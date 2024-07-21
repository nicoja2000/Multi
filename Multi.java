import java.util.*;
/**
 * Write a description of class Multi here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Multi
{
    static Random ran = new Random();
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       
       System.out.println("How many rows do you want in your 2 dimensional array");
       int a=input.nextInt();
       int[][] array= new int[a][];
       for(int i=0; i<a; i++)
       {
           int r = ran.nextInt(10)+1;
           array[i]=new int[r];
       }
       rando(array);
       
    }
    public static void rando(int[][] a)
    {
        for(int row=0; row<a.length; row++)
        {
            for(int col=0; col<a[row].length; col++)
            {
                a[row][col]=ran.nextInt(11);
            }
        }
        printMulti(a);
    }
    public static void printMulti(int[][] a)
    {
        for(int row=0; row<a.length; row++)
        {
            System.out.println(Arrays.toString(a[row]));
        }
    }
}
