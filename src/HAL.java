import isel.leic.UsbPort;

public class HAL {
  // Bit que representa o sinal dVal que indica existência de dados no
  // barramento de Keyboard Reader
  public static final int DVAL_BIT = 0b0010000;
  // D0..D3 bits que representam os dados lidos
  public static final int DATA_MASK = 0b00001111;
  // variável com o valor da leitura e manipulado pelo controlador
  public static int currentValue;

  // Inicia a classe
  public static void init() {
    currentValue = 0;
  }

  // Verifica se mask tem apenas um bit a 1
  public static Boolean isOnlyOneBitOne(int x) {
    return (x != 0) && ((x & (x - 1)) == 0);
  }

  // Retorna true se o bit tiver o valor lógico ‘1’
  public static boolean isBit(int mask) {
    return (isOnlyOneBitOne(mask) ? (mask & currentValue) == mask : false);
  }

  // Retorna os valores dos bits representados por mask presentes no UsbPort
  public static int readBits(int mask) {
    return mask & UsbPort.in();
  }

  // Escreve nos bits representados por mask o valor de value
  public static void writeBits(int mask, int value) {
    clrBits(mask);
    setBits(mask & value);
  }

  // Coloca os bits representados por mask no valor lógico ‘1’
  public static void setBits(int mask) {
    currentValue |= mask;
  }

  // Coloca os bits representados por mask no valor lógico ‘0’
  public static void clrBits(int mask) {
    currentValue &= ~mask;
  }

  public static void main(String[] args) {
  }
}
