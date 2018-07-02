
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 * @author user
 */
public class Exercicio03 implements BaseInterface{
    
    private JLabel jLabelNumero, jLabelTabuada ;
    private JTextField jTextFieldNumero; 
    private JTextArea jTextAreaTabuada;
    private JScrollPane jScrollPaneTabuada; 
    private JButton jButtonTabuada;
    private JFrame jFrame;
    
    public Exercicio03(){
       instanciarComponentes();
       gerarTela();
       adicionarComponentes();
       gerarDimensoes();
       gerarLocaizacoes();
       acaoBotaoTabuada();
       configurarJScrollPane();
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
        jLabelTabuada = new JLabel("Tabuada");
        jTextAreaTabuada = new JTextArea();
        jScrollPaneTabuada = new JScrollPane();
        jButtonTabuada = new JButton("Gerar Tabuada");
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelNumero);
        jFrame.add(jTextFieldNumero);
        jFrame.add(jLabelTabuada);
        jFrame.add(jTextAreaTabuada);
        jFrame.add(jScrollPaneTabuada);
        jFrame.add(jButtonTabuada);
    }

    @Override
    public void gerarLocaizacoes() {
        jLabelNumero.setLocation(10, 5);
        jTextFieldNumero.setLocation(10, 35);
        jLabelTabuada.setLocation(200, 5);
        jTextAreaTabuada.setLocation(200, 35);
        jScrollPaneTabuada.setLocation(200, 35);
        jButtonTabuada.setLocation(10, 80);
    }

    @Override
    public void gerarDimensoes() {
        jLabelNumero.setSize(120, 30);
        jTextFieldNumero.setSize(150, 30);
        jLabelTabuada.setSize(120, 30);
        jTextAreaTabuada.setSize(300, 380);
        jScrollPaneTabuada.setSize(12, 12);
        jButtonTabuada.setSize(150, 60);
    }

    private void acaoBotaoTabuada() {
        jButtonTabuada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            int numero = Integer.parseInt(jTextFieldNumero.getText());
            
            String texto = "";
            
            
            }
            
        });
        
    }
            
    private void configurarJScrollPane() {
       
    }
    
}
