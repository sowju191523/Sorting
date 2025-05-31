public class InsertionSort {

    public static void main(String[] args) {
        int[] a={12,13,0,1,2,3,4,5,6};
        for(int i=1;i<a.length;i++)
        {
            int key=a[i];
            int j=i-1;
            while(j>=0 && a[j]>key)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
        for(int i:a)
        {
            System.out.print(i+" ");
        }
        














    }
    
}
