/* Given an integer array arr, move all 0s to the end of it while maintaining the relative order of the non-zero elements.
   You must do this in-place. */
public class Question_41 {
    static void move0sToEnd(int a[])
    {
        int n=a.length;
        for(int i=0; i<n-1; i++)
        {
            boolean flag = false;
            for(int j=0; j<n-1-i; j++)
            {
                if(a[j]==0 && a[j+1]!=0)
                {
                    a[j+1]+=a[j];
                    a[j]=a[j+1]-a[j];
                    a[j+1]-=a[j];
                    flag=true;
                }       
            }
            if(!flag)
            return;
        }
    }
    public static void main(String args[])
    {
        int a[]=Question_1.inputArray();
        System.out.print("Original Array : ");
        Question_1.printArray(a);
        System.out.print("0s at the end array : ");
        move0sToEnd(a);
        Question_1.printArray(a);
    }
}
