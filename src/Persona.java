public abstract class  Persona {
    String Nombre, Telefono;
    int Edad;

    public Persona() {
    }

    public Persona(String nombre, String telefono, int edad) {
        Nombre = nombre;
        Telefono = telefono;
        Edad = edad;
    }

    public abstract void MostrarDatos();

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }
}
