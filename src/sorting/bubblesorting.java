package sorting;

public class bubblesorting {

		 void bubbleSort(int arr[])
		    {
		        int n = arr.length;
		        for (int i = 0; i < n-1; i++)
		            for (int j = 0; j < n-i-1; j++)
		                if (arr[j] > arr[j+1])
		                {
		                    int temp = arr[j];
		                    arr[j] = arr[j+1];
		                    arr[j+1] = temp;
		                }
		    }
		 
		 void printArray(int arr[])
		    {
		        int n = arr.length;
		        for (int i=0; i<n; ++i)
		            System.out.print(arr[i] + " ");
		        System.out.println();
		    }

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 bubblesorting ob = new bubblesorting();
		        int arr[] = {64, 466, 25, 18, 22, 11, 90};
		        ob.bubbleSort(arr);
		        System.out.println("Sorted array");
		        ob.printArray(arr);



	}

}
