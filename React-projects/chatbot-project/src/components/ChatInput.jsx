import { useState } from "react";
import {Chatbot} from 'supersimpledev';
import dayjs from "dayjs";
export function ChatInput({chatMessages,setChatMessages}) {
      const [inputText, setInputText]=useState('');
      function saveInputText(event) {
        // console.log(event.target.value)
        setInputText(event.target.value);
      }

      function sendMessage() {
          console.log(inputText);
          const newChatMessages=[
            ...chatMessages,
            {// this is added at the end of current message
              // if we just push its state won't change, hence it can't update UI
              message:inputText,
              sender:'user',
              id:crypto.randomUUID(),
              time: dayjs().valueOf()
            }
          ]
          setChatMessages(newChatMessages)
        const respose=Chatbot.getResponse(inputText)
            setInputText('');
        setChatMessages(
          [
            ...newChatMessages,
            {// this is added at the end of current message
              // if we just push its state won't change, hence it can't update UI
              message:respose,
              sender:'robot',
              id:crypto.randomUUID(),
              time: dayjs().valueOf()
            }
          ]
        )
        console.log(respose)
      }
      return (
        <div className="chat-input-container">
          <input
            placeholder="Send message to chat bot"
            size="25"
            onChange={saveInputText}
            value={inputText}
            className="text-box"
            >
          </input>
          <button
            onClick={sendMessage}
          >Send</button>
        </div>
      );
    }