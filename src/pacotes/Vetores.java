package pacotes;

import java.util.Arrays;

public class Vetores {
  public static void test() {

    // tamanho imutável

    int[] numeros = new int[5];

    numeros[0] = 1;
    numeros[1] = 2;
    numeros[2] = 3;
    numeros[3] = 5;
    numeros[4] = 5;

    System.out.println(numeros);

    for (int i = 0; i < numeros.length; i++) {
      System.out.println(numeros[i]);
    }

    // alternativa

    String[] letras = { "A", "B", "C", "D", "X" };

    for (int i = 0; i < letras.length; i++) {
      System.out.println(letras[i]);
    }

    // array -> string

    System.out.println(Arrays.toString(letras));

  }

  public static void media() {

    int[] numeros = { 9, 10, 12, 25, 2 };

    int maior = numeros[0];
    int menor = numeros[0];
    int soma = 0;

    for (int i = 0; i < numeros.length; i++) {

      if (numeros[i] > maior) {
        maior = numeros[i];
      }
      if (numeros[i] < menor) {
        menor = numeros[i];
      }
      soma += numeros[i];
    }

    int media = soma / numeros.length;

    System.out.println("Maior: " + maior);
    System.out.println("Menor: " + menor);
    System.out.println("Média: " + media);

  }
}
