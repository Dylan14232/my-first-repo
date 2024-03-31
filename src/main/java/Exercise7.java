public class Exercise7 {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i+=1) {
        System.out.println(i);

        if (i == 4) {
            System.out.println(">java Exercise7" + "i = 4");
            break;
        } else {
          System.out.println(">java Exercise7" + "i != 4");
      }
    }

  }


}