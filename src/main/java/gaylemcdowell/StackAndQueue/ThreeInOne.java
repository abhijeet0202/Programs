package gaylemcdowell.StackAndQueue;

/*
 * Three in One: Describe how you could use a single array to implement three stacks.
 */
public class ThreeInOne {
    private int stacks =3;
    private int stackCapacity;
    private int[] top;
    private int[] values;
    
    
    public ThreeInOne(int stackCapacity){
        this.stackCapacity = stackCapacity;
        this.values = new int[stackCapacity * stacks];
        this.top = new int[stacks];

    }

    public int peek(int stackNumber){
       if( top[stackNumber] == 0){
    	   System.out.println("Stack "+stackNumber+ "Under Flow");
           return -1;
       }
       int index = indexOfStack(stackNumber);
       return values[index];
    }
    public int push(int value, int stackNumber){
        if(top[stackNumber] >= stackCapacity){
            System.out.println("Stack :"+stackNumber+ " OverFlow Flow");
            return -1;
        }
        int index = indexOfStack(stackNumber);
        index++;
        top[stackNumber]++;
        values[index]= value;
        return index;
    }
    
    public int pop(int stackNumber){
        if(top[stackNumber] == 0){
            System.out.println("Stack :"+stackNumber+ "Under Flow");
            return -1;
        }
        int index = indexOfStack(stackNumber);
        top[stackNumber]--;
        return values[index];
    }

    private int indexOfStack(int stackNumber){
       int offset = stackNumber*stackCapacity;
       int currentSize = top[stackNumber];
       return offset+currentSize-1;
    }

}
