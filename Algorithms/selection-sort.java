void selection_sort(int li[]) 
    { 
        int pos;
        int tmp;
        for (int i = 0; i < li.length; i++) 
        { 
            pos = i; 
            for (int j = i+1; j < li.length; j++) 
           {
                if (li[j] < li[pos])
                {
                    pos = j;
                }
            }

            tmp = li[pos];
            li[pos] = li[i]; 
            li[i] = tmp; 
        } 
    } 