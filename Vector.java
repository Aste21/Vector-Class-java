import java.util.ArrayList;
import java.util.List;

public class Vector {
    private List<Integer> intList = new ArrayList<Integer>();

    public Vector() {
    }

    public Vector(String string) {
        stringToVector(string);
    }

    public void appendElement(int value) {
        intList.add(value);
    }

    public void stringToVector(String string) {
        String[] stringArray = string.split(",");
        for (String element : stringArray) {
            if (element.matches("\\d+")) {
                intList.add(Integer.parseInt(element));
            }
        }
    }

    public String vectorIntoString() {
        String result = "";
        for (int i = 0; i < intList.size(); i++) {
            if (i < intList.size() - 1) {
                result += (Integer.toString(intList.get(i)) + ", ");
            } else {
                result += Integer.toString(intList.get(i));
            }

        }
        return result;
    }

    public int returnLength() {
        return intList.size();
    }

    public boolean isEqualLength(Vector secondVector) {
        return this.returnLength() == secondVector.returnLength();
    }

    public List<Integer> getIntList() {
        return intList;
    }
}