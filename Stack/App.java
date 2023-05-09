import java.util.Arrays;

public class App {


    public static void reverseArray(int[] arr,StackIntf s){

        for (int i = 0; i < arr.length; i++) {
            s.push(arr[i]);
        }
        int i=0;
        while(!s.isEmpty()){
           arr[i]=s.pop();
           ++i;
        }

    }

    public static void main(String[] args) {
        int[] arr={1,2,3};

       StackUsingArray stackObj=new StackUsingArray(arr.length);

        System.out.println(Arrays.toString(arr));

        App ab=new App();
        ab.reverseArray(arr, stackObj);

        System.out.println(Arrays.toString(arr));

    

    
    }
    
}
