public class RegistroActividades {
    private static RegistroActividades instancia;
    private String[] fechas;
    private String[] horas;
    private String[] sectores;
    private String[] descripciones;
    private int total;

    private RegistroActividades() {
        this.fechas = new String[5];
        this.horas = new String[5];
        this.sectores = new String[5];
        this.descripciones = new String[5];
        this.total = 0;
    }

    public static RegistroActividades getInstancia() {
        if (instancia == null) {
            instancia = new RegistroActividades();
        }
        return instancia;
    }

    public void registrarActividad(String fecha, String hora, String sector, String descripcion) {
        if (total < 5) {
            fechas[total] = fecha;
            horas[total] = hora;
            sectores[total] = sector;
            descripciones[total] = descripcion;
            total++;
            System.out.println("Actividad registrada [" + sector + "]: " + descripcion);
        } else {
            System.out.println("Capacidad de registro llena.");
        }
    }

    public void mostrarHistorial() {
        System.out.println("--- Historial Completo de Actividades ---");
        for (int i = 0; i < total; i++) {
            System.out.println((i + 1) + ". Fecha: " + fechas[i] + " - Hora: " + horas[i] + " - Sector: " + sectores[i] + " - Descripción: " + descripciones[i]);
        }
    }

    public void filtrarPorSector(String sectorBuscado) {
        System.out.println("--- Filtrando por Sector: " + sectorBuscado + " ---");
        for (int i = 0; i < total; i++) {
            if (sectores[i].equals(sectorBuscado)) {
                System.out.println("- [" + horas[i] + "] " + descripciones[i]);
            }
        }
    }

    public int getTotalEventos() {
        return total;
    }
}