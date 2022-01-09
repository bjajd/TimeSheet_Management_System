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

const ViewTime = () => {
  const classes = useStyles();
  const [timeSheet, setTimeSheet] = useState([]);

  const getTimeData = async () => {
    try {
      const data = await axios.get(
        "http://localhost:8080/timesheets"
      );
      console.log(data.data);
      setTimeSheet(data.data);
    } catch (e) {
      console.log(e);
    }
  };

  useEffect(() => {
    getTimeData();
  }, []);
  return (
    <div className="App">
      <Navbar/>
<TableContainer component={Paper}>
<Table className={classes.table} aria-label="customized table">
  <TableHead>
    <TableRow>
      <StyledTableCell>TimeSheet Id</StyledTableCell>
      <StyledTableCell>Activity</StyledTableCell>
      <StyledTableCell>No.of Hours</StyledTableCell>
      <StyledTableCell>Feedback</StyledTableCell>
    </TableRow>
  </TableHead>
  <TableBody>
    {timeSheet
      .map((tm,index1) => {
        return (
          <StyledTableRow key={tm.tid}>
            <StyledTableCell >
            {tm.timeSheetId}
            </StyledTableCell>
            <StyledTableCell >
            {tm.timeSheetAct}
            </StyledTableCell>
            <StyledTableCell >
            {tm.timeSheetNoOfHours}
            </StyledTableCell>
            <StyledTableCell >
            {tm.timeSheetFeedback}
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

export default ViewTime



