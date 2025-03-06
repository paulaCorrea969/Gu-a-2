
public class FeriaEmpresarialApp {
    public static void main(String[] args) {
       
        Empresa empresa1 = new Empresa("CyberCore", "Tecnología", "contacto@cybercore.com");
        Empresa empresa2 = new Empresa(" BioVital", "Salud", "info@biovital.com");

        
        Stand stand1 = new Stand(1, "Pabellón A", "Grande");
        Stand stand2 = new Stand(2, "Pabellón B", "Mediano");

        
        stand1.asignarEmpresa(empresa1);
        stand2.asignarEmpresa(empresa2);

        
        Visitante visitante1 = new Visitante("Paula Correa", "123456", "paulac@email.com");
        Visitante visitante2 = new Visitante("Libia Gonzalez", "654321", "libiag@email.com");

        
        Comentario comentario1 = new Comentario(visitante1, stand1, "Excelente empresa!", 5);
        Comentario comentario2 = new Comentario(visitante2, stand2, "Muy buena atención al cliente.", 4);

        
        System.out.println("\n=== Empresas Registradas ===");
        System.out.println(empresa1);
        System.out.println(empresa2);

        System.out.println("\n=== Stands ===");
        System.out.println(stand1);
        System.out.println(stand2);

        System.out.println("\n=== Visitantes ===");
        System.out.println(visitante1);
        System.out.println(visitante2);

        System.out.println("\n=== Comentarios ===");
        System.out.println(comentario1.getDetalleComentario());
        System.out.println(comentario2.getDetalleComentario());
    }
}
