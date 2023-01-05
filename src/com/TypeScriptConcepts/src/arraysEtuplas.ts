// Arrays: todos os métodos de array do js
//também estão presentes no TS
let dados: string[] = ["joão", "claudio"];
let dados2: Array<string> = ["joão", "claudio"];

//array com possibilidade de 2 tipos
let infos: (string | number)[]= ["joao", 23, "fabiano",23,4,4]

//tuplas
let boleto: [string, number, number, number]= ["conta de operadora", 12.4, 16342,343242]

//Datas
let diaCriancas: Date = new Date("2022-10-12 12:00");
// console.log(diaCriancas.toString());