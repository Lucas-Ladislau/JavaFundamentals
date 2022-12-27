// Objetos são baseados em chave-valor, eles podem possuir
//atributos e métodos
const lucas = {
    nome: "Lucas Anderson ",
    idade : 21,

    descrever: function(){
        console.log(`Meu nome é ${this.nome} e minha idade ${this.idade}`);
    }
};

console.log(lucas);
console.log(lucas.idade);
// Com JS é possível incrementar valores ao objeto
lucas.altura= 1.75;
console.log(lucas);

// delete lucas.idade;
console.log(lucas);

lucas.descrever();
lucas.idade = 22;
lucas.descrever();

lucas.descrever = function(){
    console.log(`Olá me chamo ${this.nome}`);
}
lucas.descrever();


