import javax.swing.*;
import java.util.Scanner;
import java.math.*;

import static java.lang.Math.sqrt;

public class job1 {
    public static void main(String[] args) {
        double a,b,c,realPart,imgPart;
        double x1,x2;
        double q;
        Scanner s = new Scanner(System.in);
        a=s.nextDouble();b=s.nextDouble();c=s.nextDouble();
        q=b*b-4*a*c;

        if  (a==0&&b==0&&c==0){
            System.out.println("There are infinite solutions.");

        }
        else if (a==0&&b==0&&c!=0){
            System.out.println("The equation has no solution.");
        }



        else if (q>=0) {
            x1 = (-b + sqrt(b * b - 4 * a * c)) / (2 * a);
            x2 = (-b - sqrt(b * b - 4 * a * c)) / (2 * a);
            System.out.printf("The equation has real roots, x1 = %.6f,  x2 = %.6f", x1, x2);
        }
           else if (q<0) {


            realPart = (-b / (2 * a));
            imgPart = (Math.sqrt(-q)) / (2 * a);

            System.out.printf("The equation has complex roots, x1 = %.6f + %.6fi,  x2 = %.6f - %.6fi", realPart, imgPart, realPart, imgPart);

        }











    }


}

