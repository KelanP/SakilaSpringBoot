import React from "react";

import 'bootstrap/dist/css/bootstrap.min.css';
import Form from "react-bootstrap/Form";
import Button from "react-bootstrap/Button";
import Container from "react-bootstrap/Container";


class AccountCreation extends React.Component{
    render(){
        return(
            <Container className={"buffer-top"}>
                <h2>Create an account:</h2>

                <Form>
                    <Form.Group className="mb-3" controlId="formBasicFirstName" id={"form-firstname"}>
                        <Form.Label>First Name</Form.Label>
                        <Form.Control type="firstname" placeholder="Enter first name" />
                    </Form.Group>
                    <Form.Group className="mb-3" controlId="formBasicLastName" id={"form-lastname"}>
                        <Form.Label>Last Name</Form.Label>
                        <Form.Control type="lastname" placeholder="Enter last name" />
                    </Form.Group>

                    <Form.Group className="mb-3" controlId="formBasicEmail" id={"form-email"}>
                        <Form.Label>Email address</Form.Label>
                        <Form.Control type="email" placeholder="Enter email" />
                        <Form.Text className="text-muted">
                            We'll never share your email with anyone else.
                        </Form.Text>
                    </Form.Group>

                    <Form.Group className="mb-3" controlId="formBasicPassword" id={"form-password"}>
                        <Form.Label>Password</Form.Label>
                        <Form.Control type="password" placeholder="Password" />
                    </Form.Group>
                    <Form.Group className="mb-3" controlId="formBasicCheckbox" id={"form-checkbox"}>
                        <Form.Check type="checkbox" label="Check this box if you'd like to receive our weekly newsletter" />
                    </Form.Group>
                    <Button variant="primary" type="submit">
                        Submit
                    </Button>
                </Form>


            </Container>



        );
    }
}

export default AccountCreation;