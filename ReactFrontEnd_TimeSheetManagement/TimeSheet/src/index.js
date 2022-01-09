import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import LoginPage from './Components/loginform';
import ViewEmp from './Components/viewEmployee';
import ViewTime from './Components/viewTimesheet';
import Employee from './Components/SignUp';
import UpdateEmployee from './Components/UpdateEmployee';
import Navbars from './Components/navbar';
import NavBar from './Components/navbar';
import Navbar from './Components/HomeNav';
import AdminLogin from './Components/AdminLogin';
import Userhome from './Components/Userhome';
import Adminhome from './Components/adminHome';
import AddTimeSheet from './Components/AddTimeSheet';
import ViewRole from './Components/viewRole';
import ViewProject from './Components/viewProject';
import Project from './Components/AddProject';


ReactDOM.render(
  <React.StrictMode>
    <BrowserRouter>
    <Routes>
      <Route path="/" element={<LoginPage/>}/>
      <Route path="/viewemp" element={<ViewEmp/>}/>
      <Route path="/viewtime" element={<ViewTime/>}/>
      <Route path="/addemp" element={<Employee/>}/>
      <Route path="/updateemp" element={<UpdateEmployee/>}/>
      <Route path="/nav" element={<Navbar/>}/>
      <Route path="/adminlogin" element={<AdminLogin/>}/>
      <Route path="/userhome" element={<Userhome/>}/>
      <Route path="/adminhome" element={<Adminhome/>}/>
      <Route path="/addtime" element={<AddTimeSheet/>}/>
      <Route path="/viewRole" element={<ViewRole/>}/>
      <Route path="/viewProject" element={<ViewProject/>}/>
      <Route path="/addProject" element={<Project/>}/>

    </Routes>
    </BrowserRouter>
    <App />
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
