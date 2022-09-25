/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package huyvb;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class DemoFor1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap n tu ban phim: ");
        int n = input.nextInt();
        System.out.println("Nhung so chan trong khoang tu 0 - n la: ");
        for(int i = 0; i <= n; i += 2) {
            System.out.printf("%d\t", i);
        }
    }
}
