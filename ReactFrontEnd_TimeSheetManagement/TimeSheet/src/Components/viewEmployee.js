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
import MenuAppBar from "./navbar";
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

const ViewEmp = () => {
  const classes = useStyles();
  const [employee, setEmployee] = useState([]);

  const getEmployeeData = async () => {
    try {
      const data = await axios.get(
        "http://localhost:8080/employees"
      );
      console.log(data.data);
      setEmployee(data.data);
    } catch (e) {
      console.log(e);
    }
  };

  useEffect(() => {
    getEmployeeData();
  }, []);
  return (
    <div className="App">
      <Navbar/>
<TableContainer component={Paper}>
<Table className={classes.table} aria-label="customized table">
  <TableHead>
    <TableRow>
      <StyledTableCell>Employee Name</StyledTableCell>
      <StyledTableCell>Email</StyledTableCell>
      <StyledTableCell>Phone number</StyledTableCell>
      <StyledTableCell>Skills</StyledTableCell>
      <StyledTableCell>Username</StyledTableCell>
    </TableRow>
  </TableHead>
  <TableBody>
    {employee
      .map((emp) => {
        return (
          <StyledTableRow key={emp.id}>
            <StyledTableCell component="th" scope="row">
            {emp.empName}
            </StyledTableCell>
            <StyledTableCell >
            {emp.empEmail}
            </StyledTableCell>
            <StyledTableCell >
            {emp.empPhone}
            </StyledTableCell>
            <StyledTableCell >
            {emp.empSkills}
            </StyledTableCell>
            <StyledTableCell >
            {emp.empUserName}
            </StyledTableCell>
          </StyledTableRow>
        );
      })}
  </TableBody>
</Table>
</TableContainer>
</div>
);
};

export default ViewEmp



