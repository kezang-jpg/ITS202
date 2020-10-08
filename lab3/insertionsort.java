public class insertionsort
{

   public  static void insertion(int array[])
  {
     int n=array.length;
     for(int j=0;j<n;j++)
     {
     	int compare=array[j];
     	int i=j-1;
     	while ((i>-1) && (array [i]>compare))
     	{
     		array [i+1]=array [i];
     		i--;
     	}
     	array[i+1]=compare;

     }
      
   }
   public static void main(String []args)
    {
        int number[]={5,1,8,7,9,4};
       System.out.println("before insertion");
        for(int i:number)
        {
            System.out.println(i+" ");
        }
        insertion(number);
        System.out.println("after insertion");
        for(int i:number){
            System.out.println(i+" ");
        }
    }
}