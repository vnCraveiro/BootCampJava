package JavaPOO.src.Aulas.Aula_1.Exercicios.Veiculo;

public class Veiculo {
        private double capacidadeCombustivel;
        private int passageiro;
        private double consumo;

        public Veiculo(int p, double ca, double co){
             passageiro = p;
             capacidadeCombustivel = ca;
             consumo = co;
        }

        public double tanqueViagem(double quilometro){
                return quilometro/(consumo*capacidadeCombustivel);
        }

        public double dividirDespesas(double quilometro, double combustivel){
                return (quilometro/capacidadeCombustivel*combustivel)/passageiro;
        }

        public double getCapacidadeCombustivel() {
                return capacidadeCombustivel;
        }

        public void setCapacidadeCombustivel(double capacidadeCombustivel) {
                this.capacidadeCombustivel = capacidadeCombustivel;
        }

        public int getPassageiro() {
                return passageiro;
        }

        public void setPassageiro(int passageiro) {
                this.passageiro = passageiro;
        }

        public double getConsumo() {
                return consumo;
        }

        public void setConsumo(double consumo) {
                this.consumo = consumo;
        }

        @Override
        public String toString() {
                return "\nO Veículo comporta "+passageiro+" passageiros." +
                        "\nTem capacidade de "+capacidadeCombustivel+" litros de combustível" +
                        "\nConsumo de "+consumo+" quilometros por litro.\n";
        }
}
