import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
//    static int upcOrder = 0;
    public static void main(String[] args) {

//        upcOrder++;

        String upcNumber = "";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyMMdd");
        LocalDateTime now = LocalDateTime.now();

        Scanner entradaEscaner = new Scanner (System.in);
        System.out.print("Ingrese un número: ");
        String entradaTeclado = entradaEscaner.nextLine ();
        if (entradaTeclado.length() == 1){
           upcNumber = "888888"+ dtf.format(now)+"0"+ Integer.parseInt(entradaTeclado);
        }else{
            upcNumber = "888888"+ dtf.format(now)+ Integer.parseInt(entradaTeclado);
        }

        System.out.println(upcNumber);
    }
    @Test
    public void stuff (){

        String upcNumber = "";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyMMdd");
        LocalDateTime now = LocalDateTime.now();

        Scanner entradaEscaner = new Scanner (System.in);
        System.out.print("Ingrese un número: ");
        String entradaTeclado = entradaEscaner.nextLine ();
        if (entradaTeclado.length() == 1){
            upcNumber = "888888"+ dtf.format(now)+"0"+ Integer.parseInt(entradaTeclado);
        }else{
            upcNumber = "888888"+ dtf.format(now)+ Integer.parseInt(entradaTeclado);
        }

        System.out.println(upcNumber);
    }
}
