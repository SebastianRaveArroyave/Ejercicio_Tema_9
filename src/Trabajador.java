public class Trabajador extends Persona {
    int Salario;

    public Trabajador(int salario) {
        Salario = salario;
    }

    public Trabajador(String nombre, String telefono, int edad, int salario) {
        super(nombre, telefono, edad);
        Salario = salario;
    }

    @Override
    public void MostrarDatos() {
        System.out.println("Trabajador!!  " + "Nombre: " + Nombre + " Edad: " + Edad + " Telefono: " + Telefono + " Salario: " + Salario );

    }
}
