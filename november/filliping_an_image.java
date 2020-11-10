class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int i=0;i<A.length; i++) {
            int count = 0;
            // int length = A[i].length
            while(count != A[i].length/2){
                swap(A[i], count);
                count +=1;
            }
            if(A[i].length%2 == 1){
                A[i][count] = A[i][count]^1; 
            }
        }
        return A;
        
        
    }
    public void swap(int[] arr, int count){
        int length = arr.length;
        int temp = arr[count]^1;
        arr[count] = arr[length-1-count]^1;
        arr[length-1-count] = temp;
    }
}