import React, { useEffect, useState } from 'react';
import { makeStyles } from '@material-ui/core/styles';
//import input from '@material-ui/core/TextField';
import { Container ,Paper,Button, TextField} from '@material-ui/core';
import { useHistory} from "react-router-dom";
import axios from 'axios';
import UserNav from './usernavbar';

const useStyles = makeStyles((theme) => ({
  root: {
    '& > *': {
      margin: theme.spacing(1),
     
    },
  },
}));

export default function UpdateEmployee() {
    const paperStyle={padding:'50px 20px', width:600,margin:"20px auto"}
    const[empid,setEmpId]=useState('')
    const[name,setEmpName]=useState('')
    const[username,setEmpUserName]=useState('')
    const[email,setEmpEmail]=useState('')
    const[password,setEmpPassword]=useState('')
    const[skills,setEmpSkills]=useState('')
    const[notes,setEmpNotes]=useState('')
    const[roleId,setRoleId]=useState('')
    const[timesheetId,setTimesheetId]=useState('')
    const[date,setJoinDate]=useState('')
    const[desigId,setEmpDesigId]=useState('')
    const[phone,setEmpPhone]=useState('')
    const[departId,setEmpDepartId]=useState('')
    //const[employees,setEmployees]=useState([])

    
     const classes = useStyles();

  const handleClick=(e)=>{
    e.preventDefault()
    const employee={ "empId":empid,"empName":name,"empUserName":username,"empEmail":email,"empPassword":password, "empSkills":skills,"empNotes":notes,"joinDate":date,"empDepartId":departId,"empDesigId":desigId ,
    "empPhone":phone,"roleId":{"roleId":roleId},"timeSheet": {
      "timeSheetId":timesheetId}}
    console.log(employee)
    axios.post('http://localhost:8080/updateemployee',employee)
    .then(response=>{
      console.log('Employee data updated successfully',response.data);
      alert("Updated details Successfully")
    })
    .catch(error =>{
      console.log(error.response);
     // alert("fill the details")
    });
  }
  
  return (
    <div className="App">
    <UserNav/>    
 <Container>
        <Paper elevation={3} style={paperStyle}>
            <h1 style={{color:"blue"}}><u>Edit Details</u></h1>

    <form  onSubmit={handleClick }className={classes.root}  autoComplete="off">
    <TextField id="outlined-basic" label="Employee id" variant="outlined" fullWidth 
      value={empid}
      onChange={(e)=>setEmpId(e.target.value)}
      required/>

      <TextField id="outlined-basic" label="Employee Name" variant="outlined" fullWidth 
      value={name}
      onChange={(e)=>setEmpName(e.target.value)}
      required/>
    
      <TextField id="outlined-basic" label="Employee Username" variant="outlined" fullWidth
      value={username}
      onChange={(e)=>setEmpUserName(e.target.value)}
      required/>
       <TextField id="outlined-basic" label="email" variant="outlined" fullWidth type="email"
      value={email}
      onChange={(e)=>setEmpEmail(e.target.value)}
      required/>
       
       <TextField id="outlined-basic" type="password" label="Password" variant="outlined" fullWidth
      value={password}
      onChange={(e)=>setEmpPassword(e.target.value)}
      required/>
       
        <TextField id="outlined-basic" label="Phone number" variant="outlined" fullWidth
      value={phone} 
      onChange={(e)=>setEmpPhone(e.target.value)}
      required/>
       
       <TextField id="outlined-basic" type="number" label="DesignationId" variant="outlined" fullWidth
      value={desigId}
      onChange={(e)=>setEmpDesigId(e.target.value)}
      required/>
      
      <TextField id="outlined-basic" label="DepartmentId" variant="outlined" fullWidth
      value={departId}
      onChange={(e)=>setEmpDepartId(e.target.value)}
      required/>
      
      <TextField id="outlined-basic" type="date" label="Date" variant="outlined" fullWidth
      value={date}
      onChange={(e)=>setJoinDate(e.target.value)}
      required/>
      
       <TextField id="outlined-basic" label="skills" variant="outlined" fullWidth
      value={skills}
      onChange={(e)=>setEmpSkills(e.target.value)}
      required/>
         
        <TextField id="outlined-basic" label="notes" variant="outlined" fullWidth
      value={notes} 
      onChange={(e)=>setEmpNotes(e.target.value)}
      required/>
         
       <TextField id="outlined-basic" type="number" label="RoleId" variant="outlined" fullWidth
      value={roleId}
      onChange={(e)=>setRoleId(e.target.value)}
      required/>
      <br/>
       <TextField id="outlined-basic" type="number" label="TimesheetId" variant="outlined" fullWidth
      value={timesheetId}
      onChange={(e)=>setTimesheetId(e.target.value)}
      required/>
      <br/>
      <input type="submit" value="Submit"/>
    </form>
   
    </Paper>

    </Container>
    </div>
  );
}