public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA REGISTRO DE MOTORES ===");

        motor motor = new motor("Motor principal", 15.5);
        motor.mostrarInformacion();

        System.out.println("\n--- Encendiendo el motor ---");
        motor.encender();
        motor.mostrarInformacion();

        System.out.println("\nTotal motores: " + motor.getTotalMotores());
        System.out.println("Motores encendidos: " + motor.getMotoresEncendidos());
    }
}