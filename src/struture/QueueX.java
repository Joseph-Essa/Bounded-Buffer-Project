package struture;

/**
 *
 * @author joseph
 */
public class QueueX {
    
    private int head,tail,size,Max;
    int entry[];
    
    public QueueX(int size) {
        Max = size;
        entry = new int[Max];
        size = 0;
        head = 0;
        tail = Max -1;
}
    
    public void  EnQueue (int item){
    tail=(tail+1)%Max;
    entry[tail]=item;
    size++;
    
    }
     
public int  DeQueue(){
size--;
int item=entry[head];
head=(head+1)%Max;

  return item;
}  

public boolean isEmpty(){

return size==0;

}

public boolean isFull(){

return size==Max;

}

public int size(){

return size;

}



public void print(){

for(int i=0 ; i<Max ; i++){

int item=entry[head];
System.out.println(item);
head++;
}

}




    
}
