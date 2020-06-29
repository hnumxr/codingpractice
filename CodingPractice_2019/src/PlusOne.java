import java.util.ArrayList;

public class PlusOne {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        ArrayList<Integer> resultArray = new ArrayList<Integer>();
        int val = 0;
        for (int i = A.size(); i > 0; i--){
            val += A.get(i-1) * Math.pow(10, A.size()-i);
        }
        val++;
        int indexVal;
        do{
                indexVal = val % 10;
                val = val / 10;
                resultArray.add(0, indexVal);
        }while (val>=1);
        return resultArray;
    }
}
