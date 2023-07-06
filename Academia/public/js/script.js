var nome = document.getElementById('nome').value;
var email = document.getElementById('email').value;
var tel = document.getElementById('tel').value;
var descricao = document.getElementById('descricao').value;

function validarmsg(){
    if (nome == "") {
        alert(`Por gentileza digite seu nome!`)
    } else
        if (email == "") {
            alert('Por gentileza digite o seu Email!')
        } else
            if (tel == "") {
                alert('Por gentileza digite o seu Telefone!')
            } else 
                if (descricao == ""){
                    alert('Por gentileza digite a mensagem que deseja enviar!')
                }else
                    alert(`Olá maromba sua mensagem foi enviada com SUCESSO!`)
}

