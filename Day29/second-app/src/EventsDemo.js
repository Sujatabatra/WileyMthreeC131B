const EventsDemo = () => {
    
    const handleClick =()=>{
        console.log("Hello Evevryone! Capturing Click Event");
    }

    const handleClickAgain=(name)=>{
        console.log("welcome "+name+" to the world of react events");
    }
    const title="Demostrating Event!";
    let name="Muskan";
    const changeName=()=>{
        console.log("Before Change"+name)
        name="Ahmad";
        console.log("After change "+name);
    }
    return (  
        <div className="content">
            <h1>{title}</h1>
            <button onClick={handleClick}>Click Me</button><br></br>
            {/* <button onClick={()=>{
                handleClickAgain("Amogh");
            }
                }>Click Me Again</button> */}
            <h2>{name}</h2>
            <button onClick={()=>handleClickAgain("Amogh")}>Click Me Again</button>
            <br></br>
            <button onClick={changeName}>Click to change name</button>
        </div>
    );
}
 
export default EventsDemo;