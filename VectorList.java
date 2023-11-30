import java.util.ArrayList;

public class VectorList{
    private ArrayList<Vector> vectorList;
    private ArrayList<Integer> lengthList;


    public void generateLengthList()
    {
        for(int i = 0;i < vectorList.size();i++)
        {
            lengthList.add(vectorList.get(i).returnLength());
        }
    }
    
    public ArrayList<Vector> getVectorList() {
        return vectorList;
    }

    public ArrayList<Integer> getLengthList() {
        return lengthList;
    }
}
