import { useState } from "react";

type usernamePropsType = {
    "updateUsername": React.Dispatch<string>
}

const Username = ({ updateUsername }: usernamePropsType) => {
    const [usernameInput, updateUsernameInput] = useState("");

    const updateUsernameEvent = (e: React.ChangeEvent<HTMLInputElement>) => {
        updateUsernameInput(e.target.value);
    }

    const addOrUpdateUsername = () => {
        console.log(usernameInput);
        updateUsername(usernameInput);
    }

    return(
        <div className="username-container">
            <input type="input" onChange={updateUsernameEvent}></input>
            <button onClick={addOrUpdateUsername}>Enter username</button>
        </div>
    )
}

export default Username;