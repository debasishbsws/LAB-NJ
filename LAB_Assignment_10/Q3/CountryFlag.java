import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class CountryFlag extends JFrame implements ActionListener {

    JLabel jLabel;
    JButton jButton1, jButton2, jButton3;
    ImageIcon imageIcon;

    CountryFlag() {

        JFrame jFrame = new JFrame("Country Flag");
        jFrame.setSize(500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jPanel = new JPanel();
        jButton1 = new JButton("India");
        jButton2 = new JButton("USA");
        jButton3 = new JButton("UK");
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
                new CountryFlag();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jButton1) {
            imageIcon = new ImageIcon("C:\\Users\\debasish\\Desktop\\Java\\LAB_Assignment_10\\Q3\\india.png"); // path
                                                                                                               // to
                                                                                                               // image
            jLabel.setIcon(imageIcon);
        } else if (e.getSource() == jButton2) {
            imageIcon = new ImageIcon("C:\\Users\\debasish\\Desktop\\Java\\LAB_Assignment_10\\Q3\\usa.png");
            jLabel.setIcon(imageIcon);
        } else if (e.getSource() == jButton3) {
            imageIcon = new ImageIcon("C:\\Users\\debasish\\Desktop\\Java\\LAB_Assignment_10\\Q3\\uk.png");
            jLabel.setIcon(imageIcon);
        }
    }
}
