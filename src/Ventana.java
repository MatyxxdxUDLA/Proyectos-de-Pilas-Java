import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel principal;
    private JTextField txtDatoEntero;
    private JButton insertarButton;
    private JLabel lblValorTope;
    private JButton valorTopeButton;
    private JButton extraerButton;
    private JButton listarButton;
    private JTextArea listadoElementosTxtArea;
    private Pila coleccion = new Pila();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Ventana() {

        insertarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coleccion.ingresarElementos(Integer.parseInt(txtDatoEntero.getText()));
                JOptionPane.showMessageDialog(null,"Dato ingresado a la Pila");
            }
        });

        valorTopeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    lblValorTope.setText("El valor del tope es: "+coleccion.elementoTop());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());   //Para que muestre el mensaje de error en una ventana emergente
                }
            }
        });

        extraerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    JOptionPane.showMessageDialog(null, "Se elimino el elemento: "+ coleccion.extraerElemento());
                    listadoElementosTxtArea.setText(coleccion.toString());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });

        listarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listadoElementosTxtArea.setText(coleccion.toString());
            }
        });
    }
}
