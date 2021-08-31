import React from "react";

class DemoClassComponent extends React.Component{

    constructor(props){
        super(props);
        this.state={
            name:this.props.name,
            age:this.props.age
        };
        
    }

    // handleClick(){
    //     this.setState({
    //         name:"Ganesh"
    //     })
    // }

    handleClick(na){
        this.setState({
            name:na,
            age:26
        })
    }
    render(){
        return(
            <div>
                {/* <h2>Hi {this.props.name} from Class Component!</h2> */}
                <p>{this.props.age}</p>
                <h2>Hi {this.state.name}  with age {this.state.age} from Class Component!</h2>
                {/* <button onClick={this.handleClick.bind(this)}>Click me to change name</button> */}
                <button onClick={this.handleClick.bind(this,"Ganesh")}>Click me to change name</button>
            </div>
        )
    }
}

export default DemoClassComponent;