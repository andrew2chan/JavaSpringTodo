import TodoInputs from "./TodoInputs";
import { useState } from "react";

type todoInputsType = {
    "username" : string
}

const TodoInputsComponent = ({ username }: todoInputsType) => {
    const [todoInput, updateTodoInput] = useState("");

    const todoInputEventOnChange = (e: React.ChangeEvent<HTMLInputElement>) => {
        updateTodoInput(e.target.value);
    }

    const addTodoOnClick = () => {
        const todoJsonObj = {
            "username": {
                "username": username
            },
            "todo": todoInput
        };

        const opt = {
            "method": "POST",
            "headers": {
                "Content-Type": "application/json",
            },
            "body": JSON.stringify(todoJsonObj)
        }

        fetch('http://localhost:8080/todo', opt)
        .then((res) => {
            return res.json();
        })
        .then((res) => {
            console.log(res);
        })
    }

    return (
        <section className="inputs">
            <div className="todo-inputs-container">
                <input type="input" onChange={todoInputEventOnChange}></input>
                <button onClick={addTodoOnClick}>Add</button>
            </div>
        </section>
    );
}

export default TodoInputsComponent;