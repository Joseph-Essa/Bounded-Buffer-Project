package Producer_Consumer;


import Semaphore.Mysemaphore;


/**
 *
 * @author joseph
 */

public class buffer {
       
	public int size ; 
	private int store[];
	private int head ; 
	private int tail ;  
	
        public int Max;
	Mysemaphore empty;
	Mysemaphore full;
	Mysemaphore mutex;

///////////////////////*Constructors*///////////////////////
	
	public buffer(int size)
	{
		Max = size;
		empty = new Mysemaphore(Max);
		full = new Mysemaphore(0);
		mutex = new Mysemaphore(1);
		store = new int[Max];
                size = 0;
                head = 0;
                tail = Max -1;
	}



///////////////////////*Producer function*///////////////////////
	public void produce(int value) throws InterruptedException {
				
			tail=(tail+1)%Max;
                        store[tail]=value;
                        size++;

	}

///////////////////////*Consumer function*///////////////////////
	public int consume() throws InterruptedException {
		int value;
		
		      size--;
                      value=store[head];
                      head=(head+1)%Max;

                        
		return value;
	}
        
        
public int size(){

return size;

}
}

