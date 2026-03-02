import './App.css'
import { HomePage } from './pages/HomePage'
import { Route, Routes } from 'react-router'
import { CheckoutPage } from './pages/CheckoutPage'
import { OrdersPage } from './pages/OrdersPage'

function App() {
  return (
    <Routes>
      <Route path='/' element={<HomePage />}></Route>
      <Route path='/checkout' element={<CheckoutPage />}></Route>
      <Route path='/orders' element={<OrdersPage />} />
    </Routes >
  )
}
export default App
