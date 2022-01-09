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

const ViewProject = () => {
  const classes = useStyles();
  const [project,setProject] = useState([]);

  const getProjectData = async () => {
    try {
      const data = await axios.get(
        "http://localhost:8080/project"
      );
      console.log(data.data);
      setProject(data.data);
    } catch (e) {
      console.log(e);
    }
  };

  useEffect(() => {
    getProjectData();
  }, []);
  return (
    <div className="App">
      <Navbar/>
<TableContainer component={Paper}>
<Table className={classes.table} aria-label="customized table">
  <TableHead>
    <TableRow>
      <StyledTableCell>Project Id</StyledTableCell>
      <StyledTableCell>Project Name</StyledTableCell>
      <StyledTableCell>Client Name</StyledTableCell>
      <StyledTableCell>Client Manager</StyledTableCell>
      <StyledTableCell>Client Email</StyledTableCell>
      <StyledTableCell>OS Id</StyledTableCell>
      <StyledTableCell>Notes</StyledTableCell>
      <StyledTableCell>Start Date</StyledTableCell>
      <StyledTableCell>End Date</StyledTableCell>
      <StyledTableCell>Status</StyledTableCell>
    </TableRow>
  </TableHead>
  <TableBody>
    {project
      .map((pj) => {
        return (
          <StyledTableRow key={pj.tid}>
            <StyledTableCell >
            {pj.projId}
            </StyledTableCell>
            <StyledTableCell >
            {pj.projName}
            </StyledTableCell>
            <StyledTableCell >
            {pj.projClientName}
            </StyledTableCell>
            <StyledTableCell >
            {pj.projClientManager}
            </StyledTableCell>
            <StyledTableCell >
            {pj.projClientEmailId}
            </StyledTableCell>
            <StyledTableCell >
            {pj.projOsId}
            </StyledTableCell>
            <StyledTableCell >
            {pj.notes}
            </StyledTableCell>
            <StyledTableCell >
            {pj.startDate}
            </StyledTableCell>
            <StyledTableCell >
            {pj.endDate}
            </StyledTableCell>
            <StyledTableCell >
            {pj.projStatus}
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

export default ViewProject



