public class Main {
    public static void main(String[] args) {

        Cliente Obj_Cliente = new Cliente("Sebastian", "+57 ### ### #####",30,10000000);
        Obj_Cliente.MostrarDatos();

        Trabajador Obj_Trabajador = new Trabajador("Pepito", "+57 ### ### #####",37,15000000);
        Obj_Trabajador.MostrarDatos();
    }
}