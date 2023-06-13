function validarNome(){
    let nome = formContato.nome.value;
    let email = formContato.email.value;
    let telefone = formContato.tel.value

    if(nome==""){
        alert('Digite seu nome seu jumento(a)!')
        formContato.nome.focus()
        return false;
    }else 
        if(email == ""){
            alert('Digite seu email seu burro(a)!')
            formContato.email.focus()
            return false;
    }else 
    if(telefone == ""){
        alert('Digite seu telefone seu animal!')
        formContato.tel.focus()
        return false;
    } else {
        alert('Olá ${nome} sua mensagem foi enviada com SUCESSO!')
    }
}

function modo(modo){
    switch (modo) {
        case 'escuro':
            document.querySelector('body').style.background = 'black'
            document.querySelector('body').style.color = 'white'
            document.getElementById('claro').style.display = 'block'
            document.getElementById('escuro').style.display = 'none'
            break;
        case 'claro':
            document.querySelector('body').style.background = 'white'
            document.querySelector('body').style.color = 'black'
            document.getElementById('claro').style.display = 'none'
            document.getElementById('escuro').style.display = 'block'
            break;
    }
}
function alterarTexto() {
    let texto = document.getElementById('title')
    let nome = formContato.nome.value
    texto.innerHTML = `Olá ${nome}, Bom dia!`
    return false;
}