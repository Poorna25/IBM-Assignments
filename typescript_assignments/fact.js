"use strict";
exports.__esModule = true;
var readline = require("readline");
var valFromRuntime = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
valFromRuntime.question('enter the input number', function (ans) {
    var fact = 1;
    for (var i = 1; i <= ans; i++) {
        fact = fact * i;
    }
    console.log(fact);
    valFromRuntime.close;
});
