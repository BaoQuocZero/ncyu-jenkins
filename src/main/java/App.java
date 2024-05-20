public class App {

  public static void main(String[] args) {
    System.out.println("Xin chao");
    GradeConverter converter = new GradeConverter();

    for (int i = 0; i <= 100; i++) {
      System.out.println(i + ";" + converter.convert(i));
    }
  }
}
