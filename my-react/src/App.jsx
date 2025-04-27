// import { useState } from 'react'
// import reactLogo from './assets/react.svg'
// import viteLogo from '/vite.svg'
// import './App.css'

import { useEffect, useState } from "react"

// function App() {
//   const [count, setCount] = useState(0)

//   return (
//     <>
//       <div>
//         <a href="https://vite.dev" target="_blank">
//           <img src={viteLogo} className="logo" alt="Vite logo" />
//         </a>
//         <a href="https://react.dev" target="_blank">
//           <img src={reactLogo} className="logo react" alt="React logo" />
//         </a>
//       </div>
//       <h1>Vite + React</h1>
//       <div className="card">
//         <button onClick={() => setCount((count) => count + 1)}>
//           count is {count}
//         </button>
//         <p>
//           Edit <code>src/App.jsx</code> and save to test HMR
//         </p>
//       </div>
//       <p className="read-the-docs">
//         Click on the Vite and React logos to learn more
//       </p>
//     </>
//   )
// }

const  Card1=({title})=>{
  const [hasLiked,setHasLiked] = useState(false); //state has been defined with initial state=false
  const [count,setCount] = useState(0);
  useEffect(()=>{
    console.log(`${title} has been ${hasLiked}`);
  },[hasLiked]);

  return(
    <div className="card">
    <h1>{title}</h1>
    <button onClick={()=>(setHasLiked(!hasLiked),setCount(prevState=>prevState+1))}>
      {/* integrating two states in on action */}
    {/* setHasLiked(true) with this we are forcing it to be true */}
    {/* setHasLiked(!hasLiked) with this we can switch between like or liked */}
       {/* Like if we simply name it as Like we can't really see the state change*/}
       {hasLiked?'💗':'🤍'}
       {/* we can add text as emoji from keyboard insted of Liked : Like */}
       </button>
       <h2>{count||null}</h2>
       {/* conditional render  */}
  </div>
  )
}

const App = ()=>{
    return (
        <div className="card-container">
          {/* <h1> Functional Arrow </h1> */}
          <Card1 title="RRR"/>
          {/* just giving title as "PROPS" to card won't display it over the website, we need it to be passed as an arguement */}
          <Card1 title="Bahubali"/>
          <Card1 title="Pushpa"/>
           {/* //inserting card in div */}
        </div>
    )
}

export default App
