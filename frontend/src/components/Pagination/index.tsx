import {ReactComponent as Arrow} from 'assets/img/Arrow.svg';
import { MoviePage } from 'types/movie';
import './Styles.css';

type Props ={
    page: MoviePage;
    OnChange: Function;
        
};

function Pagination({page,OnChange} : Props){
    return (
        <div className="dsmovie-pagination-container">
    <div className="dsmovie-pagination-box">
        <button className="dsmovie-pagination-button" disabled={page.first} onClick={()=> OnChange(page.number - 1)} >
            <Arrow />
        </button>
        <p>{`${page.number + 1} de ${page.totalPages}`}</p>
        <button className="dsmovie-pagination-button" disabled={page.last} onClick={()=> OnChange(page.number + 1)} >
            <Arrow className="dsmovie-flip-horizontal" />
        </button>
    </div>
</div>
    );
}


export default Pagination