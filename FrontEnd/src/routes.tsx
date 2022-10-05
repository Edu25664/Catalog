import Navbar from 'components/Navbar/intex';
import Admin from 'Pages/Admin';
import Catalog from 'Pages/Catalog';
import Home from 'Pages/Home';
import { BrowserRouter, Route, Switch } from 'react-router-dom';

function Routes() {
  return (
    <>
      <BrowserRouter>
        <Navbar />
        <Switch>
          <Route path="/" exact>
            <Home />
          </Route>
          <Route path="/products">
            <Catalog/>
          </Route>
          <Route path="/admin">
            <Admin/>
          </Route>
        </Switch>
      </BrowserRouter>
    </>
  );
}
export default Routes;
