package Cadastro;
import javax.swing.JOptionPane;
public class Teste {
    
    int n = 5; // tamanho do vetor
    String v[] = new String[n]; // declaração e alocação de espaço para o vetor "v"
    int i; // índice ou posição
    
    public int menu(){
 
       int op = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a opção desejada  \n \n 1 - Cadastrar \n 2 - Consultar \n 3 - Alterar \n 4 - Ordenar Crescente \n 5 - Ordenar Decrescente \n 6 - Excluir \n 7 - Imprimir \n 8 - Sair \n \n" ,"Cadastro",1)); 
       return op; 
     
    }
    
    public void cadastrar(){
        
        //processando os "n" elementos do vetor "v"
        for (i=0; i<5; i++) {
            v[i] = JOptionPane.showInputDialog(null,"Digite o nome " + (i+1),"Cadastro",1); // na i-ésima posição do vetor "v" armazena o valor da variável "i" 
        }
        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!", "Aviso", 1);       
     
    }
    
    public void consultar(String nome){        
        
        boolean en=false;
        int in=0;
        //processando os "n" elementos do vetor "v"
        while((in<5) && (en==false)){             
            if (v[in].equals(nome)){
                en=true;
            }else{
                in++;}
        }
        
        if (en==true){
            JOptionPane.showMessageDialog(null, "Nome consta no vetor!", "Aviso", 1);
        }else{
            JOptionPane.showMessageDialog(null, "Nome não consta no vetor!", "Aviso", 1);
        }       
     
    }
    
    public void alterar(String nome){        
        
        boolean en=false;
        int in=0;
        //processando os "n" elementos do vetor "v"
        while((in<5) && (en==false)){             
            if (v[in].equals(nome)){
                en=true;
            }else{
                in++;}
        }
        
        if (en==true){
            v[i] = JOptionPane.showInputDialog(null,"Digite o novo nome " ,"Alterar",1); 
            JOptionPane.showMessageDialog(null, "Nome alterado com sucesso!", "Aviso", 1);
        }else{
            JOptionPane.showMessageDialog(null, "Nome não consta no vetor!", "Aviso", 1);
        }       
     
    }
    
    public void ordcrescente(){
        
        int y,z;
        String aux;
        
        for (int in=0; in<4; in++) {
            for (y=in+1;y<5;y++){
                z=(v[in]).compareTo(v[y]);
                if(z>0){
                    aux=v[in];
                    v[in]=v[y];
                    v[y]=aux;
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
                 z=(v[in]).compareTo(v[y]);
                if(z<0){
                    aux=v[in];
                    v[in]=v[y];
                    v[y]=aux;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Ordenação concluída!", "Ordem decrescente", 1);
        
    }
    
    public void excluir(String nome){        
        
        int y;
        boolean en=false;
        int in=0;
        //processando os "n" elementos do vetor "v"
        while((in<5) && (en==false)){             
            if (v[in].equals(nome)){
                en=true;                
            }else{
                in++;}
        }        
        
        if (en==true){
            for (y=in; y<4; y++) {
                v[y]=v[y+1];                    
            }
            v[4]="";            

            JOptionPane.showMessageDialog(null, "Nome excluído com sucesso!", "Exclusão", 1);
       }else{
            JOptionPane.showMessageDialog(null, "Nome não consta no vetor!", "Aviso", 1);
        }
    }    
    
    public void imprimir(){
        String imp="";
        
        for (int in=0; in<5; in++) {
            imp=imp + v[in]+"\n";
        }
        
        JOptionPane.showMessageDialog(null, imp, "Imprimir", 1);
    }
    
}
    
