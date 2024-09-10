package trabajo_bakend;

import java.util.Scanner;

public class Usuario {
    static int  usuarioId;

    static String Usuario;

    static String gmail;

    static String password;

    static  Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        menu();
        createusuario();
    }
    public static void  createusuario(){
        String [] tags = {"usuarioid","usarioname","gmail:","passwod"};

        String [] usuarios  = new String[5];

        System.out.println("ingrese al id");
        usuarioId = sc.nextInt();
        usuarios[0]=  usuarioId + "";
        System.out.println("ingrese el nombre");
        Usuario = sc.next();
        usuarios[1]=Usuario + " ";
        System.out.println("gmail");
        gmail = sc.next();
        usuarios[3]= gmail + " ";
        System.out.println("contraseña");
        password = sc.nextLine();
        usuarios[4]= password + " ";
    }
    public static void  menu(){
        System.out.println("select: 1. iniciar  ");


        int opc = sc.nextInt();
        sc.nextLine();

        switch (opc){

            case 1:
                System.out.println("empezando  ");
                createusuario();
                break;
            default:
                System.out.println("ingresar una opcion valida ");
        }

    }











}
