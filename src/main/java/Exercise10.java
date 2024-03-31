public class Exercise10 {
 public static void main(String[] args) {
   for (int i = 1; i <= 3; i++) {
       System.out.println(">java Exercise10" + "  " + "Statement" + i + " of the for loop");

       int count = 1;
       while (count <= 5) {
           System.out.println(">java Exercise10" + "  " + "internal while loop: " + count);
           count++;
       }
   }


   }

 }