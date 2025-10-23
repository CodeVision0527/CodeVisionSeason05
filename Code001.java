# CodeVision001
#코드비전 첫번째 실습 교안입니다
#코드비전 첫번째 코딩 스터디 내용

import java.util.Scanner;

public class CodeVisionPromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printBanner();
        printStudyDetails();

        System.out.print("\n스터디에 참여하고 싶으신가요? (yes/no): ");
        String input = scanner.nextLine().trim().toLowerCase();

        if (input.equals("yes")) {
            System.out.print("이름을 입력해주세요: ");
            String name = scanner.nextLine();
            System.out.println("환영합니다, " + name + "님! CodeVision 스터디에서 곧 뵙겠습니다 😊");
        } else {
            System.out.println("괜찮습니다! 다음에 또 관심 있으시면 언제든지 연락주세요.");
        }

        scanner.close();
    }

    private static void printBanner() {
        System.out.println("=======================================");
        System.out.println("       👨‍💻 CodeVision 코딩 스터디 👩‍💻");
        System.out.println("=======================================");
    }

    private static void printStudyDetails() {
        System.out.println("\n🔥 함께 성장하는 개발자 커뮤니티, CodeVision!");
        System.out.println("✅ 대상: 모든 수준의 개발자 (초보 ~ 고급)");
        System.out.println("✅ 언어: Java, Python, JavaScript 등 자유롭게");
        System.out.println("✅ 일정: 매주 수요일 오후 8시 (온라인 진행)");
        System.out.println("✅ 주요 활동: 알고리즘 문제풀이 / 프로젝트 협업 / 코드 리뷰");
        System.out.println("✅ 참여 방법: 지금 신청하고 슬랙 초대받기!");
    }
}
