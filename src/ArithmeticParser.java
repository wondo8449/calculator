import Arithmetic.*;

import java.util.List;
import java.util.regex.Pattern;

public class ArithmeticParser {

    // 사칙연산 기호를 식별해줄 상수를 선언해준다 변하지 않을 값이기 때문에 static final로 선언해준다
    private static final String OPERATION_REG = "[+\\-*%/]";
    // ArithmeticCalculator를 사용해야해서 인스턴스화를 해준다 변하지 않을 값이기 때문에 static final로 선언해준다
    private static final ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();

    // 입력된 양의 정수를 매개변수로 실행되는 메서드이다.
    // 입력된 값이 양의 정수가 아닌 경우 Exception이 발생하게 하기 위하여 throws Exception 써준다
    public ArithmeticParser parseFirstNum(int num1) throws Exception{
        // 받아온 num1이 0보다 작다면
        if(num1 < 0) {
            // 선언해놓은 WrongInputException의 "양의 정수"를 전달하여 오류메세지가 출력되게 한다
            throw new WrongInputException("양의 정수");
        }
        // 0보다 크다면 arithmeticCalculator의 setFirstNumber 메서드를 통하여 num1 값을 넣어준다
        arithmeticCalculator.setFirstNumber(num1);

        // 다음 메서드를 이어서 실행하기 위해 ArithmeticParser를 다시 리턴해준다
        return this;
    }

    // 입력된 양의 정수를 매개변수로 실행되는 메서드이다.
    // 입력된 값이 양의 정수가 아닌 경우 Exception이 발생하게 하기 위하여 throws Exception 써준다
    public ArithmeticParser parseSecondNum(int num2) throws Exception{
        // 받아온 num2가 0보다 작다면
        if(num2 < 0) {
            // 선언해놓은 WrongInputException의 "양의 정수"를 전달하여 오류메세지가 출력되게 한다
            throw new WrongInputException("양의 정수");
        }
        // 0보다 크다면 arithmeticCalculator의 setFirstNumber 메서드를 통하여 num2 값을 넣어준다
        arithmeticCalculator.setSecondNumber(num2);

        // 다음 메서드를 이어서 실행하기 위해 ArithmeticParser를 다시 리턴해준다
        return this;
    }

    // 입력된 문자열을 매개변수로 실행되는 메서드이다.
    // 입력된 값이 양의 정수가 아닌 경우 Exception이 발생하게 하기 위하여 throws Exception 써준다
    public ArithmeticParser parseOperator(String symbol) throws Exception {
        // Pattern.matches를 통하여 입력된 문자열이 + - * % / 에 매칭이 되는지 확인한다
        // !가 붙어있기 때문에 매칭이 되지 않는 문자가 입려되었다면
        if (!Pattern.matches(OPERATION_REG, symbol)) {
            // // 선언해놓은 WrongInputException의 "사칙 연산자"를 전달하여 오류메세지가 출력되게 한다
            throw new WrongInputException("사칙 연산자");
        }
        // 정상적으로 입력된 문자는 switch문을 통해 연산자에 맞는 case가 실행되게 한다
        switch (symbol) {
            // arithmeticCalculator의 setAbstractOperation 메소드를 통하여 연산자에 맞게
            // 실제 연산을 실행할 Class를 생성하여 매개변수로 전달한다
            case "+" -> arithmeticCalculator.setAbstractOperation(new AddOperator());
            case "-" -> arithmeticCalculator.setAbstractOperation(new SubtractOperator());
            case "*" -> arithmeticCalculator.setAbstractOperation(new MultiplyOperator());
            case "/" -> arithmeticCalculator.setAbstractOperation(new DivideOperator());
            case "%" -> arithmeticCalculator.setAbstractOperation(new ModOperator());
        }
        // 다음 메서드를 이어서 실행하기 위해 ArithmeticParser를 다시 리턴해준다
        return this;
    }

    // arithmeticCalculator의 calculate() 메서드로 위에서 입력한 값들을 통하여 계산을 실행한다
    public double excutecalculate() {
        // Calculator에서 상속받은 setResults()에 계산 결과를 매개변수로 전달하여 결과 List의 저장이 되게 해준다
        arithmeticCalculator.setResults(arithmeticCalculator.calculate());
        // 실행한 결과(double)를 리턴해준다
        return arithmeticCalculator.calculate();
    }

    // arithmeticCalculator이 Calculator에서 상속받은 removeResult() 메서드로 저장된 결과를 삭제해준다
    public void removeResult() {
        arithmeticCalculator.removeResult();
    }

    // arithmeticCalculator이 Calculator에서 상속받은 inquiryResults() 메서드로 저장된 결과들(List<Double>)을 불러와준다
    public List<Double> inquiryResults() {
        return arithmeticCalculator.inquiryResults();
    }
}
