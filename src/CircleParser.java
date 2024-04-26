import java.util.List;

public class CircleParser {
    // CircleCalculator를 사용해야해서 인스턴스화를 해준다 변하지 않을 값이기 때문에 static final로 선언해준다
    private static final CircleCalculator circleCalculator = new CircleCalculator();

    // 입력된 원의 반지름을 매개변수로 실행되는 메서드이다.
    // 입력된 값이 양의 정수가 아닌 경우 Exception이 발생하게 하기 위하여 throws Exception 써준다
    public void parseNumber(int radius) throws Exception {
        // 받아온 redius가 0보다 작다면
        if(radius < 0) {
            // 선언해놓은 WrongInputException의 "양의 정수"를 전달하여 오류메세지가 출력되게 한다
            throw new WrongInputException("양의 정수");
        }
        // 0보다 크다면 circleCalculator의 setRadius 메서드를 통하여 radius 값을 넣어준다
        circleCalculator.setRadius(radius);
    }

    // circleCalculator의 calculate() 메서드로 위에서 입력한 값들을 통하여 계산을 실행한다
    public double excutecalculate() {
        // Calculator에서 상속받은 setResults()에 계산 결과를 매개변수로 전달하여 결과 List의 저장이 되게 해준다
        circleCalculator.setResults(circleCalculator.calculate());
        // 실행한 결과(double)를 리턴해준다
        return circleCalculator.calculate();
    }

    // circleCalculator이 Calculator에서 상속받은 inquiryResults() 메서드로 저장된 결과들(List<Double>)을 불러와준다
    public List<Double> inquiryResults() {
        return circleCalculator.inquiryResults();
    }
}
