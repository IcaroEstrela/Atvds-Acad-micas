    var n1;
    var n2;
    var op;
    var result;

function operar(){
    var n1 = document.getElementById('n1').value;
    var n2 = document.getElementById('n2').value;
    var op = document.getElementById('op').value;
    
    if(isNaN(n1) || isNaN(n2)){
        alert('CARACTER INVÁLIDO!');
    }else if(op == "+"){
        result = parseFloat(n1) + parseFloat(n2);
        alert('RESULTADO: ' + result);  
    }else if(op == "-"){
        result = parseFloat(n1) - parseFloat(n2);
        alert('RESULTADO: ' + result);     
    }else if(op == "*"){
        result = parseFloat(n1) * parseFloat(n2);
        alert('RESULTADO: ' + result);       
    }else if(op == "/"){
        result = parseFloat(n1) / parseFloat(n2);
        alert('RESULTADO: ' + result);   
    }
}

