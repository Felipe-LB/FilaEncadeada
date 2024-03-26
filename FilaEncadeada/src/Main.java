import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        FilaEncadeada fila = new FilaEncadeada();
        int opcao;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Inserir elemento na fila");
            System.out.println("2. Retirar elemento da fila");
            System.out.println("3. Verificar se a fila está vazia");
            System.out.println("4. Liberar a fila");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o elemento a ser inserido: ");
                    int elemInsere = sc.nextInt();
                    fila.insere(elemInsere);
                    System.out.println("Elemento inserido na fila.");
                    break;
                case 2:
                    try {
                        int elemRetirado = fila.retira();
                        System.out.println("Elemento retirado da fila: " + elemRetirado);
                    } catch (Exception exception) {
                        System.out.println("Está vazia IMBECIL");
                    }
                    break;
                case 3:
                    if (fila.vazia()) {
                        System.out.println("A fila está vazia.");
                    } else {
                        System.out.println("A fila não está vazia.");
                    }
                    break;
                case 4:
                    fila.libera();
                    System.out.println("Fila liberada.");
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

            System.out.println();

        } while (opcao != 0);

        sc.close();
    }

}
