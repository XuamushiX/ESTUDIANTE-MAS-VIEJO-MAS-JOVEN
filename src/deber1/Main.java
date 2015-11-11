/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package deber1;
import java.io.*;
/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InputStreamReader DATO= new InputStreamReader(System.in);
        BufferedReader DATO1= new BufferedReader(DATO);
        int PROMEDAD,ESTUJOVEN,ESTUMAYOR,EDADESTU;
        int i,NUMESTU,TOTAL;

        i=1;
        TOTAL=0;
        ESTUJOVEN=100000;
        ESTUMAYOR=0;

        try
        {
            System.out.println("Realizar un programa para calcular el promedio");
            System.out.println("de edad en programacion 1 de la Kennedy, determinar");
            System.out.println("la edad del estudiante mas joven y del estudiante");
            System.out.println("mayor de todos");
            System.out.println("");
            System.out.println("");
            System.out.println("INGRESE EL # DE ESTUDIANTES");
            NUMESTU=Integer.parseInt(DATO1.readLine());
            while (i<=NUMESTU)
           {
           System.out.println("INGRESE LA EDAD DEL ESTUDIANTE" +i);
           EDADESTU=Integer.parseInt(DATO1.readLine());
           TOTAL=TOTAL+EDADESTU;
           if(EDADESTU<ESTUJOVEN)
            {
                ESTUJOVEN=EDADESTU;
            }
            if(EDADESTU>ESTUMAYOR)
            {
                ESTUMAYOR=EDADESTU;
            }
              i=i+1;
          }

         PROMEDAD=TOTAL/NUMESTU;

          System.out.println("EL PROMEDIO DE EDAD EN PROGRAMACION 1 ES:" +PROMEDAD +" AÑOS ");
          System.out.println("EL ESTUDIANTE MAS JOVEN ES DE:" + ESTUJOVEN +" AÑOS ");
          System.out.println("EL ESTUDIANTE MAYOR DE TODOS ES DE:" + ESTUMAYOR +" AÑOS ");


         }
       catch (IOException e)
        {
            System.out.println("ERROR");
        }
}

}
