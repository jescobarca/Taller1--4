/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplo1;

/**
 *
 * @author jorge
 */
import java.util.Scanner;
public class Ejemplo1 {

    public static void main(String[] args) {
        double juan,alberto,ana,mama;
        Scanner ent=new Scanner(System.in);
        juan=ent.nextInt();
        alberto=juan*2/3;
        ana=juan*4/3;
        mama=juan+alberto+ana;
        System.out.println("Edades:");
        System.out.println("Juan:"+juan);
        System.out.println("Alberto:"+alberto);
        System.out.println("Ana:"+ana);
        System.out.println("Mama:"+mama);
    }
}
