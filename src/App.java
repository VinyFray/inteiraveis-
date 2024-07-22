public class App {
    public static void main(String[] args) {
        // Faça um vetor de duas dimensões com 3 posições relacionando o faturamento de uma empresa.
        // o ultimo index de cada posição corresponde ao faturamento de cada trimestre
        // 1) faça um programa que calcule o total do faturamento do ano todo.
        // 2) faça um programa que calcule o total do faturamento do meio de cada ano.
        // 3) faça um programa que calcule o total do faturamento do inicio do ultimo trimestre do ultimo ano, medio do segundo e final do primeiro.

        // exemplo da matriz
        //    |0      |1      |2     |
        // |0| 100,00 |237,84 |555,23|
        // |1| 2000,00|4558,72|6534,2|
        // |2| 300,00 |374,23 |765,23|

        double[][] receita = {
                {100.00, 2000.00, 300.00, 400.00},
                {237.84, 4558.72, 374.23, 556.73},
                {555.23, 6534.20, 765.23, 745.87}
        };

        for(int indice = 0; indice < receita.length; indice++){
            double resultado = 0;
            for(int subIndice = 0; subIndice < receita[indice].length; subIndice++){
                resultado = resultado + receita[indice][subIndice];
            }
            System.out.println("O valor total do "+indice+" ano é: "+resultado);
        }

//        double primeiroAno = receita[0][0] + receita[0][1] + receita[0][2];
//        double segundoAno = receita[1][0] + receita[0][1] + receita[0][2];
//        double terceiroAno = receita[2][0] + receita[0][1] + receita[0][2];
//
//        System.out.println("O valor total do primeiro ano é: "+primeiroAno);
//        System.out.println("O valor total do segundo ano é: "+segundoAno);
//        System.out.println("O valor total do terceiro ano é: "+terceiroAno);
//        System.out.println("\n");
//        System.out.println("O valor total do meio do primeiro ano é: "+receita[0][1]);
//        System.out.println("O valor total do meio do segundo ano é: "+receita[1][1]);
//        System.out.println("O valor total do meio do terceiro ano é: "+receita[2][1]);
//        System.out.println("\n");
//        double somaTotal = receita[0][0]+receita[1][1]+receita[2][2];
//        System.out.println("A soma do primeiro trimestre do primeiro ano com o meio do segundo e final do terceiro é "+somaTotal);


        // A matriz abaixo representa um grupo de alunos que foram reprovados e aprovados na escola.
        // cada linha/indice repsenta um aluno, para decidir quais alunos vão passar de ano é necessario que
        // ele tenha pelo menos 50% de Aprovação (V) entre as 5 materias;
        // Faça um programa que mostre os nomes de cada um dos alunos aprovados e reprovados.
        // Os indices de cada nome corresponde ao indice de cada linha da matriz

        String[] nome = {"João", "Ines Brasil", "Zaca", "Munha"};
        String[][] aprovados = {
                {"V", "F", "V", "F", "V"},
                {"V", "F", "F", "F", "V"},
                {"F", "F", "F", "V", "F"},
                {"F", "V", "V", "F", "V"}
        };


    }
}