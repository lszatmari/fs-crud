import {json, useLoaderData} from "react-router-dom";
import RacesList from "../components/RacesList";

const HomePage = () => {
  const data = useLoaderData();

  if (data.isError) {
    return <p>{data.message}</p>;
  }

  return (
    <>
      <RacesList data={data}/>
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