import './styles.css';
import { ReactComponent as Mainimage } from 'assets/images/main-image.svg';
import ButtonIcon from 'components/buttonIcon';
import { Link } from 'react-router-dom';

const Home = () => {
  return (
    <div className="home-container">
      <div className="home-card">
        <div className="home-content-container">
          <div>
            <h1>Conheça o melhor catálogo de produtos</h1>
            <p>
              Ajudaremos você a encontrar os melhores produtos disponíveis no
              mercado.
            </p>
          </div>
          <Link to="/products">
            <ButtonIcon />
          </Link>
        </div>

        <div className="home-image-container">
          <Mainimage />
        </div>
      </div>
    </div>
  );
};
export default Home;
