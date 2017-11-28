package minicopier;

public aspect TransferTaskAspect {
   /*@
	 @ requires this.paused != null; 
	 @*/ 
	
	pointcut setPause(TransferTask ttask): execution(public void setPause())
	&& target(ttask);
	
	before(TransferTask ttask): setPause(ttask){
		if (ttask.paused == null){
			//System.err.println("paused can't be null");
			//System.exit(1);
		}
	}
	
	/*@
	 @ requires this.cancel != null; 
	 requires this.putInQueue != null; 
	  @*/ 
		
		pointcut setCanclAndQueue(TransferTask ttask , boolean _putInQueue): execution(public void setCancelAndQueue(boolean))
		&& target(ttask)  &&args( _putInQueue);
		
		before(TransferTask ttask , boolean _putInQueue ): setCanclAndQueue(ttask , _putInQueue){
			if (ttask.cancel == null){
				//System.err.println("cancel can't be null");
				//System.exit(1);
			}
		}
}
