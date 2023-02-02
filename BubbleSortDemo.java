class BubbleSortDemo {


static void Isort(int arr[])
{   
    int n=arr.length;
    for(int i=0;i<n-1;++i)
    { 
        int key=arr[i];
        int j=i-1;

        while(j>0&& arr[j]>key)
        {
            arr[j+1]=arr[j];
            j=j-1
        }

            arr[j+1]=key;
             display(arr);
            System.out.println();



       

        

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
  isort(arr);

}

}