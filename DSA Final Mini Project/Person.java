	import java.util.Scanner;
	public class Person{
		Person lchild;
		int flatNo;
		Person rchild;
		String name;
		String Address;
		String Contact;
		String payment;
	static Scanner scan =new Scanner(System.in);	
	public  Person(int i,String name,String Address,String Contact){
		
		flatNo = i;
		lchild =null;
		rchild = null;
		this.name = name;
		this.Address = Address;
		this.Contact=Contact;
		System.out.print("       Payment recieved from customer in lakhs :    ");
		payment = scan.nextLine();
		System.out.println("\n     --------------------------------------------------------------------");
		//System.out.println("Flat no is : "+flatNo);
		
	}
	
	public String toString(){
		 
		return "-----------------------------------------------------------------------"
		      +"\n             DETAILS              |          INFORMATION            "
		      +"\n----------------------------------------------------------------------"
		      +"\n        Flat no is                :        "+flatNo  
              +"\n"			  
		      +"\n        Name of the owner         :        "+name  
              +"\n"				  
		      +"\n        Address of flat is        :        "+Address  
              +"\n"				  
		      +"\n        Owner contact number      :        "+Contact
			  +"\n"	
		      +"\n        Total payment received    :        "+payment+"Lakhs in Rs    "
			  +"\n---------------------------------------------------------------------";
		
	}
}