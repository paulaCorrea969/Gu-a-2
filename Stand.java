public class Stand {
    private int numero;
    private String ubicacion;
    private String tamano;
    private Empresa empresa;

    public Stand(int numero, String ubicacion, String tamano) {
        this.numero = numero;
        this.ubicacion = ubicacion;
        this.tamano = tamano;
        this.empresa = null; 
    }

    public void asignarEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getTamano() {
        return tamano;
    }

    @Override
    public String toString() {
        return "Stand #" + numero + " | Ubicación: " + ubicacion + " | Tamaño: " + tamano +
                (empresa != null ? " | Empresa: " + empresa.getNombre() : " | Sin empresa asignada");
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
}
