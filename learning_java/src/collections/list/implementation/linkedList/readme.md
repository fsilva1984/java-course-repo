Uma LinkedList, ou lista encadeada, é uma estrutura de dados linear na qual os elementos, chamados de nós, são armazenados em locais não contíguos na memória. Cada nó contém dois componentes: o valor do elemento e uma referência (ou ponteiro) para o próximo nó na sequência. Existem várias variações de listas encadeadas, sendo as mais comuns a lista encadeada simples, a lista encadeada dupla e a lista encadeada circular.

### Tipos de LinkedList

1. **Lista Encadeada Simples (Singly Linked List):**
   - Cada nó contém um valor e uma referência para o próximo nó.
   - O último nó aponta para `null`.
   - Exemplo de estrutura de nó:
     ```java
     class Node {
         int data;
         Node next;
     }
     ```

2. **Lista Encadeada Dupla (Doubly Linked List):**
   - Cada nó contém um valor, uma referência para o próximo nó e uma referência para o nó anterior.
   - O primeiro nó aponta para `null` no campo anterior, e o último nó aponta para `null` no campo próximo.
   - Exemplo de estrutura de nó:
     ```java
     class Node {
         int data;
         Node next;
         Node prev;
     }
     ```

3. **Lista Encadeada Circular:**
   - Similar à lista encadeada simples, mas o último nó aponta para o primeiro nó, formando um ciclo.
   - Pode ser simples ou dupla.

### Operações Comuns

1. **Inserção:**
   - Inserir no início, no final ou em uma posição específica.
   - Complexidade de tempo: O(1) para inserção no início ou no final (se a referência ao último nó for mantida), O(n) para inserção em uma posição específica.

2. **Remoção:**
   - Remover do início, do final ou de uma posição específica.
   - Complexidade de tempo: O(1) para remoção do início, O(n) para remoção do final ou de uma posição específica.

3. **Busca:**
   - Encontrar um elemento com um valor específico.
   - Complexidade de tempo: O(n).

4. **Traversal:**
   - Percorrer todos os elementos da lista.
   - Complexidade de tempo: O(n).

### Vantagens e Desvantagens

**Vantagens:**
- **Flexibilidade:** Os elementos podem ser inseridos ou removidos facilmente sem a necessidade de reorganizar todos os elementos.
- **Memória Dinâmica:** Não requer alocação contígua de memória, o que pode ser uma vantagem em sistemas com memória fragmentada.

**Desvantagens:**
- **Uso de Memória:** Cada nó requer espaço adicional para armazenar a referência para o próximo nó.
- **Acesso Sequencial:** O acesso aos elementos é sequencial, o que pode ser menos eficiente do que o acesso direto em arrays.

### Exemplo de Uso em Java

Aqui está um exemplo simples de uma lista encadeada simples em Java:

```java
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    // Inserir no início
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Inserir no final
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Exibir a lista
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtBeginning(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.display(); // Saída: 10 -> 20 -> 30 -> null
    }
}
```

Este exemplo demonstra como criar uma lista encadeada simples, inserir elementos no início e no final, e exibir a lista.

