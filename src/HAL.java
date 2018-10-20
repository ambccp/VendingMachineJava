import isel.leic.UsbPort;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class HAL {
    public static final int DVAL_BIT = 16; // Bit que representa o sinal dVal que indica existência de dados no barramento de Keyboard Reader

    public static void main(String[] args) {
//        UsbPort.out(1);
//        UsbPort.out(0);
//        System.out.println(UsbPort.in());
        System.out.println(0 & 15);
    }

    // Inicia a classe
    public static void init() {
        throw new NotImplementedException();
    }

    // Retorna true se o bit tiver o valor lógico ‘1’
    public static boolean isBit(int mask) {
        return (mask & UsbPort.in()) == mask;
    }

    // Retorna os valores dos bits representados por mask presentes no UsbPort
    public static int readBits(int mask) {
        return mask & UsbPort.in();
    }

    // Escreve nos bits representados por mask o valor de value
    public static void writeBits(int mask, int value) {
        UsbPort.out(mask & value);
    }

    // Coloca os bits representados por mask no valor lógico ‘1’
    public static void setBits(int mask) { // ler do in?
        UsbPort.out(mask | 0);
    }

    // Coloca os bits representados por mask no valor lógico ‘0’
    public static void clrBits(int mask) {
        UsbPort.out(mask ^ 0); // ler do in?
    }

}
