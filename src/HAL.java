import isel.leic.UsbPort;


/**
 * @author pereiraa
 *
 */
public class HAL {

  /**
   * @param args
   */
  public static void init() {
    
  }
  
  
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub
//    UsbPort.out(1);
//    System.out.println(UsbPort.in());
    int mask = 245&16>>2;
    Integer.toBinaryString(mask);
    System.out.println(Integer.toBinaryString(mask));
    
  }

}
