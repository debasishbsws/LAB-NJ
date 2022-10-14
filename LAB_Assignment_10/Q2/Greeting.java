import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Greeting extends JFrame implements ActionListener {

    JLabel jLabel;
    JButton jButton1, jButton2, jButton3;

    Greeting() {

        JFrame jFrame = new JFrame("Greeting");
        jFrame.setSize(500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jPanel = new JPanel();
        jButton1 = new JButton("Good Morning");
        jButton2 = new JButton("Good Afternoon");
        jButton3 = new JButton("Good Evening");
        jLabel = new JLabel("");

        jButton1.addActionListener(this);
        jButton2.addActionListener(this);
        jButton3.addActionListener(this);
        jPanel.setSize(500, 500);
        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jPanel.add(jButton3);
        jPanel.add(jLabel);

        jFrame.add(jPanel);

        jFrame.pack();
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Greeting();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jButton1) {
            jLabel.setText("Good Morning");
        } else if (e.getSource() == jButton2) {
            jLabel.setText("Hello");
        } else if (e.getSource() == jButton3) {
            jLabel.setText("Welcome");
        }
    }
}