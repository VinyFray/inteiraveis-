public class App {
    public static void main(String[] args) {
        // Faça um vetor de duas dimensões com 3 posições relacionando o faturamento de uma empresa.
        // o ultimo index de cada posição corresponde ao faturamento de cada trimestre
        // 1) faça um programa que calcule o total do faturamento do ano todo.
        // 2) faça um programa que calcule o total do faturamento do meio de cada trimestre
        // 3) faça um programa que calcule o total do faturamento do inicio do ultimo trimestre do ultimo ano, medio do segundo e final do primeiro.

        // exemplo da matriz
        //    |0      |1      |2     |
        // |0| 100,00 |237,84 |555,23|
        // |1| 2000,00|4558,72|6534,2|
        // |2| 300,00 |374,23 |765,23|

        double[][] receita = {
                {100.00, 2000.00, 300.00},
                {237.84, 4558.72, 374.23},
                {555.23, 6534.20, 765.23}
        };

        double primeiroAno = receita[0][0] + receita[0][1] + receita[0][2];
        double segundoAno = receita[1][0] + receita[0][1] + receita[0][2];
        double terceiroAno = receita[2][0] + receita[0][1] + receita[0][2];

        System.out.println("O valor total do primeiro ano é: "+primeiroAno);
        System.out.println("O valor total do segundo ano é: "+segundoAno);
        System.out.println("O valor total do terceiro ano é: "+terceiroAno);
    }
}