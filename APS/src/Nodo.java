public class Nodo {
    public int matricula;
    public int idade;
    public Nodo anterior;
    public Nodo seguinte;

    Nodo(int matricula, int idade) {
        this.matricula = matricula;
        this.idade = idade;
        this.anterior = null;
        this.seguinte = null;
    }
}
