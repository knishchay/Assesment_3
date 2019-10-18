

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int option = 0;

		Sales m = new Sales();

		do {
			System.out.println("//Stock entry//");
			System.out.println("MENU");
			System.out.println("1.Entry new product details");
			System.out.println("2.Print all available products in Stock");
			System.out.println("3.Search by product name in Stock");
			System.out.println("4.Update product details in Stock");
			System.out.println("//Customer entry//");
			System.out.println("MENU");
			System.out.println("5. B n G");
			System.out.print("\nOption > ");
			option = s.nextInt();
			switch (option) {
			case 1:

				m.add();

				break;
			case 2:
				System.out.println("Available Products in Stock");
				for (Stock i:m.st) {
					System.out.println(i);
				}

				break;
			case 3:
				m.search();
				break;
			case 4:
				m.updateproductDetails();	
				break;
			case 5:
				m.bng();
				break;
			default:
				option = 6;
				break;
			}

		} while (option != 6);

	}

}



