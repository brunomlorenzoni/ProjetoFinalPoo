public class CaixaSemPrioridade implements Caixas {

    private String pessoa_em_atendimento;
    @Override
    public String proximo(Fila fila) {
        return fila.getFilaNormal().poll();
    }

    public void setAtendimento(String nome){
        this.pessoa_em_atendimento=nome;
    }

    @Override
    public String toString() {
        if(pessoa_em_atendimento==null){
            return "Ninguém sendo atendido";
        }else{
            return "Em atendimento: "+ pessoa_em_atendimento;
        }
    }
}

