import java.util.Scanner;
public class AlgebraMatriz {
    public static void main (String[] args) {
        Scanner lector = new Scanner (System.in);
        byte intentosMax = 3, intentos = 1;
        int numFilas1, numColumna1, numFilas2, numColumna2;

        while (intentos < intentosMax) {

            System.out.println("Selecciona una operación:");
            System.out.println("1. Verificar si 2 matrices son iguales");
            System.out.println("2. Sumar 2 matrices");
            System.out.println("3. Generar una matriz 0 de n x m");
            System.out.println("4. Obtener el inverso aditivo de una matriz");
            System.out.println("5. Restar 2 matrices");
            System.out.println("6. Multiplicar un escalar por una matriz");
            System.out.println("7. Multiplicar 2 matrices compatibles");
            System.out.println("8. Obtener una matriz identidad");
            System.out.println("9. Obtener la inversa de una matriz");
            System.out.println("10. Obtener el determinante de una matriz");
            System.out.println("0. Salir");

            int opcion = lector.nextInt();

            if (opcion == 0) {
                break;
            }

            switch (opcion) {
                case 1:
                //verificar si dos matrices son iguales ambas deben tener el mismo numero de\n filas y columnas");

                System.out.println("Cual es el numero de filas para la primera matriz");
                numFilas1=leer.nextInt();
  
                System.out.println("Cual es el numero de columnas para la primera matriz ");
                numColumna1=leer.nextInt();
  
                System.out.println("Cual es el numero de filas para la segunda matriz");
                numFilas2=leer.nextInt();
  
                System.out.println("Cual es el numero de columnas para la segunda matriz ");
                numColumna2=leer.nextInt();
  
                int matriz1[][] = new int [numFilas1][numColumna1];
                int matriz2[][] = new int [numFilas2][numColumna2];
  
                if(numFilas1 != numFilas2 && numColumna1 !=  numColumna2){
                  System.out.println("Las matrices a y b son diferentes ");
                  break;
  
                }else{
                  System.out.println("Las matrices 1 y 2 son iguales ");
                }
  
                  for(int i = 0 ; i <numFilas1 ; i ++){
                      for(int j =  0 ;j<numColumna1 ; j++){
  
                      System.out.println("Cual es el valor de la matriz a  : " + "[" + (i + 1) + "][" + (j + 1) +"]");
                      matriz1[i][j] = leer.nextInt(); 
                      }
                  }
  
                  for(int x = 0 ; x <numFilas1 ; x ++){
                      for(int y =  0 ;y<numColumna1 ; y++){
  
                      System.out.println("Cual es el valor de la segunda matriz : " + "[" +(x + 1) + "][" + (y + 1) +"]");
                      matriz2[x][y] = leer.nextInt(); 
                          }
                      }
  
                   System.out.println("La primera matriz es : ");
  
                  for(int i = 0 ; i <numFilas1 ; i ++){
                      for(int j =  0 ;j<numColumna1 ; j++){
                            
                              System.out.print(matriz1[i][j] + " ");
  
                            }
                          System.out.println(" :::::::::::::::::::::::::::::");
                          }
  
                          System.out.println("La matriz b es ");
  
                          for(int x = 0 ; x <numFilas1 ; x ++){
                            for(int y =  0 ;y<numColumna1 ; y++){
                           
                              System.out.print(matriz2[x][y] + " ");
                              }
                          System.out.println(" :::::::::::::::::::::::::::::::");
                          }
                        
                    break;
                case 2:
                // sumar 2 matrices tanto las columnas como las filas necesitan ser iguales");
             
                System.out.println("Cual es el numero de filas para la primera matriz");
                numFilas1=leer.nextInt();
  
                System.out.println("Cual es el numero de columnas para la primera matriz ");
                numColumna1=leer.nextInt();
  
                System.out.println("Cual es el numero de filas para la segunda matriz ");
                numFilas2=leer.nextInt();
  
                System.out.println("Cual es el numero de columnas para la segunda matriz ");
                numColumna2=leer.nextInt();
  
                int matrizA1[][] = new int [numFilas1][numColumna1];
                int matrizB1[][] = new int [numFilas2][numColumna2];
  
                if(numFilas1 != numFilas2 && numColumna1 != numColumna2){
                  System.out.println("Las filas o las columnas no son iguales no se puede sumar ");
                  break;
  
                }else{
                  System.out.println("Las filas de la matriz 1 y 2 son iguales\n las columnas de la matriz 1 y 2 son iguales ");
                }
  
                  for(int i = 0 ; i <numFilas1 ; i ++){
                      for(int j =  0 ;j<numColumna1 ; j++){
  
                      System.out.println("Cual es el valor de la primera matriz : " + "[" + (i + 1) + "][" + (j + 1) +"]");
                      matrizA1[i][j] = leer.nextInt(); 
                      }
                  }
  
                  for(int i = 0 ; i <numFilas1 ; i ++){
                      for(int j =  0 ;j<numColumna1 ; j++){
  
                      System.out.println("Cual es el valor de la segunda matriz : " + "[" +(i + 1) + "][" + (j + 1) +"]");
                      matrizB1[i][j] = leer.nextInt(); 
                          }
                      }
                       int resultado [][] = new int [numFilas1][numColumna1];
                      
  
                      for(int i = 0 ; i <matrizA1.length ; i ++){
                          for(int j =  0 ;j<matrizB1.length; j++){
  
                              resultado[i][j] = matrizA1[i][j] + matrizB1[i][j];
                          }
                      }
                   System.out.println("La primera matriz  es");
  
                  for(int i = 0 ; i <numFilas1 ; i ++){
                      for(int j =  0 ;j<numColumna1 ; j++){
                          
                            
                              System.out.print(matrizA1[i][j] + ":::::::::::::::: ");
  
                            }
                          System.out.println(":::::::::::::::::::::::::: ");
                          }
  
                          System.out.println("La segunda matriz es ");
  
                          for(int i = 0 ; i <numFilas1 ; i ++){
                            for(int j =  0 ;j<numColumna1 ; j++){
  
                           
                              System.out.print(matrizB1[i][j] + " ");
  
                              }
                          System.out.println("::::::::::::::::::::::::::: ");
                          }
  
                          System.out.println("La suma de las matrices son : ");
  
                          for(int i =0 ; i<numFilas1 ;  i++){
                              for(int j =0 ; j<numColumna1; j ++){
                                  System.out.print(resultado[i][j] + " ");
                              }
                              System.out.println("");
                          }
                    break;
                case 3:
                //Para generar una matriz 0 de n x m \n solo se nexesita pedir la cantidad de filas y columnas ");

                System.out.println("Cual es la cantidad de filas que va a tener la primera matriz ");
                numFilas1 = leer.nextInt();
                
                System.out.println("Cual es la cantidad de columnas que va a la segunda matriz ");
                numColumna1 = leer.nextInt();

                 int matrizA2 [][] = new int [numFilas1][numColumna1]; 

                for(int i =0; i<numFilas1; i ++){
                    for(int j =0 ; j<numColumna1; j++){

                        matrizA2[i][j] = 0;    
                    }
                }
                System.out.println("::::::::::::::");

                System.out.println("La matriz de ceros n x m es ");

                for(int i=0; i<numFilas1; i++){
                    for(int j =0; j<numColumna1; j++){
                        
                        System.out.print(matrizA2[i][j] + "::: ");
                    }
                    System.out.println(".....");
                }
                  
                    break;
                case 4:
               //matriz inversa de una matriz

                System.out.println("Cual es la cantidad de filas de la mnatriz");
                numFilas1 = leer.nextInt();

                System.out.println("Cual es la cantida de columnas para la matriz");
                numColumna1 = leer.nextInt();

                int matrizA3 [][] = new int [numFilas1][numColumna1]; 

                for(int i =0; i<numFilas1; i ++){
                    for(int j =0 ; j<numColumna1; j++){
                        
                        System.out.println("Cual es el valor de : " + "[" +(i + 1) + "][" + (j + 1) +"]");
                        matrizA3[i][j] = leer.nextInt();
                        
                    }
                }
                int matrizA3A [][] = new int[numFilas1][numColumna1];

                 for(int i =0; i<numFilas1; i ++){
                    for(int j =0 ; j<numColumna1; j++){

                        matrizA3A[i][j] = - matrizA3 [i][j];
                        
                    }

                }

                for(int i =0; i<numFilas1; i ++){
                    for(int j =0 ; j<numColumna1; j++){

                      System.out.print(matrizA3A[i][j] + " ");
                        
                    }
                    System.out.println("::::::::::::::::::::");
                }
                    
                    break;
                case 5:
               //restar dos matrices

                System.out.println("Cual es el numero de filas para la matriz ");
                numFilas1=leer.nextInt();

                System.out.println("Cual es el numero de columnas para la primera matriz");
                numColumna1=leer.nextInt();

                System.out.println("Cual es numero de filas para la segunda matriz ");
                numFilas2=leer.nextInt();

                System.out.println("Cual es el numero de columnas para la segunda matriz ");
                numColumna2=leer.nextInt();

                int matrizA5[][] = new int [numFilas1][numColumna1];
                int matrizB5[][] = new int [numFilas2][numColumna2];

                if(numFilas1 != numFilas2 && numColumna1 != numColumna2){
                System.out.println("Las filas o las columnas no son iguales no se puede restar ");
                break;

                }else{
                System.out.println("Las filas de la matriz 1 y 2 son iguales\n las columnas de la matriz 1 y 2 son iguales : ");
                }

                for(int i = 0 ; i <numFilas1 ; i ++){
                    for(int j =  0 ;j<numColumna1 ; j++){

                    System.out.println("Cual es el valor de la matriz a  : " + "[" + (i + 1) + "][" + (j + 1) +"]");
                    matrizA5[i][j] = leer.nextInt(); 

                    
                    }
                }

                for(int i = 0 ; i <numFilas1 ; i ++){
                    for(int j =  0 ;j<numColumna1 ; j++){

                    System.out.println("Cual es el valor de la matriz b : " + "[" +(i + 1) + "][" + (j + 1) +"]");
                    matrizB5[i][j] = leer.nextInt(); 
                        }
                    }
                     int resultado5 [][] = new int [numFilas1][numColumna1];
                    

                    for(int i = 0 ; i <matrizA5.length ; i ++){
                        for(int j =  0 ;j<matrizB5.length; j++){

                            resultado5[i][j] = matrizA5[i][j] - matrizB5[i][j];
                        }
                    }

                 System.out.println("La primera matriz es");

                for(int i = 0 ; i <numFilas1 ; i ++){
                    for(int j =  0 ;j<numColumna1 ; j++){
                                                  
                            System.out.print(matrizA5[i][j] + " ");

                          }
                        System.out.println(" ");
                        }

                        System.out.println("La segundda matriz es ");

                        for(int i = 0 ; i <numFilas1 ; i ++){
                          for(int j =  0 ;j<numColumna1 ; j++){

                         
                            System.out.print(matrizB5[i][j] + " ");

                            }
                        System.out.println("::::::::::::::::::::: ");
                        }

                        System.out.println("La resta de las matrices es ");

                        for(int i =0 ; i<numFilas1 ;  i++){
                            for(int j =0 ; j<numColumna1; j ++){
                                System.out.print(resultado5[i][j] + " ");
                            }
                            System.out.println("");
                        }

                    break;
                case 6:
                //multiplicar un escalar por una matriz n x m

                System.out.println("Cual es el numero de filas para la primera matriz : ");
                numFilas1=leer.nextInt();

                System.out.println("Cual es el numero de columnas para primera matriz : ");
                numColumna1=leer.nextInt();

                System.out.println("Inserte el valor del escalar : ");
                int escalar = leer.nextInt();

                int matrizA6 [][] = new int[numFilas1][numColumna1];

                for(int i = 0 ; i <numFilas1 ; i ++){
                    for(int j =  0 ;j<numColumna1 ; j++){

                    System.out.println("Cual es el valor de la primera matriz  : " + "[" + (i + 1) + "][" + (j + 1) +"]");
                    matrizA6[i][j] = leer.nextInt(); 
                    }
                }

                 int resultado6 [][] = new int [numFilas1][numColumna1];
                    

                    for(int i = 0 ; i <numFilas1 ; i ++){
                        for(int j =  0 ;j<numColumna1; j++){

                            resultado6[i][j] = escalar * matrizA6[i][j];

                        }
                    }
                        System.out.println("La multiplicacion de una matriz (nxm) x un escalar es de : ");

                        for(int i =0 ; i<numFilas1 ;  i++){
                            for(int j =0 ; j<numColumna1 ; j ++){
                                System.out.print(resultado6[i][j] + " ");
                            }
                            System.out.println("::::::::::::::::::::::::::");
                        }
                  
                    break;
                case 7:
                   //multiplicar dos matrices
                   System.out.println("Para multiplicar 2 matrices compatibles\n Para ello se necesitan las filas y las columnas");

            System.out.println("Cual es el numero de filas de la primera matriz :");
            numFilas1=leer.nextInt();

            System.out.println("Cual es el numero de columna de la primer matriz : ");
            numColumna1=leer.nextInt();

            System.out.println("Cual es numero de filas de la segunda matriz : ");
            numFilas2=leer.nextInt();

            System.out.println("Cual es el numero de columnas de la segunda matriz ");
            numColumna2=leer.nextInt();

            int matrizA7[][] = new int [numFilas1][numColumna1];
            int matrizB7[][] = new int [numFilas2][numColumna2];

            if(numFilas1 != numFilas2 && numColumna1 != numColumna2){
              System.out.println("Las filas o las columnas no son iguales por tanto no se pueden multiplicar  ");
              break;

            }else if(numFilas1 == numFilas2 && numColumna1 == numColumna2){
              System.out.println("Las filas de la matriz 1 y 2 son iguales\n las columnas de la matriz 1 y 2 son iguales ");
            }

              for(int i = 0 ; i <numFilas1 ; i ++){
                  for(int j =  0 ;j<numColumna1 ; j++){

                  System.out.println("Cual es el valor de la primera matriz  : " + "[" + (i + 1) + "][" + (j + 1) +"]");
                  matrizA7[i][j] = leer.nextInt(); 
                  }
              }

              for(int i = 0 ; i <numFilas1 ; i ++){
                  for(int j =  0 ;j<numColumna1 ; j++){

                  System.out.println("Cual es el valor de la segunda matriz : " + "[" +(i + 1) + "][" + (j + 1) +"]");
                  matrizB7[i][j] = leer.nextInt(); 
                      }
                  }
                   int resultado7 [][] = new int [numFilas1][numColumna1];
                  

                  for(int i = 0 ; i <matrizA7.length ; i ++){
                      for(int j =  0 ;j<matrizB7.length; j++){

                          resultado7[i][j] = matrizA7[i][j] * matrizB7[i][j];

                      }
                  }

               System.out.println("La primera matriz es :");

              for(int i = 0 ; i <numFilas1 ; i ++){
                  for(int j =  0 ;j<numColumna1 ; j++){
                      
                        
                          System.out.print(matrizA7[i][j] + " ");

                        }
                      System.out.println("::::::::::::::::::: ");
                      }

                      System.out.println("La segunda matriz es ");

                      for(int i = 0 ; i <numFilas1 ; i ++){
                        for(int j =  0 ;j<numColumna1 ; j++){

                       
                          System.out.print(matrizB7[i][j] + " ");

                          }
                      System.out.println(" :::::::::::::::::: ");
                      }

                      System.out.println("La multiplicacion de las matrices son : ");

                      for(int i =0 ; i<numFilas1 ;  i++){
                          for(int j =0 ; j<numColumna1; j ++){
                              System.out.print(resultado7[i][j] + " ");
                          }
                          System.out.println("");
                      }
                  
                    break;
                case 8:
                    obtenerMatrizIdentidad();
                    break;
                case 9:
                    obtenerInversaMatriz();
                    break;
                case 10:
                    obtenerDeterminanteMatriz();
                    break;
                default:
                    System.out.println("Opción no válida. Introduce un número del 0 al 10.");
           
                }
            if(intentos <3){

                System.out.println("Intentelo nuevamente : ");
                System.out.println("Le quedan : " + (intentosMax - intentos) + " Intentos");
            }
          }
          intentos++;
    
          
          if(intentos == intentosMax){
            
          System.out.println("No le quedan mas intentos ");
          }

        lector.close();
     }
        

   
    private static void obtenerMatrizIdentidad() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de la matriz identidad (n):");
        int n = scanner.nextInt();

        int[][] matrizIdentidad = obtenerMatrizIdentidad(n);

        System.out.println("La matriz identidad de tamaño " + n + " x " + n + " es:");
        imprimirMatrizIdentidad(matrizIdentidad);

        scanner.close();
    }
    
    public static int[][] obtenerMatrizIdentidad(int n) {
        int[][] matrizIdentidad = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matrizIdentidad[i][j] = 1;
                } else {
                    matrizIdentidad[i][j] = 0;
                }
            }
        }

        return matrizIdentidad;
    }

    public static void imprimirMatrizIdentidad(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
            System.out.println();
        
    }

    private static void obtenerInversaMatriz() {
          Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de la matriz cuadrada (n):");
        int n = scanner.nextInt();

        double[][] matriz = new double[n][n];

        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextDouble();
            }
        }

        double[][] matrizInversa = calcularInversa(matriz);

        if (matrizInversa != null) {
            System.out.println("La matriz inversa es:");
            imprimirMatrizInversa(matrizInversa);
        } else {
            System.out.println("La matriz no tiene inversa.");
        
        }
        scanner.close();
    }

    public static double[][] calcularInversa(double[][] matriz) {
        int n = matriz.length;
        double[][] matrizAumentada = new double[n][2 * n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizAumentada[i][j] = matriz[i][j];
                if (i == j) {
                    matrizAumentada[i][j + n] = 1; 
                } else {
                    matrizAumentada[i][j + n] = 0;
                }
            }
        }

        
        for (int i = 0; i < n; i++) {
            double pivote = matrizAumentada[i][i];

            if (pivote == 0.0) {
                return null;
            }

            for (int j = 0; j < 2 * n; j++) {
                matrizAumentada[i][j] /= pivote;
            }

            for (int k = 0; k < n; k++) {
                if (k != i) {
                    double factor = matrizAumentada[k][i];
                    for (int j = 0; j < 2 * n; j++) {
                        matrizAumentada[k][j] -= factor * matrizAumentada[i][j];
                    }
                }
            }
        }
        double[][] matrizInversa = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizInversa[i][j] = matrizAumentada[i][j + n];
            }
        }

        return matrizInversa;
    }

    public static void imprimirMatrizInversa(double[][] matriz) {
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void obtenerDeterminanteMatriz() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de la matriz cuadrada (n):");
        int n = scanner.nextInt();

        double[][] matriz = new double[n][n];

        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextDouble();
            }
        }

        double determinante = calcularDeterminante(matriz);

        System.out.println("El determinante de la matriz es: " + determinante);

        scanner.close();
    }

    public static double calcularDeterminante(double[][] matriz) {
        int n = matriz.length;

        if (n == 1) {
            return matriz[0][0]; 
        }

        if (n == 2) {
            return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0]; // Caso base: matriz 2x2
        }

        double determinante = 0.0;

        for (int k = 0; k < n - 1; k++) {
            for (int i = k + 1; i < n; i++) {
                double factor = matriz[i][k] / matriz[k][k];
                for (int j = k; j < n; j++) {
                    matriz[i][j] -= factor * matriz[k][j];
                }
            }
        }

        determinante = 1.0;
        for (int i = 0; i < n; i++) {
            determinante *= matriz[i][i];
        }

        return determinante;
    }
}

    