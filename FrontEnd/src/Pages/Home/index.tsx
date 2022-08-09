import Navbar from 'components/Navbar/intex';
import './styles.css';
import { ReactComponent as Mainimage } from 'assets/images/main-image.svg';
import ButtonIcon from 'components/buttonIcon';

const Home = () => {
  return (
    <>
      <Navbar />
      <div className="home-container">
        <div className="home-card">
          <div className="home-content-container">
            <h1>Conheça o melhor catálogo de produtos</h1>
            <p>
              Ajudaremos você a encontrar os melhores produtos disponíveis no
              mercado.
            </p>
            <ButtonIcon></ButtonIcon>
          </div>

          <div className="home-image-container">
            <Mainimage />
          </div>
        </div>
      </div>
    </>
  );
};
export default Home;
