import LogoApp from 'assets/images/logo.png';
import { Link } from 'react-router-dom';

const NavBar = () => {
    return (
        <div className="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-light border-bottom shadow-sm">
        <div className="container">
          <Link to="/">
              <nav className="my-2 my-md-0 mr-md-3">
                <img src={LogoApp} alt="FullstackApp" width="120" />
              </nav>
          </Link>
        </div>
      </div>
    );
  }
  
  export default NavBar;