import './App.css';
import {createBrowserRouter, RouterProvider} from "react-router-dom";
import RootLayout from "./components/RootLayout";
import HomePage from "./pages/HomePage";
import {loader as raceLoader} from "./pages/HomePage";

function App() {

  const router = createBrowserRouter([
    {
      path: '/',
      element: <RootLayout />,
      children: [
        {
          index: true,
          element: <HomePage />,
          loader: raceLoader
        }
      ]
    }
  ]);

  return (
    <RouterProvider router={router} />
  );
}

export default App;
