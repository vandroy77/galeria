import {ReactComponent as StarFull} from 'assets/img/FullStar.svg';
import {ReactComponent as StarHalf} from 'assets/img/HalfStar.svg';
import {ReactComponent as StarEmpty} from 'assets/img/emptyStar.svg';
import './Styles.css'

function MovieStars() {
    return (
        <div className="dsmovie-stars-container">
            <StarFull />
            <StarFull />
            <StarFull />
            <StarHalf />
            <StarEmpty />
        </div>
    );
}


export default MovieStars