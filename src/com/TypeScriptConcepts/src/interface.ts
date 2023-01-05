interface dados{
    nome: String;
    sobrenome: String;
    idade: number;
    sayhello():string;
}

class Pessoa implements dados{
    nome: String;
    sobrenome: String;
    idade: number;

    constructor(nome: string, sobrenome:string ,idade: number){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;

    }
    
    sayhello(): string {
        return "Hi";
    }

}