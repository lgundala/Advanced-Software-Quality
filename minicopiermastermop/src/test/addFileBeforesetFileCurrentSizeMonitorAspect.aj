package test;
import java.util.Arrays;

import javamoprt.MOPMonitor;
import minicopier.MainQueue;

class addFileBeforesetFileCurrentSizeMonitor_Set extends javamoprt.MOPSet {
	protected addFileBeforesetFileCurrentSizeMonitor[] elementData;

	public addFileBeforesetFileCurrentSizeMonitor_Set(){
		this.size = 0;
		this.elementData = new addFileBeforesetFileCurrentSizeMonitor[4];
	}

	public final int size(){
		while(size > 0 && elementData[size-1].MOP_terminated) {
			elementData[--size] = null;
		}
		return size;
	}

	public final boolean add(MOPMonitor e){
		ensureCapacity();
		elementData[size++] = (addFileBeforesetFileCurrentSizeMonitor)e;
		return true;
	}

	public final void endObject(int idnum){
		int numAlive = 0;
		for(int i = 0; i < size; i++){
			addFileBeforesetFileCurrentSizeMonitor monitor = elementData[i];
			if(!monitor.MOP_terminated){
				monitor.endObject(idnum);
			}
			if(!monitor.MOP_terminated){
				elementData[numAlive++] = monitor;
			}
		}
		for(int i = numAlive; i < size; i++){
			elementData[i] = null;
		}
		size = numAlive;
	}

	public final boolean alive(){
		for(int i = 0; i < size; i++){
			MOPMonitor monitor = elementData[i];
			if(!monitor.MOP_terminated){
				return true;
			}
		}
		return false;
	}

	public final void endObjectAndClean(int idnum){
		int size = this.size;
		this.size = 0;
		for(int i = size - 1; i >= 0; i--){
			MOPMonitor monitor = elementData[i];
			if(monitor != null && !monitor.MOP_terminated){
				monitor.endObject(idnum);
			}
			elementData[i] = null;
		}
		elementData = null;
	}

	public final void ensureCapacity() {
		int oldCapacity = elementData.length;
		if (size + 1 > oldCapacity) {
			cleanup();
		}
		if (size + 1 > oldCapacity) {
			addFileBeforesetFileCurrentSizeMonitor[] oldData = elementData;
			int newCapacity = (oldCapacity * 3) / 2 + 1;
			if (newCapacity < size + 1){
				newCapacity = size + 1;
			}
			elementData = Arrays.copyOf(oldData, newCapacity);
		}
	}

	public final void cleanup() {
		int numAlive = 0 ;
		for(int i = 0; i < size; i++){
			addFileBeforesetFileCurrentSizeMonitor monitor = (addFileBeforesetFileCurrentSizeMonitor)elementData[i];
			if(!monitor.MOP_terminated){
				elementData[numAlive] = monitor;
				numAlive++;
			}
		}
		for(int i = numAlive; i < size; i++){
			elementData[i] = null;
		}
		size = numAlive;
	}

	public final void event_addFile(MainQueue j) {
		int numAlive = 0 ;
		for(int i = 0; i < this.size; i++){
			addFileBeforesetFileCurrentSizeMonitor monitor = (addFileBeforesetFileCurrentSizeMonitor)this.elementData[i];
			if(!monitor.MOP_terminated){
				elementData[numAlive] = monitor;
				numAlive++;

				monitor.Prop_1_event_addFile(j);
				if(monitor.Prop_1_Category_fail) {
					monitor.Prop_1_handler_fail(j);
				}
				if(monitor.Prop_1_Category_match) {
					monitor.Prop_1_handler_match(j);
				}
			}
		}
		for(int i = numAlive; i < this.size; i++){
			this.elementData[i] = null;
		}
		size = numAlive;
	}

	public final void event_setFileCurrentSize(MainQueue j) {
		int numAlive = 0 ;
		for(int i = 0; i < this.size; i++){
			addFileBeforesetFileCurrentSizeMonitor monitor = (addFileBeforesetFileCurrentSizeMonitor)this.elementData[i];
			if(!monitor.MOP_terminated){
				elementData[numAlive] = monitor;
				numAlive++;

				monitor.Prop_1_event_setFileCurrentSize(j);
				if(monitor.Prop_1_Category_fail) {
					monitor.Prop_1_handler_fail(j);
				}
				if(monitor.Prop_1_Category_match) {
					monitor.Prop_1_handler_match(j);
				}
			}
		}
		for(int i = numAlive; i < this.size; i++){
			this.elementData[i] = null;
		}
		size = numAlive;
	}
}

class addFileBeforesetFileCurrentSizeMonitor extends javamoprt.MOPMonitor implements Cloneable, javamoprt.MOPObject {
	public Object clone() {
		try {
			addFileBeforesetFileCurrentSizeMonitor ret = (addFileBeforesetFileCurrentSizeMonitor) super.clone();
			return ret;
		}
		catch (CloneNotSupportedException e) {
			throw new InternalError(e.toString());
		}
	}

	int Prop_1_state;
	static final int Prop_1_transition_addFile[] = {1, 1, 2};;
	static final int Prop_1_transition_setFileCurrentSize[] = {0, 1, 2};;

	boolean Prop_1_Category_fail = false;
	boolean Prop_1_Category_match = false;

	public addFileBeforesetFileCurrentSizeMonitor () {
		Prop_1_state = 0;

	}

	public final void Prop_1_event_addFile(MainQueue j) {
		MOP_lastevent = 0;

		Prop_1_state = Prop_1_transition_addFile[Prop_1_state];
		Prop_1_Category_fail = Prop_1_state == 2;
		Prop_1_Category_match = Prop_1_state == 1;
	}

	public final void Prop_1_event_setFileCurrentSize(MainQueue j) {
		MOP_lastevent = 1;

		Prop_1_state = Prop_1_transition_setFileCurrentSize[Prop_1_state];
		Prop_1_Category_fail = Prop_1_state == 2;
		Prop_1_Category_match = Prop_1_state == 1;
	}

	public final void Prop_1_handler_fail (MainQueue j){
		{
			System.err.println("! addFile() not called before setFileCurrentSize()");
			this.reset();
		}

	}

	public final void Prop_1_handler_match (MainQueue j){
		{
			System.out.println("pattern matched");
		}

	}

	public final void reset() {
		MOP_lastevent = -1;
		Prop_1_state = 0;
		Prop_1_Category_fail = false;
		Prop_1_Category_match = false;
	}

	public javamoprt.ref.MOPWeakReference MOPRef_j;

	//alive_parameters_0 = [MainQueue j]
	public boolean alive_parameters_0 = true;

	public final void endObject(int idnum){
		switch(idnum){
			case 0:
			alive_parameters_0 = false;
			break;
		}
		switch(MOP_lastevent) {
			case -1:
			return;
			case 0:
			//addFile
			//alive_j
			if(!(alive_parameters_0)){
				MOP_terminated = true;
				return;
			}
			break;

			case 1:
			//setFileCurrentSize
			//alive_j
			if(!(alive_parameters_0)){
				MOP_terminated = true;
				return;
			}
			break;

		}
		return;
	}

}

public aspect addFileBeforesetFileCurrentSizeMonitorAspect implements javamoprt.MOPObject {
	javamoprt.map.MOPMapManager addFileBeforesetFileCurrentSizeMapManager;
	public addFileBeforesetFileCurrentSizeMonitorAspect(){
		addFileBeforesetFileCurrentSizeMapManager = new javamoprt.map.MOPMapManager();
		addFileBeforesetFileCurrentSizeMapManager.start();
	}

	// Declarations for the Lock
	static Object addFileBeforesetFileCurrentSize_MOPLock = new Object();

	static boolean addFileBeforesetFileCurrentSize_activated = false;

	// Declarations for Indexing Trees
	static javamoprt.map.MOPBasicRefMapOfMonitor addFileBeforesetFileCurrentSize_j_Map = new javamoprt.map.MOPBasicRefMapOfMonitor(0);
	static javamoprt.ref.MOPWeakReference addFileBeforesetFileCurrentSize_j_Map_cachekey_0 = javamoprt.map.MOPBasicRefMapOfMonitor.NULRef;
	static addFileBeforesetFileCurrentSizeMonitor addFileBeforesetFileCurrentSize_j_Map_cachenode = null;

	// Trees for References
	static javamoprt.map.MOPRefMap addFileBeforesetFileCurrentSize_MainQueue_RefMap = addFileBeforesetFileCurrentSize_j_Map;

	pointcut MOP_CommonPointCut() : !within(javamoprt.MOPObject+) && !adviceexecution();
	pointcut addFileBeforesetFileCurrentSize_addFile(MainQueue j) : (call(* addFile(..)) && target(j)) && MOP_CommonPointCut();
	before (MainQueue j) : addFileBeforesetFileCurrentSize_addFile(j) {
		addFileBeforesetFileCurrentSize_activated = true;
		synchronized(addFileBeforesetFileCurrentSize_MOPLock) {
			addFileBeforesetFileCurrentSizeMonitor mainMonitor = null;
			javamoprt.map.MOPMap mainMap = null;
			javamoprt.ref.MOPWeakReference TempRef_j;

			// Cache Retrieval
			if (j == addFileBeforesetFileCurrentSize_j_Map_cachekey_0.get()) {
				TempRef_j = addFileBeforesetFileCurrentSize_j_Map_cachekey_0;

				mainMonitor = addFileBeforesetFileCurrentSize_j_Map_cachenode;
			} else {
				TempRef_j = addFileBeforesetFileCurrentSize_j_Map.getRef(j);
			}

			if (mainMonitor == null) {
				mainMap = addFileBeforesetFileCurrentSize_j_Map;
				mainMonitor = (addFileBeforesetFileCurrentSizeMonitor)mainMap.getNode(TempRef_j);

				if (mainMonitor == null) {
					mainMonitor = new addFileBeforesetFileCurrentSizeMonitor();

					mainMonitor.MOPRef_j = TempRef_j;

					addFileBeforesetFileCurrentSize_j_Map.putNode(TempRef_j, mainMonitor);
				}

				addFileBeforesetFileCurrentSize_j_Map_cachekey_0 = TempRef_j;
				addFileBeforesetFileCurrentSize_j_Map_cachenode = mainMonitor;
			}

			mainMonitor.Prop_1_event_addFile(j);
			if(mainMonitor.Prop_1_Category_fail) {
				mainMonitor.Prop_1_handler_fail(j);
			}
			if(mainMonitor.Prop_1_Category_match) {
				mainMonitor.Prop_1_handler_match(j);
			}
		}
	}

	pointcut addFileBeforesetFileCurrentSize_setFileCurrentSize(MainQueue j) : (call(* setFileCurrentSize()) && target(j)) && MOP_CommonPointCut();
	before (MainQueue j) : addFileBeforesetFileCurrentSize_setFileCurrentSize(j) {
		addFileBeforesetFileCurrentSize_activated = true;
		synchronized(addFileBeforesetFileCurrentSize_MOPLock) {
			addFileBeforesetFileCurrentSizeMonitor mainMonitor = null;
			javamoprt.map.MOPMap mainMap = null;
			javamoprt.ref.MOPWeakReference TempRef_j;

			// Cache Retrieval
			if (j == addFileBeforesetFileCurrentSize_j_Map_cachekey_0.get()) {
				TempRef_j = addFileBeforesetFileCurrentSize_j_Map_cachekey_0;

				mainMonitor = addFileBeforesetFileCurrentSize_j_Map_cachenode;
			} else {
				TempRef_j = addFileBeforesetFileCurrentSize_j_Map.getRef(j);
			}

			if (mainMonitor == null) {
				mainMap = addFileBeforesetFileCurrentSize_j_Map;
				mainMonitor = (addFileBeforesetFileCurrentSizeMonitor)mainMap.getNode(TempRef_j);

				if (mainMonitor == null) {
					mainMonitor = new addFileBeforesetFileCurrentSizeMonitor();

					mainMonitor.MOPRef_j = TempRef_j;

					addFileBeforesetFileCurrentSize_j_Map.putNode(TempRef_j, mainMonitor);
				}

				addFileBeforesetFileCurrentSize_j_Map_cachekey_0 = TempRef_j;
				addFileBeforesetFileCurrentSize_j_Map_cachenode = mainMonitor;
			}

			mainMonitor.Prop_1_event_setFileCurrentSize(j);
			if(mainMonitor.Prop_1_Category_fail) {
				mainMonitor.Prop_1_handler_fail(j);
			}
			if(mainMonitor.Prop_1_Category_match) {
				mainMonitor.Prop_1_handler_match(j);
			}
		}
	}

}
