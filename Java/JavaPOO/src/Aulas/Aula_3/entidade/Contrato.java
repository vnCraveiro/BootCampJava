package JavaPOO.src.Aulas.Aula_3.entidade;

import java.util.Date;

public class Contrato {
    private Date data;
    private double valorHora;
    private int horas;

    public Contrato(){

    }

    public Contrato(Date data, double valorHora, int horas) {
        this.data = data;
        this.valorHora = valorHora;
        this.horas = horas;
    }
}
