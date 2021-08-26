import React from 'react'

class SidePane extends React.Component{

    // constructor(props){
    //     super(props);
    // }
    
    render(){
        return(
        <div className="sidepane">
            <h4>Hi I am Side Pane Component</h4>
            <h5>{this.props.message}</h5>
        </div>
        )
    }
}

export default SidePane;