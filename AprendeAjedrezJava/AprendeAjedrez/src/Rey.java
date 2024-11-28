
import java.util.ArrayList;

public class Rey {
   public static ArrayList<String> obtenerMovimientosRey(String posicionRey) {
      ArrayList<String> movimientos = new ArrayList<String>();

      char columnaInicial = posicionRey.charAt(0);
      char filaInicial = posicionRey.charAt(1);

      int[][] direcciones = {{1, 1}, {1, -1}, {-1, 1}, {-1, -1}, {1, 0}, {-1, 0}, {0, 1}, {0, -1}};

      for (int[] direccion : direcciones) {
         char columnaActual = columnaInicial;
         char filaActual = filaInicial;

         for (int i = 0; i < 1; i++) {
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
