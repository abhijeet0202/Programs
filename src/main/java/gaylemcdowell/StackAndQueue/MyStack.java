package gaylemcdowell.StackAndQueue;

public class MyStack {
	   int top;
	   int[] values;
	   int capacity;

	   public MyStack(int capacity){
	       this.capacity = capacity;
	        values = new int[capacity];
	        top=-1;
	   }

	   public int push(int element){
	        if(top >= capacity-1){
	            System.out.println("Over Fow");
	            return -1;
	        }
	        values[++top] = element;
	        return top;
	   }
	   public int pop(){
	        if(top == -1){
	            System.out.println("UnderFow");
	            return -1;
	        }
	        int data = values[top];
	        values[top] = 0;
	        --top;
	        return data;
	   }
	   
	   public int peek(){
	        if(top == -1){
	            return -1;
	        }
	        return values[top];
	   }
	   
	   public boolean isFull(){
	        if(top >=  capacity-1){
	            return true;
	        }
	        return false;
	   }
	   
       public boolean isEmpty(){
	        if(top == -1){
	            return true;
	        }
	        return false;
	   }
}
