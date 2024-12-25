A interface `List` em Java é uma parte fundamental do pacote `java.util` e faz parte do Java Collections Framework. Ela estende a interface `Collection` e representa uma coleção ordenada (também conhecida como sequência) de elementos. A interface `List` permite elementos duplicados e fornece controle posicional sobre os elementos, o que significa que você pode acessar, inserir e remover elementos por seu índice.

### Características Principais da Interface `List`

1. **Ordenação**: Os elementos na lista têm uma ordem específica, e cada elemento tem um índice.
2. **Duplicatas**: A lista permite elementos duplicados.
3. **Acesso Posicional**: Você pode acessar elementos por seu índice.
4. **Operações de Inserção e Remoção**: A lista fornece métodos para inserir e remover elementos em posições específicas.

### Métodos Principais da Interface `List`

Aqui estão alguns dos métodos mais comuns da interface `List`:

- `boolean add(E e)`: Adiciona o elemento especificado ao final da lista.
- `void add(int index, E element)`: Insere o elemento especificado na posição especificada na lista.
- `E get(int index)`: Retorna o elemento na posição especificada na lista.
- `E remove(int index)`: Remove o elemento na posição especificada na lista.
- `boolean remove(Object o)`: Remove a primeira ocorrência do elemento especificado na lista, se estiver presente.
- `E set(int index, E element)`: Substitui o elemento na posição especificada na lista pelo elemento especificado.
- `int size()`: Retorna o número de elementos na lista.
- `boolean isEmpty()`: Retorna `true` se a lista não contiver elementos.
- `boolean contains(Object o)`: Retorna `true` se a lista contiver o elemento especificado.
- `int indexOf(Object o)`: Retorna o índice da primeira ocorrência do elemento especificado na lista, ou `-1` se a lista não contiver o elemento.
- `int lastIndexOf(Object o)`: Retorna o índice da última ocorrência do elemento especificado na lista, ou `-1` se a lista não contiver o elemento.
- `List<E> subList(int fromIndex, int toIndex)`: Retorna uma vista da parte da lista entre os índices especificados.

### Implementações da Interface `List`

A interface `List` tem várias implementações, cada uma com suas próprias características e casos de uso:

1. **ArrayList**:
   - Baseada em array dinâmico.
   - Acesso rápido aos elementos por índice.
   - Adição e remoção de elementos no meio da lista podem ser mais lentas.

2. **LinkedList**:
   - Baseada em lista duplamente encadeada.
   - Adição e remoção rápidas de elementos no meio da lista.
   - Acesso aos elementos por índice pode ser mais lento.

3. **Vector**:
   - Semelhante ao `ArrayList`, mas sincronizado (thread-safe).
   - Pode ser mais lento devido à sobrecarga de sincronização.

4. **Stack**:
   - Subclasse de `Vector` que representa uma pilha LIFO (Last-In-First-Out).
   - Fornece métodos adicionais como `push`, `pop`, e `peek`.

5. **CopyOnWriteArrayList**:
   - Uma implementação thread-safe da interface `List`.
   - Todas as operações de modificação (adicionar, definir e remover) são implementadas fazendo uma cópia do array subjacente.

### Exemplo de Uso da Interface `List`

Aqui está um exemplo que demonstra como usar a interface `List` com a implementação `ArrayList`:

```java
import java.util.List;
import java.util.ArrayList;

public class Main {
 public static void main(String[] args) {
  List<String> list = new ArrayList<>();
  
   // Adicionar elementos
      list.add("Maçã");
      list.add("Banana");
      list.add("Cereja");

   // Acessar elementos
      System.out.println("Elemento na posição 1: "
      			+ list.get(1)); // Saída: Banana

   // Adicionar elemento em uma posição específica
      list.add(1, "Laranja");
      System.out.println(
      "Lista após adicionar Laranja: " + list
      ); // Saída: [Maçã, Laranja, Banana, Cereja]

  // Remover elemento
      list.remove("Banana");
      System.out.println("Lista após remover Banana: "
      			+ list); // Saída: [Maçã, Laranja, Cereja]

        // Substituir elemento
        list.set(2, "Morango");
        System.out.println("Lista após substituir Cereja por Morango: "
        			+ list); // Saída: [Maçã, Laranja, Morango]

        // Verificar se a lista contém um elemento
        boolean contains = list.contains("Morango");
        System.out.println("A lista contém Morango? "
        			+ contains); // Saída: true

        // Tamanho da lista
        int size = list.size();
        System.out.println("Tamanho da lista: " + size); // Saída: 3
    }
}
```

Este exemplo demonstra como usar a interface `List` para realizar operações comuns em uma lista, como adicionar, acessar, remover e substituir elementos.

```
