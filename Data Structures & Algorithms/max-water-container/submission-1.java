class Solution {
    public int maxArea(int[] heights) {
        int area = 0;
        int left = 0;
        int right = heights.length - 1;
        while(left < right)
        {
            if(heights[left] <= heights[right])
            {
                area = Math.max(area, heights[left] * (right - left));
                left++;
            }
            else
            {
                area = Math.max(area, heights[right] * (right - left));
                right--;
            }

        }
        return area;
        
    }
}
