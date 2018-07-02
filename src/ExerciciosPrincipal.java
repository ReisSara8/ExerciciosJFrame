import java.awt.EventQueue;

/**
 *
 * @author user
 */
public class ExerciciosPrincipal {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Exercicios();
            }
        });

    }
}