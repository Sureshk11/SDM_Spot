class BubbleSortDemo {


static void bsort(int arr[])
{   
    int n=arr.length;
    for(int i=0;i<n-1;i++)
    { 
        for(int j=0;j<n-1-i;j++)
        {
             if(arr[j]>arr[j+1])
             { 
                int temp;
              temp=arr[j];
              arr[j]=arr[j+1];
              arr[j+1]=temp;
               
             }
             display(arr);
            System.out.println();



        }

        

    }

}


static void display(int arr[])
{
    int n=arr.length;
    for(int i=0;i<n-1;i++)
    {
      System.out.println(arr[i]+" ");  
    }
}

public static void main (String args[])
{
  int arr[]={54,12,89,55,47};
  bsort(arr);

}

}