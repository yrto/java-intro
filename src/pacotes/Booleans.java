package pacotes;

public class Booleans {
  public void test() {

    boolean fimDeSemana = true;
    boolean fazendoSol = true;

    boolean vamosAPraia = fimDeSemana && fazendoSol;

    // tabela verdade

    // operador && (AND)
    // true && true = true
    // true && false = false
    // false && true = false
    // false && false = false

    // operador || (OR)
    // true && true = true
    // true && false = true
    // false && true = true
    // false && false = false

    System.out.println(vamosAPraia);

    // operador ? : (ternário)

    String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";

    System.out.println(mensagem);

  }
}
