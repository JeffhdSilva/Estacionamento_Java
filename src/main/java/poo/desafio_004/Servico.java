package poo.desafio_004;

/**
 *
 * @author jeffe
 */
public abstract class Servico {
    
    private String placaDoVeiculo;
    private String modelo;

    public Servico(String placaDoVeiculo, String modelo) {
        this.placaDoVeiculo = placaDoVeiculo;
        this.modelo = modelo;
    }

    public String getPlacaDoVeiculo() {
        return placaDoVeiculo;
    }

    public String getModelo() {
        return modelo;
    }
    
    public abstract double calcularTotal();
         
}
