import java.util.Vector;

public class main {
    public static void main(String[] args) {

        int array[] = {1,2,3,4};
        //Ejemplo de vector
        Vector vector = new Vector(); //Inicializado en 10 por default
        vector.add('H'); //Metodo para agregar un elemento
        vector.add("19");
        vector.remove("19");
        vector.add(array);

        System.out.println(vector);



    }
}
