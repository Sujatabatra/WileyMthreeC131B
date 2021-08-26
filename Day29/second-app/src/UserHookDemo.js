import { useState } from "react";

const  UserHookDemo= () => {

    const [name,setName]=useState("Aditya");
    const [age,setAge]=useState(23);
    const handleClick=()=>{
        setName("Ahmad");
        setAge(24);
    }
    return (
        <div className="user">
            <h2>{name} is of {age} years old!</h2>
            <button onClick={handleClick}>Click Me to Change Values</button>
        </div>
      );
}
 
export default UserHookDemo;