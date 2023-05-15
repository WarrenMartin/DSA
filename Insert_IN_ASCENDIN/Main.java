public class SortedList {

    private Node head;

    public  SortedList(){
        head=null;
    }

    public void insert(int element){
        Node newNode=new Node(element);

        if (head==null){
            head=newNode;
            return;
        }

        //List is not empty.
        //Find first node  having data greater than newnode's data

        Node current=head;
        Node previous=null;

        while (current!=null){

            if(current.getData()>newNode.getData()){
                // Found the node.
                break;
                //break statement will terminate the loop
            }
            previous=current;
            current=current.getNext();
        }

        //newNodes data is smallest => add first
        // here previous will be null because the newnode is very small
        if(previous==null){
            // Add newNode as first node.
            newNode.setNext(head);
            head=newNode;
            return;
        }

        previous.setNext(newNode);
        newNode.setNext(current);

    }

    public void print(){
        Node current=head;
        while (current!=null){
            System.out.println(current.getData());
            current=current.getNext();
        }
    }


}
