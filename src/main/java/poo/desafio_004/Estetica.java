package poo.desafio_004;

/**
 *
 * @author jeffe
 */
public class Estetica extends Servico {

    private String tipoLavagem;

    public Estetica(String placaDoVeiculo, String modelo, String tipoLavagem) {
        super(placaDoVeiculo, modelo);
        this.tipoLavagem = tipoLavagem;
    }

    @Override
    public double calcularTotal() {

        if (tipoLavagem.equals("Simples")) {
            return 40;

        } else if (tipoLavagem.equals("Completa")) {
            return 70;
        }

        return 0;
    }

    public String getTipoLavagem() {
        return tipoLavagem;
    }
}
