import java.io.*;

public class Mayor {

	public static void main(String[] args) {

       int numeroUno = 0;
       System.out.print("Introduce el primer numero ");

       try{
           BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
           numeroUno = Integer.parseInt( entrada.readLine() );
       }

        catch (IOException e) {}

        int numeroDos = 0;
       System.out.print("Introduce el segundo numero ");

       try{
           BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
           numeroDos = Integer.parseInt( entrada.readLine() );
       }

        catch (IOException e) {}

        int numeroTres = 0;
       System.out.print("Introduce el tercer numero ");

       try{
           BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
           numeroTres = Integer.parseInt( entrada.readLine() );
       }

       catch (IOException e) {}



		if (numeroUno > numeroDos && numeroUno > numeroTres) {

					 System.out.println ("El primer numero es Mayor");

			 }

    else if (numeroDos > numeroUno && numeroDos > numeroTres) {

           System.out.println ("El segundo numero es Mayor");

   		}

    else if (numeroTres > numeroDos && numeroTres > numeroDos) {

           System.out.println ("El Tercero numero es Mayor");

    }
	}

}
