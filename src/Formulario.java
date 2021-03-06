import javax.swing.*;
import java.awt.*;

public class Formulario extends JFrame {

    public Formulario() {
        setTitle("Formulario Hola");
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

        JLabel nomLabel = new JLabel("Nom: ");
        nomLabel.setBounds(10, 10, 80, 25);
        mainPanel.add(nomLabel);

        JTextField nomField = new JTextField(20);
        nomField.setBounds(80, 10, 160, 25);
        mainPanel.add(nomField);

        JLabel cognomsLabel = new JLabel("Cognoms: ");
        cognomsLabel.setBounds(10, 50, 80, 25);
        mainPanel.add(cognomsLabel);

        JTextField cognomsField = new JTextField(20);
        cognomsField.setBounds(80, 50, 160, 25);
        mainPanel.add(cognomsField);

        JLabel dniLabel = new JLabel("DNI: ");
        dniLabel.setBounds(10, 100, 80, 25);
        mainPanel.add(dniLabel);

        JTextField dniField = new JTextField(20);
        dniField.setBounds(80, 100, 160, 25);
        mainPanel.add(dniField);

        JLabel pinLabel = new JLabel("Pin: ");
        pinLabel.setBounds(10, 150, 80, 25);
        mainPanel.add(pinLabel);

        JTextField pinField = new JTextField(20);
        pinField.setBounds(80, 150, 160, 25);
        mainPanel.add(pinField);

        JLabel telefonoLabel = new JLabel("Teléfono: ");
        telefonoLabel.setBounds(10, 200, 80, 25);
        mainPanel.add(telefonoLabel);

        JTextField telefonoField = new JTextField(20);
        telefonoField.setBounds(80, 200, 160, 25);
        mainPanel.add(telefonoField);

        JLabel fechaNacimientoLabel = new JLabel("Fecha nac.: ");
        fechaNacimientoLabel.setBounds(10, 250, 80, 25);
        mainPanel.add(fechaNacimientoLabel);

        JTextField nacimientoField = new JTextField(20);
        nacimientoField.setBounds(80, 250, 160, 25);
        mainPanel.add(nacimientoField);

        JLabel interesesLabel = new JLabel("Intereses: ");
        interesesLabel.setBounds(10, 300, 80, 25);
        mainPanel.add(interesesLabel);

        String[] interesesArray = {"0%", "1%", "2%", "3%", "4%", "5%"};

        JComboBox interesesLista = new JComboBox<>(interesesArray);
        interesesLista.setSelectedIndex(0);
        interesesLista.setBounds(80, 300, 160, 25);
        mainPanel.add(interesesLista);

        JLabel otrosInteresesLabel = new JLabel("Otros: ");
        otrosInteresesLabel.setBounds(260, 300, 80, 25);
        mainPanel.add(otrosInteresesLabel);

        JTextField otrosInteresesField = new JTextField();
        otrosInteresesField.setBounds(300, 300, 160, 25);
        mainPanel.add(otrosInteresesField);

        JButton guardarDatosButton = new JButton("Guardar");
        guardarDatosButton.setBounds(80, 370, 160, 25);
        mainPanel.add(guardarDatosButton);

        guardarDatosButton.addActionListener(e -> System.out.println(nomField.getText()));

        getContentPane().add(mainPanel);

    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        Formulario form = new Formulario();

        form.setVisible(true);
    }
}
