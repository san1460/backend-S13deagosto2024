package tiendapop;

import java.util.Scanner;

public class Product {
    // Atrivutos
     int productId;
     String productname;
    double costo;
     float profit;
     double price;

    static Scanner sc = new Scanner(System.in);

    public void createproduct() {
        String[] tags = {"id", "productoname", "costo:", "profit", "precio"};

        String[] product = new String[5];

        System.out.println("id");
        productId = sc.nextInt();
        sc.nextLine();
        product[0] = productId + "";
        System.out.println("productoname:");
        productname = sc.nextLine();
        product[1] = productname;
        System.out.println("costo:");
        costo = sc.nextDouble();
        sc.nextLine();
        product[2] = Double.toString(costo);
        System.out.println("profit");
        profit = sc.nextFloat();
        sc.nextLine();
        product[3] = profit + "";
        System.out.println("precio");
        price = calculateprice(profit, costo);
        product[4] = Double.toString(price);

        for (int i = 0; i < product.length; i++) {
            System.out.println(tags[i] + "itm" + product[i]);
        }
    }
       public double calculateprice(float profit,double costo){
            double price = costo/(1-(profit/100));


            return price;
        }
        public void printproduct() {
            System.out.println("id" + productId + "\n" + "product name " + productname + "\n" +
                    "precio" + price);
        }
        public void  menu() {
            System.out.println("select 1. creat product " +
                    "2.see product ");


            int opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {

                case 1:
                    System.out.println("creat product ");
                    createproduct();
                    break;
                case 2:
                    System.out.println("see product");
                    printproduct();
                    break;
                default:
                    System.out.println("ingresar una opcion valida ");
            }
        }
}