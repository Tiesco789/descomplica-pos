/**
 * Classe
 */
class Pessoa {
    constructor(firstName, lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    falar() {
        console.log("Olá, eu sou o " + this.firstName);
    }

    get fullName() {
        console.log(`${this.firstName} ${this.lastName}`);
    }
}

var p1 = new Pessoa("John", "Doe");
p1.falar();
Pessoa.fullName;