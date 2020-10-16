package main;

import javax.swing.*;

public class ScheduleSmart {
    private JPanel mainPanel;

    public ScheduleSmart() {
        JFrame frame = new JFrame("Problem Solver");
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(ScheduleSmart::new);
    }
}
