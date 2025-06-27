public class FutVolei {
    public class FutVolei extends Esporte {
    private boolean jogaNaAreia;
    private int numeroDeJogadoresPorTime;
    private double alturaDaRede;

    // Getters e Setters
    public boolean isJogaNaAreia() {
        return jogaNaAreia;
    }

    public void setJogaNaAreia(boolean jogaNaAreia) {
        this.jogaNaAreia = jogaNaAreia;
    }

    public int getNumeroDeJogadoresPorTime() {
        return numeroDeJogadoresPorTime;
    }

    public void setNumeroDeJogadoresPorTime(int numeroDeJogadoresPorTime) {
        this.numeroDeJogadoresPorTime = numeroDeJogadoresPorTime;
    }

    public double getAlturaDaRede() {
        return alturaDaRede;
    }

    public void setAlturaDaRede(double alturaDaRede) {
        this.alturaDaRede = alturaDaRede;
    }
}
