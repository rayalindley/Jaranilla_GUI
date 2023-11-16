package SimpleCalculator;

import javax.swing.*;
import java.util.Objects;

public class SimpleCalculator extends JFrame {
    private JPanel jpanel;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JTextField tfNumber2;
    private JButton btnCompute;
    private JTextArea lblResult;


    public SimpleCalculator() {
        btnCompute.addActionListener(e -> {
            int num1 = Integer.parseInt(tfNumber1.getText());
            int num2 = Integer.parseInt(tfNumber2.getText());
            String op = (String) cbOperations.getSelectedItem();
            double res;

            if(Objects.equals(op, "+")) {
                res = num1 + num2;
                lblResult.append(String.valueOf(res));
            } else if(Objects.equals(op, "-")) {
                res = num1 - num2;
                lblResult.append(String.valueOf(res));
            } else if(Objects.equals(op, "*")) {
                res = num1 * num2;
                lblResult.append(String.valueOf(res));
            } else if(Objects.equals(op, "/")) {
                res = num1 / num2;
                lblResult.append(String.valueOf(res));
            }
        });
    }

    public static void main(String[] args) {
        SimpleCalculator calcu = new SimpleCalculator();

        calcu.setTitle("Simple Calculator");
        calcu.setContentPane(calcu.jpanel);
        calcu.setSize(800, 500);
        calcu.setDefaultCloseOperation(EXIT_ON_CLOSE);
        calcu.setVisible(true);
    }
}
