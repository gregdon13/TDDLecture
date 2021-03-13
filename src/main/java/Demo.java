import java.util.Arrays;

public class Demo {

    public String[] sortStrArr(String[] strArr) {
        boolean redo = true;
        while (redo) {
            redo = false;
            for (int i = 0; i < strArr.length - 1; i++) {
                if (strArr[i] != null && strArr[i+1] != null) {
                    if (strArr[i].length() > strArr[i + 1].length()) {
                        strArr = swapIndex(strArr, i, i+1);
                        redo = true;
                    } else if (strArr[i].compareTo(strArr[i + 1]) > 0 && strArr[i].length() == strArr[i + 1].length()) {
                        strArr = swapIndex(strArr, i, i+1);
                        redo = true;
                    }
                } else if (strArr[i] == null) {
                    strArr = swapIndex(strArr, i, i+1);
                    redo = true;
                }
            }
        }
        return strArr;
    }

    public String[] swapIndex(String[] strArr, int firstIndex, int secondIndex) {
        String temp = strArr[firstIndex];
        strArr[firstIndex] = strArr[secondIndex];
        strArr[secondIndex] = temp;
        return strArr;
    }

    public Boolean needToSwap(String one, String two) {
            if (one == null) {
                return true;
            } else if (one.compareTo(two) > 0 && one.length() == two.length()) {
                return true;
            } else if (one.length() > two.length()) {
                return true;
            } else {
                return false;
            }
    }
}
