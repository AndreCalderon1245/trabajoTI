/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoti;

import java.util.Scanner;

/**
 *
 * @author End User
 */
public class TrabajoTI {

    /**
     * @param args the command line arguments
     */
    public static int seleccion;
    public static String [] nombre;
    public static String [] descripción;
    public static String [] habilidades;
    public static String [] experiencia;
    public static String [] nivel;
    
    /**
     * Matriz de 1x1 nombre
     */
    
    public static void Nombre(){
     
        nombre = new String[3];
        nombre[0] = "developper";
        nombre[1] = "designer";      
        nombre[2] = "telecom";
        
    }
    
     /**
     * Matriz de 1x1 descripción
     */
    
    public static void Descripción(){
    
     descripción = new String[1];
        
     descripción[0] = "desarrollo de aplicaciones";
        
    }
    
     /**
     * Matriz de 1x1 habilidades
     */
    
    public static void Habilidades(){
    
    habilidades = new String[1];
        
    habilidades[0] = "programación web, base de datos, configuración de servidores";
    
    }
    
     /**
     * Matriz de 1x1 Nivel
     */
    
    public static void Nivel(){
    
    nivel = new String[4];
        
    nivel[0] = "Jr";
    nivel[1] = "Sr";
    nivel[2] = "Leader";
    nivel[3] = "Boss";
    
    }
    
    /**
     * Representa el Metodo para obtener el salario según el nivel y experiencia del usuarios.
     */
    
    public static void Sueldo(int opcion){
    
    experiencia = new String[3];
        
    experiencia[0] = "1";
    experiencia[1] = "2";
    experiencia[2] = "3";
    
    int salario;
    
        switch (opcion) {
        case 1:
            salario = (1000) * (1 + (Integer.parseInt(experiencia[0]) / 10));
                 System.out.println("Según el nivel ingresado y en base la experiencia del usuario ceunta con un salario de: $" + salario + " MXN");
            break;
        case 2:
            salario = (1500) * (1 + (Integer.parseInt(experiencia[1]) / 10));
                  System.out.println("Según el nivel ingresado y en base la experiencia del usuario ceunta con un salario de: $" + salario + " MXN");
            break;
        case 3:
            salario = (2000) * (1 + (Integer.parseInt(experiencia[1]) / 10));
                  System.out.println("Según el nivel ingresado y en base la experiencia del usuario ceunta con un salario de: $" + salario + " MXN");
            break;
        case 4:
            salario = (2500) * (1 + (Integer.parseInt(experiencia[2]) / 10));
                 System.out.println("Según el nivel ingresado y en base la experiencia del usuario ceunta con un salario de: $" + salario + " MXN");
            break;
        default:    
        System.out.println("Favor de escribir un número que este dentro de la lista");   
            break;    
        }

    }
      
    /**
     * Representa el Encabezado de página del proyecto.
     */
      public static void Encabezado(){
    
        System.out.println("=====================================================");  
        System.out.println("          UNIVERSIDAD AUTÓNOMA DE CAMPECHE           ");
        System.out.println("====================================================="); 
        System.out.println("               FACULTAD DE INGENIERÍA                "); 
        System.out.println("====================================================="); 
        System.out.println("    LIC. INGENIERÍA EN SISTEMAS COMPUTACIONALES      "); 
        
        }
    
    
    /**
     * Representa el cuerpo de página del proyecto.
     */
    public static void Cuerpo(){
    
        System.out.println("====================================================="); 
        System.out.println(" CLASE DE LENGUAJE DE PROGRAMACIÓN 1RO A. TrabajoTI "); 
        System.out.println("====================================================="); 
    }
    
    /**
     * Representa el pie de página del proyecto.
     */
    public static void Pie(){
    
        System.out.println("=====================================================");
        System.out.println("                                             ACM.2021"); 
    
    }
    
     /**
     * Representa la parte principal de la página del proyecto.
     */
    
    public static void main(String[] args) {
        
       Encabezado();
       Cuerpo();
       Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese un nivel para determinar el sueldo de su usuario: \nJr -------------> 1 \nSr -------------> 2 \nLeader ---------> 3 \nBoss -----------> 4");  
            seleccion = sc.nextInt();
            Sueldo(seleccion);  
       Pie();

    }
    
}
