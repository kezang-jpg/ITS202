public class selectionsort
{
  public static void selection(int array[])
   {
   	  for(int i=0;i<array.length-1;i++)
   	 {
   		  int n=i;
   		  for(int j= i+1; j<array.length;j++)
   		 {

   		     if(array[j]<array[n])
   		   {
   			   n=j;
   		    }
   		  }
    	   int smallernumber=array[n];
    	   array[n]=array[i];
    	   array[i]=smallernumber;
      }
    }
   public static void main(String []args)
  {
    int number[]={5,1,8,7,9,4};;
    System.out.println("before selection");
      for(int i:number)
      {
        System.out.println(i+" ");
      } 
    selection(number);
    System.out.println("after selection");
    for(int i:number)
    {
      System.out.println(i+" ");
    }
  }
}