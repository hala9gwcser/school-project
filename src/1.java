// RandomJavaCode.java
import java.util.*;
public class RandomJavaCode {
  public static void main(String[] args) {
    int num = (int)(Math.random()*10);
    if(num % 2 == 0) {
      System.out.println("Even number: " + num);
    } else {
      System.out.println("Odd number: " + num);
    }
  }
}
