import React from 'react';
import {
Nav,
NavLink,
Bars,
NavMenu,
NavBtn,
NavBtnLink,
} from './Navelements';

const NavBar = () => {
return (
	<>
	<Nav>
		<Bars />

		<NavMenu>
		
		<NavLink to='/' activeStyle>
			User
		</NavLink>
		<NavLink to='/adminlogin' activeStyle>
			Admin 
		</NavLink>
		{/* Second Nav */}
		{/* <NavBtnLink to='/sign-in'>Sign In</NavBtnLink> */}
		</NavMenu>
	</Nav>
	</>
);
};

export default NavBar;
