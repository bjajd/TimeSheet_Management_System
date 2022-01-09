import axios from "axios";
import { useEffect, useState } from "react";
import { withStyles, makeStyles } from "@material-ui/core/styles";
import Table from "@material-ui/core/Table";
import TableBody from "@material-ui/core/TableBody";
import TableCell from "@material-ui/core/TableCell";
import TableContainer from "@material-ui/core/TableContainer";
import TableHead from "@material-ui/core/TableHead";
import TableRow from "@material-ui/core/TableRow";
import Paper from "@material-ui/core/Paper";
import Navbar from "./navbar";

const StyledTableCell = withStyles((theme) => ({
    head: {
      backgroundColor: theme.palette.common.black,
      color: theme.palette.common.white,
    },
    body: {
      fontSize: 14,
    },
  }))(TableCell);
  
  const StyledTableRow = withStyles((theme) => ({
    root: {
      "&:nth-of-type(odd)": {
        backgroundColor: theme.palette.action.hover,
      },
    },
  }))(TableRow);
  
  const useStyles = makeStyles({
    table: {
      minWidth: 700,
    },
  });

const ViewRole = () => {
  const classes = useStyles();
  const [role, setRole] = useState([]);

  const getRoleData = async () => {
    try {
      const data = await axios.get(
        "http://localhost:8080/roles"
      );
      console.log(data.data);
      setRole(data.data);
    } catch (e) {
      console.log(e);
    }
  };

  useEffect(() => {
    getRoleData();
  }, []);
  return (
    <div className="App">
      <Navbar/>
    <div className="App">
<TableContainer component={Paper}>
<Table className={classes.table} aria-label="customized table">
  <TableHead>
    <TableRow>
      <StyledTableCell>Role Id</StyledTableCell>
      <StyledTableCell>Role Name</StyledTableCell>
    </TableRow>
  </TableHead>
  <TableBody>
    {role
      .map((tm,index1) => {
        return (
          <StyledTableRow key={tm.tid}>
            <StyledTableCell component="th" scope="row">
            {tm.roleId}
            </StyledTableCell>
            <StyledTableCell >
            {tm.roleName}
            </StyledTableCell>
          </StyledTableRow>
        );
      })}
  </TableBody>
</Table>
</TableContainer>
</div>
</div>
);
};

export default ViewRole



