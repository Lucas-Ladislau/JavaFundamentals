class Pessoa{
    nome;
    peso;
    altura;

    constructor(nome, peso, altura){
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    calculoIMC(){
        return this.peso/(this.altura*this.altura)
    }
}

const jose = new Pessoa("José", 70, 1.75);
console.log(jose.calculoIMC());