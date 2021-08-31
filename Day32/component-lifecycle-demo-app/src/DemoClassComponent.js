import React from "react";

class DemoClassComponent extends React.Component{

    constructor(props){
        super(props);
        this.state={
            name:this.props.name,
            age:this.props.age
        };
        
    }
    componentWillReceiveProps(newProps){
        if(this.props!==newProps){
            console.log("New Props have been assigned");
        }
    }
    shouldComponentUpdate(nextProps,nextState){
        console.log("Hi from shouldComponent Update()");
        return true;
    }
    componentWillUpdate(){
        console.log("Hi from componentWillUpdate()")
    }
    componentDidUpdate(){
        console.log("Hi from componentDidUpdate");
    }
    handleClick(na){
        this.setState({
            name:na,
            age:26
        })
    }
    componentWillMount(){
        console.log("Hi from componentWillMount()");
    }
    componentDidMount(){
        console.log("Hi from componentDidMount()");
    }

    render(){
        return(
            <div>
                <h2>Hi {this.state.name}  with age {this.state.age} from Class Component!</h2>
                <button onClick={this.handleClick.bind(this,"Ganesh")}>Click me to change name</button>
            </div>
        )
    }
}

export default DemoClassComponent;