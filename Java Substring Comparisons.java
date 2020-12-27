

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int len=s.length();
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        int j;
            smallest=s.substring(0,k);
            largest=s.substring(0,k);
            for(j=0;j<len-k;j++)
            {
                String x=s.substring(j,j+k);
                if(x.compareTo(smallest)<0)
                {
                    smallest=x;
                }
            }
            for(j=0;j<len-k;j++)
            {
                String x=s.substring(j,j+k);
                if(x.compareTo(largest)>0)
                {
                    largest=x;
                }
            }
        return smallest + "\n" + largest;
    }

