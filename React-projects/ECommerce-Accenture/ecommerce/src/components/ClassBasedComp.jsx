import React from "react";

export default class ClassCompo extends React.Component{
    state={
        count:0
    }
    render(){
        return(
            <>
            <h1>Hi from Class Comp</h1>
            <h2>Count:{this.state.count}</h2>
            <button onClick={()=>this.setState({count: this.state.count+1})}>+</button>
            </>
        )
    }
}
