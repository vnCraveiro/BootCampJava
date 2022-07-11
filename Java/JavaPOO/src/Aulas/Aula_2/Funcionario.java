package JavaPOO.src.Aulas.Aula_2;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Funcionario {
    private int id;
    private String nome;
    private Date dataAdmissao;
    private float salario;
    private Date dataDesligamento = null;

    public Funcionario(){

    }

    public Funcionario(int id, String nome, Date dataAdmissao, float salario) {
        this.id = id;
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    public Funcionario(int id, String nome, Date dataAdmissao, float salario, Date dataDesligamento) {
        this.id = id;
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
        this.dataDesligamento = dataDesligamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataAdmissao() {
        DateFormat f = DateFormat.getDateInstance(DateFormat.SHORT);
        return f.format(dataAdmissao);
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getDataDesligamento() {
        DateFormat f = DateFormat.getDateInstance(DateFormat.SHORT);
        return f.format(dataDesligamento);
    }

    public void setDataDesligamento(Date dataDesligamento) {
        this.dataDesligamento = dataDesligamento;
    }

    public int tempoServico(Date dataAdmissao){
        Calendar data = new GregorianCalendar();
        data.setTime(dataAdmissao);
        Calendar hoje = Calendar.getInstance();

        int tempo = hoje.get(Calendar.YEAR) - data.get(Calendar.YEAR);

        data.add(Calendar.YEAR, tempo);

        if (hoje.before(data)){
            tempo--;
        }
        return tempo;
    }

    public String toString(){
        DateFormat f = DateFormat.getDateInstance(DateFormat.MEDIUM);
        if (dataDesligamento == null) {
            return "\n" + nome + ", prontuário " + id + " trabalha desde " + f.format(dataAdmissao) + ", há " + tempoServico(dataAdmissao) + "" +
                    " anos, com salário atual de R$ " + String.format("%.2f,", salario) + ".\n";
            }
            else {
                return "\n"+nome+", prontuário "+id+" trabalhou de "+f.format(dataAdmissao)+" a "+f.format(dataDesligamento)+ "" +
                        "e seu último salario foi de R$ "+String.format("%.2f",salario)+".\n";
                }

    }
}
