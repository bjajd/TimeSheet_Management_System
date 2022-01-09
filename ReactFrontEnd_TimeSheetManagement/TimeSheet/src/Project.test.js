import { render, screen, fireEvent } from '@testing-library/react';
import Project from './Project';

test("welcome team component",()=>{
    render(<Project/>)
    fireEvent.click(screen.getByText("View Project Name"))
    screen.findAllByAltText("Timesheet").then((e)=>{
        console.log(e)
        expect(e).toBeInTheDocument()
    })
    fireEvent.click(screen.getByText("View Project Id"))
    screen.findAllByAltText("abc12").then((e)=>{
        console.log(e)
        expect(e).toBeInTheDocument()
    })
    fireEvent.click(screen.getByText("View Team Name"))
    screen.findAllByAltText("Grp 5").then((e)=>{
        console.log(e)
        expect(e).toBeInTheDocument()
    })
    fireEvent.click(screen.getByText("View Team Id"))
    screen.findAllByAltText("xyz23").then((e)=>{
        console.log(e)
        expect(e).toBeInTheDocument()
    })
})

