import { render, screen, fireEvent } from '@testing-library/react';

import Login from './login';



test("welcome user component test",()=>{

    render(<Login/>)

    fireEvent.click(screen.getByText("View User Name"))

    screen.findAllByAltText("Peter").then((e)=>{

        console.log(e)

        expect(e).toBeInTheDocument()

    })

    fireEvent.click(screen.getByText("View User Password"))

    screen.findAllByAltText("abc").then((e)=>{

        console.log(e)

        expect(e).toBeInTheDocument()

    })

})