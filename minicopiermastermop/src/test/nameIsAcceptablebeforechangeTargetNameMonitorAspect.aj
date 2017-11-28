package test;
import java.util.Arrays;

import javamoprt.MOPMonitor;
import minicopier.Copier;

class nameIsAcceptablebeforechangeTargetNameMonitor_Set extends javamoprt.MOPSet {
	protected nameIsAcceptablebeforechangeTargetNameMonitor[] elementData;

	public nameIsAcceptablebeforechangeTargetNameMonitor_Set(){
		this.size = 0;
		this.elementData = new nameIsAcceptablebeforechangeTargetNameMonitor[4];
	}

	public final int size(){
		while(size > 0 && elementData[size-1].MOP_terminated) {
			elementData[--size] = null;
		}
		return size;
	}

	public final boolean add(MOPMonitor e){
		ensureCapacity();
		elementData[size++] = (nameIsAcceptablebeforechangeTargetNameMonitor)e;
		return true;
	}

	public final void endObject(int idnum){
		int numAlive = 0;
		for(int i = 0; i < size; i++){
			nameIsAcceptablebeforechangeTargetNameMonitor monitor = elementData[i];
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
			nameIsAcceptablebeforechangeTargetNameMonitor[] oldData = elementData;
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
			nameIsAcceptablebeforechangeTargetNameMonitor monitor = (nameIsAcceptablebeforechangeTargetNameMonitor)elementData[i];
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

	public final void event_nameIsAcceptable(Copier copy) {
		int numAlive = 0 ;
		for(int i = 0; i < this.size; i++){
			nameIsAcceptablebeforechangeTargetNameMonitor monitor = (nameIsAcceptablebeforechangeTargetNameMonitor)this.elementData[i];
			if(!monitor.MOP_terminated){
				elementData[numAlive] = monitor;
				numAlive++;

				monitor.Prop_1_event_nameIsAcceptable(copy);
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

	public final void event_changeTargetName(Copier copy) {
		int numAlive = 0 ;
		for(int i = 0; i < this.size; i++){
			nameIsAcceptablebeforechangeTargetNameMonitor monitor = (nameIsAcceptablebeforechangeTargetNameMonitor)this.elementData[i];
			if(!monitor.MOP_terminated){
				elementData[numAlive] = monitor;
				numAlive++;

				monitor.Prop_1_event_changeTargetName(copy);
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

class nameIsAcceptablebeforechangeTargetNameMonitor extends javamoprt.MOPMonitor implements Cloneable, javamoprt.MOPObject {
	public Object clone() {
		try {
			nameIsAcceptablebeforechangeTargetNameMonitor ret = (nameIsAcceptablebeforechangeTargetNameMonitor) super.clone();
			return ret;
		}
		catch (CloneNotSupportedException e) {
			throw new InternalError(e.toString());
		}
	}

	int Prop_1_state;
	static final int Prop_1_transition_nameIsAcceptable[] = {1, 1, 2};;
	static final int Prop_1_transition_changeTargetName[] = {0, 1, 2};;

	boolean Prop_1_Category_fail = false;
	boolean Prop_1_Category_match = false;

	public nameIsAcceptablebeforechangeTargetNameMonitor () {
		Prop_1_state = 0;

	}

	public final void Prop_1_event_nameIsAcceptable(Copier copy) {
		MOP_lastevent = 0;

		Prop_1_state = Prop_1_transition_nameIsAcceptable[Prop_1_state];
		Prop_1_Category_fail = Prop_1_state == 2;
		Prop_1_Category_match = Prop_1_state == 1;
	}

	public final void Prop_1_event_changeTargetName(Copier copy) {
		MOP_lastevent = 1;

		Prop_1_state = Prop_1_transition_changeTargetName[Prop_1_state];
		Prop_1_Category_fail = Prop_1_state == 2;
		Prop_1_Category_match = Prop_1_state == 1;
	}

	public final void Prop_1_handler_fail (Copier copy){
		{
			System.err.println("! nameIsAcceptable() not called before changeTargetName()");
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
			//nameIsAcceptable
			//alive_copy
			if(!(alive_parameters_0)){
				MOP_terminated = true;
				return;
			}
			break;

			case 1:
			//changeTargetName
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

public aspect nameIsAcceptablebeforechangeTargetNameMonitorAspect implements javamoprt.MOPObject {
	javamoprt.map.MOPMapManager nameIsAcceptablebeforechangeTargetNameMapManager;
	public nameIsAcceptablebeforechangeTargetNameMonitorAspect(){
		nameIsAcceptablebeforechangeTargetNameMapManager = new javamoprt.map.MOPMapManager();
		nameIsAcceptablebeforechangeTargetNameMapManager.start();
	}

	// Declarations for the Lock
	static Object nameIsAcceptablebeforechangeTargetName_MOPLock = new Object();

	static boolean nameIsAcceptablebeforechangeTargetName_activated = false;

	// Declarations for Indexing Trees
	static javamoprt.map.MOPBasicRefMapOfMonitor nameIsAcceptablebeforechangeTargetName_copy_Map = new javamoprt.map.MOPBasicRefMapOfMonitor(0);
	static javamoprt.ref.MOPWeakReference nameIsAcceptablebeforechangeTargetName_copy_Map_cachekey_0 = javamoprt.map.MOPBasicRefMapOfMonitor.NULRef;
	static nameIsAcceptablebeforechangeTargetNameMonitor nameIsAcceptablebeforechangeTargetName_copy_Map_cachenode = null;

	// Trees for References
	static javamoprt.map.MOPRefMap nameIsAcceptablebeforechangeTargetName_Copier_RefMap = nameIsAcceptablebeforechangeTargetName_copy_Map;

	pointcut MOP_CommonPointCut() : !within(javamoprt.MOPObject+) && !adviceexecution();
	pointcut nameIsAcceptablebeforechangeTargetName_nameIsAcceptable(Copier copy) : (call(* nameIsAcceptable(..)) && target(copy)) && MOP_CommonPointCut();
	before (Copier copy) : nameIsAcceptablebeforechangeTargetName_nameIsAcceptable(copy) {
		nameIsAcceptablebeforechangeTargetName_activated = true;
		synchronized(nameIsAcceptablebeforechangeTargetName_MOPLock) {
			nameIsAcceptablebeforechangeTargetNameMonitor mainMonitor = null;
			javamoprt.map.MOPMap mainMap = null;
			javamoprt.ref.MOPWeakReference TempRef_copy;

			// Cache Retrieval
			if (copy == nameIsAcceptablebeforechangeTargetName_copy_Map_cachekey_0.get()) {
				TempRef_copy = nameIsAcceptablebeforechangeTargetName_copy_Map_cachekey_0;

				mainMonitor = nameIsAcceptablebeforechangeTargetName_copy_Map_cachenode;
			} else {
				TempRef_copy = nameIsAcceptablebeforechangeTargetName_copy_Map.getRef(copy);
			}

			if (mainMonitor == null) {
				mainMap = nameIsAcceptablebeforechangeTargetName_copy_Map;
				mainMonitor = (nameIsAcceptablebeforechangeTargetNameMonitor)mainMap.getNode(TempRef_copy);

				if (mainMonitor == null) {
					mainMonitor = new nameIsAcceptablebeforechangeTargetNameMonitor();

					mainMonitor.MOPRef_copy = TempRef_copy;

					nameIsAcceptablebeforechangeTargetName_copy_Map.putNode(TempRef_copy, mainMonitor);
				}

				nameIsAcceptablebeforechangeTargetName_copy_Map_cachekey_0 = TempRef_copy;
				nameIsAcceptablebeforechangeTargetName_copy_Map_cachenode = mainMonitor;
			}

			mainMonitor.Prop_1_event_nameIsAcceptable(copy);
			if(mainMonitor.Prop_1_Category_fail) {
				mainMonitor.Prop_1_handler_fail(copy);
			}
			if(mainMonitor.Prop_1_Category_match) {
				mainMonitor.Prop_1_handler_match(copy);
			}
		}
	}

	pointcut nameIsAcceptablebeforechangeTargetName_changeTargetName(Copier copy) : (call(* changeTargetName()) && target(copy)) && MOP_CommonPointCut();
	before (Copier copy) : nameIsAcceptablebeforechangeTargetName_changeTargetName(copy) {
		nameIsAcceptablebeforechangeTargetName_activated = true;
		synchronized(nameIsAcceptablebeforechangeTargetName_MOPLock) {
			nameIsAcceptablebeforechangeTargetNameMonitor mainMonitor = null;
			javamoprt.map.MOPMap mainMap = null;
			javamoprt.ref.MOPWeakReference TempRef_copy;

			// Cache Retrieval
			if (copy == nameIsAcceptablebeforechangeTargetName_copy_Map_cachekey_0.get()) {
				TempRef_copy = nameIsAcceptablebeforechangeTargetName_copy_Map_cachekey_0;

				mainMonitor = nameIsAcceptablebeforechangeTargetName_copy_Map_cachenode;
			} else {
				TempRef_copy = nameIsAcceptablebeforechangeTargetName_copy_Map.getRef(copy);
			}

			if (mainMonitor == null) {
				mainMap = nameIsAcceptablebeforechangeTargetName_copy_Map;
				mainMonitor = (nameIsAcceptablebeforechangeTargetNameMonitor)mainMap.getNode(TempRef_copy);

				if (mainMonitor == null) {
					mainMonitor = new nameIsAcceptablebeforechangeTargetNameMonitor();

					mainMonitor.MOPRef_copy = TempRef_copy;

					nameIsAcceptablebeforechangeTargetName_copy_Map.putNode(TempRef_copy, mainMonitor);
				}

				nameIsAcceptablebeforechangeTargetName_copy_Map_cachekey_0 = TempRef_copy;
				nameIsAcceptablebeforechangeTargetName_copy_Map_cachenode = mainMonitor;
			}

			mainMonitor.Prop_1_event_changeTargetName(copy);
			if(mainMonitor.Prop_1_Category_fail) {
				mainMonitor.Prop_1_handler_fail(copy);
			}
			if(mainMonitor.Prop_1_Category_match) {
				mainMonitor.Prop_1_handler_match(copy);
			}
		}
	}

}
