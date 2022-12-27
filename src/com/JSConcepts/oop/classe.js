class Pessoa{
    nome;
    idade;
    anoDeNascimento;


    constructor(nome, idade){
        this.nome = nome;
        this.idade = idade;
        this.anoDeNascimento = 2022 - idade;
    }

    descrever(){
        console.log(`Meu nome é ${this.nome} e minha idade ${this.idade}, ${this.anoDeNascimento}`);
    }
}

// Instanciando uma classe
const joao = new Pessoa('Joao Alexandre', 24);

const marcus = new Pessoa('Marcus Jorge', 27);
// marcus.nome = 'Marcus Jorge';
// marcus.idade = 27;

const denis = new Pessoa("denis Araujo", 23);

joao.descrever();
marcus.descrever();
denis.descrever();

function compararIdades(pessoa1, pessoa2){
    if(pessoa1.idade > pessoa2.idade){
        console.log(`${pessoa1.nome} é mais velho(a) que ${pessoa2.nome}`);
    }else if(pessoa1.idade < pessoa2.idade){
        console.log(`${pessoa2.nome} é mais velho(a) que ${pessoa1.nome}`);
    }else{
        console.log(`${pessoa2.nome} e ${pessoa1.nome} possuem a mesma idade`);
    }
}
compararIdades(joao, marcus);
