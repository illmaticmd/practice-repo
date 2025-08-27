public class sample {
    public static void main( String args[] ) {
        
         int[][][] arr = { 
        { {0,1,2}, {2,3,4}, {6,7,1} }, 
        { {6,7, 1}, {8,9, 2}, {9,14, 22} } 
        };
        // accessing single value i.e 0
        System.out.println(arr[0][0][0]);

    // output each element's value by iterating through the array 

        for (int i = 0; i < 2; ++i) 
        { 
            for (int j = 0; j < 3; ++j) 
            { 
                for (int k = 0; k < 2; ++k) 
                { 
                
                    System.out.println("Element at arr[" + i + "][" + j
                        + "][" + k + "] = " + arr[i][j][k]);
            
                } 
            }         
        }          
    }
}