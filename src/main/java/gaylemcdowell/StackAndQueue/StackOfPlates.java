package gaylemcdowell.StackAndQueue;

/*
 * Stack of Plates: Imagine a (literal) stack of plates. If the stack gets too high, it might topple.
Therefore, in real life, we would likely start a new stack when the previous stack exceeds some
threshold. Implement a data structure SetOfStacks that mimics this. SetOfStacks should be
composed of several stacks and should create a new stack once the previous one exceeds capacity.
SetOfStacks. push () and SetOfStacks. pop () should behave identically to a single stack
(that is, pop ( ) should return the same values as it would if there were just a single stack).
FOLLOW UP
Implement a function popAt (int index) which performs a pop operation on a specific sub-stack.
 */

public class StackOfPlates {
    MyStack[] numOfStack;
    int stackNumber;
    int capacity;

    public StackOfPlates(int cap){
        numOfStack = new MyStack[10];
        stackNumber=-1;
        this.capacity = cap;
        createNewStackSet();

    }

    public void push(int element){
        if (numOfStack[stackNumber].top >= capacity-1){
            createNewStackSet();
        }
        numOfStack[stackNumber].push(element);

    }

    private void createNewStackSet(){
        MyStack temp = new MyStack(capacity);
        numOfStack[++stackNumber] = temp;
    }
    
    public void pop(){
        if (stackNumber ==-1 ){
            System.out.println("UnderFlow");
            return ;
        }
        int top = numOfStack[stackNumber].pop();
        if(top == -1){
            numOfStack[stackNumber] = null;
            --stackNumber;
        }
    }
    public int peek(){
        if (stackNumber ==-1 ){
            System.out.println("UnderFlow");
            return -1;
        }
        return numOfStack[stackNumber].peek();
    }
}
