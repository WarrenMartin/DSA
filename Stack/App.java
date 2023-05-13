import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static void reverseArray(int[] arr,StackIntf s){
        for (int i = 0; i <arr.length ; i++) {
            s.push(arr[i]);
        }

        int i=0;
        while (!s.isEmpty()){
            arr[i]=s.pop();
            i++;
        }

    }

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6};

        StackIntf stackobj=new StackUsingArray(arr.length);
        StackIntf stackobj2=new stackUsingList();


        reverseArray(arr,stackobj);
        System.out.println(Arrays.toString(arr));

    }
}
