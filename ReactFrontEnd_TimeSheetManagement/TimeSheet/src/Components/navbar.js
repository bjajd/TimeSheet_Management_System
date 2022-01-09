import React from 'react';
import App from '../App';
import {
Nav,
NavLink,
Bars,
NavMenu,
NavBtn,
NavBtnLink,
} from './Navelements';

const Navbar = () => {
return (
	<>
	<Nav>
		<Bars />

		<NavMenu>
    <NavLink to='/Adminhome' activeStyle>
			Home
		</NavLink>
		<NavLink to='/addemp' activeStyle>
			Add Employee
		</NavLink>
		<NavLink to='/viewemp' activeStyle>
			View Employee
		</NavLink>
		<NavLink to='/viewtime' activeStyle>
			View TimeSheet
		</NavLink>	
		<NavLink to='/viewProject' activeStyle>
			View Project
		</NavLink>	
		<NavLink to='/viewRole' activeStyle>
			View Role
		</NavLink>	
		{/* Second Nav */}
		{/* <NavBtnLink to='/sign-in'>Sign In</NavBtnLink> */}
		<NavBtn>
          <NavBtnLink to='/'>Log out</NavBtnLink>
        </NavBtn>
		</NavMenu>
	</Nav>
	</>
);
};

export default Navbar;
