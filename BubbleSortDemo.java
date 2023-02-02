class SelectionSortDemo {


static void ssort(int arr[])
{   
    int n=arr.length;
    for(int i=0;i<n-1;i++)
    { 
        int min=i;
        for(int j=i+1;j<n;j++)
        {
             if(arr[j]<arr[min])
             min=j;
               
             }
   int temp=arr[min];
   arr[min]=arr[i];
   arr[i]=temp;

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
  ssort(arr);

}

}