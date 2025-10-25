public class CodeVisionIntroAnimation {
    public static void main(String[] args) {
        String[][] intro = {
            {"<", "CodeVision", ">"},
            {"우리의", "비전은", "모두가 코딩을 쉽게 접하는 것!"},
            {"함께", "공부하고", "성장하는", "개발자 스터디"},
            {"Java", "Python", "Web", "Game", "다양한 분야를 함께 공부합니다."},
            {"재미있고", "간단하게", "함께", "비전을", "실현해요!"}
        };

        clearConsole();

        System.out.println("==========================================");
        for (int i = 0; i < intro.length; i++) {
            for (int j = 0; j < intro[i].length; j++) {
                System.out.print(intro[i][j] + " ");
                delay(500);
            }
            System.out.println();
            delay(500);
        }
        System.out.println("==========================================");

        delay(500);
        System.out.println(" 함께 성장하고 싶은 분들을 기다립니다! ");
        delay(500);
        System.out.println("==========================================");
    }

    public static void delay(long milliseconds) {
        try {
            Thread.sleep(milliseconds); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void clearConsole() {
        String os = System.getProperty("os.name").toLowerCase();
        try {
            if (os.contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
