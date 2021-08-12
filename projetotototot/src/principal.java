import java.util.Scanner;

public class principal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Caixas caixaSemPrioridade = new CaixaSemPrioridade();
        Caixas caixaComPrioridade = new CaixaComPrioridade();
        Fila fila = new Fila();
        int op;
        do{
            System.out.println(fila);
            System.out.println("     Caixa com prioridade: "+caixaComPrioridade);
            System.out.println("     Caixa sem prioridade: "+caixaSemPrioridade);
            System.out.println();
            System.out.println("=====Menu controlador de caixas do banco=====");
            System.out.println("1 -> Entrar na fila");
            System.out.println("2 -> chamar o proximo do caixa sem prioridade");
            System.out.println("3 -> chamar o proximo do caixa com prioridade");
            System.out.print("-> ");op = scanner.nextInt();
            switch (op){
                case 1:
                    fila.entrar();
                    break;
                case 2:
                    caixaSemPrioridade.setAtendimento(caixaSemPrioridade.proximo(fila));
                    break;
                case 3:
                    caixaComPrioridade.setAtendimento(caixaComPrioridade.proximo(fila));
                    break;
            }
            System.out.println("\n\n\n\n");
        }while (op!=0);
    }
}
