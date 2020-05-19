package one;

public class Robot {
    String Run;
    String Jump;

    public static void main(String[] args) {
        Robot Pavel = new Robot();
        Pavel.Jump = "Прыгает";
        Pavel.Run = "Бежит";
        System.out.println(" Робот павел " + Pavel.Jump + " и ещё робот павел " + Pavel.Run);

    }
}
