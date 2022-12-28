package Lab4.Question1;

import javax.swing.JOptionPane;

public class Dialog {
    public Dialog(){}

    public void display(){
        String name = JOptionPane.showInputDialog("What is your name?");
        String message = String.format("Welcome, %s, to Java Programming!", name);
        JOptionPane.showMessageDialog(null, message);
    }
}
