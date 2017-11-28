package test;
import java.util.Arrays;

import javamoprt.MOPMonitor;
import minicopier.Copier;

class paste2URIStringAfteraddFile2QueueMonitor_Set extends javamoprt.MOPSet {
	protected paste2URIStringAfteraddFile2QueueMonitor[] elementData;

	public paste2URIStringAfteraddFile2QueueMonitor_Set(){
		this.size = 0;
		this.elementData = new paste2URIStringAfteraddFile2QueueMonitor[4];
	}

	public final int size(){
		while(size > 0 && elementData[size-1].MOP_terminated) {
			elementData[--size] = null;
		}
		return size;
	}

	public final boolean add(MOPMonitor e){
		ensureCapacity();
		elementData[size++] = (paste2URIStringAfteraddFile2QueueMonitor)e;
		return true;
	}

	public final void endObject(int idnum){
		int numAlive = 0;
		for(int i = 0; i < size; i++){
			paste2URIStringAfteraddFile2QueueMonitor monitor = elementData[i];
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
			paste2URIStringAfteraddFile2QueueMonitor[] oldData = elementData;
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
			paste2URIStringAfteraddFile2QueueMonitor monitor = (paste2URIStringAfteraddFile2QueueMonitor)elementData[i];
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

	public final void event_addFile2Queue(Copier copy) {
		int numAlive = 0 ;
		for(int i = 0; i < this.size; i++){
			paste2URIStringAfteraddFile2QueueMonitor monitor = (paste2URIStringAfteraddFile2QueueMonitor)this.elementData[i];
			if(!monitor.MOP_terminated){
				elementData[numAlive] = monitor;
				numAlive++;

				monitor.Prop_1_event_addFile2Queue(copy);
				if(monitor.Prop_1_Category_fail) {
					monitor.Prop_1_handler_fail(copy);
				}
				if(monitor.Prop_1_Category_match) {
					monitor.Prop_1_handler_match(copy);
				}
			}
		}
		for(int i = numAlive; i < this.size; i++){
			this.elementData[i] = null;
		}
		size = numAlive;
	}

	public final void event_paste2URIString(Copier copy) {
		int numAlive = 0 ;
		for(int i = 0; i < this.size; i++){
			paste2URIStringAfteraddFile2QueueMonitor monitor = (paste2URIStringAfteraddFile2QueueMonitor)this.elementData[i];
			if(!monitor.MOP_terminated){
				elementData[numAlive] = monitor;
				numAlive++;

				monitor.Prop_1_event_paste2URIString(copy);
				if(monitor.Prop_1_Category_fail) {
					monitor.Prop_1_handler_fail(copy);
				}
				if(monitor.Prop_1_Category_match) {
					monitor.Prop_1_handler_match(copy);
				}
			}
		}
		for(int i = numAlive; i < this.size; i++){
			this.elementData[i] = null;
		}
		size = numAlive;
	}
}

class paste2URIStringAfteraddFile2QueueMonitor extends javamoprt.MOPMonitor implements Cloneable, javamoprt.MOPObject {
	public Object clone() {
		try {
			paste2URIStringAfteraddFile2QueueMonitor ret = (paste2URIStringAfteraddFile2QueueMonitor) super.clone();
			return ret;
		}
		catch (CloneNotSupportedException e) {
			throw new InternalError(e.toString());
		}
	}

	int Prop_1_state;
	static final int Prop_1_transition_addFile2Queue[] = {1, 1, 2};;
	static final int Prop_1_transition_paste2URIString[] = {0, 1, 2};;

	boolean Prop_1_Category_fail = false;
	boolean Prop_1_Category_match = false;

	public paste2URIStringAfteraddFile2QueueMonitor () {
		Prop_1_state = 0;

	}

	public final void Prop_1_event_addFile2Queue(Copier copy) {
		MOP_lastevent = 0;

		Prop_1_state = Prop_1_transition_addFile2Queue[Prop_1_state];
		Prop_1_Category_fail = Prop_1_state == 2;
		Prop_1_Category_match = Prop_1_state == 1;
	}

	public final void Prop_1_event_paste2URIString(Copier copy) {
		MOP_lastevent = 1;

		Prop_1_state = Prop_1_transition_paste2URIString[Prop_1_state];
		Prop_1_Category_fail = Prop_1_state == 2;
		Prop_1_Category_match = Prop_1_state == 1;
	}

	public final void Prop_1_handler_fail (Copier copy){
		{
			System.err.println("! paste2URIString() not called after addFile2Queue()");
			this.reset();
		}

	}

	public final void Prop_1_handler_match (Copier copy){
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

	public javamoprt.ref.MOPWeakReference MOPRef_copy;

	//alive_parameters_0 = [Copier copy]
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
			//addFile2Queue
			//alive_copy
			if(!(alive_parameters_0)){
				MOP_terminated = true;
				return;
			}
			break;

			case 1:
			//paste2URIString
			//alive_copy
			if(!(alive_parameters_0)){
				MOP_terminated = true;
				return;
			}
			break;

		}
		return;
	}

}

public aspect paste2URIStringAfteraddFile2QueueMonitorAspect implements javamoprt.MOPObject {
	javamoprt.map.MOPMapManager paste2URIStringAfteraddFile2QueueMapManager;
	public paste2URIStringAfteraddFile2QueueMonitorAspect(){
		paste2URIStringAfteraddFile2QueueMapManager = new javamoprt.map.MOPMapManager();
		paste2URIStringAfteraddFile2QueueMapManager.start();
	}

	// Declarations for the Lock
	static Object paste2URIStringAfteraddFile2Queue_MOPLock = new Object();

	static boolean paste2URIStringAfteraddFile2Queue_activated = false;

	// Declarations for Indexing Trees
	static javamoprt.map.MOPBasicRefMapOfMonitor paste2URIStringAfteraddFile2Queue_copy_Map = new javamoprt.map.MOPBasicRefMapOfMonitor(0);
	static javamoprt.ref.MOPWeakReference paste2URIStringAfteraddFile2Queue_copy_Map_cachekey_0 = javamoprt.map.MOPBasicRefMapOfMonitor.NULRef;
	static paste2URIStringAfteraddFile2QueueMonitor paste2URIStringAfteraddFile2Queue_copy_Map_cachenode = null;

	// Trees for References
	static javamoprt.map.MOPRefMap paste2URIStringAfteraddFile2Queue_Copier_RefMap = paste2URIStringAfteraddFile2Queue_copy_Map;

	pointcut MOP_CommonPointCut() : !within(javamoprt.MOPObject+) && !adviceexecution();
	pointcut paste2URIStringAfteraddFile2Queue_addFile2Queue(Copier copy) : (call(* addFile2Queue(..)) && target(copy)) && MOP_CommonPointCut();
	before (Copier copy) : paste2URIStringAfteraddFile2Queue_addFile2Queue(copy) {
		paste2URIStringAfteraddFile2Queue_activated = true;
		synchronized(paste2URIStringAfteraddFile2Queue_MOPLock) {
			paste2URIStringAfteraddFile2QueueMonitor mainMonitor = null;
			javamoprt.map.MOPMap mainMap = null;
			javamoprt.ref.MOPWeakReference TempRef_copy;

			// Cache Retrieval
			if (copy == paste2URIStringAfteraddFile2Queue_copy_Map_cachekey_0.get()) {
				TempRef_copy = paste2URIStringAfteraddFile2Queue_copy_Map_cachekey_0;

				mainMonitor = paste2URIStringAfteraddFile2Queue_copy_Map_cachenode;
			} else {
				TempRef_copy = paste2URIStringAfteraddFile2Queue_copy_Map.getRef(copy);
			}

			if (mainMonitor == null) {
				mainMap = paste2URIStringAfteraddFile2Queue_copy_Map;
				mainMonitor = (paste2URIStringAfteraddFile2QueueMonitor)mainMap.getNode(TempRef_copy);

				if (mainMonitor == null) {
					mainMonitor = new paste2URIStringAfteraddFile2QueueMonitor();

					mainMonitor.MOPRef_copy = TempRef_copy;

					paste2URIStringAfteraddFile2Queue_copy_Map.putNode(TempRef_copy, mainMonitor);
				}

				paste2URIStringAfteraddFile2Queue_copy_Map_cachekey_0 = TempRef_copy;
				paste2URIStringAfteraddFile2Queue_copy_Map_cachenode = mainMonitor;
			}

			mainMonitor.Prop_1_event_addFile2Queue(copy);
			if(mainMonitor.Prop_1_Category_fail) {
				mainMonitor.Prop_1_handler_fail(copy);
			}
			if(mainMonitor.Prop_1_Category_match) {
				mainMonitor.Prop_1_handler_match(copy);
			}
		}
	}

	pointcut paste2URIStringAfteraddFile2Queue_paste2URIString(Copier copy) : (call(* paste2URIString()) && target(copy)) && MOP_CommonPointCut();
	before (Copier copy) : paste2URIStringAfteraddFile2Queue_paste2URIString(copy) {
		paste2URIStringAfteraddFile2Queue_activated = true;
		synchronized(paste2URIStringAfteraddFile2Queue_MOPLock) {
			paste2URIStringAfteraddFile2QueueMonitor mainMonitor = null;
			javamoprt.map.MOPMap mainMap = null;
			javamoprt.ref.MOPWeakReference TempRef_copy;

			// Cache Retrieval
			if (copy == paste2URIStringAfteraddFile2Queue_copy_Map_cachekey_0.get()) {
				TempRef_copy = paste2URIStringAfteraddFile2Queue_copy_Map_cachekey_0;

				mainMonitor = paste2URIStringAfteraddFile2Queue_copy_Map_cachenode;
			} else {
				TempRef_copy = paste2URIStringAfteraddFile2Queue_copy_Map.getRef(copy);
			}

			if (mainMonitor == null) {
				mainMap = paste2URIStringAfteraddFile2Queue_copy_Map;
				mainMonitor = (paste2URIStringAfteraddFile2QueueMonitor)mainMap.getNode(TempRef_copy);

				if (mainMonitor == null) {
					mainMonitor = new paste2URIStringAfteraddFile2QueueMonitor();

					mainMonitor.MOPRef_copy = TempRef_copy;

					paste2URIStringAfteraddFile2Queue_copy_Map.putNode(TempRef_copy, mainMonitor);
				}

				paste2URIStringAfteraddFile2Queue_copy_Map_cachekey_0 = TempRef_copy;
				paste2URIStringAfteraddFile2Queue_copy_Map_cachenode = mainMonitor;
			}

			mainMonitor.Prop_1_event_paste2URIString(copy);
			if(mainMonitor.Prop_1_Category_fail) {
				mainMonitor.Prop_1_handler_fail(copy);
			}
			if(mainMonitor.Prop_1_Category_match) {
				mainMonitor.Prop_1_handler_match(copy);
			}
		}
	}

}
