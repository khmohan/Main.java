public class Binary {
   public static void main(String[] args){
       int[] nums={1,2,34,5,6,9};
       int target=2;
       int ans=binarysearch(nums,target);
       System.out.println(ans);
   }
   static  int binarysearch(int[] arr, int target){
       int start=0;
       int end=arr.length-1;
       while(start<=end){
           int mid=(start+end)/2;
           if(arr[mid]<target){
               start=mid+1;
           }else if(arr[mid]>target){
               end=mid-1;
           }else{
               return mid;
           }
       }
       return -1;
   }
}
