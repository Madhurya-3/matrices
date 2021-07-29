import java.util.*;
class matrices
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a[][]; int b[][]; 
        int r1,r2,c1,c2,i,j,k,sum,mul;
        System.out.println("Enter num of rows in first matrix");
        r1=sc.nextInt();
        System.out.println("Enter num of columns in first matrix");
        c1=sc.nextInt();
        a=new int[r1][c1];
        System.out.println("Enter num of rows in second matrix");
        r2=sc.nextInt();
        System.out.println("Enter num of columns in second matrix");
        c2=sc.nextInt();
        b=new int[r2][c2];
        System.out.println("Enter the first matrix");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            a[i][j]=sc.nextInt();
        }
        System.out.println("Enter the second matrix");
        for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            b[i][j]=sc.nextInt();
        }
        //matrix addition
        if(r1==r2&&c1==c2)
        {
            System.out.println("The sum of matrices is ");
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c1;j++)
                {
                    sum=a[i][j]+b[i][j];
                    System.out.print(sum+"  ");
                }
            }
        }
        else
            System.out.println("Matrix addition is not possible");
        System.out.println();
        //matrix multiplication
        if(c1==r2)
        {
            System.out.println("The product of matrices is ");
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c2;j++)
                {
                    mul=1;
                    for(k=0;k<r2;k++)
                    mul+= a[i][k]*b[k][j];
                    System.out.print(mul+"  ");
                }
            }
        }
        else
            System.out.println("Matrix multiplication is not possible");
    }
}
