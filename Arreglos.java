//Juan Melendres A00369017
public class PruebaArreglos{

    public int suma(int[] valores){

        int total = 0;
        for (int i = 0; i < valores.length; i++) {

            total+=valores[i];

        }

        return total;

    }

    public int maximo(int[] valores){

        int max = valores[0];
        for (int i = 0; i < valores.length; i++) {

            if (valores[i] > max) {

                max = valores[i];

            }

        }

        return max;

    }

    public int minimo(int[] valores){

        int min = valores[0];
        for (int i = 0; i < valores.length; i++) {

            if (valores[i] < min) {

                min = valores[i];

            }

        }

        return min;

    }

    public double promedio(int[] valores){

        double pro = 0.0;
        int canNum = 0;
        for (int i = 0; i < valores.length; i++) {

            pro+=valores[i];
            canNum ++;

        }

        pro = (pro/canNum);
        return pro;

    }

    public void imprime(String[][] letras){


        for (int i = 0; i < letras.length; i++) {

            for (int j = 0; j < letras[i].length; j++) {

                System.out.print(letras[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[] a = {2,6,8,27,49,11};
        int[] b = {1,100};

        //Bidimensional
        String[][] animales =  { {"cat", "dog", "lizzard"},
                                 {"bear", "shark", "snake"} };

        PruebaArreglos pa = new PruebaArreglos();
        //suma
        System.out.println("El total es" + " " + pa.suma(a));
        System.out.println("El total es" + " " + pa.suma(b));

        //maximo
        System.out.println("El numero mayor es" + " " + pa.maximo(a));
        System.out.println("El numero mayor es" + " " + pa.maximo(b));

        //menor
        System.out.println("El numero menor es" + " " + pa.minimo(a));
        System.out.println("El numero menor es" + " " + pa.minimo(b));

        //promedio
        System.out.println("El promedio es" + " " + pa.promedio(a));
        System.out.println("El promedio es" + " " + pa.promedio(b));

        //bidimensional
        pa.imprime(animales);

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        String[][] byd;
        byd = new String[x][y];

        int counter = 2;

        for (int i = 0; i < byd.length; i++){
           for (int j = 0; j < byd[i].length; j++){
             byd[i][j] = args[counter];
             counter += 1;
           }
        }

        for (int i = 0; i < byd.length; i++){
           for (int j = 0; j < byd[i].length; j++){
             System.out.print(byd[i][j]+" ");
           }
           System.out.println("");
        }

    }

}
