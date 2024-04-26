// 예외처리를 하기 위하여 만들어둔 클래스
public class WrongInputException extends Exception{
    // 오류 메세지를 출력해준다
    public WrongInputException(String text) {
        super(text + "를 입력해주세요.");
    }
}
