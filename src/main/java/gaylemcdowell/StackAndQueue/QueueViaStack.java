package gaylemcdowell.StackAndQueue;
/*
 * Queue via Stacks: Implement a MyQueue class which implements a queue using two stacks.
 */


public class QueueViaStack {
    MyStack up;
    MyStack down;

    public QueueViaStack(int capacity){
        up = new MyStack(capacity);
        down = new MyStack(capacity);
    }

    public void push(int element){
        up.push(element);
    }

    public int pop(){
        while (up.peek() != -1){
            down.push(up.pop());
        }
        int remove = down.pop();
        while (down.peek() != -1){
            up.push(down.pop());
        }
        return remove;
    }


}
