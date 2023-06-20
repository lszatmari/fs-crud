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
  const response = await fetch('http://localhost:8080/');
  console.log(response);

  if (!response.ok) {
    return json({message: 'Could not load races'}, {status: 500});
  } else {
    return response;
  }
}