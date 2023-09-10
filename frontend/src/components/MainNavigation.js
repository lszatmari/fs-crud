import {NavLink} from "react-router-dom";

import './MainNavigation.style.css';

const MainNavigation = () => {

  return (
    <header>
      <nav className="container-lg main-nav d-flex">
        <div className="header-nav-item">
          <NavLink className="text-white text-decoration-none mx-4" to="/">Home</NavLink>
        </div>
        <div className="header-nav-item">
          <NavLink className="text-white text-decoration-none mx-4" to="/races/add">Add race</NavLink>
        </div>
      </nav>
    </header>
  );
}

export default MainNavigation;