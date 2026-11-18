public class Main {
    public static void main(String[] args) {
        RegistroActividades r1 = RegistroActividades.getInstancia();
        RegistroActividades r2 = RegistroActividades.getInstancia();

        System.out.println("¿Es la misma instancia?: " + (r1 == r2));

        r1.registrarActividad("05/06/2026", "10:00", "Prestamos", "Préstamo de libro Java");
        r1.registrarActividad("05/06/2026", "11:30", "Devoluciones", "Devolución de libro SQL");
        r2.registrarActividad("05/06/2026", "12:15", "Socios", "Inscripción nuevo socio");

        System.out.println("\nTotal de eventos registrados: " + r1.getTotalEventos());

        System.out.println();
        r1.mostrarHistorial();

        System.out.println();
        r1.filtrarPorSector("Prestamos");
    }
}