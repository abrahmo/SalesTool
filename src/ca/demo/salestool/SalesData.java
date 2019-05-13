package ca.demo.salestool;

public class SalesData {
	
	int data[] = {0, 4, 42};
	
	public void display() {
		System.out.println("Data: ");
		for (int i=0; i < data.length; i++) {
			System.out.println("Next value: " + data[i]);
			// Commit#: 1 -> Commit#: 3
			// Commit#: 2
            // Commit#: 3
			// Commit#: 4 feature/display-comment
			// Commit#: 5 feature/display-comment
			// Commit#: 6 feature/display-comment
			// Commit#: 7 master
			// Commit#: 9
			// Commit#: 10
			// Commit#: 11
			// Commit#: 12b
			// Commit#: 13b
			// Commit#: 14b
			// Commit#: 15b
			
		}
	}
}