function cadastrar(){
    if(Usuario == "flamengo" &&  Senha == "flamengo"){
        alert('Sucesso');
    }else{
        alert('Usuario ou senha incorretos');
    }
}
function modo(modo){
    switch(modo){
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

