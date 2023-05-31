public class Eval {
   import java.util.Scanner; //fichero para hacer uso del scanner

    /**
     *
     * @author Rolando Dominguez
     */
    public class Eval {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {

            // declaro las variables que voy a uttilizar y me servirán de auxiliares
            String nombre, cal;             // variables de tipo String para el nombre y la Calificacion con Letra
            int i;                          // Auxiliar para bucle
            float a;                        // variable de tipo float para el promedio
            float calif[] = new float [5];  // declaración y creación de array de tipo float para las calificaciones individuales
            System.out.println("*** Bienvenido alumno *** \n");
            System.out.println("Introduce tu nombre: ");
            //// inicializo un objeto de tipo scanner con el nombre in,  para poder leer de teclado
            Scanner in = new Scanner(System.in);

            //// se lee el nombre y se asigna a la variable de tipo String
            nombre = in.nextLine();

            //// Se capturan los datos del array de calificaciones con datos de tipo float a traves de un bucle for
            for(i = 0; i<5; i++)
            {
                System.out.println("Introduce la calificacion de la materia "+(i+1));
                calif[i] = in.nextFloat();
            }


            //// se utilizan los metodos
            a = prom(calif);        // se asigna la devolucion del metodo prom, que regresa un float, a la variable 'a'. se envia el array de calificaciones
            cal = Calf(a);          // se asigna la devolucion del metodo Calf, que regresa un String, a la var "cal". Se envia el promedio (a)

            MostrarR(nombre,calif,a,cal);//Se llama al metodo que muestra los resultados

        }
        ///////////////////////////////////////
        //////////// Metodos //////////////////
        ///////////////////////////////////////

        ////metodo que calcula promedio
        static float prom(float lista[])    //retorna un float y recibe un array de tipo float
        {
            // se declaran las variables auxiliares
            float pro;
            int i;
            float sum = 0;

            // en un bucle for se hace la sumatoria de los elementos en el array, el cual se recorre con la variable auxiliar "i"
            for(i=0;i<5;i++)
            {
                sum = sum + lista[i];
            }

            //el resultado de la sumatoria se divide entre 5 y se obtiene el promedio. el cual será retornado por el metodo
            pro = sum/5;
            return pro;
        }

        //// Metodo que asigna una calificacion con letra segun el promedio numerico obtenido
        static String Calf(float promedio)
        {
            //declaro una variable de tipo String para asignar la letra que retornaremos
            String cal = null;

            //se evaluan las condicionales correspondientes
            if (promedio <= 5)
                cal = "F";
            else if (promedio <= 6 && promedio > 5)
                cal = "E";
            else if (promedio <= 7 && promedio > 6)
                cal = "D";
            else if (promedio <= 8 && promedio > 7)
                cal = "C";
            else if (promedio <= 9 && promedio > 8)
                cal = "B";
            else if (promedio <= 10 && promedio > 9)
                cal = "A";

            return cal; // segun el resultado cal obtiene un valor y es lo que devuelve el metodo
        }


        //// metodo que muestra los resultados
        static void MostrarR(String nombre,float grades[],float promedio,String Cfinal) // no devuelve nada, recibe un string para el nombre, array de float
        {                                                                               // float para el promedio y un String para la calificacion con letra
            int i;

            System.out.println("\n ****Resultados****\n");
            System.out.println("Nombre: "+nombre);
            System.out.println("------------------------------");
            System.out.println("\nCalificaciones individuales");

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
}
