import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

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

const App =()=>{
  return(
    <>
      <div class="grid grid-cols-2 sm:grid-cols-4">
      <h1 class=" font-bold font-serif underline text-gradient bg-linear-to-r from-blue-500 to-blue-300" >
        Hello world!
      </h1>      <h1 class=" font-bold font-serif underline text-gradient bg-linear-to-r from-blue-500 to-blue-300" >
        Hello world!
      </h1>      <h1 class=" font-bold font-serif underline text-gradient bg-linear-to-r from-blue-500 to-blue-300" >
        Hello world!
      </h1>      <h1 class=" font-bold font-serif underline text-gradient bg-linear-to-r from-blue-500 to-blue-300" >
        Hello world!
      </h1>      <h1 class=" font-bold font-serif underline text-gradient bg-linear-to-r from-blue-500 to-blue-300" >
        Hello world!
      </h1>      <h1 class=" font-bold font-serif underline text-gradient bg-linear-to-r from-blue-500 to-blue-300" >
        Hello world!
      </h1>
    </div>
      <div class="grid grid-cols-2 sm:grid-cols-3">
        <h1></h1>
     </div>
     </>
  )
}

export default App
