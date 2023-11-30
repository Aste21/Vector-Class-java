import java.util.ArrayList;
import java.util.List;

public class VectorList {
    private ArrayList<Vector> vectorList;
    private ArrayList<Integer> lengthList;

    public VectorList()
    {
        vectorList = new ArrayList<Vector>();
        lengthList = new ArrayList<Integer>();
    }

    public Vector addVectors() throws DifferentVectorsLengthsException {
        if (!areAllVectorsTheSameLength()) {
            throw new DifferentVectorsLengthsException("The vectors have different lengths.", lengthList);
        }
        Vector result = new Vector();
        int element;
        for (int i = 0; i < lengthList.get(0); i++) {
            element = 0;
            for (int j = 0; j < vectorList.size(); j++) {
                element += vectorList.get(j).getIntList().get(i);
            }
            result.appendElement(element);
        }
        return result;
    }

    public void appendVector(Vector vector)
    {
        vectorList.add(vector);
    }

    public void generateLengthList() {
        for (int i = 0; i < vectorList.size(); i++) {
            lengthList.add(vectorList.get(i).returnLength());
        }
    }

    public void stringListToVectorList(List<String> stringList)
    {   
        for(String string : stringList)
        {
            Vector vector = new Vector();
            vector.stringToVector(string);
            this.appendVector(vector);
        }
        this.generateLengthList();
    }

    public Boolean areAllVectorsTheSameLength() {
        int firstElement = lengthList.get(0);
        for (int i = 1; i < lengthList.size(); i++) {
            if (firstElement != lengthList.get(i)) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Vector> getVectorList() {
        return vectorList;
    }

    public ArrayList<Integer> getLengthList() {
        return lengthList;
    }
}
