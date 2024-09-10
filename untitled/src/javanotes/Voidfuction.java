package javanotes;

import java.util.Scanner;

public class Voidfuction {

   static int  costumerId;

    static String contumer;

   static String gmail;

    static String password;

    static  Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        createcostumer();
    }
    public static void  createcostumer(){

        System.out.println("ingrese al id");
        costumerId = sc.nextInt();
        System.out.println("ingrese el nombre");
        contumer = sc.next();
        System.out.println("gmail");
        gmail = sc.next();
        System.out.println("contraseña");
        password = sc.nextLine();

    }

}
