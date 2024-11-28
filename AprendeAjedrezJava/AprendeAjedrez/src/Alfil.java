
import java.util.ArrayList;

public class Alfil {
   public static ArrayList<String> obtenerMovimientosAlfil(String posicionAlfil) {
      ArrayList<String> movimientos = new ArrayList<String>();

      char columnaInicial = posicionAlfil.charAt(0);
      char filaInicial = posicionAlfil.charAt(1);

      int[][] direcciones = {{1, 1}, {1, -1}, {-1, 1}, {-1, -1}};

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
