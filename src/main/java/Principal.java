import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        // RESULTADO FINAL 12345678-5
        String rut = "12345678";
        rut = invertirRut(rut);
        int suma = multiplicarCadena(rut);
        int dividirMulti11 = dividir(suma);
        int resta =restar(dividirMulti11,suma);
        resultado(resta);

    }

    private static void resultado(int resta) {
        System.out.println("El numero verificador es: "+resta);
    }

    private static int restar(int a, int b) {
        return 11 - Math.abs(a-b);
    }

    private static int dividir(int suma) {
        int aux = suma/11;
        return aux*11;
    }

    private static int multiplicarCadena(String rut) {
        int[] lista = {2,3,4,5,6,7,2,3,4,5,6,7,2,3,4,5,6,7};
        int[] digitos = separarDigitos(Integer.parseInt(rut));
        int suma = 0;
        int contador = 0;

        for (int j = 0; j < digitos.length; j++) {
            suma = suma + lista[j]*digitos[j];
            contador++;
            if (contador == digitos.length){
                break;
            }
        }
            

        return suma;
    }

    private static String invertirRut(String rut) {
        StringBuilder frase = new StringBuilder(rut);
        return frase.reverse().toString();
    }

    public static int[] separarDigitos(int numero) {
        String numeroString = Integer.toString(numero);
        int longitud = numeroString.length();
        int[] digitos = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            digitos[i] = Character.getNumericValue(numeroString.charAt(i));
        }

        return digitos;
    }
}
