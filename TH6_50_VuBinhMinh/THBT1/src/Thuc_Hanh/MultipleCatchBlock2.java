/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Thuc_Hanh;

public class MultipleCatchBlock2  {

    public static void main(String[] args) {
    try{
            int a[]=new int[5];
         System.out.println(a[10]);
         }
         catch(ArithmeticException e)
         {
          System.out.println("Arithmetic Exception occurs");
         }
          catch(ArrayIndexOutOfBoundsException e)
         {
           System.out.println("ArrayIndexOutOfBounds Exception occurs");
         }
           catch(Exception e)
         {
           System.out.println("Parent Exception occurs");
          }
           System.out.println("rest of the code");
      } 
}

