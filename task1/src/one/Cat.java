package one;

public class Cat {
    String Run;
    String Jump;

    public static void main(String[] args) {
        Cat Oreo = new Cat();
        Oreo.Jump = "Прыгает";
        Oreo.Run = "Бегает";
        System.out.println("Кот " + Oreo.Run + " и ещё " + Oreo.Jump);
    }
}
