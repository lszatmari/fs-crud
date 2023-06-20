import {Outlet} from "react-router-dom";
import {Container} from "react-bootstrap";

const RootLayout = () => {
  return (
    <>
      <h2 align="center">This is the navigation component</h2>
      <Container>
        <Outlet/>
      </Container>
    </>
  );
}

export default RootLayout;