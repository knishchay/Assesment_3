

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sales {
	List<Stock> st;
	Scanner k;



public Sales(){
	this.st= new ArrayList<>();
	this.k=new Scanner(System.in);
	
	
}



public void add() {
	// TODO Auto-generated method stub
	int prodCode=0;;
	String prodName="";
	float prodPrice=0;
	int prodQuant;
	System.out.println("----------------Entering items in stock---------------");
	System.out.println("Enter product code! Integer 3 digit type only");
	prodCode=k.nextInt();
	System.out.println("Enter name of the product");
	prodName=k.next();
	System.out.println("Enter cost per item");
	prodPrice=k.nextFloat();
	System.out.println("Enter quantity being added to stock");
	prodQuant=k.nextInt();
	Stock d= new Stock(prodCode,prodName,prodPrice,prodQuant);
	st.add(d);
	
	
}



public void search() {
	// TODO Auto-generated method stub
	
	System.out.println("Enter product whose details you want to Search");
	String name=k.next();
	int index=0;
	
	for(Stock i:st) {
		if(name.equals(i.getProductName())) {
			System.out.println(i);
			
		
	}
	
	
}




	
	
}



public void updateproductDetails() {
	
	// TODO Auto-generated method stub
	
	System.out.println("Enter product name whose details you want to update:");
	String name=k.next();
	int index=0;
	for(Stock i:st) {
		if(name.equals(i.getProductName()))
		{
			index=st.indexOf(i);
			
			break;
		}
	}
	int code=0;
	String nam="";
	float cos=0;
	int quan=0;
	System.out.println("Enter product code! Integer 3 digit type only");
	code=k.nextInt();
	System.out.println("Enter name of the product");
	nam=k.next();
	System.out.println("Enter cost per item");
	cos=k.nextFloat();
	System.out.println("Enter quantity being added to stock");
	quan=k.nextInt();
	Stock d= new Stock(code,nam,cos,quan);
	st.set(index, d);
	
	
}



public void bng() {
	int code = 0;
	int quant = 0;
	float cost = 0;
	

	
		System.out.println("Enter code to buy");
		code = k.nextInt();
		for (Stock i : st) {
			if (code == i.getSCode()) {
				System.out.println(i);
				System.out.println("Enter quantity");
				quant = k.nextInt();
				if (quant > i.getQuant()) {
					System.out.println("This number of quantity not available. Available quantity:" + i.getQuant());

				} else {
					System.out.println("Product Code"+i.getSCode()+"Product Name:"+i.getProductName()+"Quantity:"+quant);						
					cost = quant * i.getCost()+cost;
					i.setQuant((i.getQuant()-quant));
					
				}

			}

			else {
				System.out.println("Product Not in Directory");
			}
			
		}
		
		System.out.println("The product total bill is Rs:"+cost);
	

	// TODO Auto-generated method stub
}
	
}
