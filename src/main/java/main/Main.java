package main;

import java.util.Scanner;

import cart.Model.Basket;
import cart.Model.Product;
import cart.Model.UserInfo;
import cart.Services.ProductServices;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
				   
				      int id;
				      String itemName;
				      double itemPrice;
				      int quantity;

				      Scanner scan = new Scanner(System.in);
				      
				      
				   System.out.print ("Enter the UserName : ");
			           String userN= scan.next();

			          System.out.print ("Enter Mobile No. : ");
			            int mobN= scan.nextInt();
			            
			          UserInfo u =new UserInfo(userN, mobN);
				      
			          Basket b=new Basket();
				     // Basket b= ProductServices.createBasket();
				      ProductServices p1=new ProductServices();
				  
				      boolean shop = true;
					
				      while(shop)
						{
							System.out.println("\nMenu");
							System.out.println("1 User Details");
							System.out.println("2 Add an item to your cart");
							System.out.println("3 Reduce the quantity of an item from your cart");
							System.out.println("4 Remove an item from your cart");
							System.out.println("5 View the items in your cart");
							System.out.println("6 Empty your cart");
							System.out.println("7 Display Total Bill");
							System.out.println("8 EXIT");
						    System.out.println("Select a menu option\n");
						    
						    
						    int choice = scan.nextInt();
							if (choice <1 || choice >6)
							{
								System.out.println("Enter a value between 1 and 6:");
							}
							else
							{
								switch(choice)
								{
								case 1:
									     System.out.print ("Current User details :");  
							             System.out.println(u.toString());  
									     break;
									
								case 2:
									
									    System.out.print ("Enter the id of the item: ");
							            id = scan.nextInt();
							           
							            
							            Product  pi=b.getProductByProductNoObj(id);
							           // System.out.println(pi);
							            if(pi!=null) {
							            	 System.out.print ("Enter the quantity: ");
									            quantity = scan.nextInt();

							            	int initial=pi.getQty();
							            	int finalq=quantity;
							            	pi.setQty(initial+finalq);
							            	
							            	
							            }
							            
							            
							            else {
							            System.out.print ("Enter the name of the item: ");
							            itemName = scan.next();

							            System.out.print ("Enter the unit price: ");
							            itemPrice = scan.nextDouble();

							            System.out.print ("Enter the quantity: ");
							            quantity = scan.nextInt();

							          
							          b.addProductToBasket(p1.createProduct(id, itemName, itemPrice, quantity));
							            }
									    break;
									    
								case 3:
									
									   System.out.print ("Enter the id of the item: ");
									   int id1=scan.nextInt();
									   
									   Product pr=b.getProductByProductNoObj(id1);
							            if(pr!=null) {
							            	 System.out.print ("Enter the quantity to be reduced: ");
									            quantity = scan.nextInt();

							            	int initial1=pr.getQty();
							            	int finalq1=quantity;
							            	if(initial1>finalq1)
							            	  pr.setQty(initial1-finalq1);
							            	else
							            		b.removeFromBasket(pr);
							            	
							            	
							            }
							            else {
							            	System.out.println("Product dont exist");
							            }
							            
							            
									  
							            
										    break;
										    
											
								case 4:
									System.out.print ("Enter the id of the item: ");
									   int id2=scan.nextInt();
									   Product pr1=null;
									  // removeByProdNo(id2);
									    pr1=b.getProductByProductNoObj(id2);
							            if(pr1!=null) {
							            	b.removeFromBasket(pr1);
							           }
							            else {
							            	System.out.println("Product doesn't exists");
							            }
									   
									   break;
									
								case 5:
									   System.out.println("Displaying your items in cart");
									   b.displayProducts();
									   break;
									
								case 6:
									    p1.clearBasket(b);
								        //System.out.println("Cart Cleared");
									    System.out.println("Cart Cleared");
								        break;
								case 7:
									  int price=b.calculate();
									   System.out.println(price);
									
								case 8:
									//ex
									shop = false;
									System.out.println("Exit to menu");
									break;
				 
								}
							}
						}
				      



	}

}
