//선형검색, 순차검색
//정렬되지 않은 배열에서 검색할 때 사용하는 유일한 방법
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
