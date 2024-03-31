public class Exercise3 {
  public static void main(String[] args) {
    int day = 4;
    System.out.println(">java Exercise3");
    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
      default:
        System.out.println("Looking forward to the Weekend!");
        break;
    }

  }
}
// For Exercise3, the system uses the switch, case, and break statements. int day is assigned to 4 thus triggers the loop to print "thursday". Each case is assigned a number, then a println for a specfic day of the week. As long as the int var does not surpass 7 or go below 1, the system will print the desired day. If the int var is not within the range of the loop i have added a default statement to print "Looking forward to the weekend" to avoid any errors in code so the print statement can exicute.