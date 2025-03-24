class Sort{
    public static void main(String args[])
    {
        int a[] = {8,7,4,2,3,1};
        int size = a.length;
        for(int i = 0 ; i < size ; i++)
        {
            for(int j = i+1 ; j < size ; j++)
            {
                if(a[i] > a[j])
                {
                    int temp = 0;
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i = 0 ; i < size ; i++)
        {
            System.out.println("Array:"+a[i]);
        }
    }
}