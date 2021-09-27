persons = [["obaida",25,"syrian"],["Ahmad",20,"Lebanon"],["Ahmad",20]];

let person = 0
let info = 1

console.log(persons)
console.log(persons[0][2])

for (const items of persons) {
    for (const item of items) {
        console.log(item)
    }
}
