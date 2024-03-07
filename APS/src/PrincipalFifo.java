import javax.swing.*;
import java.sql.SQLOutput;

public class PrincipalFifo {

    public static void main(String[] args){

        String entra;
        int opcao = 0, idade = 0, matricula = 0, aux = 0, mediaTotal = 0;

        Fifo func = new Fifo();

        do{
            entra = JOptionPane.showInputDialog("MENU \n\n\t1.INSERIR  \n\t2.RETIRAR  \n\t3.MOSTRAR \n\t4.MOSTRAR INVERTIDO \n\t5.PROCURAR IDADE \n\t6.MEDIA IDADE \n\t7.REINICIALIZAR \n\t8.MOSTRAR CALDA \n\t9.MOSTRAR CABECA \n\t10.SAIR");
            opcao = Integer.parseInt(entra);

            switch (opcao){
                case 1: {

                    entra = JOptionPane.showInputDialog("QUAL A SUA MATRICULA?");
                    matricula = Integer.parseInt(entra);

                    entra = JOptionPane.showInputDialog("QUAL A SUA IDADE?");
                    idade = Integer.parseInt(entra);

                    func.enqueue(matricula, idade);
                    System.out.println("\nMATRICULA " + matricula + " E IDADE " + idade + " ADICIONADOS COM SUCESSO");

                    break;
                }

                case 2: {
                    aux = func.dequeue();

                    if (aux == -99) {
                        System.out.println("NINGUEM NA FILA");
                    }else {
                        System.out.println("\nMATRICULA " + aux + " RETIRADA");
                    }
                    break;
                }

                case 3: {
                        func.mostrar();
                    break;
                }

                case 4: {
                        func.invertida();
                    break;
                }

                case 5: {
                    entra = JOptionPane.showInputDialog("INFORME A MATRICULA");
                    matricula = Integer.parseInt(entra);

                    aux = func.procura(matricula);

                    if(aux == -99){
                        System.out.println("NINGUEM NA FILA");
                    }else{
                        System.out.println("\nA IDADE DO FUNCIONARIO E: " + aux);
                    }
                    break;
                }

                case 6: {
                    idade = func.somaIdade();
                    aux = func.contador();

                        if(idade == -99 && aux == -99){
                            System.out.println("NINGUEM NA FILA");
                        }else{
                            mediaTotal = idade / aux;
                        }

                    System.out.println("\nA MEDIA DE IDADE DOS FUNCIONARIOS E: " + mediaTotal);
                    break;
                }

                case 7: {
                    func.reinicializar();
                    System.out.println("\nFIFO REINICIALIZADA");
                    break;
                }

                case 8: {
                    System.out.println("\nMATRICULA NA CALDA: " + func.cabeca());
                    break;
                }

                case 9: {
                    System.out.println("\nMATRICULA NA CABECA: " + func.calda());
                    break;
                }

                case 10: {
                    System.out.println("\nENCERRANDO OPERACAO");
                    break;
                }

                default: System.out.println("\nOPCAO INVALIDA");
            }

        }while(opcao != 10);

        System.out.println("\nOBRIGADO POR USAR MEU SISTEMA!");

    }

}
