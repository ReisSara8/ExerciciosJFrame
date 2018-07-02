
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
public class Exercicio05 implements BaseInterface{
    
    private JLabel jLabelNumero01, jLabelNumero02, jLabelResultado;
    private JTextField jTextFieldNumero01, jTextFieldNumero02;
    private JTextArea jTextAreaResultado;
    private JScrollPane jScrollPaneResultado;
    private JButton jButtonSomar, jButtonSubtrair, jButtonMultiplicar, jButtonDividir;
    private JFrame jFrame;
    
    public Exercicio05(){
        instanciarComponentes();
        gerarTela();
        adicionarComponentes();
        gerarDimensoes();
        gerarLocaizacoes();
        acaoBotaoSomar();
        acaoBotaoSubtrair();
        acaoBotaoMultiplicar();
        acaoBotaoDividir();
        configurarJScrollPane();
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
        jLabelNumero01 = new JLabel("Número 1");
        jTextFieldNumero01 = new JTextField();
        jLabelNumero02 = new JLabel("Número 2");
        jTextFieldNumero02 = new JTextField();
        jLabelResultado = new JLabel("Resultado");
        jTextAreaResultado = new JTextArea();
        jScrollPaneResultado = new JScrollPane();
        jButtonSomar = new JButton("Somar");
        jButtonSubtrair = new JButton("Subtrair");
        jButtonMultiplicar = new JButton("Multiplicar");
        jButtonDividir = new JButton("Dividir");
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelNumero01);
        jFrame.add(jTextFieldNumero01);
        jFrame.add(jLabelNumero02);
        jFrame.add(jTextFieldNumero02);
        jFrame.add(jLabelResultado);
        jFrame.add(jScrollPaneResultado);
        jFrame.add(jButtonSomar);
        jFrame.add(jButtonSubtrair);
        jFrame.add(jButtonMultiplicar);
        jFrame.add(jButtonDividir);
    }

    @Override
    public void gerarLocaizacoes() {
        jLabelNumero01.setLocation(10, 10);
        jTextFieldNumero01.setLocation(10, 40);
        jLabelNumero02.setLocation(10, 70);
        jTextFieldNumero02.setLocation(10, 100);
        jLabelResultado.setLocation(300, 10);
        jScrollPaneResultado.setLocation(300, 20);
        jButtonSomar.setLocation(10, 150);
        jButtonSubtrair.setLocation(10, 220);
        jButtonMultiplicar.setLocation(10, 290);
        jButtonDividir.setLocation(10, 360);
    }

    @Override
    public void gerarDimensoes() {
        jLabelNumero01.setSize(120, 30);
        jTextFieldNumero01.setSize(150,30);
        jLabelNumero02.setSize(120, 30);
        jTextFieldNumero02.setSize(150, 30);
        jLabelResultado.setSize(120, 30);
        jScrollPaneResultado.setSize(300, 280);
        jButtonSomar.setSize(150, 50);
        jButtonSubtrair.setSize(150, 50);
        jButtonMultiplicar.setSize(150, 50);
        jButtonDividir.setSize(150, 50);
    }

    private void acaoBotaoSomar() {
        jButtonSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numero1 = Integer.parseInt(jTextFieldNumero01.getText());
                int numero2 = Integer.parseInt(jTextFieldNumero02.getText());
                
                int soma = numero1 + numero2;
           }
        });
    }
        
    private void acaoBotaoSubtrair() {
     jButtonSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numero1 = Integer.parseInt(jTextFieldNumero01.getText());
                int numero2 = Integer.parseInt(jTextFieldNumero02.getText());
                
                int subtracao = numero1 - numero2;
           }
        });
    }

    private void acaoBotaoMultiplicar() {
    jButtonSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numero1 = Integer.parseInt(jTextFieldNumero01.getText());
                int numero2 = Integer.parseInt(jTextFieldNumero02.getText());
                
                int multiplicacao = numero1 * numero2;
           }
        });
    }
    
    private void acaoBotaoDividir() {
     jButtonSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numero1 = Integer.parseInt(jTextFieldNumero01.getText());
                int numero2 = Integer.parseInt(jTextFieldNumero02.getText());
                
                int divisao = numero1 % numero2;
           }
        });
    }

    private void configurarJScrollPane() {
    }
    
}
