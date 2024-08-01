public class SearchIniRange {
    public static void main(String[] args) {
    int[] arr={1,2,3,4,5,6,7,8,9};
    int target=2;
    System.out.println(linearSearch(arr, target, 1 ,4));

    }
    //search in array
    static int linearSearch(int[] arr,int target, int start, int end){
        if(arr.length==0){
            return -1;
        }
        for (int i=start; i<=end; i++){
            int element=arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }

}
