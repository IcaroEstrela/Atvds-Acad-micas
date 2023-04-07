
package cadastro;

import javax.swing.JOptionPane;

    public class Cadastro {
        
        
        public static void main(String[] args) {
            OperacionesString op = new OperacionesString();
            
            int m;     
            do{
                m=op.menu();
                switch(m){
                       case 1:
                           op.cadastrar();
                           break;
                       case 2:
                           op.consultar(JOptionPane.showInputDialog(null,"Digite o nome que deseja consultar", "CONSULTA",1));
                           break;
                       case 3:
                           op.alterar(JOptionPane.showInputDialog(null,"Digite o nome que deseja alterar ","Alterar",1));
                           break;
                       case 4:
                           op.ordcrescente();
                                  
                           break;
                       case 5: 
                           op.orddecrescente();
                           break;
                       case 6: 
                           
                           break;
                       case 7:
                           op.imprimir();
                           break;
                }
            }while(m!=8);

        }
    }



