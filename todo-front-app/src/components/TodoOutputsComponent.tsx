import TodoOutputs from "./TodoOutputs";

type todoOutputType = {
    "todolist": any[],
    "updatetodolist": React.Dispatch<any[]>
}

const TodoOutputsComponent = ({ todolist, updatetodolist }: todoOutputType) => {
    return(
        <section className="outputs">
            <TodoOutputs todolist={todolist} updatetodolist={updatetodolist} />
        </section>
    );
}

export default TodoOutputsComponent;