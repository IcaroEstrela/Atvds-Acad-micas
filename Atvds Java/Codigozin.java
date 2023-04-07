package codigozin;

import javax.swing.JButton;

public class Codigozin {
    

     public static void mover (JButton bp, JButton vb1, JButton vb2) {
        if(vb1.getText().equals("")){
            vb1.setText(bp.getText());
            bp.setText("");
        }else if(vb2.getText().equals("")){
            vb2.setText(bp.getText());
            bp.setText("");
        } 
    }
  
    public static void mover (JButton bp, JButton vb1, JButton vb2, JButton vb3) {
        if(vb1.getText().equals("")){
            vb1.setText(bp.getText());
            bp.setText("");
        }else if(vb2.getText().equals("")){
            vb2.setText(bp.getText());
            bp.setText("");
        }else if(vb3.getText().equals("")){
            vb3.setText(bp.getText());
            bp.setText("");
        
        }
    }  
     public static void mover (JButton bp, JButton vb1, JButton vb2, JButton vb3, JButton vb4) {
        if(vb1.getText().equals("")){
            vb1.setText(bp.getText());
            bp.setText("");
        }else if(vb2.getText().equals("")){
            vb2.setText(bp.getText());
            bp.setText("");
        }else if(vb3.getText().equals("")){
            vb3.setText(bp.getText());
            bp.setText("");
        }else if(vb4.getText().equals("")){
            vb4.setText(bp.getText());
            bp.setText("");
 
        }
    }  
}
