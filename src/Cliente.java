public class Cliente extends Persona {
    int Credito;

    public Cliente(int credito) {
        Credito = credito;
    }

    public Cliente(String nombre, String telefono, int edad, int credito) {
        super(nombre, telefono, edad);
        Credito = credito;
    }

    @Override
    public void MostrarDatos() {
        System.out.println("Cliente!!  " + "Nombre: " + Nombre + " Edad: " + Edad + " Telefono: " + Telefono +
                " Credito: " + Credito );

    }
}
