
var hora = new Date().getHours();
var nome = prompt("Qual é o seu nome?");

function BemVindo(){
    if(hora < 12){
        document.write("Bom dia, " + nome + "!");
    }else if(hora < 18){
        document.write("Boa tarde, " + nome + "!");
    }else if(hora > 18){
        document.write("Boa noite, " + nome + "!");
    }
}