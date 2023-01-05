class Personagem {
    nome: string;
    forca: number;
    habilidades?: string; // a interrogasção faz com que habilidade seja opcional

    constructor(nome: string, forca: number, habilidades?: string){
        this.nome = nome;
        this.forca = forca;
        this.habilidades = habilidades;
    }

    attack(){
        console.log(`O ataque foi de ${this.forca}`);
    }
}

const p1 = new Personagem("Scorpion", 12);
p1.attack();