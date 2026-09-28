import java.util.*;

class Maximum_Perimeter_of_Triangle_from_Array {
    public int maxPerimeter(int[] arr) {
        // code here
        int n = arr.length;
        if(n<3){
            return -1;
        }

        Arrays.sort(arr);
        for(int i=n-1;i>=2;i--)
        {
            if(arr[i]<arr[i-1]+arr[i-2])
            {
                return arr[i]+arr[i-1]+arr[i-2];
            }
        }
        return -1;
    }
}