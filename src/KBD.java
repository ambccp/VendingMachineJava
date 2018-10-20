/**
 * 
 */

public class KBD { // Ler teclas. Métodos retornam ‘0’..’9’,’#’,’*’ ou NONE.

  public static final char NONE = 0;

  // Inicia a classe
  public static void init() {

  }

  // Retorna de imediato a tecla premida ou NONE se não há tecla premida.
  public static char getKey() {
    int value = HAL.readBits(256);
    final int dval = HAL.DVAL_BIT; 
    switch (value) {
      case (dval+1) :
        return '1';
      case (dval+2) :
        return '2';
      case (dval+3) :
        return '3';
      case (dval+4) :
        return '4';
      case (dval+5) :
        return '5';
      case (dval+6) :
        return '6';
      case (dval+7) :
        return '7';
      case (dval+8) :
        return '8';
      case (dval+9) :
        return '9';
      case (dval+11) :
        return '0';
      case (dval+10) :
        return '*';
      case (dval+12) :
        return '#';
      default :
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

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

}
