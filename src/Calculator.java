import java.util.ArrayList;
import java.util.List;

public class Calculator {

    // 결과 값을 담아 리턴할 List 객체를 외부에서 접근할 수 없도록 private 생성
    private List<Integer> results;
    // 결과 값을 담아 리턴할 List 객체를 외부에서 접근할 수 없도록 private 생성
    private List<Double> areas;

    // 원주율은 바꾸지 않는 수이기 때문에 static final로 선언해주어서
    // 상수로써의 역할을 하게 해준다
    static final double RATIO = 3.14;

    // 생성자를 통하여 results가 초기화되어 생성되도록 설정
    public Calculator() {
        results = new ArrayList<>();
        areas = new ArrayList<>();

    }

    // results의 값을 가져올 수 있는 getter 생성
    public List<Integer> getResults() {
        return results;
    }

    // results의 값을 넣을 수 있는 setter 생성
    public void setResults(List<Integer> results) {
        this.results = results;
    }

    // areas의 값을 가져올 수 있는 getter 생성
    public List<Double> getAreas() { return areas; }

    // areas의 값을 넣을 수 있는 setter 생성
    public void setAreas(List<Double> areas) {
        this.areas = areas;
    }


    // 메인 메소드에서 접근할 수 있도록 접근 제어자는 public으로 설정해주고 return 타입은 계산 결과를
    // List 객체에 담아 리턴해줄 것이기 때문에 List로 설정해준다. 매개변수로는 두 개의 양의 정수,
    // 사칙연산 기호를 각각 받아오도록 설정하여 계산을 담당할 메소드를 만들어준다
    public List<Integer> calculate(int firstNumber, int secondNumber, char symbol){
        // 결과값과 나머지를 담기 위한 변수 생성
        int result = 0, rest = 0;

        // 받아온 매개변수로 switch문 실행
        switch (symbol) {
            // + 일 때의 연산 실행
            case '+':
                result = firstNumber + secondNumber;
                // 연산 결과를 results에 추가
                results.add(result);
                // 연산된 결과를 출력
                System.out.println("result : " + result);
                getResults();
                // 더 이상 switch문을 돌지 않도록 break를 설정
                break;
            // - 일 때의 연산 실행
            case '-':
                result = firstNumber - secondNumber;
                results.add(result);
                System.out.println("result : " + result);
                break;
            // * 일 때의 연산 실행
            case '*':
                result = firstNumber * secondNumber;
                results.add(result);
                System.out.println("result : " + result);
                break;
            // / 일 때의 연산 실행
            case '/':
                // 만약 입력받은 두 번째 정수가 0이 아니라면 try 문 안에 연산 실행
                try {
                    // 나눗셈의 몫을 담아주는 부분
                    result = firstNumber / secondNumber;
                    // 나눗셈의 나머지를 담아주는 부분
                    rest = firstNumber % secondNumber;
                    results.add(result);
                    System.out.println("몫 : " + result);
                    System.out.println("나머지 : " + rest);
                // catch문을 통해 두 번째 정수가 0이라면 Exception을 잡도록 설계
                } catch (ArithmeticException e) {
                    // 만약 입력받은 두 번째 정수가 0이라면 입력될 수 없다는 문구 출력
                    System.out.println("나눗셈에서 두 번째 정수에는 0이 입력될 수 없습니다.");
                }
                break;
            // 사칙연산 기호가 잘못 입력된 경우 출력
            default:
                System.out.println("사칙연산 기호를 확인해주세요.");
        }
        // 연산 결과가 담긴 results를 리턴해준다
        return getResults();
    }

    // 사용자가 삭제를 요청할 시 0번 인덱스를 삭제할 메소드 생성
    public void removeResult() {
        // List 객체의 remove 메소드를 사용하여 0번 인덱스의 값 삭제
        results.remove(0);
    }

    // 사칙연산 결과 값 조회 메서드
    public List<Integer> inquiryResults() {
        return getResults();
    }

    // 원의 넓이를 구하는 메서드, 매개변수로 입력된 원의 반지름을 받아와준다
    public double calculateCircleArea(int radius) {
        // 결과값을 담을 변수 생성
        double result = 0.0;

        // 상수인 RATIO를 가져와서 원의 반지름을 구해 result에 담아준다
        result = radius * radius * RATIO;
        // 나온 결과를 List에 추가해 준다
        areas.add(result);
        // 결과값을 리턴해준다
        return result;
    }

    // 원의 결과 값 조회 메서드
    public List<Double> inquiryCircle() {
        return getAreas();
    }

}
