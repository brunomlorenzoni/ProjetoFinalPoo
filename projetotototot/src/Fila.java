import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Fila {
    Scanner scanner = new Scanner(System.in);
    private Queue<String> filaPreferencial = new LinkedList<>();
    private Queue<String> filaNormal = new LinkedList<>();

    public void entrar(){
        Pessoa obj = new Pessoa();
        System.out.print("Qual seu nome? \n->");obj.setNome(scanner.next());
        System.out.print("Qual sua idade? \n->");obj.setIdade(scanner.nextInt());
        if (obj.getIdade() > 65) {
            filaPreferencial.add(obj.getNome());
            System.out.println("Você entrou na fila preferencial");
        } else {
            filaNormal.add(obj.getNome());
            System.out.println("Você entrou na fila");
        }
    }

    public Queue<String> getFilaPreferencial(){
        return filaPreferencial;
    }

    public Queue<String> getFilaNormal(){
        return filaNormal;
    }

    public String toString(){
        return "     Fila normal: " + getFilaNormal()+
                "\n" + "     Fila Preferencial: " + getFilaPreferencial();
    }
}
