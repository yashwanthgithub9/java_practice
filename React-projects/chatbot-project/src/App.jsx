import { useState } from 'react'
// import './chatbot.js'
import {Chatbot} from 'supersimpledev';
// import reactLogo from './assets/react.svg'
// import viteLogo from '/vite.svg'
import './App.css';
import { ChatInput } from './components/ChatInput';

import { ChatMessages } from './components/ChatMessages';
import dayjs from 'dayjs';
function App() {
  const [chatMessages, setChatMessages] = useState([{
        message:'Hellooo Chatbot',
        sender:'user',
        id:'id1',
        time: dayjs().valueOf()
      },{
        message:'Hellooo User',
        sender:'robot',
        id:'id2',
        time: dayjs().valueOf()

      },{
        message:'Get me Todays date',
        sender:'user',
        id:'id3',
        time: dayjs().valueOf()
      },{
        message:'Hellooo Chatbot',
        sender:'robot',
        id:'id4',
        time: dayjs().valueOf()
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
