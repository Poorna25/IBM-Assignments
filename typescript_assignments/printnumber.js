"use strict";
exports.__esModule = true;
var readline = require("readline");
var valFromRuntime = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
var answer;
valFromRuntime.question('Enter a string', function (answer) {
    console.log(answer);
    var len = answer.length;
    var count = 0;
    for (var i = 0; i < len; i++) {
        var flag = 0;
        if (answer.charAt(i) == 'a' || answer.charAt(i) == 'e' || answer.charAt(i) == 'i' || answer.charAt(i) == 'o' || answer.charAt(i) == 'u') {
            for (var j = 0; j < len; j++) {
                if (i != j && answer.charAt(i) == answer.charAt(j)) {
                    flag = 1;
                }
            }
        }
        if (flag == 1) {
            console.log(answer.charAt(i));
            count++;
        }
    }
    console.log("NUmber of repeating vowels: " + count);
    valFromRuntime.close();
});
