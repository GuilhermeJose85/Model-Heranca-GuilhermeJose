public class Futebol {
    public class Futebol extends Esporte {
    private String principalCampeonato;
    private String maiorTime;
    private boolean temVAR;

    // Getters e Setters
    public String getPrincipalCampeonato() {
        return principalCampeonato;
    }

    public void setPrincipalCampeonato(String principalCampeonato) {
        this.principalCampeonato = principalCampeonato;
    }

    public String getMaiorTime() {
        return maiorTime;
    }

    public void setMaiorTime(String maiorTime) {
        this.maiorTime = maiorTime;
    }

    public boolean isTemVAR() {
        return temVAR;
    }

    public void setTemVAR(boolean temVAR) {
        this.temVAR = temVAR;
    }
}

