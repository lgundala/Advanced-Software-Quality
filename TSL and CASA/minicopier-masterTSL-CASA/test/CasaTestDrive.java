import minicopier.Basket;
import minicopier.Configuration;
import minicopier.Copier;
import minicopier.FailedQueue;
import minicopier.FileToTransfer;
import minicopier.gui.MainFrame;
import minicopier.i18n.Language;
import org.junit.Test;
public class CasaTestDrive {

	/*actionToDO = CollisionAction
	 * choice = choice for collision action
	 */
	String fileToTransferPath = "/Users/Amulya/Documents/Log.txt";
	String fileToTransferPath1 = "/Users/Amulya/Documents/paper.pages";
	String fileToTransferPath2 = "/Users/Amulya/Documents/paper.pages";
	String FolderToTransferPath = "/Users/Amulya/Documents/sample/";
	String FolderToTransferPath1 = "/Users/Amulya/Documents/workspace/";//check for folder with max size
	String FloderDestinationPath = "/Users/Amulya/Downloads/";
	String newName = "/Users/Amulya/Documents/newName.txt";
	String directPath = "/Users/Amulya/";
	//FileToTransfer transfer;
	//test cases are success only if they are started from test 1
	
	@Test
	public void Test13(){
		Configuration conf = new Configuration();
		Language.init(Configuration.language);
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		copier.setChoice(0,2);//ask, overwrite
		conf.limitSpeed = true;
		conf.symbolicLinkAction = 0;//default- ignore it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}

	
	@Test
	public void Test14(){
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Configuration conf = new Configuration();
		Language.init(Configuration.language);
		copier.setChoice(2,5);//ask, rename
		conf.limitSpeed = true;
		conf.symbolicLinkAction = 0;//default- ignore it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}
	
	@Test
	public void Test15(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		copier.setChoice(1,4);//ask, resume
		conf.limitSpeed = true;
		conf.symbolicLinkAction = 0;//default- ignore it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}

	@Test
	public void Test16(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		copier.setChoice(3,1);//ask, cancel
		conf.limitSpeed = true;
		conf.symbolicLinkAction = 0;//default- ignore it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}
	@Test
	public void Test17(){
		Configuration conf = new Configuration();
		Language.init(Configuration.language);
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		copier.setChoice(0,2);//ask, overwrite
		conf.limitSpeed = false;
		conf.symbolicLinkAction = 1;//follow it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}
	
	@Test
	public void Test18(){
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Configuration conf = new Configuration();
		Language.init(Configuration.language);
		copier.setChoice(2,5);//ask, rename
		conf.limitSpeed = false;
		conf.symbolicLinkAction = 1;//follow it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}
	
	@Test
	public void Test19(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		copier.setChoice(1,4);//ask, resume
		conf.limitSpeed = false;
		conf.symbolicLinkAction = 1;//follow it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}

	@Test
	public void Test20(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		copier.setChoice(3,1);//ask, cancel
		conf.limitSpeed = false;
		conf.symbolicLinkAction = 1;//follow it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}
	@Test
	public void Test26(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		conf.collisionAction = 1;//cancel copy
		conf.limitSpeed = true;
		conf.symbolicLinkAction = 0; //ignore it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}

	@Test
	public void Test27(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		conf.collisionAction = 1;//cancel copy
		conf.limitSpeed = false;
		conf.symbolicLinkAction = 1;//follow it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}
	@Test
	public void Test30(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		conf.collisionAction = 2;//overwrite
		conf.limitSpeed = true;
		conf.symbolicLinkAction = 0; //ignore it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}

	@Test
	public void Test31(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		conf.collisionAction = 2;//overwrite
		conf.limitSpeed = false;
		conf.symbolicLinkAction = 1;//follow it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}
	@Test
	public void Test34(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		conf.collisionAction = 3;//overwrite if older
		conf.limitSpeed = true;
		conf.symbolicLinkAction = 0; //ignore it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}

	@Test
	public void Test35(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		conf.collisionAction = 3;//overwrite if older
		conf.limitSpeed = false;
		conf.symbolicLinkAction = 1;//follow it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}
	@Test
	public void Test38(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		conf.collisionAction = 4;//resume
		conf.limitSpeed = true;
		conf.symbolicLinkAction = 0; //ignore it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}

	@Test
	public void Test39(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		conf.collisionAction = 4;//resume
		conf.limitSpeed = false;
		conf.symbolicLinkAction = 1;//follow it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}

}