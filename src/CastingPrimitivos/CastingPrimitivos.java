package CastingPrimitivos;

/**
 *
 * @author Pedro
 */
public class CastingPrimitivos {

    public static void main(String[] args) {
        // Declarações de exemplos
        byte varByte = 1;
        int varInt = 12345;
        short varShort = 12;
        long varLong = 922337036854775807L;
        float varFloat = 1.312f;
        double varDouble = 1.3123123124;
        
        // Parte 1 – Casting implícito (widening)
        int byteToInt = varByte;
        long intToLong = varInt;
        double floatToDouble = varFloat;
        System.out.println("Atribuir de um byte a um int: " + byteToInt);
        System.out.println("Atribuir de um int a um long: " + intToLong);
        System.out.println("Atribuir de um float a um double: " + floatToDouble);
        
        // Parte 2 – Casting explícito (narrowing)
        byte intToByte = (byte) varInt;
        float doubleToFloat = (float) varDouble;
        short longToShort = (short) varLong;
        System.out.println("Atribuir de um int a um byte: " + intToByte);
        System.out.println("Atribuir de um double a um float: " + doubleToFloat);
        System.out.println("Atribuir de um long a um short: " + longToShort);
    }
}