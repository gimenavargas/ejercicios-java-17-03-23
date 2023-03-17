/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle_suma;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Bucle_suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        Scanner datos=new Scanner(System.in);
        System.out.println("ingresa tu nombre:");
        nombre = datos.nextLine();
        System.out.println("¡Hola " + nombre + "!");
    class Main {

  public static void main(String[] args) {
   System.out.println("La sumatoria es: " +  imprimirSecuencia(30, 2, 0));
  }

  public static int imprimirSecuencia(int limite, int incremento, int inicio) {
    int sumatoria = 0;
    for (int numero = inicio; numero <= limite; numero = numero + incremento) {
      sumatoria += numero;
      System.out.print(numero + " ");
    }
  return sumatoria;
        }
        
    }
   
    
    
}
