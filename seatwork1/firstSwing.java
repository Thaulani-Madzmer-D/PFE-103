import javax.swing.*;
import java.awt.*;

public class firstSwing {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("My FirstMadz Swing App"); // window title
            frame.setSize(600, 600);                         // window size
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());

            JLabel message = new JLabel("Hello Madz! Welcome to my first Java Swing program!!!.", SwingConstants.CENTER);
            message.setFont(new Font("Arial", Font.PLAIN, 12));
            frame.add(message, BorderLayout.CENTER);          // displayed text

            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
