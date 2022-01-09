import { useState } from "react"

function Project()
{
    const [projectname,setProjectname] = useState("")
    const [projectid,setProjectid] = useState("")
    const [teamname,setTeamname] = useState("")
    const [teamid, setTeamid] = useState("")

    return <div> Welcome Project Team!!!
    <button onClick={()=>{
        setProjectname("Timesheet")
    }}> View Project Name </button>
    {projectname}

    <button onClick={()=>{
        setProjectid("abcd12")
    }}> View Project Id </button>
    {projectid}

    <button onClick={()=>{
        setTeamname("Grp 5")
    }}> View Team Name </button>
    {teamname}

    <button onClick={()=>{
        setTeamid("xyz23")
    }}> View Team Id </button>
    {teamid}
    </div>
}
export default Project
