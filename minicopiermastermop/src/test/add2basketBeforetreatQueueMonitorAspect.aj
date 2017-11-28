package test;
import java.util.Arrays;

import javamoprt.MOPMonitor;
import minicopier.Basket;

class add2basketBeforetreatQueueMonitor_Set extends javamoprt.MOPSet {
	protected add2basketBeforetreatQueueMonitor[] elementData;

	public add2basketBeforetreatQueueMonitor_Set(){
		this.size = 0;
		this.elementData = new add2basketBeforetreatQueueMonitor[4];
	}

	public final int size(){
		while(size > 0 && elementData[size-1].MOP_terminated) {
			elementData[--size] = null;
		}
		return size;
	}

	public final boolean add(MOPMonitor e){
		ensureCapacity();
		elementData[size++] = (add2basketBeforetreatQueueMonitor)e;
		return true;
	}

	public final void endObject(int idnum){
		int numAlive = 0;
		for(int i = 0; i < size; i++){
			add2basketBeforetreatQueueMonitor monitor = elementData[i];
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
			add2basketBeforetreatQueueMonitor[] oldData = elementData;
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
			add2basketBeforetreatQueueMonitor monitor = (add2basketBeforetreatQueueMonitor)elementData[i];
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

	public final void event_add2Basket(Basket i) {
		int numAlive = 0 ;
		for(int i_1 = 0; i_1 < this.size; i_1++){
			add2basketBeforetreatQueueMonitor monitor = (add2basketBeforetreatQueueMonitor)this.elementData[i_1];
			if(!monitor.MOP_terminated){
				elementData[numAlive] = monitor;
				numAlive++;

				monitor.Prop_1_event_add2Basket(i);
				if(monitor.Prop_1_Category_fail) {
					monitor.Prop_1_handler_fail(i);
				}
				if(monitor.Prop_1_Category_match) {
					monitor.Prop_1_handler_match(i);
				}
			}
		}
		for(int i_1 = numAlive; i_1 < this.size; i_1++){
			this.elementData[i_1] = null;
		}
		size = numAlive;
	}

	public final void event_treatQueue(Basket i) {
		int numAlive = 0 ;
		for(int i_1 = 0; i_1 < this.size; i_1++){
			add2basketBeforetreatQueueMonitor monitor = (add2basketBeforetreatQueueMonitor)this.elementData[i_1];
			if(!monitor.MOP_terminated){
				elementData[numAlive] = monitor;
				numAlive++;

				monitor.Prop_1_event_treatQueue(i);
				if(monitor.Prop_1_Category_fail) {
					monitor.Prop_1_handler_fail(i);
				}
				if(monitor.Prop_1_Category_match) {
					monitor.Prop_1_handler_match(i);
				}
			}
		}
		for(int i_1 = numAlive; i_1 < this.size; i_1++){
			this.elementData[i_1] = null;
		}
		size = numAlive;
	}
}

class add2basketBeforetreatQueueMonitor extends javamoprt.MOPMonitor implements Cloneable, javamoprt.MOPObject {
	public Object clone() {
		try {
			add2basketBeforetreatQueueMonitor ret = (add2basketBeforetreatQueueMonitor) super.clone();
			return ret;
		}
		catch (CloneNotSupportedException e) {
			throw new InternalError(e.toString());
		}
	}

	int Prop_1_state;
	static final int Prop_1_transition_add2Basket[] = {1, 1, 2};;
	static final int Prop_1_transition_treatQueue[] = {0, 1, 2};;

	boolean Prop_1_Category_fail = false;
	boolean Prop_1_Category_match = false;

	public add2basketBeforetreatQueueMonitor () {
		Prop_1_state = 0;

	}

	public final void Prop_1_event_add2Basket(Basket i) {
		MOP_lastevent = 0;

		Prop_1_state = Prop_1_transition_add2Basket[Prop_1_state];
		Prop_1_Category_fail = Prop_1_state == 2;
		Prop_1_Category_match = Prop_1_state == 1;
	}

	public final void Prop_1_event_treatQueue(Basket i) {
		MOP_lastevent = 1;

		Prop_1_state = Prop_1_transition_treatQueue[Prop_1_state];
		Prop_1_Category_fail = Prop_1_state == 2;
		Prop_1_Category_match = Prop_1_state == 1;
	}

	public final void Prop_1_handler_fail (Basket i){
		{
			System.err.println("! add2Basket() not called before treatQueue()");
			this.reset();
		}

	}

	public final void Prop_1_handler_match (Basket i){
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

	public javamoprt.ref.MOPWeakReference MOPRef_i;

	//alive_parameters_0 = [Basket i]
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
			//add2Basket
			//alive_i
			if(!(alive_parameters_0)){
				MOP_terminated = true;
				return;
			}
			break;

			case 1:
			//treatQueue
			//alive_i
			if(!(alive_parameters_0)){
				MOP_terminated = true;
				return;
			}
			break;

		}
		return;
	}

}

public aspect add2basketBeforetreatQueueMonitorAspect implements javamoprt.MOPObject {
	javamoprt.map.MOPMapManager add2basketBeforetreatQueueMapManager;
	public add2basketBeforetreatQueueMonitorAspect(){
		add2basketBeforetreatQueueMapManager = new javamoprt.map.MOPMapManager();
		add2basketBeforetreatQueueMapManager.start();
	}

	// Declarations for the Lock
	static Object add2basketBeforetreatQueue_MOPLock = new Object();

	static boolean add2basketBeforetreatQueue_activated = false;

	// Declarations for Indexing Trees
	static javamoprt.map.MOPBasicRefMapOfMonitor add2basketBeforetreatQueue_i_Map = new javamoprt.map.MOPBasicRefMapOfMonitor(0);
	static javamoprt.ref.MOPWeakReference add2basketBeforetreatQueue_i_Map_cachekey_0 = javamoprt.map.MOPBasicRefMapOfMonitor.NULRef;
	static add2basketBeforetreatQueueMonitor add2basketBeforetreatQueue_i_Map_cachenode = null;

	// Trees for References
	static javamoprt.map.MOPRefMap add2basketBeforetreatQueue_Basket_RefMap = add2basketBeforetreatQueue_i_Map;

	pointcut MOP_CommonPointCut() : !within(javamoprt.MOPObject+) && !adviceexecution();
	pointcut add2basketBeforetreatQueue_add2Basket(Basket i) : (call(* add2Basket(..)) && target(i)) && MOP_CommonPointCut();
	before (Basket i) : add2basketBeforetreatQueue_add2Basket(i) {
		add2basketBeforetreatQueue_activated = true;
		synchronized(add2basketBeforetreatQueue_MOPLock) {
			add2basketBeforetreatQueueMonitor mainMonitor = null;
			javamoprt.map.MOPMap mainMap = null;
			javamoprt.ref.MOPWeakReference TempRef_i;

			// Cache Retrieval
			if (i == add2basketBeforetreatQueue_i_Map_cachekey_0.get()) {
				TempRef_i = add2basketBeforetreatQueue_i_Map_cachekey_0;

				mainMonitor = add2basketBeforetreatQueue_i_Map_cachenode;
			} else {
				TempRef_i = add2basketBeforetreatQueue_i_Map.getRef(i);
			}

			if (mainMonitor == null) {
				mainMap = add2basketBeforetreatQueue_i_Map;
				mainMonitor = (add2basketBeforetreatQueueMonitor)mainMap.getNode(TempRef_i);

				if (mainMonitor == null) {
					mainMonitor = new add2basketBeforetreatQueueMonitor();

					mainMonitor.MOPRef_i = TempRef_i;

					add2basketBeforetreatQueue_i_Map.putNode(TempRef_i, mainMonitor);
				}

				add2basketBeforetreatQueue_i_Map_cachekey_0 = TempRef_i;
				add2basketBeforetreatQueue_i_Map_cachenode = mainMonitor;
			}

			mainMonitor.Prop_1_event_add2Basket(i);
			if(mainMonitor.Prop_1_Category_fail) {
				mainMonitor.Prop_1_handler_fail(i);
			}
			if(mainMonitor.Prop_1_Category_match) {
				mainMonitor.Prop_1_handler_match(i);
			}
		}
	}

	pointcut add2basketBeforetreatQueue_treatQueue(Basket i) : (call(* treatQueue()) && target(i)) && MOP_CommonPointCut();
	before (Basket i) : add2basketBeforetreatQueue_treatQueue(i) {
		add2basketBeforetreatQueue_activated = true;
		synchronized(add2basketBeforetreatQueue_MOPLock) {
			add2basketBeforetreatQueueMonitor mainMonitor = null;
			javamoprt.map.MOPMap mainMap = null;
			javamoprt.ref.MOPWeakReference TempRef_i;

			// Cache Retrieval
			if (i == add2basketBeforetreatQueue_i_Map_cachekey_0.get()) {
				TempRef_i = add2basketBeforetreatQueue_i_Map_cachekey_0;

				mainMonitor = add2basketBeforetreatQueue_i_Map_cachenode;
			} else {
				TempRef_i = add2basketBeforetreatQueue_i_Map.getRef(i);
			}

			if (mainMonitor == null) {
				mainMap = add2basketBeforetreatQueue_i_Map;
				mainMonitor = (add2basketBeforetreatQueueMonitor)mainMap.getNode(TempRef_i);

				if (mainMonitor == null) {
					mainMonitor = new add2basketBeforetreatQueueMonitor();

					mainMonitor.MOPRef_i = TempRef_i;

					add2basketBeforetreatQueue_i_Map.putNode(TempRef_i, mainMonitor);
				}

				add2basketBeforetreatQueue_i_Map_cachekey_0 = TempRef_i;
				add2basketBeforetreatQueue_i_Map_cachenode = mainMonitor;
			}

			mainMonitor.Prop_1_event_treatQueue(i);
			if(mainMonitor.Prop_1_Category_fail) {
				mainMonitor.Prop_1_handler_fail(i);
			}
			if(mainMonitor.Prop_1_Category_match) {
				mainMonitor.Prop_1_handler_match(i);
			}
		}
	}

}
