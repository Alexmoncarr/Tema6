package libros;

public class testLibro
{
    public static void main(String[] args) {

        Libro l1  = new Libro("Jurassic Park", "Michael Crichton", 480, 5,0);
        System.out.println(l1.getEjemplares());
        System.out.println(l1.getEjemplaresPrestados());
        System.out.println(l1.prestamo());
        System.out.println(l1.getEjemplares());
        System.out.println(l1.getEjemplaresPrestados());
        System.out.println(l1.devlucion());
        System.out.println(l1.getEjemplares());
        System.out.println(l1.getEjemplaresPrestados());
        System.out.println(l1.toString());




    }

}