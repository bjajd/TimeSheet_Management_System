
import Navbar from './navbar';
import background from "../bg.png";
import UserNav from './usernavbar';
  function Userhome() {
  
        return (
          <div>
              <UserNav/>
              <div style={{ backgroundImage: `url(${background})`,height:"750px" }}>
                <br/> <br/> <br/> <br/> <br/> <br/> <br/>
                <center>
      <h1 style={{color:"black",fontStyle:"italic",fontSize:"40px"}}> Welcome to TimeSheet Management System</h1> </center>
      </div>
    </div>
        );
        }

        export default Userhome;

      
    