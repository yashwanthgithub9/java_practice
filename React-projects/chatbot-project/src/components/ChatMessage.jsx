import robot from '../assets/robot.png';
import user from '../assets/user.png'
    
export function ChatMessage({ message, sender }) { //destructuring at parameter level
    return (
    <div className={sender=='user'?'chat-msg-user':'chat-msg-robot'}>
        {sender === 'robot' && (<img className="img" src={robot} />)}
        <div className="chat-text-msg">
        {message}
        </div>
        {sender === 'user' && <img className="img" src={user} />}
    </div>
    );
}