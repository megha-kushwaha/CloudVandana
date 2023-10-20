import java.util.Random;
class ShuffleArray
{
	//. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it

	public static void shuffle(int a[])
	{
		Random r = new Random();
		int n = a.length;

		for(int i=n-1;i>0;i--)
		{
			int j=r.nextInt(i+1);

			int temp = a[i];
			a[i] = a[j];
			a[j]= temp;
				
		}
        }

	public static void main(String[] args) 
	{
		int[] arr ={1,2,3,4,5,6,7};

		shuffle(arr);

		 for (int num : arr)
		{
            System.out.print(num + " ");
        }

	}
}
