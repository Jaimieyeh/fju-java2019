package HW1;

public class SelectionSort extends Object{
	int data[] = {5, 4, 1, 2};

	public static void main(String[] args) {
		SelectionSort test = new SelectionSort();
		test.showdata();
		test.select();
			}

	private void showdata() {
		System.out.print("原資料為: ");
		int i;
		for (i=0; i<4; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.print("\n");
	}

	private void select() {
		int data[] = {5, 4, 1, 2};
		int n = 4;
		int i, j;
		int min, temp;
		for (i=0; i<n; i++)
		{  min = i;
		for (j=i+1; j<n; j++)
		if (data[j]<data[min]) min = j;
		temp = data[i];
		data[i] = data[min];
		data[min] = temp;
		}
		System.out.print("排序結果: ");
		for (min=0; min<n; min++) {
			System.out.print(data[min]+" ");
		}
		System.out.println("\n");
	} 
}
	
	



