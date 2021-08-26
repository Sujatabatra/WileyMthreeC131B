
import './App.css';
import Home from './Home';
import MovieList from './MovieList';
import SidePane from './SidePane';

function App(props) {
  
  const name=props.firstname;

  return (
    <div className="App">
      <h1>{name} {props.lastname} App Component</h1>
        {/* <Home/> */}
        <MovieList/>
        {/* <SidePane message={"Demonstrating props from App Component"}/> */}
    </div>
  );
}

export default App;
