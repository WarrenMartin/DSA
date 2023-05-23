public class BinaryTree {

   private BTNode root;
   int count=0;

    public BinaryTree(){
        root=null;
    }


    public void createTree01(){
        BTNode n1=new BTNode(5);
        BTNode n2=new BTNode(1);

        BTNode n3=new BTNode(4);
        BTNode n4=new BTNode(7);

        root=n1;

        n1.leftChild=n2;
        n1.rightChild=n3;
        n2.leftChild=n4;
    }
    public void createTree02(){
        BTNode n1=new BTNode(9);
        BTNode n2=new BTNode(3);
        BTNode n3=new BTNode(4);


        root=n1;

        n1.leftChild=n2;
        n1.rightChild=n3;

    }

    public void swap(){
        BTNode temp=root.leftChild;
        root.leftChild=root.rightChild;
        root.rightChild=temp;
    }

    public void printUsingPreOrder(){
        printUsingPreOrder(root);
    }

    private void printUsingPreOrder(BTNode root) {
        if(root==null){
            return;
        }
        System.out.println(root.data);

        if(root.leftChild!=null){
            swap(); //swap the left node before printing
            printUsingPreOrder(root.leftChild);
            swap(); //swap the left node back
        }if(root.rightChild!=null){
            swap(); // same as above but vv
            printUsingPreOrder(root.rightChild);
            swap();
        }
    }

    private int count(BTNode root) {
        if(root==null){
            return 0;
        } if(root.leftChild==null && root.rightChild==null){
            return count+=1;
        }
        count+=1;
        if(root.leftChild!=null){
            count(root.leftChild);
        }if(root.rightChild!=null){
            count(root.rightChild);
        }
        return count;
    }

    public int count(){
        System.out.print("count is : ");
        return count(root);
    }



}
