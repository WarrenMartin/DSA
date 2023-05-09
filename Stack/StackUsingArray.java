public class StackUsingArray implements StackIntf {

    int[] stack;
    int top;

    //constructor which takes in the size of the array.

    public StackUsingArray(int n){
        stack =new int[n];
        top=-1;
        //here we have declared top as -1 because everytime a new object is created the top is going to be -1 for it

    }
    
    @Override
    public void push(int element){
        if(isFull()){
            return; //ToDo: throw appropriate Exception
        }
        ++top;
        stack[top]=element;
        
    }
    @Override
    public int pop(){
        if(isEmpty()){
            return -1;  //TODO: throw appropriate Exception
        }
        int result=stack[top];
        --top;
        return result;
    }
    @Override
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }

        return false;
    }
    @Override
    public boolean isFull(){
        if(top==stack.length-1){
            return true;
        }
        return false;
    }

}
