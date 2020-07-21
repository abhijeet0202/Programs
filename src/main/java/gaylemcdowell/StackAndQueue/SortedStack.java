package gaylemcdowell.StackAndQueue;

/*
 * Sort Stack: Write a program to sort a stack such that the smallest items are on the top. You can use
an additional temporary stack, but you may not copy the elements into any other data structure
(such as an array). The stack supports the following operations: push, pop, peek, and isEmpty.
 */
public class SortedStack {
	MyStack myData;
    MyStack temp;

    public SortedStack(int capacity){
        myData = new MyStack(capacity);
        temp = new MyStack(capacity);
    }


    public int push(int element){
        if (myData.isFull()){
            System.out.println("OverFlow");
            return -1;
        }
        while(myData.peek() > element || myData.peek() != -1){
            temp.push(myData.pop());
        }
        myData.push(element);
        while(temp.peek() != -1){
            myData.push(temp.pop());
        }
        return element;
    }


    public int pop(){
        if (myData.isEmpty()){
            System.out.println("UnderFlow");
            return -1;
        }
        return myData.pop();
    }
    
    public int peek(){
        if (myData.isEmpty()){
            System.out.println("UnderFlow");
            return -1;
        }
        return myData.peek();
    }

}
