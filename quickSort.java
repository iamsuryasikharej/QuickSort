package quicksort;

public class quickSort {
	int array[]= {10,16,8,12,15,6,3,9,5,199}; // use your own custom array or take input from user
	public void quickSortAlogo(int low,int high)
	{
		if(low<high) {
		int x=partion(low,high); // returns the partition
		System.out.println("x=="+x); //comment this line while running
		quickSortAlogo(low, x); //recursive call

		quickSortAlogo(x+1, high); // recursive calls

		}
		
	}
	public int partion(int low,int high)
	{
		
		int pivot=array[low];
		int i=low;
		int j=high;
		while (i<j)
		{
		while(array[i]<=pivot)
		{
			i++;
		}
		while(array[j]>pivot)
		{
			j--;
		}

		if(i<j)
		{
			int temp=0;
			temp=array[i];
			array[i]=array[j];
			array[j]=temp;
		}
		}
		if(i>j)
		{
			int temp=0;
			temp=array[low];
			array[low]=array[j];
			array[j]=temp;
		}
		
		return j;
	}
}
