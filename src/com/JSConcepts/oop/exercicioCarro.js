class Carro{
    marca;
    cor;
    gastoMedioKM;

    constructor(marca, cor, gastoMedioKM){
        this.marca = marca;
        this.cor = cor;
        this.gastoMedioKM = gastoMedioKM;
    }

    consumo(km, preco){
        let gasto = km* this.gastoMedioKM * preco;
        console.log(`O gasto de combustível em ${km} foi de R$${gasto}`)
    }
}

const toro = new Carro("Fiat", "Cinza",1/10);
toro.consumo(70, 5);