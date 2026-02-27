import { useState } from 'react'
// import './chatbot.js'
import {Chatbot} from 'supersimpledev';
// import reactLogo from './assets/react.svg'
// import viteLogo from '/vite.svg'
import './App.css';
import { ChatInput } from './components/ChatInput';

import { ChatMessages } from './components/ChatMessages';

function App() {
  const [chatMessages, setChatMessages] = useState([{
        message:'Hellooo Chatbot',
        sender:'user',
        id:'id1'
      },{
        message:'Hellooo User',
        sender:'robot',
        id:'id2'
      },{
        message:'Get me Todays date',
        sender:'user',
        id:'id3'
      },{
        message:'Hellooo Chatbot',
        sender:'robot',
        id:'id4'
      }]);
      return(
        <div className="app-container">

        <ChatMessages
          chatMessages={chatMessages}
        />
        <ChatInput 
          chatMessages={chatMessages}
          setChatMessages={setChatMessages}
        />
        </div>
      );
}

export default App
