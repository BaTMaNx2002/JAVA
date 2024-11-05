import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class BeautifulBirthdayWishApp extends JFrame {
    private JLabel birthdayMessage;
    private JLabel animatedImage;
    private int xPosition = 50;  // Horizontal position of the image
    private int yPosition = 200; // Vertical position of the image
    private int xSpeed = 5; // Speed of horizontal movement
    private int ySpeed = 3; // Speed of vertical movement

    // Constructor to set up the GUI components
    public BeautifulBirthdayWishApp() {
        // Set up the JFrame
        setTitle("Happy Birthday!");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(Color.PINK);

        // Birthday message
        birthdayMessage = new JLabel("<html><font size='6' color='red'>🎉 Happy Birthday ! 🎂   </font></html>", SwingConstants.CENTER);
        birthdayMessage.setFont(new Font("Arial", Font.BOLD, 40));
        birthdayMessage.setForeground(Color.RED);
        birthdayMessage.setBounds(0, 50, 800, 400);  // Position the message at the top center
        add(birthdayMessage);

        // Image for animation (You should have a cake image named 'cake.png' in your project directory)
        ImageIcon cakeImage = new ImageIcon("image.jpg"); // Make sure the cake.png file exists
        animatedImage = new JLabel(cakeImage);
        // animatedImage.setBounds(xPosition, yPosition, cakeImage.getIconWidth(), cakeImage.getIconHeight());
        // add(animatedImage);
        Image scaledImage = cakeImage.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH); // Resize to 200x150
        ImageIcon resizedImageIcon = new ImageIcon(scaledImage); // Create a new ImageIcon with resized image
        animatedImage = new JLabel(resizedImageIcon);
        animatedImage.setBounds(xPosition, yPosition, resizedImageIcon.getIconWidth(), resizedImageIcon.getIconHeight());
        add(animatedImage);


        // Animation Timer for moving the cake image
        Timer animationTimer = new Timer(30, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Update the image position for animation
                xPosition += xSpeed;
                yPosition += ySpeed;

                // Bounce off the walls
                if (xPosition < 0 || xPosition + animatedImage.getWidth() > getWidth()) {
                    xSpeed = -xSpeed; // Reverse horizontal direction
                }

                if (yPosition < 0 || yPosition + animatedImage.getHeight() > getHeight()) {
                    ySpeed = -ySpeed; // Reverse vertical direction
                }

                animatedImage.setBounds(xPosition, yPosition, animatedImage.getWidth(), animatedImage.getHeight());
            }
        });
        animationTimer.start();

        // Random Background Color Timer
        Timer colorChangeTimer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Randomly change background color
                Color randomColor = new Color(new Random().nextInt(0xFFFFFF));
                getContentPane().setBackground(randomColor);
            }
        });
        colorChangeTimer.start();
    }

    // Main method to launch the application
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                BeautifulBirthdayWishApp app = new BeautifulBirthdayWishApp();
                app.setVisible(true);
            }
        });
    }
}
