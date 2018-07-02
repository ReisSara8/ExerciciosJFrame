import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * @author user
 */
public class Exercicios {
 
    private JFrame jFrame;
    private JButton jButton01, jButton02, jButton03, 
                    jButton04, jButton05, jButton06,
                    jButton07, jButton08, jButton09;
                   


    public Exercicios() {
        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        acaoJButton01();
        acaoJButton02();
        acaoJButton03();
        acaoJButton04();
        acaoJButton05();
        acaoJButton06();
        acaoJButton07();
        acaoJButton08();
        acaoJButton09();
        jFrame.setVisible(true);
    }

    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(700, 480);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void adicionarComponentes() {
        jFrame.add(jButton01);
        jFrame.add(jButton02);
        jFrame.add(jButton03);
        jFrame.add(jButton04);
        jFrame.add(jButton05);
        jFrame.add(jButton06);
        jFrame.add(jButton07);
        jFrame.add(jButton08);
        jFrame.add(jButton09);
    }

    public void instanciarComponentes() {
        jButton01 = new JButton("Exercício 01");
        jButton02 = new JButton("Exercício 02");
        jButton03 = new JButton("Exercício 03");
        jButton04 = new JButton("Exercício 04");
        jButton05 = new JButton("Exercício 05");
        jButton06 = new JButton("Exercício 06");
        jButton07 = new JButton("Exercício 07");
        jButton08 = new JButton("Exercício 08");
        jButton09 = new JButton("Exercício 09");
    }

    public void gerarLocalizacoes() {
        jButton01.setLocation(75, 10);
        jButton02.setLocation(260, 10);
        jButton03.setLocation(445, 10);
        jButton04.setLocation(75, 150);
        jButton05.setLocation(260, 150);
        jButton06.setLocation(445, 150);
        jButton07.setLocation(75, 290);
        jButton08.setLocation(260, 290);
        jButton09.setLocation(445, 290);
    }

    public void gerarDimensoes() {
        jButton01.setSize(150, 120);
        jButton02.setSize(150, 120);
        jButton03.setSize(150, 120);
        jButton04.setSize(150, 120);
        jButton05.setSize(150, 120);
        jButton06.setSize(150, 120);
        jButton07.setSize(150, 120);
        jButton08.setSize(150, 120);
        jButton09.setSize(150, 120);
    }


    public void acaoJButton01() {
        jButton01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio01();
            }
        });
    }

    public void acaoJButton02() {
        jButton02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio02();
            }
        });
    }

    public void acaoJButton03() {
        jButton03.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio03();
            }
        });
    }

    public void acaoJButton04() {
        jButton04.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio04();
            }
        });
    }

    public void acaoJButton05() {
        jButton05.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio05();
            }
        });
    }

    public void acaoJButton06() {
        jButton06.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio06();
            }
        });
    }

    public void acaoJButton07() {
        jButton07.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio07();
            }
        });
    }

    public void acaoJButton08() {
        jButton08.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio08();
            }
        });
    }

    public void acaoJButton09() {
        jButton09.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio09();
            }
        });
    }

 
}
