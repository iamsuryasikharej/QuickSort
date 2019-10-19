package quicksort;

public class QuckSort {
	public static void main(String[] args) {
		quickSort s=new quickSort();
		
		s.quickSortAlogo(0,s.array.length-1);
		for(int temp:s.array)
		{
			System.out.println(temp);
		}
	}
}
