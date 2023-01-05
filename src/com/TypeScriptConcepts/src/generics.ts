//"..." é chamado de spread e indica que receberá mais de um parametro
function concatArray<T>(...itens: T[]): T[]{
    return new Array().concat(...itens);
}

const numArray = concatArray<number[]>([13,43,6], [543,3]);
// numArray.push("hds"); //não posso dar o push pois esta com 
//generecs de number
const strArray = concatArray<string[]>(["hey","pomme"], ["ola"]);

console.log(numArray);
console.log(strArray);