/**
 * 
 */

/**
 * @author pereiraa
 *
 */
public class LCD { // Escreve no LCD usando a interface a 4 bits.
  private static final int LINES = 2, COLS = 16; // Dimens�o do display.
//Escreve um byte de comando/dados no LCD
private static void writeByte(boolean rs, int data) {}
//Escreve um comando no LCD
private static void writeCMD(int data) {}
//Escreve um dado no LCD
private static void writeDATA(int data) {}
//Envia a sequ�ncia de inicia��o para comunica��o a 4 bits.
public static void init() {}
//Escreve um car�ter na posi��o corrente.
public static void write(char c) {}
//Escreve uma string na posi��o corrente.
public static void write(String txt) {}
//Envia comando para posicionar cursor (�lin�:0..LINES-1 , �col�:0..COLS-1)
public static void cursor(int lin, int col) {
}
//Envia comando para limpar o ecr� e posicionar o cursor em (0,0)
public static void clear() {
  cursor(0, 0);
}

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

}
