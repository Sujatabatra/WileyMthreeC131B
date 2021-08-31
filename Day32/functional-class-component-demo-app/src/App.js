import DemoClassComponent from "./DemoClassComponent";
import DemoFunctionalComponent from "./DemoFunctionalComponent";

function App() {
 
  return (
    <div className="main">
    <div className="content">      
      <h1>Welcome to Sujata's React App!</h1>
        <DemoFunctionalComponent name="Deepika"/>

        <DemoClassComponent name="Ahmad" age="21"/>
    </div>
    </div>
  );
}

export default App;
