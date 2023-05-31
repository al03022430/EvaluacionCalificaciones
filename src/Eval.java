import java.util.Scanner;

public class Eval {

    public static void main(String[] args) {

        // declaracion de variables
        String nombre, cal;
        int i;                          // contador para medir numero de calificaciones
        float a;
        float calif[] = new float [5];
        System.out.println("*** Sistema para promediar calificaicones *** \n");
        System.out.println("Introduce escribir el nombre del alumno: ");
        Scanner in = new Scanner(System.in);
        nombre = in.nextLine();

        //atributo tipo array con un for con contador para medir las 5 calificaciones
        for(i = 0; i<5; i++)
        {
            System.out.println("Introduce la calificacion de la materia "+(i+1));
            calif[i] = in.nextFloat();
        }
        // Metodo para calcular promedios
        a = prom(calif);
        cal = Calf(a);
        MostrarR(nombre,calif,a,cal);
    }
    //Calculo de promedio
    static float prom(float lista[])
    {
        // variables de
        float pro;
        int i;
        float sum = 0;


        for(i=0;i<5;i++)
        {
            sum = sum + lista[i];
        }

        pro = sum/5;
        return pro;
    }

    // Metodo que para regresar caracter apartir de promedio
    static String Calf(float promedio)
    {
        String cal = null;
        if (promedio <= 50)
            cal = "F";
        else if (promedio <= 60 && promedio > 51)
            cal = "E";
        else if (promedio <= 70 && promedio > 61)
            cal = "D";
        else if (promedio <= 80 && promedio > 71)
            cal = "C";
        else if (promedio <= 90 && promedio > 81)
            cal = "B";
        else if (promedio <= 100 && promedio > 91)
            cal = "A";

        return cal;
    }


    // metodo que muestra los resultados
    static void MostrarR(String nombre,float grades[],float promedio,String Cfinal) // no devuelve nada, recibe un string para el nombre, array de float
    {                                                                               // float para el promedio y un String para la calificacion con letra
        int i;

        System.out.println("\n ****Resultados****\n");
        System.out.println("Nombre: "+nombre);
        System.out.println("------------------------------");
        System.out.println("\nCalificaciones por materia");

        for(i=0;i<5;i++)
        {
            System.out.println("\nMateria "+(i+1)+" : "+grades[i]);
        }
        System.out.println("------------------------------");
        System.out.println("\nPromedio: "+promedio);
        System.out.println("------------------------------");
        System.out.println("\nCalificacion: "+Cfinal);
    }

}
