package br.com.CrudGaragem;

import java.util.Scanner;
import java.util.ArrayList;

public class Garagem {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner entrada = new Scanner(System.in);
        metodosGaragem minhaGaragem = new metodosGaragem();

        do {
            System.out.println("--MENU--");
            System.out.println("1 - Cadastrar Carro");
            System.out.println("2 - Listar Carros");
            System.out.println("3 - Substituir Carro");
            System.out.println("4 - Remover Carro");
            System.out.println("5 - Buscar Carro");
            System.out.println("6 - Sair");
            System.out.println("opcao: ");

            try {opcao = Integer.parseInt(entrada.nextLine());
            } catch (NumberFormatException e){opcao = 0;}

            switch (opcao){
                case 1:
                    minhaGaragem.cadastrarCarros(entrada);
                        break;
                case 2:
                    minhaGaragem.listarCarros();
                        break;
                case 3:
                    minhaGaragem.substituirCarro(entrada);
                        break;
                case 4:
                    minhaGaragem.removerCarro(entrada);
                        break;
                case 5:
                    minhaGaragem.buscarCarro(entrada);
                        break;
                case 6:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("opcao invalida");
                        break;
            }

        }while(opcao !=6);
    }
}
