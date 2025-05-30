public class MaximumOccurence1 {

    public static void main(String[] args) {
        
       int[] a={9,8,1,1,2,2,3};
       int index=0;
       int max=Integer.MIN_VALUE;
       for(int i=0;i<a.length-1;i++)
       {
        int count=0;
        for(int j=0;j<a.length;j++)
        {
            if(a[i]==a[j])
            {
                count++;
            }
        }
        if(count>max)
        {
            max=count;
            index=i;
        }
        if(count==max)
        {
          if(a[index]>a[i])
          {
            index=i;
            max=count;
          }
        }
       }

      System.out.println(a[index]);

    }

    
}
