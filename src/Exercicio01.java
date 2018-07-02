
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 * @author Alunos
 */
public class Exercicio01 implements BaseInterface{
    
    private JLabel jLabelNome, jLabelSobrenome;
    private JTextField jTextFieldNome, jTextFieldSobrenome;
    private JButton jButtonConcatenar;
    private JFrame jFrame;

    public Exercicio01(){
        instanciarComponentes();
        gerarTela();
        adicionarComponentes();
        gerarDimensoes();
        gerarLocaizacoes();
        acaoBotaoConcatenar();
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
        jTextFieldNome = new JTextField();
        jLabelSobrenome = new JLabel("Sobrenome");
        jTextFieldSobrenome = new JTextField();
        jButtonConcatenar = new JButton("Concatenar");
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelNome);
        jFrame.add(jTextFieldNome);
        jFrame.add(jLabelSobrenome);
        jFrame.add(jTextFieldSobrenome);
        jFrame.add(jButtonConcatenar);
    }

    @Override
    public void gerarLocaizacoes() {
        jLabelNome.setLocation(255, 60);
        jTextFieldNome.setLocation(255, 90);
        jLabelSobrenome.setLocation(255, 130);
        jTextFieldSobrenome.setLocation(255, 155);
        jButtonConcatenar.setLocation(255, 210);
    }

    @Override
    public void gerarDimensoes() {
        jLabelNome.setSize(120, 30);
        jTextFieldNome.setSize(150, 30);
        jLabelSobrenome.setSize(120,20);
        jTextFieldSobrenome.setSize(150, 30);
        jButtonConcatenar.setSize(150, 70);
    }
    
     private void acaoBotaoConcatenar() {
        jButtonConcatenar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jTextFieldNome.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null,
                            "O campo 'nome' deve ser preenchido");
                    jTextFieldNome.requestFocus();
                    return;
                } 
                
                if (jTextFieldNome.getText().trim().length() <3){
                    JOptionPane.showMessageDialog(null,
                            "Nome deve conter mais de 3 caracteres");
                    jTextFieldNome.requestFocus();
                    return;
               }
                  if(jTextFieldSobrenome.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null,
                            "O campo 'sobrenome' deve ser preenchido");
                    jTextFieldNome.requestFocus();
                    return;
                }
               
                String nome = jTextFieldNome.getText();
                String sobrenome = jTextFieldSobrenome.getText();
                
                  JOptionPane.showMessageDialog(null,"Olá, " +nome +" " +sobrenome);
            }
        });
    }

}
