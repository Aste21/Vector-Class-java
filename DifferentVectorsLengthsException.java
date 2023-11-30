import java.util.ArrayList;

public class DifferentVectorsLengthsException  extends Exception{
    private ArrayList<Integer> vectorLengths;
    
    public DifferentVectorsLengthsException(){};

    public DifferentVectorsLengthsException(String errorMessege)
    {
        super(errorMessege);
    }

    public DifferentVectorsLengthsException(String errorMessege, ArrayList<Integer> vectorLengthsNew)
    {
        super(errorMessege);
        vectorLengths = vectorLengthsNew;
    }

    public ArrayList<Integer> getVectorLenghts()
    {
        return vectorLengths;
    }
}
