import {useState, useEffect} from 'react';
import axios from 'axios';

const UserComponent = props => {

    const [users, setUsers] = useState([]); //the components state(local data)

    //componentDidMount lifecycle function
    useEffect(() => {
        axios.get('http://localhost:8080/api/users').then(response => setUsers(response.data)).catch(e => console.log(e)); //fetch the endpoint then store the data into the component's state
    })

    return(
        <div className="container-fluid">
            <h1 className="text-center">Users List</h1>
            <table className="table table-striped">
                <thead>
                    <tr>
                        <td>User Id</td>
                        <td>User First Name</td>
                        <td>User Last Name</td>
                        <td>User email</td>
                    </tr>
                </thead>
                <tbody>
                    {users.map(user => <tr key={user.id}>
                        <td>{user.id}</td>
                        <td>{user.firstName}</td>
                        <td>{user.lastName}</td>
                        <td>{user.email}</td>
                    </tr>) /*loop through each user and render new table data*/}
                </tbody>
            </table>
        </div>
    );
    
    

};

export default UserComponent;