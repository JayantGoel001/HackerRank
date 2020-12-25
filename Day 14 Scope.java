
     public Difference(int e[])
     {
         elements=e;
     }
     public void computeDifference()
     {
         int len=elements.length;
         int small=999999;
         int large=-999999;
         for(int i=0;i<len;i++)
         {
             if(small>elements[i])
             {
                 small=elements[i];
             }
             if(large<elements[i])
             {
                 large=elements[i];
             }
         }
         maximumDifference=large-small;
     }
	// Add your code here

