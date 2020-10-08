public class bubblesort
{
	public static void bubblesort(int array[])
	{
		int n=array.length;
		int concurrent=0;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<(n-1);j++)
			{
				if(array[j-1]>array[j])
				{
					concurrent=array[j-1];
					array[j-1]=array[j];
					array[j]=concurrent;
				}
			}
		}

	}
	 public static void main(String []args)
  {
    int number[]={5,1,8,7,9,4};
    System.out.println("before bubblesort");
      for(int i:number)
      {
        System.out.println(i+" ");
      } 
    bubblesort(number);
    System.out.println("after bubblesort");
    for(int i:number)
    {
      System.out.println(i+" ");
    }
  }
}