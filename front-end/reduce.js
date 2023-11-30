/**
 * Reduce
 */

let total = 0;
let numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
for (let i = 0; i < numeros.length; i++) {
    total += numeros[i];
}
console.log(total);

var numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
var totalNumb = numbers.reduce(function (total, numeros) {
    return total + numeros;
}, 0);

console.log(totalNumb);
