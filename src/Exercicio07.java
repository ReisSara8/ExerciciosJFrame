
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;


/**
 * @author user
 */
public class Exercicio07 implements BaseInterface{
    
    private JLabel jLabelNome, jLabelQuantidadeHoras, jLabelValorINSS, 
            jLabelContribuicaoSindical, jLabelValorPasse, jLabelAuxilioAlmoco,
            jLabelAuxilioEducacao, jLabelAuxilioSaude, jLabelResultado,
            jLabelCargo;
    private JTextField jTextFieldNome,jTextFieldQuantidadeHoras,
            jTextFieldValorINSS,jTextFieldContribuicaoSindical,
            jTextFieldValorPasse,jTextFieldAuxilioAlmoco,
            jTextFieldAuxilioEducacao,jTextFieldAuxilioSaude;
    private JTextArea jTextAreaResultado;
    private JComboBox jComboBoxCargo;        
    private JFrame jFrame;

public Exercicio07(){
    instanciarComponentes();
    gerarTela();
    adicionarComponentes();
    gerarDimensoes();
    gerarLocaizacoes();
    gerandoResultados();
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
        jLabelQuantidadeHoras = new JLabel("Quantidade de horas");
        jTextFieldQuantidadeHoras = new JTextField();
        jLabelValorINSS = new JLabel ("INSS");
        jTextFieldValorINSS = new JTextField();
        jLabelContribuicaoSindical = new JLabel("Contribuição Sindical");
        jTextFieldContribuicaoSindical = new JTextField();
        jLabelValorPasse = new JLabel("Valor passe");
        jTextFieldValorPasse = new JTextField();
        jLabelAuxilioAlmoco = new JLabel("Auxílio almoço");
        jTextFieldAuxilioAlmoco = new JTextField();
        jLabelAuxilioEducacao = new JLabel("Auxílio educação");
        jTextFieldAuxilioEducacao = new JTextField();
        jLabelAuxilioSaude = new JLabel("Auxílio saúde");
        jTextFieldAuxilioSaude = new JTextField();
        jLabelResultado = new JLabel("Resultado");
        jTextAreaResultado = new JTextArea();
        jLabelCargo = new JLabel("Cargo");
        jComboBoxCargo = new JComboBox();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(
                new Object[]{
                    "Programador Júnior", "Programador Pleno", "Programador Sênior",
                }
        );
        jComboBoxCargo.setModel(modelo);
        jComboBoxCargo.setSelectedIndex(-1);
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelNome);
        jFrame.add(jTextFieldNome);
        jFrame.add(jLabelQuantidadeHoras);
        jFrame.add(jTextFieldQuantidadeHoras);
        jFrame.add(jLabelValorINSS);
        jFrame.add(jTextFieldValorINSS);
        jFrame.add(jLabelContribuicaoSindical);
        jFrame.add(jTextFieldContribuicaoSindical);
        jFrame.add(jLabelValorPasse);
        jFrame.add(jTextFieldValorPasse);
        jFrame.add(jLabelAuxilioAlmoco);
        jFrame.add(jTextFieldAuxilioAlmoco);
        jFrame.add(jLabelAuxilioEducacao);
        jFrame.add(jTextFieldAuxilioEducacao);
        jFrame.add(jLabelAuxilioSaude);
        jFrame.add(jTextFieldAuxilioSaude);
        jFrame.add(jLabelResultado);
        jFrame.add(jTextAreaResultado);
        jFrame.add(jLabelCargo);
        jFrame.add(jComboBoxCargo);
    }

    @Override
    public void gerarLocaizacoes() {
        jLabelNome.setLocation(10,10);
        jTextFieldNome.setLocation(10,20);
        jLabelQuantidadeHoras.setLocation(10,50);
        jTextFieldQuantidadeHoras.setLocation(10,60);
        jLabelValorINSS.setLocation(10,90);
        jTextFieldValorINSS.setLocation(10,100);
        jLabelContribuicaoSindical.setLocation(10,130);
        jTextFieldContribuicaoSindical.setLocation(10,140);
        jLabelValorPasse.setLocation(10,170);
        jTextFieldValorPasse.setLocation(10,180);
        jLabelAuxilioAlmoco.setLocation(10,210);
        jTextFieldAuxilioAlmoco.setLocation(10,220);
        jLabelAuxilioEducacao.setLocation(10,250);
        jTextFieldAuxilioEducacao.setLocation(10,260);
        jLabelAuxilioSaude.setLocation(10,290);
        jTextFieldAuxilioSaude.setLocation(10,300);
        jLabelResultado.setLocation(200,10);
        jTextAreaResultado.setLocation(200,20);
        jLabelCargo.setLocation(10,330);
        jComboBoxCargo.setLocation(10, 340);
    }

    @Override
    public void gerarDimensoes() {
        jLabelNome.setSize(120, 30);
        jTextFieldNome.setSize(150,30);
        jLabelQuantidadeHoras.setSize(120,30);
        jTextFieldQuantidadeHoras.setSize(150,30);
        jLabelValorINSS.setSize(120,30);
        jTextFieldValorINSS.setSize(150,30);
        jLabelContribuicaoSindical.setSize(120,30);
        jTextFieldContribuicaoSindical.setSize(150,30);
        jLabelValorPasse.setSize(120,30);
        jTextFieldValorPasse.setSize(150,30);
        jLabelAuxilioAlmoco.setSize(120,30);
        jTextFieldAuxilioAlmoco.setSize(150,30);
        jLabelAuxilioEducacao.setSize(120,30);
        jTextFieldAuxilioEducacao.setSize(150,30);
        jLabelAuxilioSaude.setSize(120,30);
        jTextFieldAuxilioSaude.setSize(150,30);
        jLabelResultado.setSize(120,30);
        jTextAreaResultado.setSize(350, 400);
        jLabelCargo.setSize(120,30);
        jComboBoxCargo.setSize(200, 20);
    }

    private void gerandoResultados(){
        String nome = jTextFieldNome.getText();
        int quantidadeDeHoras = Integer.parseInt(
                jTextFieldQuantidadeHoras.getText());
        double valorINSS = Double.parseDouble(
                jTextFieldValorINSS.getText());
        double contribuicaoSindical = Double.parseDouble(
                jTextFieldContribuicaoSindical.getText());
        double valorPasse = Double.parseDouble(
                jTextFieldValorPasse.getText());
        double auxilioAlmoco = Double.parseDouble(
                jTextFieldAuxilioAlmoco.getText());
        double auxilioEducacao = Double.parseDouble(
                jTextFieldAuxilioEducacao.getText());
        double auxilioSaude = Double.parseDouble(
                jTextFieldAuxilioSaude.getText());
        String cargoSelecionado = jComboBoxCargo
                                  .getSelectedItem().toString();
        double salarioProgJrBruto = 2.300;
        double salarioProgPlBruto = 2.800;
        double salarioProgSnBruto = 4.000;
        double valorHProgJr = 10;
        double valorHProgPl = 12;
        double valorHProgSn = 18;
        
        double salarioProgJrLiq = valorHProgJr *quantidadeDeHoras
                               -valorINSS -contribuicaoSindical
                               -valorPasse +auxilioAlmoco
                               +auxilioEducacao +auxilioSaude;
        double salarioProgPlLiq = valorHProgPl *quantidadeDeHoras
                               -valorINSS -contribuicaoSindical
                               -valorPasse +auxilioAlmoco
                               +auxilioEducacao +auxilioSaude;
        double salarioProgSnLiq = valorHProgSn *quantidadeDeHoras
                               -valorINSS -contribuicaoSindical
                               -valorPasse +auxilioAlmoco
                               +auxilioEducacao +auxilioSaude;
        
        String resultadoProgJr = "Dados do funcionário:" +"\n"
                          +"Nome:                             " +nome +"\n"
                          +"Quantidade de Horas:              " +quantidadeDeHoras +"\n"
                          +"Valor do INSS:                    " +valorINSS +"\n"
                          +"Contribuição Sindical:            " +contribuicaoSindical +"\n"
                          +"Valor do passe:                   " +valorPasse +"\n"
                          +"Auxílio Almoço:                   " +auxilioAlmoco +"\n"
                          +"Auxíio Educação:                  " +auxilioEducacao +"\n"
                          +"Auxílio Saúde:                    " +auxilioSaude +"\n"
                          +"Cargo:                            " +cargoSelecionado +"\n"
                          +"Salário Bruto:                    " +salarioProgJrBruto +"\n"
                          +"Salário Líquido:                  " +salarioProgJrLiq +"\n"
                ;
        
        String resultadoProgPl = "Dados do funcionário:" +"\n"
                          +"Nome:                             " +nome +"\n"
                          +"Quantidade de Horas:              " +quantidadeDeHoras +"\n"
                          +"Valor do INSS:                    " +valorINSS +"\n"
                          +"Contribuição Sindical:            " +contribuicaoSindical +"\n"
                          +"Valor do passe:                   " +valorPasse +"\n"
                          +"Auxílio Almoço:                   " +auxilioAlmoco +"\n"
                          +"Auxíio Educação:                  " +auxilioEducacao +"\n"
                          +"Auxílio Saúde:                    " +auxilioSaude +"\n"
                          +"Cargo:                            " +cargoSelecionado +"\n"
                          +"Salário Bruto:                    " +salarioProgPlBruto +"\n"
                          +"Salário Líquido:                  " +salarioProgPlLiq +"\n"
                ;
        
        String resultadoProgSn = "Dados do funcionário:" +"\n"
                          +"Nome:                             " +nome +"\n"
                          +"Quantidade de Horas:              " +quantidadeDeHoras +"\n"
                          +"Valor do INSS:                    " +valorINSS +"\n"
                          +"Contribuição Sindical:            " +contribuicaoSindical +"\n"
                          +"Valor do passe:                   " +valorPasse +"\n"
                          +"Auxílio Almoço:                   " +auxilioAlmoco +"\n"
                          +"Auxíio Educação:                  " +auxilioEducacao +"\n"
                          +"Auxílio Saúde:                    " +auxilioSaude +"\n"
                          +"Cargo:                            " +cargoSelecionado +"\n"
                          +"Salário Bruto:                    " +salarioProgSnBruto +"\n"
                          +"Salário Líquido:                  " +salarioProgSnLiq +"\n"
                ;
        
       
    }
    
}
