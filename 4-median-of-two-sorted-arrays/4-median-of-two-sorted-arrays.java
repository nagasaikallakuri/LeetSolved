class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int[] temp = new int[nums1.length+nums2.length];
        double res;
        for(int i=0,j=0,k=0;i<temp.length;i++){
            if(j==nums1.length){
                temp[i]=nums2[k++];
            }else if(k==nums2.length){
                temp[i]=nums1[j++];
            }
            else{
                if(nums1[j]<=nums2[k])
                    temp[i]=nums1[j++];
                else
                    temp[i]=nums2[k++];
            }  
        }
        if(temp.length%2==0)
            res=(double)(temp[temp.length/2]+temp[(temp.length/2)-1])/2;
        else
            res=temp[(temp.length-1)/2];
      return res;      
    }
}