import { useState } from "react"

export default function Functional(){
    const[count,setCount]=useState(0);
    return(
        <>
                <h1>Hello from FunctionComp</h1>
                <h2>Count:{count}</h2>
                <button onClick={()=>setCount(count+1)}>
                    +
                </button>
        </>
    )
}