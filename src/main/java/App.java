public class App {

  public static void main(String[] args) {
    System.out.println("Xin chaoo");
    GradeConverter converter = new GradeConverter();

    for (int i = 0; i < 105; i++) {
      System.out.println(i + ";" + converter.convert(i));
    }
  }
}
