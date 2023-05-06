function suporte(){
    var Usuario = document.getElementById("Usuario").value;
    var Senha = document.getElementById("Senha").value;

    if(Usuario == "admin" &&  Senha == "admin"){
        alert('SUPORTE ENVIADO');
    }else{
        alert('USURARIO OU SENHA INCORRETO');
    }
}
