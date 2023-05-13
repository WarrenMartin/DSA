public class stackUsingList extends SList implements StackIntf {
    //first extends nd thn implements

    @Override
    public void push(int element) {
        addAtFront(element);
    }

    @Override
    public int pop() {
        return deleteFirstNodeAndReturnValue() ;
    }

    @Override
    public boolean isEmpty() {
        //ths is not the correct way of doing it because your implementing head which is a var off another class, and it disobeys the encapsulation parameters
        //or you can implement isEmpty in the LL class itself.
        if (head==null){
            return true;
        }
        return false;
    }


    //LinkedList can never be full it can keep on adding elements.
    @Override
    public boolean isFull() {
        return false;
    }
}
