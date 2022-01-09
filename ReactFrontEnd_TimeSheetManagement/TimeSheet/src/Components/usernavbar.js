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

const UserNav = () => {
return (
	<>
	<Nav>
		<Bars />

		<NavMenu>
    <NavLink to='/userhome' activeStyle>
			Home
		</NavLink>
		<NavLink to='/addtime' activeStyle>
			Add TimeSheet
		</NavLink>
		<NavLink to='/addProject' activeStyle>
			Add Project Details
		</NavLink>
		<NavLink to='/updateemp' activeStyle>
			Edit Details
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

export default UserNav;
