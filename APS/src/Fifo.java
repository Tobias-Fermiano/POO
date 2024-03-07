public class Fifo {

        public Nodo comeco;
        public Nodo fim;

        public Fifo() {
            this.comeco = null;
            this.fim = null;
        }

        public void enqueue(int matricula, int idade) {

            Nodo aux = new Nodo(matricula, idade);

            if (comeco == null) {
                comeco = aux;
            } else {
                aux.anterior = fim;
                fim.seguinte = aux;
            }
            fim = aux;
        }

        public int dequeue() {
            int aux = -99;
            if(comeco != null) {
                aux = comeco.matricula;
                comeco = comeco.seguinte;
                if (comeco == null)
                    fim = null;
                else
                    comeco.anterior = null;
                }

            return aux;
        }

        public void mostrar() {
            Nodo aux;
            if (comeco == null) {
                System.out.println("\nNINGUEM NA FILA!");
                return;
            }
            System.out.print("\nOBSERVE A LISTA: \n");
            aux = comeco;
            while (aux != null) {
                System.out.print("MATRICULA: " + aux.matricula + " - IDADE: " + aux.idade + "\n");
                aux = aux.seguinte;
            }
        }

        public void invertida() {
            Nodo aux;
            if (comeco == null) {
                System.out.println("\nNINGUEM NA FILA!!!");
                return;
            }
            System.out.print("\nOBSERVE A LISTA: \n");
            aux = fim;
            while (aux != null) {
                System.out.print("MATRICULA: " + aux.matricula + " - IDADE: " + aux.idade + "\n");
                aux = aux.anterior;
            }
        }

        public int procura(int matricula) {
            Nodo aux;
            if (comeco == null) {
                return -99;
            }
            aux = comeco;
            int idade = 0;
            while (aux != null) {
                if (aux.matricula == matricula) {
                    idade = aux.idade;
                }
                aux = aux.seguinte;
            }
            return idade;
        }

        public int somaIdade() {
            Nodo aux;
            if (comeco == null) {
                return -99;
            }
            aux = comeco;
            int somaIdade = 0;
            while (aux != null) {
                somaIdade += aux.idade;
                aux = aux.seguinte;
            }
            return somaIdade;
        }

        public int contador() {
            Nodo aux;
            if (this.comeco == null) {
                return -99;
            }
            aux = comeco;
            int contador = 0;
            while (aux != null) {
                contador++;
                aux = aux.seguinte;
            }
            return contador;
        }

        public int cabeca() {
                if (this.comeco == null) {
                    return -99;
                }
                return comeco.matricula;
            }

        public int calda() {
            if (fim == null) {
                return -99;
            }
            return fim.matricula;
        }

        public void reinicializar() {
            comeco = null;
            fim = null;
        }
    }
