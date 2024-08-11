public class Pilha {
    private int capacidade;
    private int topo; // indice do topo na array
    private int dados[];

    public Pilha(int capacidade){
        this.capacidade = capacidade;
        topo = -1; // inicializa o topo com -1, indica pilha vazia
        dados = new int [capacidade];
    }

    public void Insere(int elemento){
        if(Cheia()){
            System.out.println("Pilha cheia");
        } else {
            topo ++; // aumentando o índice antes de inserir
            dados[topo] = elemento; // apos incrementar o topo, inserimos o elem. no topo
        }
    }

    public boolean Cheia(){
        return topo == capacidade -1; // capacidade -1 é o último índice
    }

    public boolean Vazia(){
        return topo == -1; // topo == =1 significa vazia
    }

    public int remove(){
        if(Vazia()){
            System.out.println("Pilha vazia!");
            return -1; // para indicar um valor inválido
        } else {
            int elemento = dados[topo]; // armazea o valor do elemento que está no topo
            topo --; // aponta para o elemento anterior
            return elemento;
        }
    }

    public void imprime() {
        if (Vazia()) {
            System.out.println("Pilha vazia!");
            return;
        }
        System.out.print("Pilha: ");
        for (int i = topo; i >= 0; i--) {
            System.out.print(dados[i] + " ");
        }
        System.out.println();
    }

}
