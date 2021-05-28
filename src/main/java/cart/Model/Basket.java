package cart.Model;

import java.util.ArrayList;
import java.util.List;

public class Basket {
	

	
		private List<Product> items=new ArrayList<Product>();

		public List<Product> getItems() {
			return items;
		}

		public void setItems(List<Product> items) {
			this.items = items;
		}
		
	
		
			
       public Product getProductByProductNoObj(int prodno) {
				
				Product ur=null;
				List<Product> items=this.getItems();
				for(Product i:items) {
					 if(i.getPid()==prodno) {
						 ur=i;
						 break;
					 }
					 
				}
				
				return ur;
			}
			
		public void removeByProdNo(int prodno) {
			if(items.size()==0) {System.out.println("Basket is Empty");}	
			Product i= getProductByProductNoObj(prodno);
			if(i!=null)
				{	items.remove(i);  }
			}
		
			
			public boolean addProductToBasket(Product p)
			{
			     return this.items.add(p);
		    }
			
		
		public boolean removeFromBasket(Product p) {
				
			return this.items.remove(p);
				
			
			
		}
		
		public int calculate() {
			int sum=0;
			for(Product i:items)
		       {
				sum+=i.getPrice();
		       }
			return sum;
		}
			
			public void displayProducts() {
				// TODO Auto-generated method stub
				for(Product i:items)
			       {
					System.out.println(i);
			       }
				}
			
			
			}
	    
	


