import './style.css'
import ProductImg from '../../assets/images/product.png';
const ProductCard = () => {
  return (
    <div className="base-card product-card">
      <div className="card-botton-container">
        <h6>Nome do Produto</h6>
        <p>R$2.345</p>
      </div>
      <div className="card-top-container">
        <img src={ProductImg} alt="nome do producto"></img>
      </div>
    </div>
  );
};

export default ProductCard;
