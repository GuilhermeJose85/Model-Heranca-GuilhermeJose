public class FutMesa {
    public class FutMesa extends Esporte {
    private String materialDaMesa;
    private int numeroDeBarras;
    private boolean temContadorDePlacar;

    // Getters e Setters
    public String getMaterialDaMesa() {
        return materialDaMesa;
    }

    public void setMaterialDaMesa(String materialDaMesa) {
        this.materialDaMesa = materialDaMesa;
    }

    public int getNumeroDeBarras() {
        return numeroDeBarras;
    }

    public void setNumeroDeBarras(int numeroDeBarras) {
        this.numeroDeBarras = numeroDeBarras;
    }

    public boolean isTemContadorDePlacar() {
        return temContadorDePlacar;
    }

    public void setTemContadorDePlacar(boolean temContadorDePlacar) {
        this.temContadorDePlacar = temContadorDePlacar;
    }
}
