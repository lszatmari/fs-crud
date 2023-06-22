import './App.css';
import {createBrowserRouter, RouterProvider} from "react-router-dom";
import RootLayout from "./components/RootLayout";
import HomePage from "./pages/HomePage";
import {loader as raceLoader} from "./pages/HomePage";
import ErrorPage from "./pages/ErrorPage";
import RaceForm from "./components/RaceForm";
import {action as manipulateRaceAction, loader as loadPilotsLoader} from "./components/RaceForm";

function App() {

  const router = createBrowserRouter([
    {
      path: '/',
      element: <RootLayout />,
      errorElement: <ErrorPage />,
      children: [
        {
          index: true,
          element: <HomePage />,
          loader: raceLoader
        },
        {
          path: "/races/add",
          element: <RaceForm />,
          action: manipulateRaceAction,
          loader: loadPilotsLoader
        }
      ]
    }
  ]);

  return (
    <RouterProvider router={router} />
  );
}

export default App;
