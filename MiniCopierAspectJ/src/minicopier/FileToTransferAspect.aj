package minicopier;

import java.io.File;

public aspect FileToTransferAspect {
	/*@
	  @ requires newName !=null; 
	  @ ensures this.destinationFilePath = this.destinationPath + File.separator +
			newName
	  @*/
	pointcut changeTgtName(FileToTransfer ftt, String newNames): execution(public void changeTargetName(String))
	&& target(ftt) && args(newNames);
	
	before(FileToTransfer ftt, String newNames): changeTgtName(ftt, newNames){
		if (newNames == null){
			//System.err.println("newNames should not be null.");
			//System.exit(1);
		}
	}
	
	after(FileToTransfer ftt, String newNames) returning: changeTgtName(ftt, newNames){
		if (ftt.destinationFilePath != ftt.destinationPath + File.separator +
				newNames){
			//System.err.println("destinationFilePath is not correct");
			//System.exit(2);
		}
	}
	/*@
	 @ requires _path2source !=null;  
	 @ requires _path2destinationfolder !=null;  
	 @ ensures this.sourcePath !=null;
	 @ ensures this.name !=null;
	 @ ensures this.destinationFilePath !=null;
	 @ ensures this.destinationFilePath !=null;
	 @
	 @*/
	pointcut fileToTransfer(FileToTransfer ftt, String _path2Source, 
			String _path2destinationfolder): initialization(FileToTransfer.new(String,String))
			&& target(ftt)
			&& args(_path2Source, _path2destinationfolder);
	before(FileToTransfer ftt, String _path2Source, 
			String _path2destinationfolder): fileToTransfer(ftt, _path2Source, _path2destinationfolder)
			{
			if(_path2Source == null)
			{
				System.err.println("path to source cannot be null");
			}
			if(_path2destinationfolder == null)
			{
				System.err.println("path to destination cannot be null");
			}
			}
	after(FileToTransfer ftt, String _path2Source, 
			String _path2destinationfolder): fileToTransfer(ftt, _path2Source, _path2destinationfolder)
			{
		if(ftt.sourcePath == null)
		{
			System.err.println("source path cannot be null");
		}
		if(ftt.destinationPath == null)
		{
			System.err.println("destination path cannot be null");
		}
		if(ftt.size == 0)
		{
			System.err.println("size cannot be 0");
		}
		if(ftt.name == null)
		{
		System.err.println("name cannot be null");
		}
			}
}
