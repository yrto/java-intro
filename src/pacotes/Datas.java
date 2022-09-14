package pacotes;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Datas {
  public void test() {

    // Olá, {nome}. Hoje é {dia-da-semana}, BOM DIA!

    String nome = "Ayrton";

    // String nomeOutro = "ayrton";

    // System.out.println(nome.toUpperCase());
    // System.out.println(nome.toLowerCase());
    // System.out.println(nome.length());
    // System.out.println(nome.equals(nomeOutro));
    // System.out.println(nome.equalsIgnoreCase(nomeOutro));

    // ISO 8601

    LocalDateTime agora = LocalDateTime.now();
    LocalDate hoje = LocalDate.now();
    Locale brasil = new Locale("pt", "BR");

    String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);

    // horário

    String saudacao;
    int horario = agora.getHour();

    if (horario < 24 && horario >= 18) {
      saudacao = "boa noite";
    } else if (horario < 18 && horario >= 12) {
      saudacao = "boa tarde";
    } else if (horario < 12 && horario >= 0) {
      saudacao = "bom dia";
    } else {
      saudacao = "ERRO";
    }

    // out

    System.out.println(
        "Olá, " + nome + ". Hoje é " + diaSemana + ". " + saudacao.toUpperCase() + "!");

    System.out.printf(
        "Olá, %s. Hoje é %s. %s!%n",
        nome, diaSemana, saudacao.toUpperCase());

  }
}
