import {Outlet} from "react-router-dom";
import {Container} from "react-bootstrap";
import MainNavigation from "./MainNavigation";

const RootLayout = () => {
  return (
    <>
      <MainNavigation />
      <Container fluid="lg">
        <Outlet/>
      </Container>
    </>
  );
}

export default RootLayout;