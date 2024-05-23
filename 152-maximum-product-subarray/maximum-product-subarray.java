class Solution {
    public int maxProduct(int[] a) {
         int curr_prduct=1;
    int maxProduct=Integer.MIN_VALUE;
    for(int i=0;i<a.length;i++){
        if(curr_prduct==0) curr_prduct=1;
        
        curr_prduct =curr_prduct*a[i];
        maxProduct=Math.max(curr_prduct,maxProduct);
    }
    curr_prduct=1;
    for(int i=a.length-1;i>=0;i--){
        if(curr_prduct==0) curr_prduct=1;
        curr_prduct =curr_prduct*a[i];
        maxProduct=Math.max(curr_prduct,maxProduct);
    }

return maxProduct;
    }
}