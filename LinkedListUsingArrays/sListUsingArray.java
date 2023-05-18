public class sListUsingArray {

    Node[] nodes;
    boolean[] isUsed;
    int head;

    final int EMPTY=-1;

    public sListUsingArray(int n){
        //N will tell how many nodes in the LL will be there.
        nodes=new Node[n]; // this nodes will allocate memory and tel the used element availability
        isUsed =new boolean[n];
        for (int i = 0; i <n ; i++) {
            nodes[i]=new Node();
            isUsed[i]=false;
        }

        head=EMPTY;

    }


    private int getFreeNdde(){
        //tell the position of first free node looking at isUsed boolean array

        for (int i = 0; i <isUsed.length ; i++) {
            if (isUsed[i]==false){
                isUsed[i]=true;
                return i;
            }
        }
        return EMPTY;
    }

    public void addAtFront(int element){

        //Make space for new element
        int newNode=getFreeNdde();

        //store element in newNode's data;
        nodes[newNode].data=element;

        //set newNodes next to head
        nodes[newNode].next=head;

        //set head to Newnode.
        head=newNode;

    }

    public void print(){

        // set current to first node.

        int current=head;
        while (current!=EMPTY){
            System.out.println(nodes[current].data);
            // set current to current nodes next
            current=nodes[current].next;
        }

    }



}
