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

export default function AddTimeSheet() {
    const paperStyle={padding:'50px 20px', width:600,margin:"20px auto"}
    const[id,setId]=useState('')
    const[activity,setActivity]=useState('')
    const[date,setDate]=useState('')
    const[apprv,setApprv]=useState('')
    const[apprvdBy,setApprvdBy]=useState('')
    const[reason,setReason]=useState('')
    const[notes,setNotes]=useState('')
    const[feedback,setFeedback]=useState('')
    const[sugges,setSuggses]=useState('')
    const[otheractivity,setOtheractivity]=useState('')
    const[hours,setHours]=useState('')
    //const[employees,setEmployees]=useState([])

    
     const classes = useStyles();

  const handleClick=(e)=>{
    e.preventDefault()
    const employee={"empName":"","empDepartId":"","empUserName":"","empEmail":"", "joinDate":"","empPassword":"", "empSkills":"","empNotes":"","empDesigId":"", "empPhone":"","timeSheet":{"timeSheetId":id,"timeSheetAct":activity,"timeSheetDate":date,"approved":apprv,"approvedBy":apprvdBy,"timeSheetRejRes":reason,"timeSheetNotes":notes,"timeSheetFeedback":feedback,"timeSheetSugges":sugges,"timeSheetOtherAct":activity,"timeSheetNoOfHours":hours},"roleId":{"roleId":"","roleName":""}}
    console.log(employee)
    axios.post('http://localhost:8080/addemployee',employee)
    .then(response=>{
      console.log('TimeSheet data added successfully',response.data);
      alert("TimeSheet Added Successfully")
    })
    .catch(error =>{
      console.log(error.response);
    });
  }
  
  return (
    <div className="App">
    <UserNav/>
    <Container>
        <Paper elevation={3} style={paperStyle}>
            <h1 style={{color:"blue"}}><u>Add TimeSheet</u></h1>

    <form onSubmit={handleClick} className={classes.root}  autoComplete="off">
    
      <TextField id="outlined-basic" label="Timesheet Id" variant="outlined" fullWidth 
      value={id}
      onChange={(e)=>setId(e.target.value)}
      required
      />
      <TextField id="outlined-basic" label="Activity" variant="outlined" fullWidth
      value={activity}
      onChange={(e)=>setActivity(e.target.value)}
      required
      />
       <TextField id="outlined-basic" type="date" label="Date" variant="outlined" fullWidth
      value={date}
      onChange={(e)=>setDate(e.target.value)}
      required
      />
       <TextField id="outlined-basic" label="approved" variant="outlined" fullWidth
      value={apprv}
      onChange={(e)=>setApprv(e.target.value)}
      required
      />
       <TextField id="outlined-basic" type="text" label="approved By" variant="outlined" fullWidth
      value={apprvdBy}
      onChange={(e)=>setApprvdBy(e.target.value)}
      required
      />
       <TextField id="outlined-basic" label="Rejected Reason" type="text" variant="outlined" fullWidth
      value={reason}
      onChange={(e)=>setReason(e.target.value)}
      required
      />
       <TextField id="outlined-basic" label="notes" variant="outlined" fullWidth
      value={notes} 
      onChange={(e)=>setNotes(e.target.value)}
      required
      />
       <TextField id="outlined-basic" label="Feedback" variant="outlined" fullWidth
      value={feedback}
      onChange={(e)=>setFeedback(e.target.value)}
      required
      />
       <TextField id="outlined-basic" label="Suggestion" variant="outlined" fullWidth
      value={sugges}
      onChange={(e)=>setSuggses(e.target.value)}
      required
      />
        <TextField id="outlined-basic" label="Other Activity" variant="outlined" fullWidth
      value={otheractivity}
      onChange={(e)=>setOtheractivity(e.target.value)}
      required
      />
       <TextField id="outlined-basic" type="text" label="Hours" variant="outlined" fullWidth
      value={hours}
      onChange={(e)=>setHours(e.target.value)}
      required
      />
       <input type="submit" style={{width:"100px",height:"40px"}} value="Add"/>
    </form>
   
    </Paper>

    </Container>
    </div>
  );
}