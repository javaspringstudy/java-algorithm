package comparator;

import java.util.Arrays;
import java.util.Comparator;

public class StrArrComparator {

    public String[] compareArr(String[] strArr){

        class StrComparator implements Comparator<String>{

            //abcd 순으로 문자열배열을 오름차순 정렬
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        }

        Arrays.sort(strArr, new StrComparator());

        return strArr;
    }
}
