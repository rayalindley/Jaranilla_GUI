package FoodOrderingSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderingSystem extends JFrame {
    private JPanel jpanel;
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton orderButton;

    public FoodOrderingSystem() {
        orderButton.addActionListener(e ->  {
            double total = 0;

            if(cPizza.isSelected()) {
                total += 100;
            }

            if(cBurger.isSelected()) {
                total += 80;
            }

            if(cFries.isSelected()) {
                total += 65;
            }

            if(cSoftDrinks.isSelected()) {
                total += 55;
            }

            if(cTea.isSelected()) {
                total += 50;
            }

            if(cSundae.isSelected()) {
                total += 40;
            }



            if(rbNone.isSelected()) {
                JOptionPane.showMessageDialog(this, "The total price is " + String.format("%.2f", total), "Message", JOptionPane.INFORMATION_MESSAGE);
            }

            if(rb5.isSelected()) {
                JOptionPane.showMessageDialog(this, "The total price is " + String.format("%.2f", total-(total*0.05)), "Message", JOptionPane.INFORMATION_MESSAGE);
            }

            if(rb10.isSelected()) {
                JOptionPane.showMessageDialog(this, "The total price is " + String.format("%.2f", total-(total*0.1)), "Message", JOptionPane.INFORMATION_MESSAGE);
            }

            if(rb15.isSelected()) {
                JOptionPane.showMessageDialog(this, "The total price is " + String.format("%.2f", total-(total*0.15)), "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        FoodOrderingSystem app = new FoodOrderingSystem();
        app.setContentPane(app.jpanel);
        app.setSize(800, 500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Food Ordering System");
    }
}
