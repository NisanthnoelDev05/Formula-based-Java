import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        double h=sc.nextDouble();
        double surfaceArea=2*Math.PI*r*(h+r);
        double volume=Math.PI*r*r*h;
        System.out.println("Surface Area = " + surfaceArea);
        System.out.println("Volume = " + volume);
    }
}