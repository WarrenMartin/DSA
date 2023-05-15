public class Node {

    private int data;
    private Node next;

    public Node(int data){

        //Store element in newNodes data.
        this.data=data;
        //set newNodes next to empty
        next=null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
