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