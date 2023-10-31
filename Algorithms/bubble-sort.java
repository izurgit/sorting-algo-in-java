static void bubbleSort(int li[], int n)
    {                                       
        if (n == 1)                     
        {
            return;
        }

        for (int i=0; i<n-1; i++) 
        {     
            if (li[i] > li[i+1])      
            {                          
                int temp = li[i];
                li[i] = li[i+1];
                li[i+1] = temp;
            }
        }
            
        bubbleSort(li, n-1);          
    }