// var arr = [0, 1, 2, 3, 5, 9];

// for (let i = 0; i < arr.length; i++) {
//   const element = arr[i];
//   console.log(`Posição ${i}: ${element}`);
// }

// var carros = [];
// carros[0] = "Volvo";
// carros[1] = "Jeep";

// var motos = new Array("BMW", "YAMAHA", "HONDA");

// // Calcular media de toros os numeros de um array
// var soma = 0;
// for (let i = 0; i < arr.length; i++) {
//   soma += arr[i];
// }

// var media = soma / arr.length;
// console.log(media);

// // Retornar o maior nome de cidade em um array de cidades

// var cidades = ["Foz do Iguaçu", "Santa Teresinha", "São José dos Campos"];

// const maiorCidade = cidades.reduce((maior, cidade) => {
//   return cidade.nome > maior.nome ? cidade : maior;
// });

// console.log(maiorCidade);

var arr1 = [1, 2, 3, 4, 5, 6];
console.log(arr1.join(' '));

var retirado = arr1.shift(); // Retira o primeiro item do array
console.log(retirado);

console.log(arr1);

console.log("Posição do numero: " + arr1.indexOf(3));

arr1.push(7); // Adiciona no ultimo indice do array
console.log(arr1);

arr1.pop(); // Retira o ultimo item do array
console.log(arr1);

// Separar numeros positivos de negativos e retorne apenas os positivos
var ar = [-5, 10, 15, 20, -3, 89];


var arr2 = [1, 2, 3, 4, 5, 6, 7, 8, 9];
arr2.splice(3, 8);
console.log(arr2);

var nomes = ["maria", "joao", "lucas", "pedro"];
console.log(nomes);

var novos = nomes.splice(1, 2, "luiz", "ronaldo");
console.log(novos);

var pais = ["brasil", "argentina", "colombia"];
pais.unshift("uruguai")
console.log(pais);
pais.pop();
pais.push();
