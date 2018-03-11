import javax.swing.*;
import java.awt.*;

public class CajeroAutomatico extends JFrame {

    private CajeroAutomatico() {
        setTitle("Cajero Automatico");
        setSize(700, 500);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Colocar ventana en el medio de la pantalla
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - getHeight()) / 2);
        setLocation(x, y);

    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        CajeroAutomatico cajero = new CajeroAutomatico();

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);

        //Cargar logo y posicionar en la ventana
        ImageIcon imageIcon = new ImageIcon("src/resources/logo.png");
        JLabel imgLabel = new JLabel(imageIcon);
        imgLabel.setBounds(500, 50, 128, 128);
        mainPanel.add(imgLabel);

        JLabel titleLabel = new JLabel("Login");
        titleLabel.setBounds(250, 100, 80, 25);
        mainPanel.add(titleLabel);

        JLabel userLabel = new JLabel("Usuario: ");
        userLabel.setBounds(150, 150, 80, 25);
        mainPanel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(220, 150, 160, 25);
        mainPanel.add(userText);

        JLabel passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(150, 200, 80, 25);
        mainPanel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(220, 200, 160, 25);
        mainPanel.add(passwordText);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(150, 250, 80, 25);
        mainPanel.add(loginButton);

        JButton registerButton = new JButton("Registrar");
        registerButton.setBounds(290, 250, 90, 25);

        JButton exitButton = new JButton("Salir");
        exitButton.setBounds(400, 250, 90, 25);
        mainPanel.add(exitButton);
        exitButton.addActionListener(e -> System.exit(0));

        registerButton.addActionListener(e -> new Formulario().setVisible(true));

        mainPanel.add(registerButton);

        cajero.getContentPane().add(mainPanel);

        cajero.setVisible(true);

    }
}
