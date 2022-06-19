/*
Bhavesh And Chandan fruits shipping company
*/

class Fruits2{
	//specifications of fruits
	private String name;
	private double weight;
	private double price_per_kg;
	
	//Constructor used when all specifications are given
	Fruits2(String name, double weight, double price_per_kg){
		this.name = name;
		this.weight = weight;
		this.price_per_kg = price_per_kg;
		
		System.out.println("Name of Mango breed : "+name);
		System.out.println("Minimum quantity to be ordered "+weight+" kg");
		System.out.println("Cost of 1 kg of "+name+" Mango is: "+price_per_kg);
	}
}
//creating child class of fruits by using inheritance
class Mango extends Fruits2{
	String season;
	
	//Creating constructor of class Mango
	Mango(String name, double weight, double price_per_kg){
		super(name, weight, price_per_kg);  // calling parent class constructor
		//this.season = season;
	}
	
	void season_mango(){
		System.out.println("***Mango is seasonal fruit which is majorly available in summer season");
		System.out.println("***we have Alphanso and Ratnagiri Mango which is famous all over the world");
	}
}

/*class costing_of_mango extends Mango{
	//static double cost = 100;// this is price of 1 kg of mango
	
	void cost(){
		static double total_cost = 100.0;
		System.out.println("Cost of 1 kg of Mango is "+total_cost+" per kg");
	}	
}*/


//Creating another child class of Fruits
class Apple extends Fruits2{
	String season;
	
	//creating constructor of class Apple
	Apple(String name, double weight, double price_per_kg){
		super(name, weight, price_per_kg);
		//this.season = season;
		System.out.println("Name of Apple breed : "+name);
		System.out.println("Minimum weight to placed your order: "+weight);
		System.out.println("Cost of 1 kg of Apple is: "+price_per_kg);
	}
	
	void season_apple(){
		System.out.println("***Normally the apples are ready for harvest from September-October except in the Nilgiris where the season is from April to July.");
		System.out.println("***We have a stock of specially kashmiri apples which are harvested in winter season");
	}
}

/*class costing_of_apple extends Apple{
	void cost(){
		static double total_cost = 200.0; //this is price of 1 kg of apple
		System.out.println("Cost of 1kg of Apple is "+total_cost+" per kg");
	}
}*/ 

//Fruits company main class
class FruitsCompanyMain{
	public static void main(String args[]){
		System.out.println();
		
		System.out.println("==================== All About Mango =====================");
		Mango m1 = new Mango("alphonso", 1, 150);
		System.out.println();
		Mango m2 = new Mango("Kesar", 1, 100);
		System.out.println();
		
		System.out.println("Details about Mango Fruit -->");
		m1.season_mango();
		
		System.out.println();
		System.out.println("==================== All About Apple =====================");
		Apple A1 = new Apple("Kashmiri", 1, 250);
		System.out.println();
		Apple A2 = new Apple("Imported", 1, 200);
		
		System.out.println("Deatils about Apple Fruit -->");
		A1.season_apple();
		
	}
}