import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // declarando referência para um array
        int[] array;

        // criando um array com 10 elementos
        array = new int[10];

        // criando uma string para exibir os elementos do array
        String saida = "Índice\tValor\n";

        // adicionando o valor de cada
        // elemento do Array na variável saída
        for(int i=0; i< array.length; i++) {
            saida += i + "\t" + array[i] + "\n";
        }

        // Configurando exibição dos elementos do array
        JTextArea saidaArea = new JTextArea();
        // Atribuindo valores do array à área multi-linha
        saidaArea.setText(saida);

        // Exibindo caixa de diálogo
        JOptionPane.showMessageDialog(null,saidaArea,
                "Criando um Array de Inteiros", JOptionPane.INFORMATION_MESSAGE);

        // Saindo do sistema
        System.exit(0);
    }
}
