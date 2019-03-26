package sorting;

public class NewSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bubblesorting ob = new bubblesorting();
        int array[] = {52,45,98,36,47,332,6,26,14};
        ob.bubbleSort(array);
        System.out.println("Sorted");
        ob.printArray(array);
	}

}
