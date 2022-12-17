package Producer_Consumer;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;

import Semaphore.Mysemaphore;


/**
 *
 * @author joseph
 */

public class buffer {
       
	public int size ; //buffer size
	private int store[];
	private int head ; //head
	private int tail ;  //tail
	
        public int Max;
	Mysemaphore empty;
	Mysemaphore full;
	Mysemaphore mutex;

///////////////////////*Constructors*///////////////////////
	
//	public buffer(buffer buff)// Copy Constructor
//	{
//		size = buff.size;
//		empty = new Mysemaphore(size);
//		full = new Mysemaphore(0);
//		mutex = new Mysemaphore(1);
//		store = new int[size];
//	}

	public buffer(int size) // Parameterized constructor // the buffer bound
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

