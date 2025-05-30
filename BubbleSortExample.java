import java.util.Scanner;

public class BubbleSortExample {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
                   int count=0;

        for(int i=0;i<a.length;i++)
        {
          //  Boolean flag=false;
           for(int j=0;j<a.length-1;j++)
           {
            if(a[j]>a[j+1])
            {
                count++;
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
               // flag=true;
            }
           }
        //    if(flag==false)
        //    {
        //     break;
        //    }
        }
        System.out.println(count);
        System.out.println(a[0]);
        System.out.println(a[n-1]);
    }
}
