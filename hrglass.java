import java.math.*;
import java.util.*;

public class hrglass {
    public static void main(String v[])  {
        Scanner scanner = new Scanner(System.in);

        int[][] arr=new int[6][6];

        System.out.println("Enter the array: ");
        
        int i,j;

        for(i=0;i<6;i++)
        {
            for(j=0;j<6;j++)
              arr[i][j]=scanner.nextInt();
        }
        hourglassSum(arr);
    }


    // Complete the hourglassSum function below.
    static void hourglassSum(int[][] a) 
    {
        int row=a.length;
        int col=a[0].length;
        
        int max_hr_glass=-63;
        for(int i=0;i<row-2;i++)
        {
            for(int j=0;j<col-2;j++)
            {
                int sum_hr_glass=a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
                max_hr_glass=Math.max(max_hr_glass, sum_hr_glass);
            }
        }
        System.out.println( max_hr_glass);
    }
}
