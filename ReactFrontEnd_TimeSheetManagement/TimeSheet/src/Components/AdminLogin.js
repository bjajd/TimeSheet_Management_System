import React, { useEffect, useState } from 'react';
import axios from "axios";
import { Card} from "@material-ui/core";
import { Link, useNavigate } from "react-router-dom";
import { PropTypes } from 'react'
import { Button } from '@material-ui/core';
import { withRouter } from './HistoryComp';
import validator from 'validator'
import NavBar from './HomeNav';
import { Navbar } from 'react-bootstrap';

  function AdminLogin(props) {
  const [userInput, setUserInput] = useState('');
  const [passwordInput, setPasswordInput] = useState('')
 
  const handleUserChange = (e) => {
    setUserInput(e.target.value);
}

const handlePasswordChange = (e) => {
    setPasswordInput(e.target.value);
}
  const handleClick=(e)=>{
    
    e.preventDefault()
    let cred = {
      username: 'admin123',
      password: 'abc123'
  }
  if ((userInput == cred.username) && (passwordInput == cred.password)) {
      
      alert("logged in Successfully")
      props.history('/adminhome')
  } else {
      //bad combination
      alert('wrong email or password combination');
  }

}
        return (
          <div className="App">
          <NavBar/>
            <form onSubmit={handleClick}>
              <center>
                <h3>Admin Log in</h3>
                <div className="form-group">
                    <label>Username</label>
                    <input
                type="text"
                className="form-control"
                id="username"
                placeholder="Enter email"
                value={userInput}
                onChange={handleUserChange}
                required
                />
                   
                </div>
                <br/>
                <div className="form-group">
                    <label>Password </label>
                    <input
                   type="password"
                  autoComplete="new-password"
                  className="form-control"
                  id="password"
                  placeholder="Password"
                  value={passwordInput}
                  onChange={handlePasswordChange}
                  required
                />
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

        export default withRouter(AdminLogin);

      
    