import { useState } from "react"



function Login()

{

    const [username,setUsername] = useState("")

    const [userpassword,setUserpassword] = useState("")

    return <div> Hello User!!!

    <button onClick={()=>{

        setUsername("Max")

    }}> View User Name </button>

    {username}

    <button onClick={()=>{

        setUserpassword("abc")

    }}> View User Password </button>

    {userpassword}

    </div>

}

export default Login