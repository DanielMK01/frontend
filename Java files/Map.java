import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class Map {

   public static void main(String[] args) throws IOException {
   
      Scanner console = new Scanner(System.in);
      Random rand = new Random();
      
      // 50 x 50 coordinate grid overlay for visual map
      int[][] grid = new int[1050][750];
      
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
            x = rand.nextInt(1000);
            y = rand.nextInt(700);
         }
         pointList[i] = new Point(x, y);
         grid[x][y]++;
      }
      
      // print out points
      Frame fm = new Frame();
      for(int i = 0; i < count; i++) {
         pointList[i].getCoordinate();
         fm.drawPoint(pointList[i].getX(), pointList[i].getY());
      }
   }

}