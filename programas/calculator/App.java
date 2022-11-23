package calculator;
import java.awt.*;

public class App extends javax.swing.JFrame{
    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            public void run(){
                new Panel().setVisible(true);
            }    
        });
    }
}
