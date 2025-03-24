class Sample
{
    double ebill(int sno, int p_units, int units, char code)
    {
        double amount = 0.0;
        int c_units = units - p_units;
        // System.out.println(c_units);
        if(code == 'D' || code == 'd')
        {
            if(c_units <= 50)
            {
                amount = c_units*1;
            }
            else if(c_units <= 60)
            {
                amount = (50*1)+(c_units-50*1.10);
            }
            else
            {
                amount = (50*1)+(10*2)+(c_units-60*3);
            }
        }
        else if(code == 'B' || code == 'b')
        {
            if(c_units <= 50)
            {
                amount = c_units*1;
            }
            else if(c_units <= 60)
            {
                amount = (50*1)+(c_units-50*1.20);
            }
            else
            {
                amount = (50*1)+(10*2)+(c_units-60*3);
            }
        }
        else if(code == 'I' || code == 'i')
        {
            if(c_units <= 50)
            {
                amount = c_units*1;
            }
            else if(c_units <= 60)
            {
                amount = (50*1)+(c_units-50*1.50);
            }
            else
            {
                amount = (50*1)+(10*2)+(c_units-60*3);
            }
        }
        System.out.println(amount);
        return 0;
    }
    public static void main(String args[])
    {
        Sample s = new Sample();
        s.ebill(101,100,150,'D');
        s.ebill(102,220,280,'B');
        s.ebill(103,200,450,'I');
    }
}