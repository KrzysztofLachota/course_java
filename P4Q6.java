public class P4Q6 {

    public static int findRange(int[] intArray) {
        int size = intArray.length;
        if(size==0) return -1;
        int min = intArray[0];
        int max = intArray[0];
        for(int i=1; i<size; i++) {
            if(intArray[i]>max) max=intArray[i];
            if(intArray[i]<min) min=intArray[i];
        }
        return(max-min);

    }
    public static void main(String[] args) {
        int [] myIntArray = {1, 0, 2, 3, -1, 2};
        System.out.println(findRange(myIntArray));
    }
}
