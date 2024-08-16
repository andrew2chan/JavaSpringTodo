import '../styles/App.css';
import { useState, useEffect } from 'react';
import TodoInputsComponent from './TodoInputsComponent';
import TodoOutputsComponent from './TodoOutputsComponent';
import Username from './Username';

function App() {
  const [username, updateUsername] = useState("");
  const [todoList, updateTodoList] = useState([] as any[]);

  return (
    <main id="main-body">
      <div className="flex flex-col container">
        <header>TODO</header>
        {
          username === "" ? (
            <Username updateUsername={updateUsername} />
          ) : (
            <>
              <TodoInputsComponent username={username} updatetodolist={updateTodoList} />
              <TodoOutputsComponent todolist={todoList} updatetodolist={updateTodoList} />
            </>
          )
        }
      </div>
    </main>
  )
}

export default App
