package util;
import javax.swing.JOptionPane;

public class escolha {
	
	public class DialogBoxes {
		  public static void main(String[] args) {

		    String nome;
		    StringBuilder mensagem = new StringBuilder();

		    nome = JOptionPane.showInputDialog("Digite seu nome:");
		    mensagem.append("Bem-vindo ").append(nome).append("!");
		    JOptionPane.showMessageDialog(null, mensagem);
		  }
		}

}
