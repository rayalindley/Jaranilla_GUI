package LeapYearChecker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYear extends JFrame {
    private JTextField tfYear;
    private JButton checkButton;
    private JPanel jpanel;



    public LeapYear() {
        checkButton.addActionListener(e -> {
            int year = Integer.parseInt(tfYear.getText());

            if((year/4)%4==0) {
                JOptionPane.showMessageDialog(this, "Leap Year", "Message", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Not a Leap Year", "Message", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        LeapYear app = new LeapYear();

        app.setTitle("Leap Year Checker");
        app.setVisible(true);
        app.setContentPane(app.jpanel);
        app.setSize(300, 300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
