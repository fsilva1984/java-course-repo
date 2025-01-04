<br>

O paradigma de orientação a objetos (OO) é uma abordagem de programação que se baseia no conceito de "objetos", que podem conter dados na forma de campos (geralmente conhecidos como atributos) e códigos na forma de procedimentos (geralmente conhecidos como métodos). Em Java, a orientação a objetos é um dos pilares fundamentais da linguagem, e ela suporta vários conceitos-chave que definem esse paradigma:

1. **Classes e Objetos**:
   - **Classe**: Uma classe é um modelo ou blueprint para criar objetos. Ela define um conjunto de atributos e métodos que os objetos criados a partir dessa classe terão.
   - **Objeto**: Um objeto é uma instância de uma classe. Ele contém dados reais e pode executar métodos definidos na classe.

2. **Encapsulamento**:
   - Encapsulamento é o conceito de esconder os detalhes internos de um objeto e expor apenas o que é necessário. Em Java, isso é feito usando modificadores de acesso como `private`, `protected` e `public`.

3. **Herança**:
   - Herança permite que uma classe (subclasse) herde atributos e métodos de outra classe (superclasse). Isso promove a reutilização de código e a criação de hierarquias de classes.

4. **Polimorfismo**:
   - Polimorfismo permite que métodos em diferentes classes sejam chamados pelo mesmo nome, mas executem diferentes comportamentos. Em Java, isso pode ser alcançado através de sobrecarga de métodos (overloading) e sobrescrita de métodos (overriding).

5. **Abstração**:
   - Abstração é o conceito de esconder a complexidade e mostrar apenas as características essenciais do objeto. Em Java, isso é feito usando classes abstratas e interfaces.

### Exemplos em Java

#### Classe e Objeto
```java
public class Carro {
    // Atributos
    private String marca;
    private String modelo;
    private int ano;

    // Construtor
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Métodos
    public void exibirDetalhes() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Carro
        Carro meuCarro = new Carro("Toyota", "Corolla", 2020);
        meuCarro.exibirDetalhes();
    }
}
```

#### Encapsulamento
```java
public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double quantia) {
        if (quantia > 0) {
            saldo += quantia;
        }
    }

    public void sacar(double quantia) {
        if (quantia > 0 && quantia <= saldo) {
            saldo -= quantia;
        }
    }
}
```

#### Herança
```java
public class Animal {
    public void fazerSom() {
        System.out.println("Algum som genérico");
    }
}

public class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("Au Au");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal meuAnimal = new Animal();
        meuAnimal.fazerSom(); // Algum som genérico

        Cachorro meuCachorro = new Cachorro();
        meuCachorro.fazerSom(); // Au Au
    }
}
```

#### Polimorfismo
```java
public class Main {
    public static void main(String[] args) {
        Animal meuAnimal = new Cachorro();
        meuAnimal.fazerSom(); // Au Au
    }
}
```

#### Abstração
```java
public abstract class Forma {
    public abstract void desenhar();
}

public class Circulo extends Forma {
    @Override
    public void desenhar() {
        System.out.println("Desenhando um círculo");
    }
}

public class Main {
    public static void main(String[] args) {
        Forma forma = new Circulo();
        forma.desenhar(); // Desenhando um círculo
    }
}
```

Esses exemplos ilustram como os conceitos de orientação a objetos são implementados em Java. A orientação a objetos ajuda a organizar o código de maneira mais modular e reutilizável, facilitando a manutenção e a escalabilidade do software.

<br>