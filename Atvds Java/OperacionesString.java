
package cadastro;
import javax.swing.JOptionPane;

public class OperacionesString {
    int n = 5; 
    String no[] = new String[n]; 
    int i;

    public int menu(){
        int op = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a opção desejada  \n \n 1 - Cadastrar \n 2 - Consultar \n 3 - Alterar \n 4 - Ordenar Crescente \n 5 - Ordenar Decrescente \n 6 - Excluir \n 7 - Imprimir \n 8 - Sair \n \n" ,"Cadastro",1)); 
        return op;
        
    } 
    public void cadastrar(){
        for (i=0; i<5; i++) {
            no[i] = JOptionPane.showInputDialog(null,"Insira o " + (i+1)+ "º nome","Cadastro",1); // na i-ésima posição do vetor "v" armazena o valor da variável "i" 
        }
        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!", "Aviso", 1);  
    }
    public void consultar(String nome){        
        
        boolean en=false;
        int in=0;
        while((in<5) && (en==false)){             
            if (no[in].equals(nome)){
                en=true;
            }else{
                in++;}
        }
        
        if (en==true){
            JOptionPane.showMessageDialog(null, "Nome consta no cadastro!", "Aviso", 1);
        }else{
            JOptionPane.showMessageDialog(null, "Nome não consta no cadastro!", "Aviso", 1);
        } 
    }
    public void alterar(String nome){
        boolean en=false;
        int in=0;
        
        while((in<5) && (en==false)){             
            if (no[in].equals(nome)){
                en=true;
            }else{
                in++;}
        }
        
        if (en==true){
            no[in] = JOptionPane.showInputDialog(null,"Digite o novo nome " ,"Alterar",1); 
            JOptionPane.showMessageDialog(null, "Nome alterado com sucesso!", "Aviso", 1);
        }else{
            JOptionPane.showMessageDialog(null, "Nome não consta no cadastro!", "Aviso", 1);
        }       
    }
    public void ordcrescente(){
        
        int y,z;
        String aux;
        
        for (int in= 0;in<4; in++) {
            for (y=in+1;y<5;y++){
                z=(no[in]).compareTo(no[y]);
                if(z>0){
                    aux=no[in];
                    no[in]=no[y];
                    no[y]=aux;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Ordenação concluída!", "Ordem crescente", 1);
        
    }
    
    public void orddecrescente(){
        
        int y,z;
        String aux;
        
        for (int in=0; in<4; in++) {
            for (y=in+1;y<5;y++){
                z=(no[in]).compareTo(no[y]);
                if(z<0){
                    aux=no[in];
                    no[in]=no[y];
                    no[y]=aux;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Ordenação concluída!", "Ordem decrescente", 1);
        
    }
    
    public void excluir(String nome){        
        
        int y;
        boolean en=false;
        int in=0;
        
        while((in<5) && (en==false)){             
            if (no[in].equals(nome)){
                en=true;                
            }else{
                in++;}
        }        
        
        if (en==true){
            for (y=in; y<4; y++) {
                no[y]=no[y+1];                    
            }
            no[4]="";            

            JOptionPane.showMessageDialog(null, "Nome excluído com sucesso!", "Exclusão", 1);
       }else{
            JOptionPane.showMessageDialog(null, "Nome não consta no vetor!", "Aviso", 1);
        }
    }    
    
    public void imprimir(){
        String imp="";
        
        for (int in=0; in<5; in++) {
            imp=imp + no[in]+"\n";
        }
        
        JOptionPane.showMessageDialog(null, imp, "Imprimir", 1);
    }
    
}
