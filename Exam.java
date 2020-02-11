
package exam;

import java.util.Scanner;
public class Exam {
 static Scanner keyboard = new Scanner(System.in);
  
  public static void main(String[] args) {
        int option = -1;
        do {//inicio del bucle 
            userMenu();
            option = keyboard.nextInt();
            switch (option) {//inicio switch
                case 1:
                    P1();
                    break;
                case 2:
                    P2();
                    break;
                case 3:
                    break;
                case 4:

                case 5:
                    p5();
                    break;
                case 0:
                    break;

                default:
                    System.out.println("Opcion no valida");
            }//fin switch
        } while (option != 0);//fin de do while
    }

    private static void userMenu() {
        System.out.println("Start:");
        System.out.println("Ask for note:");
        System.out.println("Visualize:");
        System.out.println("Max-Min:");
        System.out.println("Average:");
        System.out.println("Approved:");
         System.out.println("discontinued:");
        System.out.print("recoveries ?:");
        System.out.print("quantify ?:");
        System.out.print("pass course ?:");
        System.out.println("Opción 0- EXIT");
    }
     private static void P1() {

        
}
      private static void P2() {

        
}
       private static void P3() {

        
}
        private static void P4() {

        
}
         private static void P5() {

        
}
          private static void P6() {

        
}
           private static void P7() {

        
}
            private static void P8() {
                 System.out.println("THANKS ......     BYE");
    }

        
}
