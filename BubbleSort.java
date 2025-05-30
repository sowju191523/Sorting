public class BubbleSort {

public static void main(String[] args) {
    int[] a={1,4,5,6,7,8,9};
    for(int i=0;i<a.length-1;i++)
    {
        Boolean flag=false;
        for(int j=0;j<a.length-i-1;j++)
        {
            if(a[j]>a[j+1])
            {
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                flag=true;
            }
            
        }
        if(flag==false)
        {
            break;
        }
    }
    for(int b:a)
    {
        System.out.print(b+" ");
    }














}



    
}
