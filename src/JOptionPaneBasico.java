import javax.swing.JOptionPane;

// ultilizando o JOptionPane

public class JOptionPaneBasico {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog(null, "Escreva seu nome:");
        JOptionPane.showMessageDialog(null, "Olá, "+nome+", seja bem vindo(a)");

    }
}
