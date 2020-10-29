package samAlly;

public class Result {
    
    
    public Result()
    {
        super();
    }
    
    public int minNum(int samDaily, int allyDaily, int difference)
    {
        int samTot;
        int allyTot;
        for (int i = 0; i < 1000; i++)
        {
            samTot = samDaily * i;
            allyTot = allyDaily * i;
            if (allyTot > (samTot + difference))
            {
                return i;
            }
        }
        return -1;
    }

}
