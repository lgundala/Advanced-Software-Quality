package minicopier;

public aspect CopierAspect {
	
	/*@
	  @ requires uriString !=null;  
	  @*/
	
	pointcut stringURI2StringPath(Copier copier, String uriString): 
		execution(public String stringURI2StringPath(String))
		&& target(copier) &&args(uriString);
	
	before(Copier copier, String uriString):stringURI2StringPath(copier,uriString){
		if(uriString == null){
		System.err.println("Path cannot be null");
			
		}
	}
	
	/*Important!!!
	 * all the below aspects are correct according to aspectj functionalities.
	 * But, Minicopier is executed as thread loaded every second. 
	 * So, these percentage methods are called for every second and they are limiting the functionality of MiniCopier to determine %.
	 * 
	 */
	
	
	
	

	/*@
	  @ requires number>0.0 ;  
	   @ensures this.queueTotalSize > 0;
	  @ ensures this.queueTotalSize >= number ;
	  @*/
	
/*	pointcut increaseQueueTotSize(Copier copier,long number):
	execution(public void increaseQueueTotalSize(long))
		&& target(copier) &&args(number);
	
	before(Copier copier, long number):increaseQueueTotSize(copier,number){
		if(number < 0.0){
			System.err.println("Number cannot be less than 0.0");
			
		}
	}
	after(Copier copier, long number) returning: increaseQueueTotSize(copier,number){
		long queueTotsize = copier.queueTotalSize;
				if (queueTotsize < number && queueTotsize!=0){
					System.err.println("QueueTotalSize cannot be less than number");
					
		}
	}
	*/
	/*@
	  @ requires number>0.0 ;  
	  @ ensures this.queueTotalSize <= number ;
	  @*/
	/*pointcut decreaseQueueTotSize(Copier copier,long number):
	execution(public void decreaseQueueTotalSize(long))
		&& target(copier) &&args(number);
	
	before(Copier copier, long number):decreaseQueueTotSize(copier,number){
		if(number < 0.0){
			System.err.println("Number cannot be less than 0.0");
			
		}
	}
	after(Copier copier, long number) returning: decreaseQueueTotSize(copier,number){
		long queueTotsize = copier.queueTotalSize;
				if (queueTotsize > number){
					System.err.println("QueueTotalSize cannot be greater than number");
					
		}
	}*/
	
	/*@
	  @ requires number>0.0 ;  
	  @ ensures this.queueCurrentSize >= number ;
	  @*/
/*	pointcut increaseQueueCurentSize(Copier copier,long number):
		execution(public void increaseQueueCurrentSize(long))
		&& target(copier) &&args(number);
	
	before(Copier copier, long number):increaseQueueCurentSize(copier,number){
		if(number < 0.0){
			System.err.println("Number cannot be less than 0.0");
			
		}
	}
	after(Copier copier, long number) returning: increaseQueueCurentSize(copier,number){
		long queuecsize = copier.queueCurrentSize;
				if (queuecsize < number){
					System.err.println("QueueCurrentSize cannot be less than number");
					
		}
	}*/

	/*@
	  @ requires number>0.0 ;  
	  @ ensures this.queueCurrentSize <= number ;
	  @*/
/*	pointcut decreaseQueueCurentSize(Copier copier,long number):
		execution(public void decreaseQueueCurrentSize(long))
		&& target(copier) &&args(number);
	
	before(Copier copier, long number):decreaseQueueCurentSize(copier,number){
		if(number < 0.0){
			System.err.println("Number cannot be less than 0.0");
			
		}
	}
	after(Copier copier, long number) returning: decreaseQueueCurentSize(copier,number){
		long queuecsize = copier.queueCurrentSize;
				if (queuecsize > number){
					System.err.println("QueueCurrentSize cannot be greater than number");
					
		}
	}*/
	
	/*@ 
	  @ requires this.queueTotalSize > 0 ;  
	  @ ensures \result >=0;
	  @*/
	/*pointcut getTotalPercentage(Copier copier):execution(public int getTotalPercent())
	&& target(copier);
	int around(Copier copier) : getTotalPercentage(copier){
		if(copier.queueTotalSize <= 0){
					System.err.println("queue totalsize should be greater than 0");
					return -1;
		}
		int oldResult = 0;
	int Result = proceed(copier);
		//double temp= (((double)copier.queueCurrentSize)/((double)copier.queueTotalSize)*100);
		if(Result != oldResult){
					System.err.println("Result is not determined correctly");
					
		}
		Result = oldResult;
		if(Result < 0){
			System.err.println("Result cannot be less than zero");
		}
		return Result;
		
		
	}
*/

	/*@ 
	@ requires this.fileTotalSize > 0 ;  
	@ ensures \result >=0;
	@*/
	/*pointcut getCurentPercentage(Copier copier):execution(public int getCurrentPercent())
	&& target(copier);
	int around(Copier copier) : getCurentPercentage(copier){
		if(copier.fileTotalSize <= 0){
					System.err.println("file totalsize should be greater than 0");
					return -1;
		}
		int temp = 0;
	int Result = proceed(copier);
		//double temp= (((double)copier.fileCurrentSize)/((double)copier.fileTotalSize)*100);
		if(Result != temp){
					System.err.println("Result is not determined correctly");
					
		}
		Result = temp;
		if(Result < 0){
			System.err.println("Result cannot be less than zero");
		}
		return Result;
		
		
	}*/

}
