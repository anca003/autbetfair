package courses.javabasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Draw {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter two numbers:");
        String input1 = br.readLine();
        String input2 = br.readLine();

        if (input1.equals("") || input2.equals("")) {
            System.out.println("Please provide two numbers.");
            return;
        }
        if (!input1.matches("-?\\d+(\\.\\d+)?") || !input2.matches("-?\\d+(\\.\\d+)?")) {
            System.out.println("Input should be numeric.");
            return;
        }

        int param1 = Integer.parseInt(input1);
        int param2 = Integer.parseInt(input2);

//        System.out.println("Param 1: " + param1 + "\nParam 2: " + param2);
//        drawFullShape(param1, param2);
//        System.out.println("Draw same size shape");
//        drawFullShape(3);
//        System.out.println("Draw same size as string");
//        drawFullShape(param1);
        System.out.println("(Homework)Draw shape outline");
        drawShapeOutline(param1, param2);
        System.out.println("(Homework)Draw shape corners");
        drawShapeCorners(param1, param2);
    }

    public static void drawFullShape(int n, int m){
        for(int i=0; i<n; i++)
            drawFullLine(m);
    }

    public static void drawFullLine(int m){
        for(int j=1; j<m; j++) {
            System.out.print("*");
        }
        System.out.println("*");
    }

    public static void drawFullShape(int n){
        drawFullShape(n, n);
    }

    public static void drawFullShape(String n, String m) {
        drawFullShape(Integer.parseInt(n), Integer.parseInt(m));
    }

    public static void drawFullShape(String n){
        drawFullShape(Integer.parseInt(n));
    }

    //HOMEWORK
    public static void drawShapeOutline(int height, int width){
        for(int i=1; i<=height; i++) {
            for (int j=1; j<=width; j++) {
                if (i == 1 || i == height || j == 1 || j == width) {
                    System.out.print("*");
                }  else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //HOMEWORK
    public static void drawShapeCorners(int height, int width){
        for(int i=1; i<=height; i++) {
            for (int j=1; j<=width; j++) {
                if ((j == 1 || j == width) && (i == 1 || i == height)) {
                    System.out.print("*");
                }  else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
