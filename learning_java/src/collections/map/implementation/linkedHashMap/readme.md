<br> 

O `LinkedHashMap` é uma implementação de `Map` em Java, que combina as características de um `HashMap` (que oferece boa performance para operações de inserção, busca e remoção) com a capacidade de manter a ordem das inserções ou a ordem de acesso dos elementos.

### Características principais do `LinkedHashMap`:

1.  **Ordem de Inserção**:
    
    -   A principal diferença do `LinkedHashMap` em relação ao `HashMap` é que ele mantém a ordem das entradas, ou seja, a ordem em que as chaves e valores foram inseridos no mapa.
    -   O `LinkedHashMap` utiliza uma lista duplamente encadeada para armazenar as entradas, o que permite manter a ordem de inserção.
2.  **Ordem de Acesso** (Modo de acesso LRU - Least Recently Used):
    
    -   O `LinkedHashMap` pode ser configurado para manter a ordem de acesso, ou seja, os elementos mais acessados (por operações de `get()`) podem ser movidos para o final da lista, o que é útil para implementações de cache com política de substituição LRU (Least Recently Used).
    -   Para isso, basta passar um parâmetro adicional no construtor do `LinkedHashMap`, indicando que o mapa deve ordenar as entradas com base no acesso.
3.  **Desempenho**:
    
    -   O desempenho do `LinkedHashMap` é muito semelhante ao do `HashMap`, ou seja, as operações de `put()`, `get()` e `remove()` têm complexidade de tempo O(1) em média.
    -   A única sobrecarga adicional é a manutenção da ordem de inserção ou de acesso, que envolve uma estrutura de lista duplamente encadeada.
4.  **Aceita Nulos**:
    
    -   Assim como o `HashMap`, o `LinkedHashMap` permite chaves e valores nulos. Isso significa que você pode usar `null` como chave ou valor no mapa.
    
5.  **Iteração**:
    
    -   Ao iterar sobre um `LinkedHashMap`, os elementos serão retornados na ordem em que foram inseridos (ou na ordem de acesso, se configurado).
    
6. **Métodos Comuns**: O `LinkedHashMap` herda todos os métodos da interface `Map`, como `put`, `get`, `remove`, `containsKey`, `containsValue`, etc. Além disso, ele oferece métodos específicos como `removeEldestEntry` para remover a entrada mais antiga quando o mapa excede um certo tamanho.

### Construtores do `LinkedHashMap`:

1.  **Construtor padrão**: Cria um `LinkedHashMap` com capacidade inicial padrão e fator de carga padrão (0.75).
    
    ```java
    Map<Integer, String> map = new LinkedHashMap<>();
    
    ```
    
2.  **Construtor com capacidade inicial**: Permite definir a capacidade inicial do mapa. A capacidade inicial é o número de entradas que o mapa pode conter antes de precisar ser redimensionado.
    
    ```java
    Map<Integer, String> map = new LinkedHashMap<>(16);
    
    ```
    
3.  **Construtor com capacidade e fator de carga**: Permite definir a capacidade inicial e o fator de carga, que é a razão entre o número de elementos e a capacidade do mapa. O valor padrão de fator de carga é 0.75.
    
    ```java
    Map<Integer, String> map = new LinkedHashMap<>(16, 0.75f);
    
    ```
    
4.  **Construtor com capacidade, fator de carga e ordem de acesso**: Este construtor permite criar um mapa com capacidade, fator de carga e configurar se o mapa deve manter a ordem de inserção ou de acesso.
    
    -   O parâmetro `accessOrder` define se a ordem será baseada na inserção (`false`, o padrão) ou no acesso (`true`).
    
    ```java
    Map<Integer, String> map = new LinkedHashMap<>(16, 0.75f, true);
    
    ```
    

### Exemplos de uso:

1.  **Exemplo básico com ordem de inserção**:
    
    ```java
    Map<Integer, String> map = new LinkedHashMap<>();
    map.put(1, "um");
    map.put(2, "dois");
    map.put(3, "três");
    
    for (Map.Entry<Integer, String> entry : map.entrySet()) {
        System.out.println(entry.getKey() + ": " + entry.getValue());
    }
    
    ```
    
    **Saída**:
    
    ```
    1: um
    2: dois
    3: três
    
    ```
    
    Neste exemplo, a ordem das inserções é preservada ao iterar sobre o mapa.
    
2.  **Exemplo com ordem de acesso (LRU)**: Se você quiser que o mapa mantenha a ordem com base no acesso, ou seja, sempre mova as entradas acessadas recentemente para o final da lista, você pode usar o `accessOrder` configurado como `true`:
    
    ```java
    Map<Integer, String> map = new LinkedHashMap<>(16, 0.75f, true);
    map.put(1, "um");
    map.put(2, "dois");
    map.put(3, "três");
    
    // Acessando algumas chaves
    map.get(1);  // A chave 1 é agora a mais recente
    
    for (Map.Entry<Integer, String> entry : map.entrySet()) {
        System.out.println(entry.getKey() + ": " + entry.getValue());
    }
    
    ```
    
    **Saída**:
    
    ```
    2: dois
    3: três
    1: um
    
    ```
    
    Neste exemplo, como o elemento com chave `1` foi acessado, ele é movido para o final da iteração, tornando-se o mais "recente".
    
3.  **Remoção de elementos**: O `LinkedHashMap` permite remover entradas com base na chave ou no valor, assim como um `HashMap`.
    
    ```java
    map.remove(2);  // Remove a entrada com chave 2
    
    ```
    
4.  **Limpeza do mapa**: A limpeza de todas as entradas pode ser feita com o método `clear()`, como em qualquer implementação de `Map`:
    
    ```java
    map.clear();  // Remove todas as entradas do mapa
    
    ```
    

### Aplicações do `LinkedHashMap`:

1.  **Cache com política LRU**: O `LinkedHashMap` é frequentemente utilizado para implementar caches simples, onde a ordem de acesso é importante, ou seja, os itens acessados mais recentemente são considerados os mais relevantes. Usando a opção de `accessOrder` configurada como `true`, é possível fazer implementações de cache LRU de forma eficiente.
    
2.  **Armazenamento ordenado**: Quando você precisa de um `Map` que preserve a ordem de inserção e não se importa com a complexidade de tempo extra que vem com isso, o `LinkedHashMap` é ideal. Um exemplo típico seria quando a ordem das entradas é importante para o usuário final, como na exibição de dados em uma interface gráfica ou em logs.
    

### Diferenças em relação ao `HashMap`:

-   **Manutenção de ordem**: O `LinkedHashMap` preserva a ordem de inserção (ou a ordem de acesso, se configurado), enquanto o `HashMap` não garante nenhuma ordem.
-   **Desempenho**: O desempenho do `LinkedHashMap` é semelhante ao do `HashMap`, mas com um pequeno custo adicional para manter a ordem.

### Conclusão:

O `LinkedHashMap` é uma implementação de `Map` muito útil em Java quando é necessário garantir que a ordem de inserção ou a ordem de acesso dos elementos seja mantida. Ele oferece a eficiência do `HashMap`, com a vantagem adicional de manter a ordem das entradas, o que pode ser crucial em diversos cenários, como implementação de caches e iteração em dados na ordem de inserção.
