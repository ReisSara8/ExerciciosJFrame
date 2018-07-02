
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
public class Exercicio02 implements BaseInterface {
    
    private JLabel jLabelNumero;
    private JTextField jTextFieldNumero;
    private JButton jButtonCalcular;
    private JFrame jFrame;
    
    public Exercicio02(){
        instanciarComponentes();
        gerarTela();
        adicionarComponentes();
        gerarDimensoes();
        gerarLocaizacoes();
        acaoBotaoCalcular();
        jFrame.setVisible(true);
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(700, 480);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @Override
    public void instanciarComponentes() {
        jLabelNumero = new JLabel("Número");
        jTextFieldNumero = new JTextField();
        jButtonCalcular = new JButton("Calcular");
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelNumero);
        jFrame.add(jTextFieldNumero);
        jFrame.add(jButtonCalcular);
    }

    @Override
    public void gerarLocaizacoes() {
        jLabelNumero.setLocation(280,70);
        jTextFieldNumero.setLocation(280,100);
        jButtonCalcular.setLocation(280, 150);
    }

    @Override
    public void gerarDimensoes() {
        jLabelNumero.setSize(120, 30);
        jTextFieldNumero.setSize(150, 30);
        jButtonCalcular.setSize(150, 66);
    }

    private void acaoBotaoCalcular() {
        jButtonCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numero = Integer.parseInt(jTextFieldNumero.getText());
                int calcular = numero *50;
                
                JOptionPane.showMessageDialog(null, numero + " x 50 = " +calcular);
                
                
            }
            
        });
    }        
    
}
