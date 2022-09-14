package pacotes;

public class Loops {
  public void test() {

    // 1 2 3 4 5 ...

    int repeticoes = 10;

    for (int i = 1; i <= repeticoes; i++) {
      System.out.println(i);
    }

    for (int i = 1; i <= repeticoes; i += 2) {
      System.out.println(i);
    }

    for (int i = 1; i <= repeticoes; i++) {
      System.out.println("");
      for (int j = 1; j <= repeticoes; j++) {
        System.out.println(i + " * " + j + " = " + j * i);
      }
    }

  }
}
