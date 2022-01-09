import React, { useEffect, useState } from 'react';
import axios from "axios";
import { Card} from "@material-ui/core";
import { Link, useNavigate } from "react-router-dom";
import { PropTypes } from 'react'
import { Button } from '@material-ui/core';
import { withRouter } from './HistoryComp';
import validator from 'validator'
import NavBar from './HomeNav';

  function LoginPage(props) {
  const[username,setEmpUserName]=useState('')
  const[password,setEmpPassword]=useState('')
 
  const handleClick=(e)=>{
    
    e.preventDefault()
    const employee={ "username": username,"password": password}
    console.log(employee)
    axios.post('http://localhost:8080/login',employee)
    .then(response=>{
      console.log(response.data);
      console.log(username)
      console.log(password)
      alert("User Logged in Successfully")
      props.history('/userhome')
    })
    .catch(error =>{
      console.log(error.response);
      alert("Invalid Username or Password")
    
    });
   
   
  } 
        return (
          <div className="App">
          <NavBar/>
            <form onSubmit={handleClick}> 
              <center>
                <h3>Log in</h3>
                <div className="form-group">
                    <label>Username </label>
                    <input type="text"  id="username"  className="form-control" placeholder="Enter username" value={username} onChange={(e)=>setEmpUserName(e.target.value)} required/>
                   
                </div>
                <br/>
                <div className="form-group">
                    <label>Password </label>
                    <input type="password"  id="password"  className="form-control" placeholder="Enter password" value={password} onChange={(e)=>setEmpPassword(e.target.value)} required/>
                </div>
                <div>
                  <br/>
                <nav>
                 <input type="submit" value="login"/>
                   </nav> 
                </div>

               
               
                </center>
            </form>
            </div>
        );
        }

        export default withRouter(LoginPage);

      
    