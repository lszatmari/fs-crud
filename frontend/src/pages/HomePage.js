import {json, useLoaderData} from "react-router-dom";
import RacesList from "../components/RacesList";
import {useState} from "react";

const HomePage = () => {
  const [data, setData] = useState(useLoaderData());

  if (data.isError) {
    return <p>{data.message}</p>;
  }

  const handleRowDelete = async (id) => {
    const response = await fetch('http://localhost:8080/races/' + id, {method: 'DELETE'})

    if (!response.ok) {
      console.log('Not ok');
    } else {
      setData((prevList) => prevList.filter(item => item.id !== id));
    }
  }

  return (
    <>
      <RacesList data={data} deleteHandler={handleRowDelete}/>
    </>
  )
}

export default HomePage;

export const loader = async () => {
  let response = null;
  try {
    response = await fetch('http://localhost:8080/');
  } catch (e) {
    return json({message: 'Something happened with the server.', isError: true});
  }

  if (!response.ok)
    return json({message: 'Could not load races', isError: true}, {status: 500});

  return response;
}