import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    OriginCalculator originCalculator = new OriginCalculator();
    NewCalculator newCalculator = new NewCalculator();

    System.out.println("origin : " + originCalculator.calcSum("test.txt"));
    System.out.println("new : " + newCalculator.calcSum("test.txt"));
  }
}
