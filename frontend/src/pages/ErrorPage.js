import {useRouteError} from "react-router-dom";
import MainNavigation from "../components/MainNavigation";

const ErrorPage = () => {
  const error = useRouteError();
  let title = 'An error has occured!';
  let message = 'Something went wrong';

  if (error.status === 404) {
    title = 'ERROR 404'
    message = 'Resources not found!'
  }

  return (
    <>
      <MainNavigation />
      <h2>{title}</h2>
      <p>{message}</p>
    </>
  );
}

export default ErrorPage;