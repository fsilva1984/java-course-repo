package edu.basic.constantsVariable;

public class Main {

  public static void main(String[] args) throws Exception {

    // declarando uma variavel
    String name = args[0];

    // declaracao de uma constante
    final String h = "Hello, World!";

    System.out.println(h.replace("World!", name));
  }
}
