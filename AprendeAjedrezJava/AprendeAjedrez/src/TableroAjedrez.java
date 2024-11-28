
public class TableroAjedrez {
   public static void posicionesTablero() {
      System.out.println();
      System.out.println("Las posiciones de las casillas en un tablero de ajedrez se identifican mediante un sistema de notación algebraica."); 
      System.out.print("Este sistema combina letras y números para designar de manera única cada casilla del tablero. Aquí tienes la explicación:\n"); 
      System.out.println();
      System.out.println("1. División del tablero");
      System.out.println("El tablero de ajedrez es una cuadrícula de 8x8 casillas. Las filas y columnas se identifican así:");
      System.out.println("  - Columnas (verticales): Se nombran con letras minúsculas de la a a la h, de izquierda a derecha desde la perspectiva de las blancas.");
      System.out.println("  - Filas (horizontales): Se numeran del 1 al 8, desde abajo hacia arriba (también desde la perspectiva de las blancas).");
      String[][] ajedrez = new String[8][8];

      ajedrez[0][0] = "A8";
      ajedrez[1][0] = "A7";
      ajedrez[2][0] = "A6";
      ajedrez[3][0] = "A5";
      ajedrez[4][0] = "A4";
      ajedrez[5][0] = "A3";
      ajedrez[6][0] = "A2";
      ajedrez[7][0] = "A1";

      ajedrez[0][1] = "B8";
      ajedrez[1][1] = "B7";
      ajedrez[2][1] = "B6";
      ajedrez[3][1] = "B5";
      ajedrez[4][1] = "B4";
      ajedrez[5][1] = "B3";
      ajedrez[6][1] = "B2";
      ajedrez[7][1] = "B1";

      ajedrez[0][2] = "C8";
      ajedrez[1][2] = "C7";
      ajedrez[2][2] = "C6";
      ajedrez[3][2] = "C5";
      ajedrez[4][2] = "C4";
      ajedrez[5][2] = "C3";
      ajedrez[6][2] = "C2";
      ajedrez[7][2] = "C1";

      ajedrez[0][3] = "D8";
      ajedrez[1][3] = "D7";
      ajedrez[2][3] = "D6";
      ajedrez[3][3] = "D5";
      ajedrez[4][3] = "D4";
      ajedrez[5][3] = "D3";
      ajedrez[6][3] = "D2";
      ajedrez[7][3] = "D1";

      ajedrez[0][4] = "E8";
      ajedrez[1][4] = "E7";
      ajedrez[2][4] = "E6";
      ajedrez[3][4] = "E5";
      ajedrez[4][4] = "E4";
      ajedrez[5][4] = "E3";
      ajedrez[6][4] = "E2";
      ajedrez[7][4] = "E1";

      ajedrez[0][5] = "F8";
      ajedrez[1][5] = "F7";
      ajedrez[2][5] = "F6";
      ajedrez[3][5] = "F5";
      ajedrez[4][5] = "F4";
      ajedrez[5][5] = "F3";
      ajedrez[6][5] = "F2";
      ajedrez[7][5] = "F1";

      ajedrez[0][6] = "G8";
      ajedrez[1][6] = "G7";
      ajedrez[2][6] = "G6";
      ajedrez[3][6] = "G5";
      ajedrez[4][6] = "G4";
      ajedrez[5][6] = "G3";
      ajedrez[6][6] = "G2";
      ajedrez[7][6] = "G1";

      ajedrez[0][7] = "H8";
      ajedrez[1][7] = "H7";
      ajedrez[2][7] = "H6";
      ajedrez[3][7] = "H5";
      ajedrez[4][7] = "H4";
      ajedrez[5][7] = "H3";
      ajedrez[6][7] = "H2";
      ajedrez[7][7] = "H1";
      
      System.out.println("Asi se vería un tablero de ajedrez: ");
      System.out.println();
      for (int i = 0; i < ajedrez.length; i++) {
         for (int j = 0; j < ajedrez.length; j++) {
            System.out.print(ajedrez[i][j] + " ");
         }
         System.out.println();
      }
      System.out.println();
      System.out.println("2. Formato de las coordenadas");
      System.out.println("Cada casilla se identifica combinando la letra de la columna con el número de la fila. Por ejemplo:");
      System.out.println("  - La casilla en la esquina inferior izquierda es a1.");
      System.out.println("  - La casilla en la esquina superior derecha es h8.");
      System.out.println();
      System.out.println("3. Ejemplos de nombres de casillas");
      System.out.println("  - a1: Columna \"a\", fila \"1\".");
      System.out.println("  - e4: Columna \"e\", fila \"4\".");
      System.out.println();
   }
}
