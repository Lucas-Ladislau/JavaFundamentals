//declaracação de variáveis com tipagem
let ligado:boolean = false;

let indefinido:undefined = undefined;
let nulo:null = null;

//objetos - sem previsibilidade
let pessoa:object = {
    nome:"Lucas",
    idade: 12,
    sobrenome: "anderson"
}

//podendo criar um novo tipo, como
//se fosse uma struct
type ProdutoLoja ={
    nome: string;
    unidades: number;
    preço: number;
};

let meuProduto: ProdutoLoja ={
    nome: "lápis",
    preço: 12.4,
    unidades: 4
}



//Funções
function soma(x:number,y:number):number{
    return x+y;
}

function digaOla(nome:string){
    return `Olá ${nome}`;
}

// console.log(digaOla("João"));

//a função pode retornar 2 tipos
function retornarCPF(cpf: string | number){
    return cpf;
}