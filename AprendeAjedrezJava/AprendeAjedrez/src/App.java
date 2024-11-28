import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a ¿COMO SE MUEVEN LAS PIEZAS EN AJEDREZ?");
        while (true) {
            System.out.println("Elige una de las siguientes opciones: ");
            System.out.println("(1: Posiciones en el tablero de ajedrez | 2: Alfil | 3: Torre | 4: Dama | 5: Rey | 6: Caballo | 7: Peones | 0: Salir)");
            int respuesta = sc.nextInt();
            
            while (respuesta < 0 || respuesta > 7) {
                System.out.println("Introduce una opción correcta");
                System.out.println("Elige una de las siguientes opciones: ");
                System.out.println("(1: Posiciones en el tablero de ajedrez | 2: Alfil | 3: Torre | 4:Dama | 5: Rey | 6: Caballo | 7: Peones | 0: Salir)");
                respuesta = sc.nextInt();
                if (respuesta >= 0 && respuesta <= 7) {
                    break;
                }
            }

            if (respuesta == 1){
                TableroAjedrez.posicionesTablero();
            } else if (respuesta == 2) {
                System.out.println("El alfil solo se puede mover en diagonal");
                System.out.println("Introduzca la posición en el tablero del alfil: ");
                String posicionAlfil = sc.next();
                
                Pattern patternAlfil = Pattern.compile("([a-h][1-8]){1}");
                Matcher m = patternAlfil.matcher(posicionAlfil);
                if (m.find()) {
                    ArrayList<String> movimientos = Alfil.obtenerMovimientosAlfil(posicionAlfil);
                    System.out.println("El alfil en la posición " + posicionAlfil + " se puede mover hacia: ");
                    for (String movimiento : movimientos) {
                        System.out.print(movimiento + " ");
                    }
                    System.out.println();
                } else {
                    System.out.println("La posición dada no es válida");
                }
            } else if (respuesta == 3) {
                System.out.println("La torre se mueve unicamente horizontalmente y verticalmente");
                System.out.println("Introduzca la posición en el tablero de la torre: ");
                String posicionTorre = sc.next();

                Pattern patternTorre = Pattern.compile("([a-h][1-8]){1}");
                Matcher m = patternTorre.matcher(posicionTorre);
                if (m.find()) {
                    ArrayList<String> movimientos = Torre.obtenerMovimientosTorre(posicionTorre);
                    System.out.println("La torre en la posición " + posicionTorre + " se puede mover hacia: ");
                    for (String movimiento : movimientos) {
                        System.out.print(movimiento + " ");
                    }
                    System.out.println();
                } else {
                    System.out.println("La posición dada no es válida");
            }
            } else if (respuesta == 4) {
                System.out.println("La dama se puede mover tanto horizontalmente y verticalmente como una torre, además de diagonalmente como un alfil");
                System.out.println("Introduzca la posición en el tablero de la dama: ");
                String posicionDama = sc.next();

                Pattern patternDama = Pattern.compile("([a-h][1-8]){1}");
                Matcher m = patternDama.matcher(posicionDama);
                if (m.find()) {
                    ArrayList<String> movimientos = Dama.obtenerMovimientosDama(posicionDama);
                    System.out.println("La dama en la posición " + posicionDama + " se puede mover hacia: ");
                    for (String movimiento : movimientos) {
                        System.out.print(movimiento + " ");
                    }
                    System.out.println();
                } else {
                    System.out.println("La posición dada no es válida");
                }
            } else if (respuesta == 5){
                System.out.println("El rey solo se puede mover una casilla en cualquier dirección");
                System.out.println("Introduzca la posición en el tablero de el rey: ");
                String posicionRey = sc.next();

                Pattern patternRey = Pattern.compile("([a-h][1-8]){1}");
                Matcher m = patternRey.matcher(posicionRey);
                if (m.find()) {
                    ArrayList<String> movimientos = Rey.obtenerMovimientosRey(posicionRey);
                    System.out.println("El rey en la posición " + posicionRey + " se puede mover hacia: ");
                    for (String movimiento : movimientos) {
                        System.out.print(movimiento + " ");
                    }
                    System.out.println();
                } else {
                    System.out.println("La posición dada no es válida");
                }
            } else if (respuesta == 6) {
                System.out.println("Caballos... SOON");
            } else if (respuesta == 7) {
                System.out.println("Peones... SOON");
            } else if (respuesta == 0) {
                System.out.println("¿Deseas salir del programa? (s/n)");
                String respuestaSalir = sc.next();
                if (respuestaSalir.equalsIgnoreCase("s") || respuestaSalir.equalsIgnoreCase("si")){
                    break;
                }
            }
        } 
        sc.close();
    }
}
