import java.util.ArrayList;
import java.util.List;

public class ListManager {
    public static List<String> reduceList(List<String> originalList, int newSize) throws NotEnoughElementsException {
        if(newSize > originalList.size())
        {
            throw new NotEnoughElementsException();
        }
        else if (newSize == originalList.size()) {
            return new ArrayList<>(originalList);
        } else {
            return new ArrayList<>(originalList.subList(0, newSize));
        }
    }
}
