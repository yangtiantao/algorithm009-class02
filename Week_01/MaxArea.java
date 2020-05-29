// class Solution {
//     public int maxArea(int[] height) {
//         int max = 0;
//         for (int i=0;i<height.length-1;++i){
//             for (int j=i+1;j<height.length;++j){
//                 int area = (j-i) * Math.min(height[i],height[j]);
//                 max = Math.max(max,area);
//             }
//         }
//         return max;
//     }
// }

class MaxArea {
    public int maxArea(int[] a) {
        int max = 0;
        for(int i=0,j=a.length-1;i<j;){
            int height = a[i] < a[j] ? a[i++]:a[j--];
            max = Math.max((j-i+1)*height,max);
        }
        return max;
    }
}