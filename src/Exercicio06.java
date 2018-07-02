
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 * @author user
 */
public class Exercicio06 implements BaseInterface{
    
    private JLabel jLabelNome, jLabelPeso, jLabelAltura, jLabelKg, jLabelm, jLabelIMC, jLabelAvaliacao;
    private JTextField jTextFieldNome, jTextFieldPeso, jTextFieldAltura, jTextFieldIMC, jTextFieldAvaliacao;
    private JButton jButtonIMC;
    private JFrame jFrame;
    
    public Exercicio06(){
        instanciarComponentes();
        gerarTela();
        adicionarComponentes();
        gerarDimensoes();
        gerarLocaizacoes();
        acaoBotaoIMC();
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
        jLabelNome = new JLabel("Nome");
        jTextFieldNome = new JFormattedTextField();
        jLabelPeso = new JLabel("Peso ");
        jTextFieldPeso = new JTextField();
        jLabelAltura = new JLabel("Altura (Ex: 1.60)");
        jTextFieldAltura = new JTextField();
        jButtonIMC = new JButton("Calcular IMC");
        jLabelKg = new JLabel("kg");
        jLabelm = new JLabel("m");
        jLabelIMC = new JLabel("IMC");
        jTextFieldIMC = new JTextField();
        jLabelAvaliacao = new JLabel("Avaliação do IMC");
        jTextFieldAvaliacao = new JTextField();
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelNome);
        jFrame.add(jTextFieldNome);
        jFrame.add(jLabelPeso);
        jFrame.add(jTextFieldPeso);
        jFrame.add(jLabelAltura);
        jFrame.add(jTextFieldAltura);
        jFrame.add(jButtonIMC);
        jFrame.add(jLabelKg);
        jFrame.add(jLabelm);
        jFrame.add(jLabelIMC);
        jFrame.add(jTextFieldIMC);
        jFrame.add(jLabelAvaliacao);
        jFrame.add(jTextFieldAvaliacao);
    }

    @Override
    public void gerarLocaizacoes() {
        jLabelNome.setLocation(255, 10);
        jTextFieldNome.setLocation(255, 40);
        jLabelPeso.setLocation(255, 80);
        jTextFieldPeso.setLocation(255,105);
        jLabelAltura.setLocation(255, 145);
        jTextFieldAltura.setLocation(255,170);
        jButtonIMC.setLocation(255, 230);
        jLabelKg.setLocation(405,113);
        jLabelm.setLocation(405,178);
        jLabelIMC.setLocation(255,300);
        jTextFieldIMC.setLocation(255,330);
        jLabelAvaliacao.setLocation(255,360);
        jTextFieldAvaliacao.setLocation(255,390);
    }

    @Override
    public void gerarDimensoes() {
        jLabelNome.setSize(120, 30);
        jTextFieldNome.setSize(150, 30);
        jLabelPeso.setSize(120, 30);
        jTextFieldPeso.setSize(150, 30);
        jLabelAltura.setSize(120, 30);
        jTextFieldAltura.setSize(150, 30);
        jButtonIMC.setSize(150, 60);
        jLabelKg.setSize(120, 20);
        jLabelm.setSize(120, 20);
        jLabelIMC.setSize(120, 30);
        jTextFieldIMC.setSize(150, 30);
        jLabelAvaliacao.setSize(120, 30);
        jTextFieldAvaliacao.setSize(150, 30);
    }

    private void acaoBotaoIMC() {
        jButtonIMC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double peso = Double.parseDouble(jTextFieldPeso.getText());
                double altura = Double.parseDouble(jTextFieldAltura.getText());
                
                double imc = peso / (altura * altura);
                
                String nome = jTextFieldNome.getText();
                
                jTextFieldIMC.setText("" +imc);
                
                if(imc <= 9.99){
                    jTextFieldAvaliacao.setText("Desnutrição Grau V");
                }else if(imc <= 12.9){
                    jTextFieldAvaliacao.setText("Desnutrição Grau IV");
                }else if(imc <= 15.9){
                    jTextFieldAvaliacao.setText("Desnutrição Grau III");
                }else if(imc <= 16.9){
                    jTextFieldAvaliacao.setText("Desnutrição Grau II");
                }else if(imc <= 18.4){
                    jTextFieldAvaliacao.setText("Desnutrição Grau I");
                }else if(imc <= 24.9){
                    jTextFieldAvaliacao.setText("Normal");
                }else if(imc <= 29.9){
                    jTextFieldAvaliacao.setText("Obesidade Grau I");
                }else if(imc <= 34.5){
                    jTextFieldAvaliacao.setText("Obesidade Grau II");
                }else if(imc > 39.9){
                    jTextFieldAvaliacao.setText("Obesidade Grau III");
                }
            }
        });
    }
    
}
