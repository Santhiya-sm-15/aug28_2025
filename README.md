# aug28_2025
The problem that I solved today

Given a binary array arr[] containing only 0s and 1s and an integer k, you are allowed to flip at most k 0s to 1s. Find the maximum number of consecutive 1's that can be obtained in the array after performing the operation at most k times.

Code:
class Solution {
    public int maxOnes(int arr[], int k) {
        int n=arr.length;
        int zero=0;
        int l=0,r=0;
        int max=0;
        while(r<n)
        {
            if(arr[r]==0)
                zero++;
            while(zero>k)
            {
                if(arr[l]==0)
                    zero--;
                l++;
            }
            if(l!=r)
                max=Math.max(max,r-l+1);
            else
                max=Math.max(max,1);
            r++;
        }
        return max;
    }
}
