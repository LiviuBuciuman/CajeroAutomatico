import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    public Login() {
        setTitle("Login");
        setSize(700, 500);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        //Colocar ventana en el medio de la pantalla
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - getHeight()) / 2);
        setLocation(x, y);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);

        JButton consultarSaldoButton = new JButton("Consultar saldo");
        consultarSaldoButton.setBounds(10, 10, 200, 25);
        mainPanel.add(consultarSaldoButton);

        JButton transferenciasBancariasButton = new JButton("Transferencias bancarias");
        transferenciasBancariasButton.setBounds(10, 50, 200, 25);
        mainPanel.add(transferenciasBancariasButton);

        JButton cambioPinButton = new JButton("Cambio PIN");
        cambioPinButton.setBounds(10, 100, 200, 25);
        mainPanel.add(cambioPinButton);

        JButton retirarDineroButton = new JButton("Retirar dinero");
        retirarDineroButton.setBounds(10, 150, 200, 25);
        mainPanel.add(retirarDineroButton);

        JButton altaNuevoUsuarioButton = new JButton("Alta nuevo usuario");
        altaNuevoUsuarioButton.setBounds(10, 200, 200, 25);
        mainPanel.add(altaNuevoUsuarioButton);
        altaNuevoUsuarioButton.addActionListener(e -> new Formulario().setVisible(true));

        JButton bescanviarPuntosButton= new JButton("Bescanviar puntos");
        bescanviarPuntosButton.setBounds(10, 250, 200, 25);
        mainPanel.add(bescanviarPuntosButton);

        JButton exitButton = new JButton("Salir");
        exitButton.setBounds(440, 370, 90, 25);
        mainPanel.add(exitButton);

        exitButton.addActionListener(e -> dispose());

        getContentPane().add(mainPanel);

    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        Login login = new Login();

        login.setVisible(true);
    }
}

