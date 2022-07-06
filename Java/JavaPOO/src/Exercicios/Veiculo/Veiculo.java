package JavaPOO.src.Exercicios.Veiculo;

public class Veiculo {
        private double capacidadeCombustivel;
        private int passageiro;
        private double consumo;
        //


        public Veiculo(int p, double ca, double co){
             passageiro = p;
             capacidadeCombustivel = ca;
             consumo = co;
        }

        public double tanqueViagem(double quilometro){

                return quilometro/(consumo*capacidadeCombustivel);
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
}
