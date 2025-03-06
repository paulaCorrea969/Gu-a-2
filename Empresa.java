public class Empresa {
    private String nombre;
    private String sector;
    private String email;

    public Empresa(String nombre, String sector, String email) {
        this.nombre = nombre;
        this.sector = sector;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSector() {
        return sector;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Empresa: " + nombre + " | Sector: " + sector + " | Email: " + email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
