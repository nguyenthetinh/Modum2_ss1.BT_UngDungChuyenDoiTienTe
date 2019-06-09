package com.ungdungchuoidoitiente;
import java.util.Scanner;
public class Chuyendoi {
    public static void main(String[] args) {
        double vnd=23000;
        double usd;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap so tien USD: ");
        usd =scanner.nextDouble();
        double quydoi=usd *vnd;
        System.out.println("Vnd= " +quydoi);

    }
}
