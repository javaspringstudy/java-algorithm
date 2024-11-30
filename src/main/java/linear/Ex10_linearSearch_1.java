package linear;

//선형검색, 순차검색 - 시간복잡도 O(n)
//정렬되지 않은 배열에서 검색할 때 사용하는 유일한 방법
//데이터가 작고 간단할 때 유용하며, 빠르게 구현할 수 있는 장점
//배열에서 값이 '둘리'인 원소의 인덱스 추출
public class Ex10_linearSearch_1 {
    public int srch(String[] friends, String name) {

        int i = 0;
        while(true){
            if(i==friends.length) return -1;//종료조건1 - 검색실패
            if(friends[i].equals(name)) return i;//종료조건2 - 검색성공
            i++;
        }

    }
}
