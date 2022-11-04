package schedule;
import java.awt.*;

public class AppSchedule extends javax.swing.JFrame {
    public static void main(String[] args){
        EventQueue.invokeLater(() -> {
            new Panel().setVisible(true);  
        });
    }
}
