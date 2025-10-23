import java.util.Scanner; 

public class BasicIOAndTypes {
    public static void main(String[] args) {

        
        System.out.println("=== Java 기초: 입출력과 자료형 ===");
        System.out.println("Hello, CodeVision 스터디!");

        
        int number = 10;            
        double pi = 3.14159;        
        char grade = 'A';          
        boolean isJavaFun = true;   

        
        System.out.println("\n[기본 자료형 출력]");
        System.out.println("정수형 변수 number: " + number);
        System.out.println("실수형 변수 pi: " + pi);
        System.out.println("문자형 변수 grade: " + grade);
        System.out.println("bool형 변수 isJavaFun: " + isJavaFun);

        
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n이름을 입력하세요: ");
        String name = scanner.nextLine(); 

        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt(); 

      
        System.out.println("\n[입력 결과]");
        System.out.println("안녕하세요, " + name + "님!");
        System.out.println("당신의 나이는 " + age + "세 입니다.");

        scanner.close();
    }
}
