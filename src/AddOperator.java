public class AddOperator {
    // 연산을 위해 두 실수를 매개변수로 받아오고 결과값을 double로 리턴하는 메서드 생성
    public double operate(double firstNumber, double secondNumber) {
        // 결과를 담을 변수를 지역변수로 선언
        double result = 0.0;

        // 연산 결과를 만들어둔 변수에 담기
        result = firstNumber + secondNumber;

        // 담은 결과값을 리턴
        return result;
    }
}
