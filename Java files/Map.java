import java.util.Scanner;
import java.util.Random;

public class Map {

   public static void main(String[] args) {
   
      Scanner console = new Scanner(System.in);
      Random rand = new Random();
      
      // 50 x 50 coordinate grid overlay for visual map
      int[][] grid = new int[50][50];
      
      System.out.print("Welcome to Map. How many points would you like to create? ");
      int count = console.nextInt();
      System.out.print("Would you like to place manually or randomize? (1 - place; 2 - random) ");
      int choice = console.nextInt();
      
      Point[] pointList = new Point[count];
      
      for(int i = 0; i < count; i++) {
         int x;
         int y;
         if(choice == 1) {
            System.out.print("X-coordinate (0 - 50): ");
            x = console.nextInt();
            System.out.print("Y-coordinate (0 - 50): ");
            y = console.nextInt();
            System.out.println();
         }
         else
         {
            x = rand.nextInt(51);
            y = rand.nextInt(51);
         }
         pointList[i] = new Point(x, y);
      }
      
      // print out points
      for(int i = 0; i < count; i++) {
         pointList[i].getCoordinate();
      }
      
   }

}