function validarmsg() {
    let nome = formContato.nome.value;
    let email = formContato.email.value;
    let tel = formContato.tel.value;
    let descricao = formContato.descricao.value

    if (nome == "") {
        alert(`Por gentileza digite o seu nome!`)
        formContato.nome.focus()
        return false;
    } else
        if (email == "") {
            alert("Por gentileza digite o seu Email!")
            formContato.email.focus()
            return false;
        } else
            if (tel == "") {
                alert("Por gentileza digite o seu Telefone!")
                formContato.tel.focus()
                return false;
            } else 
            if (descricao == ""){
                alert("Por gentileza digite a mensagem que deseja enviar!")
                formContato.descricao.focus()
                return false;
            }else
                alert(`Olá ${nome} sua mensagem foi enviada com SUCESSO!`)
    }
function alterarTexto() {
    let texto = document.getElementById('title')
    let nome = formContato.nome.value
    texto.innerHTML = `Olá ${nome}, Bom dia!`
    return false;
}
