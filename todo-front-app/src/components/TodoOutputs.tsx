import { useEffect, useState } from "react";

type todoOutputType = {
    "todolist": any[],
    "updatetodolist": React.Dispatch<any[]>
}

const TodoOutputs = ({ todolist, updatetodolist }: todoOutputType) => {
    const removeItemFromList = (e: React.MouseEvent<HTMLButtonElement>) => {
        const id: string = (e.target as HTMLElement).id;

        const opt = {
            "method": "DELETE"
        }

        fetch("http://localhost:8080/todo/" + id, opt)
        .then(() => { return })
        .then(() => {
            const optNewList = {
                "method": "GET"
            };
    
            fetch("http://localhost:8080/todo", optNewList)
            .then((res) => res.json())
            .then((res) => {
                console.log(res);
                updatetodolist([...res]);
            })
        })
    }

    return(
        <div className="todo-outputs-container">
            {
                todolist.length > 0 ? (

                        todolist.map((item, index) => {
                            return(
                                <div className="output" key={item.id}>
                                    <span className="output">{item.todo}</span>
                                    <button onClick={removeItemFromList} id={item.id}>Remove</button>
                                </div>
                            )
                        })

                ) : (
                    <>
                        <h1>NOTHING</h1>
                    </>
                )
            }
        </div>
    )
}

export default TodoOutputs;