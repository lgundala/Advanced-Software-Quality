import minicopier.Basket;
import minicopier.Configuration;
import minicopier.Copier;
import minicopier.FailedQueue;
import minicopier.FileToTransfer;
import minicopier.gui.MainFrame;
import minicopier.i18n.Language;
import org.junit.Test;

public class TslTestDrive {

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
	//tests are success only if they are started from test1.
	@Test
	public void Test1(){
		Configuration conf = new Configuration();
		Language.init(Configuration.language);
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Basket basket = new Basket();
		copier.add2basket(FolderToTransferPath);
		boolean check = basket.isEmpty();
		System.out.println(check);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
		
		
	}
	@Test
	public void Test2(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		copier.setPause(true);
		copier.add2basket(FolderToTransferPath);
		System.out.println(copier.getPause());
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}
	@Test
	public void Test3(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		copier.add2basket(FolderToTransferPath);
		//copier.skip(true);
		FailedQueue fQ = new FailedQueue(copier);
		boolean empty = fQ.isEmpty();
		System.out.println(empty);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}
	@Test
	public void Test4(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		copier.setChoice(3,1);//cancel
		copier.add2basket(FolderToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}
	@Test
	public void Test5(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		copier.add2basket(FolderToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		boolean busy = copier.getBusy();
		System.out.println(busy);
		copier.treatQueue();
	}
	@Test
	public void Test6(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		copier.add2basket(FolderToTransferPath);
		copier.setPause(true);
		copier.unpause();
		System.out.println(copier.paused);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}
	@Test
	public void Test7(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		copier.add2basket(FolderToTransferPath);
		int length = copier.basketLength();
		if(length!=0){
			copier.clearBasket();
		}
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}
	//test 8 all the button click events- done manually
	@Test
	public void Test8(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		copier.add2basket(FolderToTransferPath1);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}

	@Test
	public void Test9(){
		Configuration conf = new Configuration();
		Language.init(Configuration.language);
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		copier.setChoice(0,2);//ask, overwrite
		conf.limitSpeed = true;
		conf.symbolicLinkAction = 1;//follow it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}
	
	@Test
	public void Test10(){
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Configuration conf = new Configuration();
		Language.init(Configuration.language);
		copier.setChoice(2,5);//ask, rename
		conf.limitSpeed = true;
		conf.symbolicLinkAction = 1;//follow it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}
	
	@Test
	public void Test11(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		copier.setChoice(1,4);//ask, resume
		conf.limitSpeed = true;
		conf.symbolicLinkAction = 1;//follow it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}

	@Test
	public void Test12(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		copier.setChoice(3,1);//ask, cancel
		conf.limitSpeed = true;
		conf.symbolicLinkAction = 1;//follow it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}

	
	@Test
	public void Test13(){
		Configuration conf = new Configuration();
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
	public void Test21(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		copier.setChoice(0,2);//ask, overwrite
		conf.limitSpeed = false;
		conf.symbolicLinkAction = 0;//default- ignore it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}

	
	@Test
	public void Test22(){
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Configuration conf = new Configuration();
		Language.init(Configuration.language);
		copier.setChoice(2,5);//ask, rename
		conf.limitSpeed = false;
		conf.symbolicLinkAction = 0;//default- ignore it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}
	
	@Test
	public void Test23(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		copier.setChoice(1,4);//ask, resume
		conf.limitSpeed = false;
		conf.symbolicLinkAction = 0;//default- ignore it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}

	@Test
	public void Test24(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		copier.setChoice(3,1);//ask, cancel
		conf.limitSpeed = false;
		conf.symbolicLinkAction = 0;//default- ignore it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}

	@Test
	public void Test25(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		conf.collisionAction = 1;//cancel copy
		conf.limitSpeed = true;
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
	public void Test28(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		conf.collisionAction = 1;//cancel copy
		conf.limitSpeed = false;
		conf.symbolicLinkAction = 0; //ignore it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}

	@Test
	public void Test29(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		conf.collisionAction = 2;//overwrite
		conf.limitSpeed = true;
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
	public void Test32(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		conf.collisionAction = 2;//overwrite
		conf.limitSpeed = false;
		conf.symbolicLinkAction = 0; //ignore it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}

	@Test
	public void Test33(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		conf.collisionAction = 3;//overwrite if older
		conf.limitSpeed = true;
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
	public void Test36(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		conf.collisionAction = 3;//overwrite if older
		conf.limitSpeed = false;
		conf.symbolicLinkAction = 0; //ignore it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}

	@Test
	public void Test37(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		conf.collisionAction = 4;//resume
		conf.limitSpeed = true;
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

	@Test
	public void Test40(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		conf.collisionAction = 4;//resume
		conf.limitSpeed = false;
		conf.symbolicLinkAction = 0; //ignore it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}

	@Test
	public void Test41(){
		Configuration conf = new Configuration();
		Language.init(Configuration.language);
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		copier.setChoice(0,2);//ask, overwrite
		conf.limitSpeed = true;
		conf.symbolicLinkAction = 1;//follow it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}
	
	@Test
	public void Test42(){
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Configuration conf = new Configuration();
		Language.init(Configuration.language);
		copier.setChoice(2,5);//ask, rename
		conf.limitSpeed = true;
		conf.symbolicLinkAction = 1;//follow it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}
	
	@Test
	public void Test43(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		copier.setChoice(1,4);//ask, resume
		conf.limitSpeed = true;
		conf.symbolicLinkAction = 1;//follow it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}

	@Test
	public void Test44(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		copier.setChoice(3,1);//ask, cancel
		conf.limitSpeed = true;
		conf.symbolicLinkAction = 1;//follow it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}

	
	@Test
	public void Test45(){
		Configuration conf = new Configuration();
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
	public void Test46(){
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
	public void Test47(){
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
	public void Test48(){
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
	public void Test49(){
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
	public void Test50(){
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
	public void Test51(){
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
	public void Test52(){
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
	public void Test53(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		copier.setChoice(0,2);//ask, overwrite
		conf.limitSpeed = false;
		conf.symbolicLinkAction = 0;//default- ignore it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}

	
	@Test
	public void Test54(){
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Configuration conf = new Configuration();
		Language.init(Configuration.language);
		copier.setChoice(2,5);//ask, rename
		conf.limitSpeed = false;
		conf.symbolicLinkAction = 0;//default- ignore it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}
	
	@Test
	public void Test55(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		copier.setChoice(1,4);//ask, resume
		conf.limitSpeed = false;
		conf.symbolicLinkAction = 0;//default- ignore it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}

	@Test
	public void Test56(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		copier.setChoice(3,1);//ask, cancel
		conf.limitSpeed = false;
		conf.symbolicLinkAction = 0;//default- ignore it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}

	@Test
	public void Test57(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		conf.collisionAction = 1;//cancel copy
		conf.limitSpeed = true;
		conf.symbolicLinkAction = 1;//follow it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}
	@Test
	public void Test58(){
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
	public void Test59(){
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
	public void Test60(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		conf.collisionAction = 1;//cancel copy
		conf.limitSpeed = false;
		conf.symbolicLinkAction = 0; //ignore it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}

	@Test
	public void Test61(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		conf.collisionAction = 2;//overwrite
		conf.limitSpeed = true;
		conf.symbolicLinkAction = 1;//follow it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}
	@Test
	public void Test62(){
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
	public void Test63(){
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
	public void Test64(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		conf.collisionAction = 2;//overwrite
		conf.limitSpeed = false;
		conf.symbolicLinkAction = 0; //ignore it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}

	@Test
	public void Test65(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		conf.collisionAction = 3;//overwrite if older
		conf.limitSpeed = true;
		conf.symbolicLinkAction = 1;//follow it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}
	@Test
	public void Test66(){
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
	public void Test67(){
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
	public void Test68(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		conf.collisionAction = 3;//overwrite if older
		conf.limitSpeed = false;
		conf.symbolicLinkAction = 0; //ignore it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}

	@Test
	public void Test69(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		conf.collisionAction = 4;//resume
		conf.limitSpeed = true;
		conf.symbolicLinkAction = 1;//follow it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}
	@Test
	public void Test70(){
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
	public void Test71(){
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

	@Test
	public void Test72(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		conf.collisionAction = 4;//resume
		conf.limitSpeed = false;
		conf.symbolicLinkAction = 0; //ignore it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}
	@Test
	public void Test73(){
		Configuration conf = new Configuration();
		Language.init(Configuration.language);
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		copier.setChoice(0,2);//ask, overwrite
		conf.limitSpeed = true;
		conf.symbolicLinkAction = 1;//follow it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}
	
	@Test
	public void Test74(){
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Configuration conf = new Configuration();
		Language.init(Configuration.language);
		copier.setChoice(2,5);//ask, rename
		conf.limitSpeed = true;
		conf.symbolicLinkAction = 1;//follow it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}
	
	@Test
	public void Test75(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		copier.setChoice(1,4);//ask, resume
		conf.limitSpeed = true;
		conf.symbolicLinkAction = 1;//follow it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}

	@Test
	public void Test76(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		copier.setChoice(3,1);//ask, cancel
		conf.limitSpeed = true;
		conf.symbolicLinkAction = 1;//follow it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}

	
	@Test
	public void Test77(){
		Configuration conf = new Configuration();
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
	public void Test78(){
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
	public void Test79(){
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
	public void Test80(){
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
	public void Test81(){
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
	public void Test82(){
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
	public void Test83(){
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
	public void Test84(){
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
	public void Test85(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		copier.setChoice(0,2);//ask, overwrite
		conf.limitSpeed = false;
		conf.symbolicLinkAction = 0;//default- ignore it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}

	
	@Test
	public void Test86(){
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Configuration conf = new Configuration();
		Language.init(Configuration.language);
		copier.setChoice(2,5);//ask, rename
		conf.limitSpeed = false;
		conf.symbolicLinkAction = 0;//default- ignore it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}
	
	@Test
	public void Test87(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		copier.setChoice(1,4);//ask, resume
		conf.limitSpeed = false;
		conf.symbolicLinkAction = 0;//default- ignore it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}

	@Test
	public void Test88(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		copier.setChoice(3,1);//ask, cancel
		conf.limitSpeed = false;
		conf.symbolicLinkAction = 0;//default- ignore it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}

	@Test
	public void Test89(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		conf.collisionAction = 1;//cancel copy
		conf.limitSpeed = true;
		conf.symbolicLinkAction = 1;//follow it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}
	@Test
	public void Test90(){
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
	public void Test91(){
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
	public void Test92(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		conf.collisionAction = 1;//cancel copy
		conf.limitSpeed = false;
		conf.symbolicLinkAction = 0; //ignore it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}

	@Test
	public void Test93(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		conf.collisionAction = 2;//overwrite
		conf.limitSpeed = true;
		conf.symbolicLinkAction = 1;//follow it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}
	@Test
	public void Test94(){
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
	public void Test95(){
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
	public void Test96(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		conf.collisionAction = 2;//overwrite
		conf.limitSpeed = false;
		conf.symbolicLinkAction = 0; //ignore it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}

	@Test
	public void Test97(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		conf.collisionAction = 3;//overwrite if older
		conf.limitSpeed = true;
		conf.symbolicLinkAction = 1;//follow it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}
	@Test
	public void Test98(){
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
	public void Test99(){
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
	public void Test100(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		conf.collisionAction = 3;//overwrite if older
		conf.limitSpeed = false;
		conf.symbolicLinkAction = 0; //ignore it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}

	@Test
	public void Test101(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		conf.collisionAction = 4;//resume
		conf.limitSpeed = true;
		conf.symbolicLinkAction = 1;//follow it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}
	@Test
	public void Test102(){
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
	public void Test103(){
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

	@Test
	public void Test104(){
		Configuration conf = new Configuration();
		Copier copier = new Copier();
		MainFrame frame = new MainFrame(copier);
		Language.init(Configuration.language);
		conf.collisionAction = 4;//resume
		conf.limitSpeed = false;
		conf.symbolicLinkAction = 0; //ignore it
		copier.add2basket(fileToTransferPath);
		copier.paste2URIString(FloderDestinationPath);
		copier.treatQueue();
	}

}
