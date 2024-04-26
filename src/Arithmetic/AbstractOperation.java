package Arithmetic;

// 실제 연산할 클래스들이 상속받을 추상클래스이다
public abstract class AbstractOperation {
    // 모든 자식들에게 operate가 있어야 하기 때문에 추상 메서드로 선언하여 강제성을 부여한다
    public abstract double operate(int firstNumber, int secondNumber);
}
