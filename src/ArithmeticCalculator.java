import Arithmetic.AbstractOperation;

// 공용으로 쓸 기능을 Calculator에 선언해놓았기 때문에 상속을 받아준다
public class ArithmeticCalculator extends Calculator{

    // 입력되어 저장될 값을 외부에서 변경할 수 없게 private로 선언하여 준다
    private int firstNumber;
    private int secondNumber;

    // 추상클래스인 AbstractOperation을 선언해준다 이로써 AbstractOperation을 상속받아 만들어진
    // 자식 클래스인 AddOperator, DivideOperator 등을 setAbstractOperation의 매개변수로써
    // 넣을 수 있게 된다 모든 자식은 부모타입이기 때문에 가능하다. 입력받은 연사자에 맞춰서
    // Operator 클래스들을 넣어주게 설계를 하면 나중에 다른 연산이 추가되어도 추가하기가 쉬워진다 (개방폐쇄원칙)
    AbstractOperation abstractOperation;

    // firstNumber getter
    public int getFirstNumber() {
        return firstNumber;
    }

    // secondNumber getter
    public int getSecondNumber() {
        return secondNumber;
    }

    // abstractOperation getter
    public AbstractOperation getAbstractOperation() {
        return abstractOperation;
    }

    // firstNumber setter, 받아온 firstNumber를 ArithmeticCalculator의 firstNumber에 저장한다
    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    // secondNumber setter, 받아온 secondNumber를 ArithmeticCalculator의 secondNumber에 저장한다
    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    // abstractOperation setter, 받아온 abstractOperation을 ArithmeticCalculator의 abstractOperation에 저장한다
    public void setAbstractOperation(AbstractOperation abstractOperation) {
        this.abstractOperation = abstractOperation;
    }

    // 사칙연산을 실행하는 메서드, 이미 setter에서 입력된 값들로 실핼하기 때문에 매개변수는 필요없다
    public double calculate() {
        // 결과값을 담을 변수 생성
        double result = 0.0;

        // 실제 연산이 실행되는 부분 이 때 abstractOperation는 추상클래스이기 때문에 연산자에 따라
        // 생성된 구현체에 맞춰서 연산이 실행되게 된다
        result = abstractOperation.operate(this.firstNumber,this.secondNumber);

        // 결과값을 리턴해준다
        return result;
    }
}
