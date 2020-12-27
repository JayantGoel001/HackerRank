

    /**
    *    Method Name: printArray
    *    Print each element of the generic array on a new line. Do not return anything.
    *    @param A generic array
    **/
    
    // Write your code here
    public static <T> void printArray(T[] obj)
    {
        //Integer[] ob=obj.toArray();
        for(T i:obj)
        {
            System.out.println(i);
        }

    }
