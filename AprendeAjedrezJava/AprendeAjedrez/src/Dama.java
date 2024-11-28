
import java.util.ArrayList;

public class Dama {
   public static ArrayList<String> obtenerMovimientosDama(String posicionDama) {
      ArrayList<String> movimientos = new ArrayList<String>();

      char columnaInicial = posicionDama.charAt(0);
      char filaInicial = posicionDama.charAt(1);

      int[][] direcciones = {{1, 1}, {1, -1}, {-1, 1}, {-1, -1}, {1, 0}, {-1, 0}, {0, 1}, {0, -1}};

      for (int[] direccion : direcciones) {
         char columnaActual = columnaInicial;
         char filaActual = filaInicial;

         while (true) {
            columnaActual += direccion[0];
            filaActual += direccion[1];

            if (columnaActual >= 'a' && columnaActual <= 'h' && filaActual >= '1' && filaActual <= '8') {
               movimientos.add("" + columnaActual + filaActual);
            } else {
               break;
            }
         }
      }

      return movimientos;
   }
}
