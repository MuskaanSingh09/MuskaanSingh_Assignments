const result = (myArr) =>
{
    for(const i of myArr)
    {
        let len = i.length;
        let obj = {
            name: i,
            length: len
        };
        newArr.push(obj);
    }
    return(newArr);
}
let newArr =[];
let myArr = ["red", "green", "yellow"];
const sol=result(myArr);
console.log(myArr);
console.log(sol);
