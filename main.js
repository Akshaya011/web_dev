// const person={
//     firstname: 'john',
//     lastname: 'cena',
//     age: 18,
//     hobbies: ['playing', 'cricket', 'music'],
//     address: {
//         street:'34 masin st',
//         city: 'patna',
//         state: 'bihar'
//     }
// }
// console.log(person.firstname, person.lastname);
// console.log(person.hobbies[1]);
// console.log(person.address.city);

// const { firstname, lastname, address:{city}} = person;
// console.log(firstname);
// console.log(city);

// person.email= 'john123@gmail.com';

// console.log(person);

const todos = [
    {
        id: 1,
        Text: 'take out trash',
        iscompleted: true
    },
    {
        id: 2,
        Text: 'meeting with boss',
        iscompleted: true
    },
    {
        id: 3,
        Text: 'dentist appt',
        iscompleted: false
    },
];
console.log(todos[1].Text);

const todoJSON = JSON.stringify(todos);
console.log(todoJSON);

for (let i = 0; i < todos.length; i++) {
    console.log(todos[i].Text);
    
}
const todoText = todos.map(function(todo)){
    return todo.Text;
    
}