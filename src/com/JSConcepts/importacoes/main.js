const func = require('./funcoesaux');
// Mesma coisa de func só que utilizando destructuring
const {gets, print} = require('./funcoesaux');

console.log(func)
print("Olá mundo");
print(gets());
