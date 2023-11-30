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

// var arr1 = [1, 2, 3, 4, 5, 6];
// console.log(arr1.join(' '));

// var retirado = arr1.shift(); // Retira o primeiro item do array
// console.log(retirado);

// console.log(arr1);

// console.log("Posição do numero: " + arr1.indexOf(3));

// arr1.push(7); // Adiciona no ultimo indice do array
// console.log(arr1);

// arr1.pop(); // Retira o ultimo item do array
// console.log(arr1);

// Separar numeros positivos de negativos e retorne apenas os positivos
// var ar = [-5, 10, 15, 20, -3, 89];


// var arr2 = [1, 2, 3, 4, 5, 6, 7, 8, 9];
// arr2.splice(3, 8);
// console.log(arr2);

// var nomes = ["maria", "joao", "lucas", "pedro"];
// console.log(nomes);

// var novos = nomes.splice(1, 2, "luiz", "ronaldo");
// console.log(novos);

// var pais = ["brasil", "argentina", "colombia"];
// pais.unshift("uruguai")
// console.log(pais);
// pais.pop();
// pais.push();

// var mesesDoAno = ['janeiro', 'fevereiro', 'março', 'abril', 'maio', 'junho', 'julho', 'agosto', 'setembro', 'outubro', 'novembro', 'dezembro'];

// for (let i = 0; i < 4; i++) {
//     const trimestre = mesesDoAno.splice(0, 3);
//     console.log(trimestre);
// }

// var numeros = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9];

// var resultado = numeros.filter(item => item % 2 === 0);
// console.log(resultado);

// var numerosFiltrados = numeros.filter(
//     function (valor) {
//         return valor > 5;
//     }
// );
// console.log(numerosFiltrados);

// function buscarValores(valor) {
//     return valor < 5;
// }

// var numerosEcontrados = numeros.filter(buscarValores);
// console.log(numerosEcontrados);

// var r1 = numeros.filter((valor) => {
//     return valor < 5;
// });
// console.log(r1);

// var r2 = numeros.filter((valor) => valor < 5);

// var funcionario = [
//     {
//         nome: "Luis",
//         idade: 62
//     },
//     {
//         nome: "Davi",
//         idade: 22
//     },
//     {
//         nome: "Arthur",
//         idade: 18
//     },
//     {
//         nome: "Lucas",
//         idade: 40
//     }
// ];

// var pessoasListagem = funcionario.filter(
//     function (valor) {
//         return valor.nome.length < 5;
//     }
// );
// console.log(pessoasListagem);


var produtos = [
    {
        id: 1,
        descricao: "Smartphone",
        categoria: "Eletronico"
    },
    {
        id: 2,
        descricao: "Notebook",
        categoria: "Eletronico"
    },
    {
        id: 3,
        descricao: "Geladeira",
        categoria: "Eletrodomestico"
    },
];

var eletronicos = produtos.filter((el) => {
    if (el.categoria === "Eletronico") {
        return el.descricao
    }
});

console.log(eletronicos);