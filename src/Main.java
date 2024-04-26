import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // 입력을 받기 위한 스캐너 생성
        Scanner sc = new Scanner(System.in);
        // while을 중지시키기 위한 변수 선언
        boolean check = true;

        // check는 true이기 때문에 바로 while문 안으로 들어간다
        while(check) {

            System.out.print("'사칙연산'과 '원의넓이' 중 원하는 계산을 입력하세요 : ");
            // 입력받은 값을 변수에 담아준다
            String msg = sc.next();

            // msg에 들어온 값이 '사칙연산'과 같다면
            if(msg.equals("사칙연산")) {
                // 사칙연산을 수행하는 ArithmeticApp의 start 메서드를 실행해준다
                ArithmeticApp.start();
            // msg에 들어온 값이 '원의넓이'와 같다면
            } else if(msg.equals("원의넓이")) {
                // 원의 지름을 구하는 CircleApp의 start 메서드를 실행해준다
                CircleApp.start();
            } else {
                // 만약 다른 값이 입력되었다면 오류메세지를 출력해준다
                throw new WrongInputException("사칙연산과 원의넓이 중 하나");
            }

            System.out.print("계속 계산하시겠습니까? (exit를 입력하면 종료됩니다) : ");
            // 입력받은 값을 변수에 담아준다
            msg = sc.next();
            // msg에 들어온 값이 'exit'와 같다면
            if(msg.equals("exit")) {
                // check를 false로 만들어서 while문을 빠져나가게 해준다
                check = false;
            }
        }
    }
}