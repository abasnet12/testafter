import java.util.ArrayList;

public class multithread {
    public static void main(String ... args)
    {
        ArrayList<Integer> bufferList = new ArrayList<>();
        Buffer currentList = new Buffer(bufferList);



    }
}

public class Buffer{

    
    public synchronized void producer(ArrayList bufferList)
    {
        
        for (int i = 0 ; i < 100 ; i++ )
        {
            bufferList.add()
        }
    }
}