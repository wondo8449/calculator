import java.util.ArrayList;
import java.util.List;

public class Calculator {

    // 결과 값을 담아 리턴할 List 객체를 외부에서 접근할 수 없도록 private 생성
    private List<Double> results;

    // 생성자를 통하여 results가 초기화되어 생성되도록 설정
    public Calculator() {
        results = new ArrayList<>();
    }

    // results의 값을 가져올 수 있는 getter 생성
    public List<Double> getResults() {
        return results;
    }

    // results의 값을 넣을 수 있는 setter 생성
    public void setResults(double result) {
        results.add(result);
    }

    // 사용자가 삭제를 요청할 시 0번 인덱스를 삭제할 메소드 생성 (자식 클래스들이 사용)
    public void removeResult() {
        // List 객체의 remove 메소드를 사용하여 0번 인덱스의 값 삭제
        results.remove(0);
    }

    // 연산 결과 값 조회 메서드 (자식 클래스들이 사용)
    public List<Double> inquiryResults() {
        return getResults();
    }
}
