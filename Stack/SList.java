public class SList {
    Node head;
    Node tail;


    public SList(){
        head=null;
        tail= null;
    }

    public void addAtFront(int element){

        // Make space for new element to be added to the list
        Node newNode=new Node();

        newNode.data=element;
        newNode.next=null;

        if (head==null){
            //list is empty;
            head=newNode;
            tail=newNode;
            return;
        }

        //List is not empty  => Add newNode as firstnode

        newNode.next=head;
        head=newNode;


    }

    public int deleteFirstNodeAndReturnValue(){

        if (head==null){
            return -1;//todo it for u
        }

        Node temp=head;
        head=head.next;
        temp.next=null;

        if (head==null){
            tail=head;
        }


        return  temp.data;



    }

    public void addAtLast(int element){

        Node newnode=new Node();

        newnode.data=element;
        newnode.next=null;

        if(head==null){
            head=newnode;
            tail=newnode;
            return;

        }
        tail.next=newnode;
        newnode=tail;

    }


    public void print(){
        Node current=head;
        while (current!=null){
            //process current node
            System.out.println(current.data);

            current=current.next;
        }
    }


}
