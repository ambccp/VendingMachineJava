/**
 * 
 */

/**
 * @author pereiraa
 *
 */
public class SerialEmitter { // Envia tramas para os diferentes módulos Serial Receiver.
  public static enum Destination {Dispenser,LCD};
//Inicia a classe
public static void init() {}
//Envia uma trama para o SerialReceiver identificado o destino em addr e os bits de dados em ‘data’.
public static void send(Destination addr, int data) {}
//Retorna true se o canal série estiver ocupado
public static boolean isBusy() {
  return false;}

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

}
