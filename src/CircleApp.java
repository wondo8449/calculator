import java.util.Scanner;

public class CircleApp {

    // 원의 넓이를 구할 작업을 해줄 메서드 return 할 값이 없기 때문에 void이고
    // 인스턴스 변수를 사용하지 않기 때문에 메인 메서드에서 인스턴스화를 하지 않고
    // 바로 사용하기 위하여 static으로 선언을 해준다
    public static void start() throws Exception {

        // CircleParser를 사용해야해서 인스턴스화를 해준다
        CircleParser circleParser = new CircleParser();
        // Scanner를 사용해야해서 인스턴스화를 해준다
        Scanner sc = new Scanner(System.in);

        System.out.print("원의 반지름을 입력해주세요 : ");
        // int 값으로 입력을 받아 변수에 담아준다
        int Input = sc.nextInt();

        // Input을 매개변수로 전달하여 circleParser의 parseNumber 메서드를 실행해준다
        circleParser.parseNumber(Input);

        // circleParser.excutecalculate()의 값(double)을 받아와서 출력해준다
        System.out.println("결과 : " + circleParser.excutecalculate());

        System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회) : ");
        // String 값으로 입력을 받아 변수에 담아준다
        String inquiry = sc.next();

        // inquiry에 들어온 값이 'inquiry'와 같다면
        if(inquiry.equals("inquiry")) {
            // circleParser의 결과를 출력하는 메서드인 inquiryResults()를 실행해준다
            System.out.println(circleParser.inquiryResults());
        }
    }
}
