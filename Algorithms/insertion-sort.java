 static void insertion_sort(int li[], int n) 
    { 
        if (n <= 1)                            
        {
            return; 
        }

        insertion_sort( li, n-1 );       
       
        int last = li[n-1];                        
        int j = n-2;                               
       
        while (j >= 0 && li[j] > last)               
        { 
            li[j+1] = li[j];        
            j--; 
        } 
        li[j+1] = last;                   
    } 