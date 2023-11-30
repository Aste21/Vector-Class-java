import java.util.ArrayList;

public class DifferentVectorsLengthsException  extends Exception{
    private ArrayList<Integer> vectorLengths;
    
    public DifferentVectorsLengthsException(){};

    public DifferentVectorsLengthsException(String errorMessage)
    {
        super(errorMessage);
    }

    public DifferentVectorsLengthsException(String errorMessage, ArrayList<Integer> vectorLengthsNew)
    {
        super(errorMessage);
        vectorLengths = vectorLengthsNew;
    }

    public ArrayList<Integer> getVectorLenghts()
    {
        return vectorLengths;
    }
}
