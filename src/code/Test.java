package code;

public class Test {

	public static void main(String[] args) {

		int a[] = {1, 3, 2, 4, 2, 1};
		int n = a.length;
		countFreq(a, n);

	}

	static void countFreq(int a[], int n)
	{
		int hm[] = new int[n];
		for (int i = 0; i < n; i++)
			hm[a[i]]++;
		int cumul = 0;

		// traverse in the array
		for(int i = 0; i < n; i++)
		{
			cumul += hm[a[i]];

			if(hm[a[i]] != 0)
			{
				System.out.println(a[i] + "->" + cumul);
			}
			hm[a[i]] = 0;
		}

	}
}
