import { useState } from "react";

const DemoFunctionalComponent = (props) => {
    
    const [name,setName]=useState(props.name);
    
    // const handleClick=()=>{
    //     // props.name="Aditya";
    //     setName("Aditya");
    // }
    const handleClick=(na)=>{
        // props.name="Aditya";
        setName(na);
    }
    return (
        <div>
            {/* <h2>Hi {props.name} from Functional Component!</h2> */}
            <h2>Hi {name} from Functional Component!</h2>
            {/* <button onClick={handleClick}>Click me to change props.name</button> */}
            <button onClick={()=>handleClick("Aditya")}>Click me to change props.name</button>
        </div>
      );
}
 
export default DemoFunctionalComponent;