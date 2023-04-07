
package tabuada;
import java.util.Scanner;

public class Tabuada {

   
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in,"UTF-8");
        Operaciones calc = new Operaciones();
        String resp = "";
        int op, n1;
            System.out.println("SELECIONE A OPCAO DESEJADA:\n\n 1 - Adicao \n 2 - Subtracao \n 3 - Multiplicacao \n 4 - Divisao \n 5 - Sair do programa\n\n");
        op = read.nextInt();
            System.out.println("Insira o numero que deseja na tabuada");
        n1 = read.nextInt();

        if( op == 5){
            System.exit(0);
        }
        for(int i = 1; i < 11; i++){
            if(op == 1){resp = calc.adicao(n1, i);}
            else if(op == 2){resp = calc.subtracao(n1, i);}
            else if(op == 3){resp = calc.multiplicaçao(n1, i);}
            else if(op == 4){resp = calc.divisao(n1, i);}
        }
        
        System.out.println(resp);
    }
    
}
