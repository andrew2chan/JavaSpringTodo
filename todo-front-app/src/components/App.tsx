import '../styles/App.css';
import TodoInputsComponent from './TodoInputsComponent';
import TodoOutputsComponent from './TodoOutputsComponent';

function App() {

  return (
    <main id="main-body">
      <div className="flex flex-col container">
        <header>TODO</header>
        <TodoInputsComponent />
        <TodoOutputsComponent />
      </div>
    </main>
  )
}

export default App
