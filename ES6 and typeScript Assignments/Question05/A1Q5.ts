//a

function add(a,b){
    return a+b;
}
console.log(add(10,10));

//b

function userFriends(username: string, ...names:string[])
{
    return username + "'s friends are " + names.join(", ");

}

var friends = ["Suruchi", "Swati", "Nilesh"];
console.log(userFriends("ruchi",...friends));

//c
function printCapitalNames(
    a: string,
    b: string,
    c: string,
    d: string,
    e: string
  ): void {
    console.log(a.toUpperCase());
    console.log(b.toUpperCase());
    console.log(c.toUpperCase());
    console.log(d.toUpperCase());
    console.log(e.toUpperCase());
  }
  
  let myNames: [string, string, string, string, string] = [
    "Alpha",
    "Bravo",
    "Charlie",
    "Delta",
    "Echo",
  ];
  
  printCapitalNames(...myNames);