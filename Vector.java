import java.util.ArrayList;
import java.util.List;

public class Vector{
    private List<Integer> vectorList = new ArrayList<Integer>();

    public Vector(String string)
    {
        stringToVector(string);
    }

    public void stringToVector(String string) 
    {
        String[] stringArray = string.split(",");
        for(String element : stringArray){
            if(element.matches( "\\d+")){
                vectorList.add(Integer.parseInt(element));
            }
        }
    }

    public int returnLength(){
        return vectorList.size();
    }

    public boolean isEqualLength(Vector secondVector){
        return this.returnLength() == secondVector.returnLength();
    }

    public static void main(String[] args) {
        String exampleString = "2,3,5,6,$%,7a,8";
        Vector vector = new Vector(exampleString);
        System.out.println(vector.vectorList);
    }
}