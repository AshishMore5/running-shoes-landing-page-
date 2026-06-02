import javax.swing.*;
import java.awt.event.*;

public class RUNXApp extends JFrame implements ActionListener {

    JLabel title, message;
    JButton shopBtn, lightBtn, comfortBtn, designBtn;

    public RUNXApp() {

        setTitle("RUNX Shoes");
        setSize(500, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        title = new JLabel("RUNX - Running Shoes");
        title.setBounds(140, 20, 250, 30);
        add(title);

        message = new JLabel("Click a button to learn more!");
        message.setBounds(120, 60, 300, 30);
        add(message);

        shopBtn = new JButton("Shop Now");
        shopBtn.setBounds(180, 110, 120, 40);
        add(shopBtn);

        lightBtn = new JButton("Lightweight");
        lightBtn.setBounds(50, 200, 120, 40);
        add(lightBtn);

        comfortBtn = new JButton("Comfort Fit");
        comfortBtn.setBounds(180, 200, 120, 40);
        add(comfortBtn);

        designBtn = new JButton("Modern Design");
        designBtn.setBounds(310, 200, 140, 40);
        add(designBtn);

        shopBtn.addActionListener(this);
        lightBtn.addActionListener(this);
        comfortBtn.addActionListener(this);
        designBtn.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == shopBtn) {
            message.setText("Welcome to RUNX Store!");
        }

        if (e.getSource() == lightBtn) {
            message.setText("Ultra-light materials for smooth running.");
        }

        if (e.getSource() == comfortBtn) {
            message.setText("Soft cushioning for all-day comfort.");
        }

        if (e.getSource() == designBtn) {
            message.setText("Modern style for sports and casual wear.");
        }
    }

    public static void main(String[] args) {
        new RUNXApp();
    }
}