import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // Create Frame
        JFrame frame = new JFrame("ONLINE VOTING SYSTEM");
        frame.setSize(800, 500);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(173, 216, 230)); // Light Blue

        // Title Label
        JLabel title = new JLabel("ONLINE VOTING SYSTEM", SwingConstants.CENTER);
        title.setFont(new Font("Verdana", Font.BOLD, 36));
        title.setForeground(new Color(25, 25, 112)); // Dark Blue
        title.setBounds(0, 50, 800, 50); 
        frame.add(title);

        // Name Label and TextField
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setFont(new Font("Arial", Font.BOLD, 18));
        nameLabel.setBounds(200, 150, 100, 30);
        frame.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(310, 150, 250, 30);
        frame.add(nameField);

        // Voter ID Label and TextField
        JLabel idLabel = new JLabel("Voter ID:");
        idLabel.setFont(new Font("Arial", Font.BOLD, 18));
        idLabel.setBounds(200, 200, 100, 30);
        frame.add(idLabel);

        JTextField idField = new JTextField();
        idField.setBounds(310, 200, 250, 30);
        frame.add(idField);

        // Participant Buttons (BNP, Awami League, NCP)
        JButton bnpBtn = new JButton("BNP");
        bnpBtn.setBounds(200, 270, 150, 40);
        bnpBtn.setBackground(new Color(135, 206, 250)); // Sky Blue
        frame.add(bnpBtn);

        JButton awamiBtn = new JButton("Awami League");
        awamiBtn.setBounds(400, 270, 150, 40);
        awamiBtn.setBackground(new Color(144, 238, 144)); // Light Green
        frame.add(awamiBtn);

        JButton ncpBtn = new JButton("NCP");
        ncpBtn.setBounds(300, 330, 150, 40);
        ncpBtn.setBackground(new Color(255, 182, 193)); // Light Pink
        frame.add(ncpBtn);

        frame.setVisible(true);
    }
}
