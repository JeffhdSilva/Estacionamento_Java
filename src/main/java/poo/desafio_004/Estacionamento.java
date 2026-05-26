package poo.desafio_004;

import java.time.Duration;
import java.time.LocalTime;

/**
 *
 * @author jeffe
 */
public class Estacionamento extends Servico {

    private LocalTime horaEntrada;
    private LocalTime horaSaida;

    public Estacionamento(LocalTime horaEntrada, LocalTime horaSaida, String placaDoVeiculo, String modelo) {
        super(placaDoVeiculo, modelo);
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
    }

    @Override
    public double calcularTotal() {

        long periodo = Duration.between(horaEntrada, horaSaida).toHours();

        if (Duration.between(horaEntrada, horaSaida).toMinutesPart() > 0) {
            periodo++;
        }

        return periodo * 10;

    }

    @Override
    public String toString() {
        return "Estacionamento";
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public LocalTime getHoraSaida() {
        return horaSaida;
    }

}
