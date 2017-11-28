package minicopier;

//import java.util.Vector;

public aspect BasketAspect {

	/*@
	  @ requires path  != null;
	  @ ensures this.basketContent.getLength() > \old (this.basketContent.getLength()) ;
	  @*/
	
	public static int oldBasket;
	Basket basket;
	pointcut addpath(Basket basket, String path): execution(public void add(String))&& target(basket) && args(path);
	
	before(Basket basket, String path): addpath(basket,path){
		if(path == null)
		{
			System.err.println("path should not be null");
		}
		oldBasket = basket.getLength();
			
		}
	
	after(Basket basket, String path): addpath(basket,path){
		
		
		int newBasket = basket.getLength();
				if(newBasket<= oldBasket){
					System.err.println("File not added to basket");
					
		}
	}
	
	
	
}
