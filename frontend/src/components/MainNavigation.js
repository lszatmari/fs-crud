import {NavLink} from "react-router-dom";

const MainNavigation = () => {

  return (
    <header>
      <nav>
        <ul>
          <li>
            <NavLink to="/">Home</NavLink>
          </li>
          <li>
            <NavLink to="/races/add">Add race</NavLink>
          </li>
        </ul>
      </nav>
    </header>
  );
}

export default MainNavigation;