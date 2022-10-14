
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SellingDress extends JFrame implements ActionListener {

    JLabel jLabel;
    JCheckBox jCheckBox1, jCheckBox2, jCheckBox3, jCheckBox4, jCheckBox5;
    JButton jButton;

    SellingDress() {

        JFrame jFrame = new JFrame("Selling Dress");
        jFrame.setSize(500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jPanel = new JPanel();
        jCheckBox1 = new JCheckBox("Saree");
        jCheckBox2 = new JCheckBox("Kurta");
        jCheckBox3 = new JCheckBox("Salwar");
        jCheckBox4 = new JCheckBox("Shirt");
        jCheckBox5 = new JCheckBox("Jeans");
        jButton = new JButton("Bill");
        jLabel = new JLabel("");

        jButton.addActionListener(this);
        jPanel.setSize(500, 500);
        jPanel.add(jCheckBox1);
        jPanel.add(jCheckBox2);
        jPanel.add(jCheckBox3);
        jPanel.add(jCheckBox4);
        jPanel.add(jCheckBox5);
        jPanel.add(jButton);
        jPanel.add(jLabel);

        jFrame.add(jPanel);

        jFrame.pack();
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SellingDress();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int total = 0;
        if (jCheckBox1.isSelected()) {
            total += 1000;
        }
        if (jCheckBox2.isSelected()) {
            total += 500;
        }
        if (jCheckBox3.isSelected()) {
            total += 700;
        }
        if (jCheckBox4.isSelected()) {
            total += 800;
        }
        if (jCheckBox5.isSelected()) {
            total += 900;
        }
        jLabel.setText(String.valueOf(total));
    }
}