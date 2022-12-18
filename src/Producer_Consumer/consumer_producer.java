package Producer_Consumer;


import Producer_Consumer.buffer;
import Semaphore.Mysemaphore;
import java.lang.Thread.State;



/**
 *
 * @author joseph
 */

public class consumer_producer  {

       buffer buf=new buffer(10);
       
       public int Max_tik_num ;
       public int Avilable_tik ;
       public int produced_tik=0;
       public int tik_count=0;
       public int consumed_tik = 0;
       
       /////////calculate time variables//////
       long start;
       long end=0 ;
       boolean Switch=true;
       
       //////////interrupt threads////////
       public boolean Ctrl_1=true;
       public boolean Ctrl_2=true;
       public boolean Ctrl_3=true;
       public boolean Ctrl_4=true;
       public boolean Ctrl_5=true;
       public boolean Ctrl_6=true;
       
       ///////////consumer tickits counter/////////
       public int c1=0;
       public int c2=0;
       public int c3=0;
       public int c4=0;
       public int c5=0;
       public int c6=0;
       
       /////////threads state//////
       public String mess;
       public String mess2;
       public String mess3;
       public String mess4;
       public String mess5;
       public String mess6;
       public String mess7;
       public String name;
       public String t1= "Thread-3";
       public String t2= "Thread-4";
       public String t3= "Thread-5";
       public String t4= "Thread-6";
       public String t5= "Thread-7";
       public String t6= "Thread-8";
       
//       State NEW;
//       State RUNNABLE;
//       State BLOCKED;
//       State WAITING;      
//       State TIMED_WAITING;
//       State TERMINATED ;       
        


/////////////////////*Constructors*///////////////////////
	public consumer_producer()// Default Constructor
	{

	}
        
  
        
///////////////////////*Wait and Signal*///////////////////////
	public void Signal(Mysemaphore S) {
		  notify();
		S.value++;
                               
	}
       
       public void Wait(Mysemaphore S) throws InterruptedException {
           
               if(Switch){
               start = System.currentTimeMillis();
               Switch=false;
               }    
              
		if (S.value <= 0) {
			wait();
		}
             
		S.value--;
	}
        

       
///////////////////////*Producer function*///////////////////////
	public void producerr() throws InterruptedException {
		
		while (produced_tik<=Max_tik_num) {
                    
			synchronized (this) {
                                                         
                               
			while (buf.size() == buf.Max ) {
                            
//                       System.out.println("Buffer is full . waiting....");
				 wait();
                                                                
					}
                        
                                 Wait(buf.empty);
			         Wait(buf.mutex);
                                
                                produced_tik++;
				buf.produce(produced_tik);
                                               
                                  Signal(buf.mutex);
			          Signal(buf.full);
                                                
					}

				}
	}

        
/////////////////////////////Consumer///////////////////////        
        
        
public void consumerr() throws InterruptedException {
                                            
		while (true) {
                          
	synchronized (this) {
            

               Thread.sleep(50);
                                          
		while (buf.size() == 0 ) {
//                 System.out.println("Tickets will be available soon please try again later ...");
			wait();
                                              
			}
                
                      Wait(buf.full);
		      Wait(buf.mutex);
                      
                                                              
                       if(checkBook(consumed_tik)){
                      name= Thread.currentThread().getName();
                      check_state(name);
                   
		      consumed_tik = buf.consume();
                                              
                                     }
                                                
                               else{
                               break;
                                    }
                                        
                       Signal(buf.mutex);
		       Signal(buf.empty);
                                               
					}
                                        
                                        
				} // End of While
                                       
			}// End Of Consumer





///////////////////////*book Check function*//////////////
public boolean checkBook(int num) {
	boolean isBooked = true;

	if (num == Max_tik_num) {
                                    
	       end = System.currentTimeMillis();
               mess7="Sorry All tickets Are Booked  !!!!";
//               System.out.println("Sorry All tickets Are Booked  !!!!");
               isBooked = false;
	       return isBooked;
                                        
			}
        else  {
					
	if(num<=Max_tik_num){   
              int numm=num;
              numm++;
              mess7="There Is Available Tickets";
//       System.out.println("tickeit number : "+ numm +" booked successfully  " );  
                   tik_count++;
                   Avilable_tik--;
                   isBooked = true;                                 
                             }
        
		return isBooked;
                
				}
			}





//////////////////////////////////check thrade state///////////////////////////

public void check_state(String s) throws InterruptedException{

               if(s.equals(t1))
                      {
                  if(!Ctrl_1){
               
                    Thread.currentThread().interrupt();
                    
                    
                          }
                  
                          c1++;
                          mess="RUNNABLE";
                          mess2="WAITING";
                          mess3="WAITING";
                          mess4="WAITING";
                          mess5="WAITING";
                          mess6="WAITING";
                          
                      }
                      
                      else if(s.equals(t2)){
                          
                          if(!Ctrl_2){
                    Thread.currentThread().interrupt();          
                    
                          }
                          
                          c2++;
                         mess="WAITING";
                         mess2="RUNNABLE";
                         mess3="WAITING";
                         mess4="WAITING";
                         mess5="WAITING";
                         mess6="WAITING";
                      
                      }

                      else if(s.equals(t3)){
                      
                          if(!Ctrl_3){     
                    Thread.currentThread().interrupt();          
                    
                          }
                         
                         c3++; 
                         mess="WAITING";
                         mess2="WAITING";
                         mess3="RUNNABLE";
                         mess4="WAITING";
                         mess5="WAITING";
                         mess6="WAITING";
                      
                      }

                      else if(s.equals(t4)){
                          
                          if(!Ctrl_4){
                              
                     Thread.currentThread().interrupt();          
                    
                          }
                         
                          c4++;
                         mess="WAITING";
                         mess2="WAITING";
                         mess3="WAITING";
                         mess4="RUNNABLE";
                         mess5="WAITING";
                         mess6="WAITING";
                      
                      }

                      else if(s.equals(t5)){
                          
                          if(!Ctrl_5){
                              
                    Thread.currentThread().interrupt();          
                    
                          }
                         
                          c5++;
                         mess="WAITING";
                         mess2="WAITING";
                         mess3="WAITING";
                         mess4="WAITING";
                         mess5="RUNNABLE";  
                         mess6="WAITING";
                      
                      }

                      else if(s.equals(t6)){
                          
                          if(!Ctrl_6){
                              
                    Thread.currentThread().interrupt();          
                    
                          }
                        
                          
                          c6++;
                         mess="WAITING";
                         mess2="WAITING";
                         mess3="WAITING";
                         mess4="WAITING";
                         mess5="WAITING";
                         mess6="RUNNABLE";                            
                      
                      }
               

}


///////////////////////////////timeElapsed/////////////////////////
public double time(){

    double x=0;
    
     if (end!=0){
     x = (end - start)/1000;
     }

    return x ;

}


}



           
