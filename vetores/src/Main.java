/**
 * Programa que calcula total de passaros utilizando o conceito de vetores
 */

class Main {
    public static void main(String[] args) {
        int[] passarosPorDia = {2, 5, 0, 7, 4, 1, 3, 0, 2, 5, 0, 1, 3, 1, 1, 5, 3, 5, 1, 6, 4};
        int totalPassaros = 0;
        int passarosPrimeiraSemana = 0;
        int passarosSegundaSemana = 0;
        int passarosTerceiraSemana = 0;

        // Total de passaros ao longo de tres semanas
        for (int i = 0; i < 21; i++) {
            totalPassaros = totalPassaros + passarosPorDia[i];
        }
        System.out.println("Total de passaros durante as duas semanas: " + totalPassaros);

        // total de passaros na primeira semana
        for (int i = 0; i < 7; i++) {
            passarosPrimeiraSemana = passarosPrimeiraSemana + passarosPorDia[i];
        }
        System.out.println("Total de passaros na primeira semana: " + passarosPrimeiraSemana);

        // Total de passaros na segunda semana
        for (int i = 7; i < 14; i++) {
            passarosSegundaSemana = passarosSegundaSemana + passarosPorDia[i];
        }
        System.out.println("Total de passaros na segunda semana: " + passarosSegundaSemana);

        /**
         * Desafio: Obter o total de passaros durante uma terceira semana
         * */
        for (int i = 14; i < 21; i++) {
            passarosTerceiraSemana = passarosTerceiraSemana + passarosPorDia[i];
        }
        System.out.println("Total de passaros na terceira semmana: " + passarosTerceiraSemana);
    }
}