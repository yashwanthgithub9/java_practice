import { useState } from 'react'
// import reactLogo from './assets/react.svg'
// import viteLogo from '/vite.svg'
import './App.css'
import Search from './components/search'

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
  const[searchItem,setSearchItem]=useState('');
  
  return(
    <main>
      <div className="pattern"></div>
      <div className="wrapper">
        <header>
          {/* <img src="./BG.png" alt="background" /> */}
          <img src="./hero-img.png" alt="Hero Image" />
          <h1>
            Find <span className='text-gradient'>Movies</span> you'll enjoy without any hassle
          </h1>
          <Search searchItem={searchItem} setSearchItem={setSearchItem}/>
          <h1 className="text-white">{searchItem}</h1>
        </header>
      </div>
    </main>
  )
}

export default App
