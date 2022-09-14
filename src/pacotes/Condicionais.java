package pacotes;

public class Condicionais {
  public void test() {

    int nota = -1;
    String graduacao;

    // nota >= 70 -> aprovado

    if (nota >= 70) {
      System.out.println("Aluno aprovado: " + nota);
    } else {
      System.out.println("Aluno reprovado: " + nota);
    }

    // A 80 B 70 C 60 D 0

    if (nota >= 80) {
      graduacao = "A";
    } else if (nota < 80 && nota >= 70) {
      graduacao = "B";
    } else if (nota < 70 && nota >= 60) {
      graduacao = "C";
    } else if (nota < 60 && nota >= 0) {
      graduacao = "D";
    } else {
      graduacao = "";
    }

    switch (graduacao) {
      case "A":
      case "B":
        System.out.println("Aluno aprovado: " + graduacao);
        break;
      case "C":
      case "D":
        System.out.println("Aluno reprovado: " + graduacao);
        break;
      default:
        System.out.println("Graduação inválida");
    }

  }
}
