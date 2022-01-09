import React, { useEffect, useState } from 'react';
import { makeStyles } from '@material-ui/core/styles';
import TextField from '@material-ui/core/TextField';
import { Container ,Paper,Button} from '@material-ui/core';
import { useHistory} from "react-router-dom";
import axios from 'axios';
import Navbar from './navbar';

const useStyles = makeStyles((theme) => ({
  root: {
    '& > *': {
      margin: theme.spacing(1),
     
    },
  },
}));

export default function Employee() {
    const paperStyle={padding:'50px 20px', width:600,margin:"20px auto"}
    const[name,setEmpName]=useState('')
    const[username,setEmpUserName]=useState('')
    const[email,setEmpEmail]=useState('')
    const[date,setJoinDate]=useState('')
    const[password,setEmpPassword]=useState('')
    const[skills,setEmpSkills]=useState('')
    const[notes,setEmpNotes]=useState('')
    const[desigId,setEmpDesigId]=useState('')
    const[phone,setEmpPhone]=useState('')
    const[departId,setEmpDepartId]=useState('')
    const[roleId,setRoleId]=useState('')
    const[roleName,setRoleName]=useState('')
    //const[employees,setEmployees]=useState([])

    
     const classes = useStyles();

  const handleClick=(e)=>{
    e.preventDefault()
    const employee={"empName":name,"empDepartId":departId,"empUserName":username,"empEmail":email, "joinDate":date,"empPassword":password, "empSkills":skills,"empNotes":notes,"empDesigId":desigId, "empPhone":phone,"roleId":{"roleId":roleId,"roleName":roleName},"timeSheet": {
      "timeSheetId":"", "timeSheetAct": " ", "timeSheetDate": " ", "approved": " ","approvedBy": " ","timeSheetRejRes": " ", "timeSheetNotes": " ", "timeSheetFeedback": " ", "timeSheetSugges": " ","timeSheetOtherAct": " ","timeSheetNoOfHours": " "}}
    console.log(employee)
    axios.post('http://localhost:8080/addemployee',employee)
    .then(response=>{
      console.log('Employee data added successfully',response.data);
      alert("Employee Added Successfully")
    })
    .catch(error =>{
      console.log(error.response);
      alert("Invalid Details!!")
    });
  }
  
  
  return (
    <div className="App">
    <Navbar/>
    <Container>
        <Paper elevation={3} style={paperStyle}>
            <h1 style={{color:"blue"}}><u>Add Employee</u></h1>

    <form onSubmit={handleClick} className={classes.root}  autoComplete="off">
    
      <TextField id="outlined-basic" label="Employee Name" variant="outlined" fullWidth 
      value={name}
      onChange={(e)=>setEmpName(e.target.value)}
      required/>
      <TextField id="outlined-basic" label="Employee Username" variant="outlined" fullWidth
      value={username}
      onChange={(e)=>setEmpUserName(e.target.value)}
      required/>
       <TextField id="outlined-basic" label="email" variant="outlined" type="email" fullWidth
      value={email}
      onChange={(e)=>setEmpEmail(e.target.value)}
      required/>
       <TextField type="date" id="outlined-basic" label="date" variant="outlined" fullWidth
      value={date}
      onChange={(e)=>setJoinDate(e.target.value)}
      required/>
       <TextField id="outlined-basic" type="password" label="Password" variant="outlined" fullWidth
      value={password}
      onChange={(e)=>setEmpPassword(e.target.value)}
      required/>
       <TextField id="outlined-basic" label="skills" variant="outlined" fullWidth
      value={skills}
      onChange={(e)=>setEmpSkills(e.target.value)}
      required/>
       <TextField id="outlined-basic" label="notes" variant="outlined" fullWidth
      value={notes} 
      onChange={(e)=>setEmpNotes(e.target.value)}
      required/>
       <TextField id="outlined-basic" label="DesigId" variant="outlined" fullWidth
      value={desigId}
      onChange={(e)=>setEmpDesigId(e.target.value)}
      required/>
       <TextField id="outlined-basic" type="tel" label="Phone" variant="outlined" fullWidth
      value={phone}
      onChange={(e)=>setEmpPhone(e.target.value)}
      required/>
        <TextField id="outlined-basic" label="DepartId" variant="outlined" fullWidth
      value={departId}
      onChange={(e)=>setEmpDepartId(e.target.value)}
      />
       <TextField id="outlined-basic" type="number" label="RoleId" variant="outlined" fullWidth
      value={roleId}
      onChange={(e)=>setRoleId(e.target.value)}
      required/>
       <TextField id="outlined-basic" label="Role Name" variant="outlined" fullWidth
      value={roleName}
      onChange={(e)=>setRoleName(e.target.value)
      }
  
      />
       <input type="submit" style={{width:"100px",height:"40px"}} value="Add"/>
    </form>
   
    </Paper>

    </Container>
    </div>
  );
}