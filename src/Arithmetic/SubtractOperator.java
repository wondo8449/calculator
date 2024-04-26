package Arithmetic;

public class SubtractOperator extends AbstractOperation {
    // AbstractOperation에 있는 operate 메서드를 Override 해준다
    @Override
    public double operate(int firstNumber, int secondNumber) {
        // 결과를 담을 변수를 지역변수로 선언
        double result = 0.0;

        // 연산 결과를 만들어둔 변수에 담기(여기서 double로 자동 형변환)
        result = firstNumber - secondNumber;

        // 담은 결과값을 리턴
        return result;
    }
}
