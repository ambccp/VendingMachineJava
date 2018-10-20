/**
 * 
 */

public class KBD extends HAL { // Ler teclas. Métodos retornam ‘0’..’9’,’#’,’*’
                               // ou NONE.

  public static final char NONE = 0;

  // Inicia a classe
  public static void init() {

  }

  // Retorna de imediato a tecla premida ou NONE se não há tecla premida.
  public static char getKey() {
    // 0b00011111 reads dval + data(0..3)
    currentValue = readBits(DVAL_BIT + DATA_MASK); 
    if (isBit(DVAL_BIT)) {
      clrBits(DVAL_BIT);
      switch (currentValue) {
        case (0b0000) : // binary value used explicit
          return '1';
        case (0b0001) :
          return '4';
        case (0b0010) :
          return '7';
        case (0b0011) :
          return '*';
        case (0b0100) :
          return '2';
        case (0b0101) :
          return '5';
        case (0b0110) :
          return '8';
        case (0b0111) :
          return '0';
        case (0b1000) :
          return '3';
        case (0b1001) :
          return '6';
        case (0b1010) :
          return '9';
        case (0b1011) :
          return '#';
        default :
          return NONE;
      }
    } else {
      return NONE;
    }
  }
  // Retorna quando a tecla for premida ou NONE após decorrido ‘timeout’
  // milisegundos.
  public static char waitKey(long timeout) {
    long now = System.currentTimeMillis();
    long finish = now + timeout;
    while (System.currentTimeMillis() < finish) {
      char key = getKey();
      if (key != NONE) {
        return key;
      }
    }
    return NONE;
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }
}
