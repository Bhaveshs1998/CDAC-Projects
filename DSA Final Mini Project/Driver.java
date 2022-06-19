import java.util.Scanner;
class Driver{
	public static void main(String[] args) 
	{
		BinarySearchTree bt = new BinarySearchTree(); 
		int choice,x;
		
		Scanner scan = new Scanner(System.in);	
	try{
		while(true)
		{
			System.out.println();
			System.out.println("    |=======================================================================|");
			System.out.println("    |================== WELCOME TO AB&D PROPERTY DEALER'S ==================|");
			System.out.println("    |=======================================================================|");
			System.out.println("    |      What operation do you want to perform ?                          |");
			System.out.println("    |-----------------------------------------------------------------------|");
		    System.out.println("    |                                                                       |");
			System.out.println("    |           1.Display details of the customers.                         |");
			System.out.println("    |                                                                       |");
			System.out.println("    |           2.Search the details of a customer.                         |");
			System.out.println("    |                                                                       |");
			System.out.println("    |           3.Add a customer.                                           |");
			System.out.println("    |                                                                       |");
			System.out.println("    |           4.Delete a customer information.                            |");
			System.out.println("    |                                                                       |");
			System.out.println("    |           5.Exit.                                                     |");
			System.out.println("    |                                                                       |");
			System.out.println("    |=======================================================================|");
			System.out.println();
			  System.out.print("       Enter your choice :         ");
			//System.out.println("-----------------------------------------------------------");
			choice = scan.nextInt();
			System.out.println("\n     --------------------------------------------------------------------");

			if(choice==5)
				break;
			
	 	

			switch(choice)
			{
				case 1:
					bt.display();
					break;
				case 2: 
				    System.out.println("\n     --------------------------------------------------------------------");
					System.out.print("       Enter the flat number to be searched : ");
					x = scan.nextInt();
					System.out.println("\n     --------------------------------------------------------------------");
					System.out.println("        a.search by recursion");
					System.out.println("        b.search of Iteration");
					System.out.println("\n     --------------------------------------------------------------------");
					System.out.print("       Enter Your Choice                       :    ");
					String ch = scan.next();
					switch(ch)
					{
						case "a":
							if(bt.search(x)){
								System.out.println("\n         Already Booked !!!");
							    System.out.println("\n     --------------------------------------------------------------------");
							}else{
								System.out.println("\n         Not Booked !!!");
							    System.out.println("\n     --------------------------------------------------------------------");
							}
							break;
						case "b":
							if(bt.search1(x)){
								System.out.println("\n         Already Booked !!!");
							    System.out.println("\n     --------------------------------------------------------------------");
							}else{
								System.out.println("\n         Not Booked !!!");
							    System.out.println("\n     --------------------------------------------------------------------");
							}break;
					}
					break;
					
				case 3:
				    //System.out.println("    |===================================================================|");
					System.out.print("       Enter the flatNo to be inserted         :    ");
					x = scan.nextInt();
					
					System.out.println("\n    ---------------------------------------------------------------------");
					
					System.out.print("       Enter the name to be inserted           :    ");
					scan.next();
					String name = scan.nextLine(); 
					if (name.matches("[0-9]+")) {
							System.out.println("Invalid number");
							throw new UserHelp("      Please enter a valid contact number");
					}
						
					System.out.println("\n    ---------------------------------------------------------------------");
					
					System.out.print("       Enter the Address to be inserted        :    ");
					String Address = scan.nextLine(); 
					//System.out.println();
					System.out.println("\n    ---------------------------------------------------------------------");
					
							
						
									System.out.print("       Enter the Contact number to be inserted :    ");
									String Contact = scan.next();
									if (!Contact.matches("[0-9]+")) {
										System.out.println("Invalid number");
										throw new UserHelp("Please enter a valid contact number");
									}

									int count = 0;
									for(int i  =0;i<Contact.length();i++){
										char a = Contact.charAt(i);
										count++;
									}

									if (count <10 || count > 10){
										//System.out.println("Please enter a valid contact number");
										throw new UserHelp("Please enter a valid contact number");
									}
							

						
							
							System.out.println("\n    ---------------------------------------------------------------------");
					
							bt.insert1( x,name,Address,Contact);
					break;
				case 4:
					System.out.print("       Enter the flatNo to be deleted          :    ");
					x = scan.nextInt();
				    System.out.println("\n       Deleted Successfully !!");
					System.out.println("\n    ---------------------------------------------------------------------");
					bt.delete1(x);
					break;
			
			
		    }
		}
	  }		
		catch(UserHelp ud){
								System.out.println("Please enter a valid input");
								 System.out.println(ud.getMessage());
						}
		catch(Exception e){
			System.out.println("Please enter a valid input");
		}
		
	

  
	}
}