
package Clases;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Escribir {
    
   public Escribir(){
       
   }
   
   public void escribir(){
       FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("\\Documents\\NetBeansProjects\\ElectronicShop\\src\\Datos\\Prueba.txt");
            pw = new PrintWriter(fichero);

            for (int i = 0; i < 10; i++)
                pw.println("Linea " + i);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
   }

