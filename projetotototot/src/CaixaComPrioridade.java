public class CaixaComPrioridade implements Caixas {

    private String pessoa_em_atendimento;

    @Override
    public String proximo(Fila fila) {
        if (!fila.getFilaPreferencial().isEmpty()) {
            return fila.getFilaPreferencial().poll();
        } else {
            return fila.getFilaNormal().poll();
        }
    }

    @Override
    public void setAtendimento(String nome) {
        this.pessoa_em_atendimento = nome;
    }

    @Override
    public String toString() {
        if (pessoa_em_atendimento == null) {
            return "Ninguém sendo atendido";
        } else {
            return "Em atendimento: " + pessoa_em_atendimento;
        }
    }


}
