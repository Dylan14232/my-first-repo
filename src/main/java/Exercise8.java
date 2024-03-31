public class Exercise8 {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i+=1) {
      if (i == 4) {
        continue;
      }
      System.out.println(">java Exercise8" + i);
      if (i == 10) {
        break;
      }
    }   
  }
}