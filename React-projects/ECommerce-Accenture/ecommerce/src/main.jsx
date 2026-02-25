import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import Functional from './components/FunctionComp'
import ClassCompo from './components/ClassBasedComp'

const virtualRoot = createRoot(document.getElementById('root'))
virtualRoot.render(
  <StrictMode>
    <Functional/>
    <ClassCompo/>
  </StrictMode>,
)
