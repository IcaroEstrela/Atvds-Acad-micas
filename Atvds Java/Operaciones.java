package tabuada;


public class Operaciones {
    String resp = "";
    
    public String adicao(int a, int b){
        resp += a + " + " + b + " = " + (a+b) + "\n";
        
        return resp;
    }
    public String subtracao(int a, int b){
        resp += (a+b) + " - " + a + " = " + b + "\n";
        
        return resp;
    }
    public String multiplicaçao(int a, int b){
        resp += a + " x " + b + " = " + (a*b) + "\n";
        
        return resp;
    }
    public String divisao(int a, int b){
        resp += (a*b) + " / " + a + " = " + b + "\n";
        
        return resp;
    }
    
}
