package minicopier;

public aspect ConfigurationAspect {
	 /*@
    @ requires i != 0;
    @ ensures  Configuration.nbBytesPerS = i;
    */
	static int oldSpeedValue;
	Configuration confi;
	pointcut setSpeedValue( int i):
	execution(public synchronized static void Configuration.setSpeedValue(int))
	&& args(i);
	
	before(int i):setSpeedValue(i){
		if(i == 0){
			System.err.println("i cannot be equal to zero");
			
		}
		oldSpeedValue = confi.nbBytesPerS;
	}

	after(int i):setSpeedValue(i){
		
	//	static int newSpeedValue = config.nbBytesPerS;
		if(confi.nbBytesPerS != i)
		{
			System.err.println("nbBytesPerS is not set as required");
			
		}
	}
}

	
