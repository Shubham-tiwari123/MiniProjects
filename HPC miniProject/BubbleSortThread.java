
import java.util.LinkedList;


class BubbleSortParallel extends Thread{
    int arr[];
    public BubbleSortParallel(int array[]) {
        arr = array;
    }
    
    @Override
    public void run(){
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
public class BubbleSortThread {

    static int arr[];
    static int arr3[];
    public BubbleSortThread() {
        arr = new int[10];
    }
    
    public void bubbleSortParallel(int n1, int n2, int n3,int n4, int n5,int n6, int n7,
            int n8,int n9,int n10) throws InterruptedException{
        arr[0]=n1;
        arr[1]=n2;
        arr[2]=n3;
        arr[3]=n4;
        arr[4]=n5;
        arr[5]=n6;
        arr[6]=n7;
        arr[7]=n8;
        arr[8]=n9;
        arr[9]=n10;
        
        int len = arr.length/2;
        System.out.println("len:-"+len);
        int arr1[] = new int[len];
        int arr2[] = new int[arr.length-len];
        for(int i=0;i<len;i++)
            arr1[i] = arr[i];
        for(int i=len,j=0;i<arr.length;i++,j++)
            arr2[j] = arr[i];
        BubbleSortParallel bs = new BubbleSortParallel(arr1);
        BubbleSortParallel bs1 = new BubbleSortParallel(arr2);
        bs.start();
        bs1.start();
        bs1.join();
        
        System.out.print("\nSorted array1:-\n");
        for(int i=0;i<len;i++)
            System.out.print(arr1[i]+" ");
        System.out.print("\nSorted array2:-\n");
        for(int i=0;i<arr2.length;i++)
            System.out.print(arr2[i]+" ");
        mergeTwoArr(arr1, arr2, arr.length);
    }
    
    static void mergeTwoArr(int arr1[],int arr2[],int n){
        int len1= arr1.length;
        int len2= arr2.length;
        arr3 = new int[n];
        int i=0,j=0,k=0;
        
        while(i<len1 && j<len2){
            if (arr1[i] < arr2[j]) 
                arr3[k++] = arr1[i++]; 
            else
                arr3[k++] = arr2[j++]; 
        }
        while (i < len1) 
            arr3[k++] = arr1[i++]; 
        while (j < len2) 
            arr3[k++] = arr2[j++]; 
        
        System.out.print("\nSorted array after merge:-\n");
        for(i=0;i<n;i++)
            System.out.print(arr3[i]+" ");
    }
    
    public LinkedList getArray(){
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0;i<arr.length;i++)
            list.add(arr3[i]);
        return list;
    }
}
