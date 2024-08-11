public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);

        pilha.Insere(10);
        pilha.Insere(20);
        pilha.Insere(30);

        pilha.imprime(); // Saída: Pilha: 30 20 10

        System.out.println("Elemento removido: " + pilha.remove()); // Saída: 30
        System.out.println("Elemento removido: " + pilha.remove()); // Saída: 20

        pilha.Insere(40);
        pilha.Insere(50);

        pilha.imprime(); // Saída: Pilha: 50 40 10

        System.out.println("Elemento removido: " + pilha.remove());

        pilha.imprime(); // Saída: Pilha: 40 10
    }
}