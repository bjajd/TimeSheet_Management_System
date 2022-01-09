import React, { useEffect, useState } from 'react';
import { makeStyles } from '@material-ui/core/styles';
import TextField from '@material-ui/core/TextField';
import { Container ,Paper,Button} from '@material-ui/core';
import { useHistory} from "react-router-dom";
import axios from 'axios';
import Navbar from './navbar';
import UserNav from './usernavbar';

const useStyles = makeStyles((theme) => ({
  root: {
    '& > *': {
      margin: theme.spacing(1),
     
    },
  },
}));

export default function Project() {
    const paperStyle={padding:'50px 20px', width:600,margin:"20px auto"}
    const[name,setProjName]=useState('')
    const[clientname,setClientName]=useState('')
    const[clientbrief,setClienBrief]=useState('')
    const[clientmanager,setClientManager]=useState('')
    const[clientemail,setClientEmail]=useState('')
    const[osid,setOsId]=useState('')
    const[dbid,setDbId]=useState('')
    const[appserverid,setAppServerId]=useState('')
    const[pmname,setPmName]=useState('')
    const[projp,setProjp]=useState('')
    const[note,setNote]=useState('')
    const[startdate,setStartDate]=useState('')
    const[enddate,setEndDate]=useState('')
    const[status,setStatus]=useState('')

    //const[employees,setEmployees]=useState([])

    
     const classes = useStyles();

  const handleClick=(e)=>{
    e.preventDefault()
    const project={"projName":name,"projClientName":clientname,"projClientBrief":clientbrief,"projClientManager":clientmanager, "projClientEmailId":clientemail,"projOsId":osid, "projDbId":dbid,"projAppServerId":appserverid,"projPmName":pmname, "projPl":projp,"notes":note,"startDate":startdate,"endDate":enddate,"projStatus":status}
    console.log(project)
    axios.post('http://localhost:8080/addprojects',project)
    .then(response=>{
      console.log('Project  added successfully',response.data);
      alert("Project Added Successfully")
    })
    .catch(error =>{
      console.log(error.response);
      alert("Invalid Details!!")
    });
  }
  
  
  return (
    <div className="App">
    <UserNav/>
    <Container>
        <Paper elevation={3} style={paperStyle}>
            <h1 style={{color:"blue"}}><u>Add Project</u></h1>

    <form onSubmit={handleClick} className={classes.root}  autoComplete="off">
    
      <TextField id="outlined-basic" label="Project Name" variant="outlined" fullWidth 
      value={name}
      onChange={(e)=>setProjName(e.target.value)}
      required/>
      <TextField id="outlined-basic" label="Client Name" variant="outlined" fullWidth
      value={clientname}
      onChange={(e)=>setClientName(e.target.value)}
      required/>
       <TextField id="outlined-basic" label="Client Brief" variant="outlined"  fullWidth
      value={clientbrief}
      onChange={(e)=>setClienBrief(e.target.value)}
      required/>
       <TextField  id="outlined-basic" label="Client Manager" variant="outlined" fullWidth
      value={clientmanager}
      onChange={(e)=>setClientManager(e.target.value)}
      required/>
       <TextField id="outlined-basic" type="email"  label="Email" variant="outlined" fullWidth
      value={clientemail}
      onChange={(e)=>setClientEmail(e.target.value)}
      required/>
       <TextField id="outlined-basic" label="Operating system" variant="outlined" fullWidth
      value={osid}
      onChange={(e)=>setOsId(e.target.value)}
      required/>
       <TextField id="outlined-basic" label="Database name" variant="outlined" fullWidth
      value={dbid} 
      onChange={(e)=>setDbId(e.target.value)}
      required/>
       <TextField id="outlined-basic" label="AppServerId" variant="outlined" fullWidth
      value={appserverid}
      onChange={(e)=>setAppServerId(e.target.value)}
      required/>
      <TextField id="outlined-basic" label="Project Manager" variant="outlined" fullWidth
      value={pmname}
      onChange={(e)=>setPmName(e.target.value)}
      required/>
      <TextField id="outlined-basic" label="Project Leader" variant="outlined" fullWidth
      value={projp}
      onChange={(e)=>setProjp(e.target.value)}
      required/>
      <TextField id="outlined-basic" label="Notes" variant="outlined" fullWidth
      value={note}
      onChange={(e)=>setNote(e.target.value)}
      required/>
       <TextField id="outlined-basic" type="date" label="Start Date" variant="outlined" fullWidth
      value={startdate}
      onChange={(e)=>setStartDate(e.target.value)}
      required/>
       <TextField id="outlined-basic" type="date" label="End Date" variant="outlined" fullWidth
      value={enddate}
      onChange={(e)=>setEndDate(e.target.value)}
      required/>
        <TextField id="outlined-basic" label="Project Status" variant="outlined" fullWidth
      value={status}
      onChange={(e)=>setStatus(e.target.value)}
      />
       <input type="submit" style={{width:"100px",height:"40px"}} value="Add"/>
    </form>
   
    </Paper>

    </Container>
    </div>
  );
}