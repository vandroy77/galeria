import {ReactComponent as GithubIcon} from 'assets/img/githubIcon.svg'
import './Styles.css'

function Navbar() {
    return (
        <header>
        <nav className="container">
          <div className='dsgallery-nav-content'>
            <h1>dsGaleria</h1>
            
            <a href="https://github.com/vandroy77" >
            <div className='dsgallery-contact-container'>
               <GithubIcon />
               <p className='dsgallery-contact-link'>/iago</p>
            </div>
            </a>
  
          </div>
        </nav>
      </header>
    );
}

export default Navbar

