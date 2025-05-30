public class SelectionSort {
     public static void main(String[] args) {
        int[] a={1,4,2,3,8,5};
        for(int i=0;i<a.length-1;i++)
        {
            int minIndex=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[minIndex])
                {
                    minIndex=j;
                }
            }
            int temp=a[i];
            a[i]=a[minIndex];
            a[minIndex]=temp;
        }
        for(int b:a)
        {
            System.out.print(b+" ");
        }
     }



    
}
