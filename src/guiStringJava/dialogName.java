package guiStringJava;

import javax.swing.*;

public class dialogName {
    public static void main(String[] args){
        String insertName = JOptionPane.showInputDialog("What u r Name : ");
        String tempMessage = String.format("Welcome %s",insertName);
        JOptionPane.showMessageDialog(null,tempMessage);
    }
}
