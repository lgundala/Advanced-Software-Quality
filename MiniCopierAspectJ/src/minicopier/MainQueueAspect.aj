package minicopier;

import java.util.Vector;

public aspect MainQueueAspect {
	/*@
	 @ requires file !=null;  
	 @ ensures this.mainQueue != null;
	 @ ensures this.mainQueue.size() !=0;
	 @*/
	
	long oldSize;
	pointcut addFile(MainQueue mq,FileToTransfer file):
		execution(public synchronized void addFile(FileToTransfer))
		&& target(mq) &&args(file);
	
	before(MainQueue mq,FileToTransfer file):addFile(mq,file){
		if(file == null){
			System.err.println("File can't be null");
			
		}

	}
	after(MainQueue mq, FileToTransfer file) returning: addFile(mq,file){
					if (mq.mainQueue == null){
						System.err.println("mainQueue cannot be null");
						
					}
					Vector<FileToTransfer> mainQ = mq.mainQueue;
					if(mainQ.size()==0)
					{
						System.err.println("mainQueue size cannot be 0");
						
					}
					
					
					
	}
}


