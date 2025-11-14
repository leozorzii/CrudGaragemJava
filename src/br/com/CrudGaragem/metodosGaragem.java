package br.com.CrudGaragem;
import java.util.ArrayList;
import java.util.Scanner;

public class metodosGaragem {
    ArrayList<Carro> carros;

    public metodosGaragem(){
        this.carros = new ArrayList<>();
    }

    public void cadastrarCarros(Scanner leitura){
        System.out.println("--Cadastro de Veiculos--\n");

        System.out.print("Digite a placa do Veiculo (formato: LLLAAAA): ");
        String placaNova = leitura.nextLine().toUpperCase();

        for(Carro carroExistente : carros){
            if(carroExistente.getPlaca().equals(placaNova)){
                System.out.println("Placa já cadastrada! Cadastro cancelado.");
                return;
            }
        }
        System.out.print("Digite o modelo do Veiculo: ");
        String modeloNovo = leitura.nextLine();

        System.out.print("Digite a cor do Veiculo: ");
        String cor = leitura.nextLine();

        System.out.print("Digite o ano do Veiculo (Ex: 2024): ");
        int ano = leitura.nextInt();
        leitura.nextLine(); // Limpa o buffer

        Carro novoCarro = new Carro(placaNova, modeloNovo, ano, cor);

        carros.add(novoCarro);
        System.out.println("Veiculo Cadastrado com sucesso!");
    }

    public void listarCarros() {
        System.out.println("--Listagem dos Carros--");

        if (carros.isEmpty()){
            System.out.println("Nenhum veiculo para listar");
            return;
        }
        for (int i = 0; i < carros.size() ; i++) {
            System.out.println("---------");
            System.out.println("ÍNDICE [" + i + "] | " + carros.get(i));
        }
    }

    public void removerCarro(Scanner leitura) {
        if (carros.isEmpty()){
            System.out.println("Nenhum carro para remover");
            return;
        }
        listarCarros();
        System.out.println("-------------");
        System.out.print("Informe o índice do carro que quer remover: ");
        int escolha = leitura.nextInt();
        leitura.nextLine();

        if (escolha < 0 || escolha >= carros.size()){
            System.out.println("Índice inválido!");
            return;
        }
        String placaRemovida = carros.get(escolha).getPlaca();
        carros.remove(escolha); // ArrayList remove automaticamente o objeto
        System.out.println("Carro (placa: " + placaRemovida + ") removido com sucesso!");
    }


    public void substituirCarro(Scanner leitura) {
        if (carros.isEmpty()) {
            System.out.println("Garagem Vazia");
            return;
        }
        listarCarros();
        System.out.print("Qual carro deseja substituir? (digite o indice do carro): ");
        int escolha = leitura.nextInt();
        leitura.nextLine();

        if (escolha < 0 || escolha >= carros.size()) {
            System.out.println("Índice inválido!");
            return;
        }

        String placaAntiga = carros.get(escolha).getPlaca();

        System.out.println("\n--- Digite os Novos Dados ---");
        System.out.print("Digite a nova placa do Carro: ");
        String novaPlaca = leitura.nextLine().toUpperCase();

        System.out.print("Digite o novo modelo do Veiculo: ");
        String novoModelo = leitura.nextLine();

        System.out.print("Digite a nova cor do Veiculo: ");
        String novaCor = leitura.nextLine();

        System.out.print("Digite o novo ano do Veiculo: ");
        int novoAno = leitura.nextInt();
        leitura.nextLine(); // limpa o buffer

        Carro novoCarro = new Carro(novaPlaca, novoModelo, novoAno, novaCor);

        carros.set(escolha, novoCarro);
        System.out.println("Carro na posição " + escolha + " (placa " + placaAntiga + ") substituído pela placa: " + novaPlaca);
    }

    public void buscarCarro(Scanner leitura) {
        if(carros.isEmpty()){
            System.out.println("Nenhum carro para buscar");
            return;
        }
        System.out.println("--BUSCAR CARRO--");
        System.out.print("Digite uma placa para buscar: ");
        // garante que a busca compare a entrada do usuário em maiusculo
        String placaBusca = leitura.nextLine().toUpperCase();

        for (int i = 0; i < carros.size(); i++) {
            if(carros.get(i).getPlaca().equals(placaBusca)){
                System.out.println("Veiculo Encontrado!");
                System.out.println("Detalhes: " + carros.get(i));
                System.out.println("Indice: " + i);
                return;
            }
        }

        System.out.println("Placa: " + placaBusca + " não encontrada na garagem.");
    }
}
