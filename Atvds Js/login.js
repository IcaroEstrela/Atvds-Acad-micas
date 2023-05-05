function logar(){
    var Usuario = document.getElementById("Usuario").value;
    var Senha = document.getElementById("Senha").value;
    if(Usuario == "admin" &&  Senha == "admin"){
        alert('Sucesso');
        location.href = "bemvindo.html"
    }else{
        alert('Usuario ou senha incorretos');
    }
}