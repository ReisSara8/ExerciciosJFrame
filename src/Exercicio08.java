
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 * @author user
 */
public class Exercicio08 implements BaseInterface{
    
    private JLabel jLabelNota1, jLabelNota2, jLabelNota3, jLabelNota4, jLabelMedia, jLabelMediaResultado;
    private JTextField jTextFieldNota1, jTextFieldNota2, jTextFieldNota3, jTextFieldNota4;
    private JButton jButtonCalcularMedia;
    private JFrame jFrame;

    public Exercicio08(){
    instanciarComponentes();
    gerarTela();
    adicionarComponentes();
    gerarDimensoes();
    gerarLocaizacoes();
    acaoBotaoCalcularMedia();
    jFrame.setVisible(true);
    }
    
    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(700, 480);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        URL caminho = Exercicio08.class.getResource("calculos-fisica-mateatica-lousa-escola-1496663581536_615x300.jpg");

        ImageIcon icone = new ImageIcon(caminho);

        JLabel imagem = new JLabel(icone);
        imagem.setLocation(5, 5);
        imagem.setSize(7000, 4800);

        jFrame.add(imagem);
    }

    @Override
    public void instanciarComponentes() {
        jLabelNota1 = new JLabel("Nota 1");
        jTextFieldNota1 = new JTextField();
        jLabelNota2 = new JLabel("Nota 2");
        jTextFieldNota2 = new JTextField();
        jLabelNota3 = new JLabel("Nota 3");
        jTextFieldNota3 = new JTextField();
        jLabelNota4 = new JLabel("Nota 4");
        jTextFieldNota4 = new JTextField();
        jLabelMedia = new JLabel("Média");
        jLabelMediaResultado = new JLabel();
        jButtonCalcularMedia = new JButton("Calcular média");
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelNota1);
        jFrame.add(jTextFieldNota1);
        jFrame.add(jLabelNota2);
        jFrame.add(jTextFieldNota2);
        jFrame.add(jLabelNota3);
        jFrame.add(jTextFieldNota3);
        jFrame.add(jLabelNota4);
        jFrame.add(jTextFieldNota4);
        jFrame.add(jLabelMedia);
        jFrame.add(jLabelMediaResultado);
        jFrame.add(jButtonCalcularMedia);
    }

    @Override
    public void gerarLocaizacoes() {
        jLabelNota1.setLocation(255, 10);
        jTextFieldNota1.setLocation(255,40);
        jLabelNota2.setLocation(255,80);
        jTextFieldNota2.setLocation(255,110);
        jLabelNota3.setLocation(255,150);
        jTextFieldNota3.setLocation(255,180);
        jLabelNota4.setLocation(255,220);
        jTextFieldNota4.setLocation(255,250);
        jLabelMedia.setLocation(310,360);
        jLabelMediaResultado.setLocation(320,390);
        jButtonCalcularMedia.setLocation(251,300);
    }

    @Override
    public void gerarDimensoes() {
        jLabelNota1.setSize(120,30);
        jTextFieldNota1.setSize(150,30);
        jLabelNota2.setSize(120,30);
        jTextFieldNota2.setSize(150,30);
        jLabelNota3.setSize(120,30);
        jTextFieldNota3.setSize(150,30);
        jLabelNota4.setSize(120,30);
        jTextFieldNota4.setSize(150,30);
        jLabelMedia.setSize(120,30);
        jLabelMediaResultado.setSize(150,30);
        jButtonCalcularMedia.setSize(160,50);
    }

    private void acaoBotaoCalcularMedia() {
         jButtonCalcularMedia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double nota1 = Double.parseDouble(jTextFieldNota1.getText());
                double nota2 = Double.parseDouble(jTextFieldNota2.getText());
                double nota3 = Double.parseDouble(jTextFieldNota3.getText());
                double nota4 = Double.parseDouble(jTextFieldNota4.getText());
                double media = (nota1 +nota2 +nota3 +nota4) / 4;
                
                jLabelMediaResultado.setText("" +media);
                
                if(media < 5){
                    jLabelMediaResultado.setForeground(Color.RED);
                }else if(media < 7){
                    jLabelMediaResultado.setForeground(Color.ORANGE);
                }else if(media > 7){
                    jLabelMediaResultado.setForeground(Color.GREEN);
                }
            }
        });
    }
    
}
