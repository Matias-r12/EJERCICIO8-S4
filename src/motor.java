public class motor {
    private int id;
    private String nombre;
    private double potencia;
    private boolean encendido;
    private static int totalMotores = 0;
    private static int motoresEncendidos = 0;

    public motor(String nombre, double potencia) {
        totalMotores++;
        this.id = totalMotores;
        this.nombre = nombre;
        this.potencia = potencia;
        this.encendido = false;
    }

    public void encender() {
        if (!this.encendido) {
            this.encendido = true;
            motoresEncendidos++;
        }
    }

    public void apagar() {
        if (this.encendido) {
            this.encendido = false;
            motoresEncendidos--;
        }
    }

    public static int getTotalMotores() {
        return totalMotores;
    }

    public static int getMotoresEncendidos() {
        return motoresEncendidos;
    }

    public void mostrarInformacion() {
        System.out.println("Motor ID: " + id + " | Nombre: " + nombre + " | Potencia: " + potencia + " HP | Encendido: " + encendido);
    }
}
