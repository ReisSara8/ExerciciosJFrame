
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 * @author user
 */
public class Exercicio04 implements BaseInterface {
    
    private JLabel jLabelNumero;
    private JTextField jTextFieldNumero;
    private JButton jButtonVerificar;
    private JFrame jFrame;
    
    public Exercicio04(){
        instanciarComponentes();
        gerarTela();
        adicionarComponentes();
        gerarDimensoes();
        gerarLocaizacoes();
        acaoBotaoVerificar();
        jFrame.setVisible(true);
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(700, 480);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);    }

    @Override
    public void instanciarComponentes() {
        jLabelNumero = new JLabel("Número");
        jTextFieldNumero = new JTextField();
        jButtonVerificar = new JButton("Verificar");
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelNumero);
        jFrame.add(jTextFieldNumero);
        jFrame.add(jButtonVerificar);
    }

    @Override
    public void gerarLocaizacoes() {
        jLabelNumero.setLocation(null);
        jTextFieldNumero.setLocation(null);
        jButtonVerificar.setLocation(null);
    }

    @Override
    public void gerarDimensoes() {
        jLabelNumero.setSize(null);
        jTextFieldNumero.setSize(null);
        jButtonVerificar.setSize(null);
    }

    private void acaoBotaoVerificar() {
        jButtonVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            int numero = Integer.parseInt(jTextFieldNumero.getText());
            
            if ( numero % 2 == 0 && numero < 0){
                JOptionPane.showMessageDialog(null,
                        "O número " +numero +" é par e negativo!");
            }if ( numero % 2 == 0 && numero > 0){
                JOptionPane.showMessageDialog(null,
                        "O número " +numero +" é par e positivo!");
            }if ( numero % 2 != 0 && numero < 0){
                JOptionPane.showMessageDialog(null,
                        "O número " +numero +" é ímpar e negativo!");
            }if ( numero % 2 != 0 && numero > 0){
                JOptionPane.showMessageDialog(null,
                        "O número " +numero +" é ímpar e positivo!");
            }
    }
        });
        
    }
    
}
