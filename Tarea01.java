//Juan Melendres A00369017
import javax.swing.*;

public class Tarea01{

  public static void main(String[] args){

    ternaPitagorica();
    int num = Integer.parseInt(JOptionPane.showInputDialog("Escribe cuál número quieres en notacion romana (No mas de 3999): "));

    System.out.println("El número en notacion romana es:  " + numerosRomanos(num));

  }

  public static void ternaPitagorica(){

    int max = 500;

    for(int a = 1; a <= max; a++){

      for(int b = 1; b <= max; b++){

        for(int c = 1; c <= max; c++){

          if ( a*a == b*b + c*c )
          System.out.printf("\nEsta es una de las varias Ternas Pitagoricas" + "\n%3d,%3d,%3d\n", a, b, c);
        }

      }

    }

  }

  public static String numerosRomanos(int num){


     int i,
        miles,
        centenas,
        decenas,
        unidades;
     String romanos = "";
     miles = num / 1000;
     centenas = num / 100 % 10;
     decenas = num / 10 % 10;
     unidades = num % 10;

     //Para Los Miles
     for (i = 1; i <= miles; i++) {

       romanos = romanos + "M";

     }

     //Para Las Centenas
     if (centenas == 9) {

       romanos = romanos + "CM";

     }

     else if (centenas >= 5) {

       romanos = romanos + "D";

       for (i = 6; i <= centenas ; i++) {

         romanos = romanos + "C";

       }

     }

     else if (centenas == 4) {

       romanos = romanos + "CD";

     }

     else{

       for (i = 1;i <= centenas ; i++) {

         romanos = romanos + "C";

       }

     }


    //Para Las Decenas
    if (decenas == 9){

      romanos = romanos + "XC";

    }

    else if (decenas >= 5) {

      romanos = romanos + "L";
      for (i = 6; i <= decenas; i++) {

        romanos = romanos + "X";

      }

    }

    else if (decenas == 4) {

      romanos = romanos + "XL";

    }

    else {

      for (i = 1; i <= decenas ; i++) {

        romanos = romanos + "X";

      }

    }

    //Para Las Unidades
    if (unidades == 9){

      romanos = romanos + "IX";

    }

    else if (unidades >= 5) {

      romanos = romanos + "V";
      for (i = 6; i <= unidades; i++) {

        romanos = romanos + "I";

      }

    }

    else if (unidades== 4) {

      romanos = romanos + "IV";

    }

    else {

      for (i = 1; i <= unidades ; i++) {

        romanos = romanos + "I";

      }

    }

    return romanos;
  }

}
