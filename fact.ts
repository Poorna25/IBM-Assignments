import * as readline from 'readline';
let valFromRuntime = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });
valFromRuntime.question('enter the input number', (ans:any) => {
    var fact:number=1;
    for(var i=1;i<=ans;i++){
        fact = fact*i;
}
console.log(fact);
valFromRuntime.close;
});