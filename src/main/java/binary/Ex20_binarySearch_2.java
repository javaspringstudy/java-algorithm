package binary;

import java.util.ArrayList;
import java.util.List;

//이진검색, 이분검색 - 시간복잡도 O(log n)
//전제조건 : 이미 오름차순 or 내림차순으로 sort 된 배열
public class Ex20_binarySearch_2 {

    /*
        이진검색

        1. 중복값이 있는 숫자배열에서 맨처음에 있는 원소의 인덱스 검색
        2. 시작인덱스 startIdx, 끝인덱스 endIdx
        3. 중간인덱스 midIdx

        4. 종료조건1 - 검색성공 : 이진검색으로 찾은후 그 이전 존재하는 원소들를 순차적으로 스캔하여 list에 저장후 맨마지막에 저장된 인덱스값을 리턴
        5. 종료조건2 - 검색실패 : -1 리턴
     */

    public int srch(int[] nums, int value) {

        //찾으려고 하는 값과 일치하는 원소의 인덱스를 저장할 배열
        List<Integer> list = new ArrayList<>();

        int startIdx = 0;
        int endIdx = nums.length;

        //값이 같은 원소의 인덱스를 모두 arrIdx에 저장
        do{
            int midIdx = (startIdx+endIdx)/2;

            if(nums[midIdx]==value){
                list.add(midIdx);

                //이진검색으로 성공했을 때부터 앞쪽으로 하나씩 스캔
                for(int i=midIdx-1;i>0;i--){
                    if(nums[i]==value) list.add(i);
                }

                System.out.println(list.toString());
                //검색성공: 맨 마지막에 저장된 값이 가장 앞쪽에 있는 값
                return list.get(list.size()-1);

            }else if(nums[midIdx]<value){
                startIdx=midIdx+1;
            }else{
                endIdx=midIdx-1;
            }
        }while(startIdx<=endIdx);

        return -1;//검색실패
    }
}
