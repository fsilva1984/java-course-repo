Herança e composição são dois dos pilares fundamentais da programação orientada a objetos (POO) em Java. Ambas são formas de reutilizar código e estabelecer relações entre classes, mas fazem isso de maneiras diferentes. Vamos explorar cada uma delas:

### 1. **Herança**

A herança é um mecanismo que permite a criação de uma nova classe a partir de uma classe existente. A classe nova (chamada de **subclasse** ou **classe filha**) herda as propriedades e comportamentos (métodos) da classe existente (chamada de **superclasse** ou **classe pai**).

#### Características:

-   **Reusabilidade:** Permite reutilizar o código da superclasse na subclasse.
-   **Extensão:** A subclasse pode adicionar novos métodos ou modificar os métodos existentes da superclasse.
-   **Tipo de relacionamento:** A herança estabelece um relacionamento "é um" entre a subclasse e a superclasse. Por exemplo, uma classe `Cachorro` é um tipo de `Animal`.

#### Sintaxe:

Em Java, a herança é definida usando a palavra-chave `extends`.

```java
// Superclasse
class Animal {
    void fazerSom() {
        System.out.println("Som do animal");
    }
}

// Subclasse
class Cachorro extends Animal {
    @Override
    void fazerSom() {
        System.out.println("Latido");
    }
}

```

#### Vantagens da Herança:

-   Facilita a reutilização de código.
-   Permite uma hierarquia clara de classes.

#### Desvantagens da Herança:

-   A herança pode resultar em uma forte dependência entre classes, dificultando a manutenção.
-   Pode levar a uma arquitetura rígida, onde a modificação de uma superclasse afeta todas as subclasses.

### 2. **Composição**

A composição é um tipo de relacionamento entre objetos em que uma classe possui referências a objetos de outras classes como parte de seu comportamento. Ao contrário da herança, que expressa um relacionamento "é um", a composição expressa um relacionamento "tem um" ou "possui".

#### Características:

-   **Reusabilidade:** As classes podem reutilizar funcionalidades de outras classes sem depender diretamente da herança.
-   **Flexibilidade:** A composição tende a ser mais flexível do que a herança, pois as classes podem ser combinadas de maneiras variadas.
-   **Menos acoplamento:** A composição tende a ter um acoplamento menor entre as classes, facilitando a manutenção e modificações.

#### Sintaxe:

Na composição, em vez de estender uma classe, uma classe possui uma instância de outra classe como atributo.

```java
// Classe Motor
class Motor {
    void ligar() {
        System.out.println("Motor ligado");
    }
}

// Classe Carro
class Carro {
    private Motor motor;

    public Carro() {
        this.motor = new Motor(); // Composição: Carro "tem um" Motor
    }

    void ligarCarro() {
        motor.ligar();
        System.out.println("Carro ligado");
    }
}

```

#### Vantagens da Composição:

-   Menor acoplamento entre as classes.
-   Mais flexível, pois você pode mudar o comportamento de uma classe substituindo o objeto composto.
-   Facilita a manutenção e evolução do sistema.

#### Desvantagens da Composição:

-   Pode exigir mais código do que a herança, pois é necessário delegar comportamentos para os objetos compostos.
-   Requer a criação de instâncias de objetos e o gerenciamento de suas interações.

### **Diferenças entre Herança e Composição:**

-   **Herança** é um relacionamento "é um", enquanto **composição** é um relacionamento "tem um".
-   A herança estabelece uma dependência mais forte entre as classes, o que pode tornar o código mais difícil de manter. A composição tende a ser mais flexível e menos propensa a problemas de acoplamento.
-   Na herança, a subclasse herda diretamente os comportamentos da superclasse, enquanto na composição, a classe delega responsabilidades para objetos de outras classes.

### **Quando usar cada uma:**

-   **Herança:** Use herança quando houver uma clara relação "é um" e você quiser reutilizar e estender funcionalidades de uma classe base.
-   **Composição:** Use composição quando houver um relacionamento "tem um" e você quiser maior flexibilidade e menor acoplamento.

### Exemplo comparativo:

#### Usando Herança:

```java
class Animal {
    void fazerSom() {
        System.out.println("Som do animal");
    }
}

class Cachorro extends Animal {
    void fazerSom() {
        System.out.println("Latido");
    }
}

```

#### Usando Composição:

```java
class Som {
    void emitirSom() {
        System.out.println("Som emitido");
    }
}

class Cachorro {
    private Som som;

    public Cachorro() {
        som = new Som();  // Composição: Cachorro "tem um" Som
    }

    void fazerSom() {
        som.emitirSom();
        System.out.println("Latido");
    }
}

```

Em resumo, **herança** e **composição** são dois métodos poderosos para modelar relacionamentos entre classes, e a escolha entre um e outro depende das necessidades e da flexibilidade desejada no design do seu sistema.
