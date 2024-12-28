<br>

O `Map` é uma interface em Java que faz parte do framework de coleções (`java.util`). Ele representa uma coleção de pares chave-valor, onde cada chave é única e mapeia para um valor específico. A interface `Map` não estende a interface `Collection`, mas é uma parte integral do framework de coleções de Java.

Aqui estão alguns pontos-chave sobre a interface `Map`:

1. **Pares Chave-Valor**: Cada elemento em um `Map` é um par chave-valor. As chaves são únicas, enquanto os valores podem ser duplicados.

2. **Métodos Principais**:
   - `put(K key, V value)`: Insere um par chave-valor no mapa. Se a chave já existir, o valor antigo será substituído pelo novo valor.
   - `get(Object key)`: Retorna o valor ao qual a chave especificada está mapeada, ou `null` se o mapa não contém a chave.
   - `remove(Object key)`: Remove o par chave-valor para a chave especificada do mapa, se estiver presente.
   - `containsKey(Object key)`: Retorna `true` se o mapa contém uma chave especificada.
   - `containsValue(Object value)`: Retorna `true` se o mapa mapeia uma ou mais chaves para o valor especificado.
   - `size()`: Retorna o número de pares chave-valor no mapa.
   - `isEmpty()`: Retorna `true` se o mapa não contém pares chave-valor.

3. **Implementações Comuns**:
   - `HashMap`: Uma implementação baseada em tabela de hash que permite uma chave `null` e múltiplos valores `null`. Não garante nenhuma ordem específica dos elementos.
   - `TreeMap`: Uma implementação baseada em árvore vermelho-preto que mantém as chaves em ordem crescente natural ou conforme um comparador especificado. Não permite chaves `null`.
   - `LinkedHashMap`: Uma implementação que mantém a ordem de inserção dos elementos. Permite uma chave `null` e múltiplos valores `null`.
   - `Hashtable`: Uma implementação sincronizada e legada que é semelhante ao `HashMap`, mas não permite chaves ou valores `null`.

4. **Iteração**:
   - Você pode iterar sobre as chaves, valores ou entradas (pares chave-valor) de um `Map` usando os métodos `keySet()`, `values()` e `entrySet()`, respectivamente.
   - Exemplo de iteração sobre entradas:
     ```java
     Map<String, Integer> map = new HashMap<>();
     map.put("um", 1);
     map.put("dois", 2);

     for (Map.Entry<String, Integer> entry : map.entrySet()) {
         System.out.println("Chave: " + entry.getKey() + ", Valor: " + entry.getValue());
     }
    ```

5. **Uso Comum**:
   - `Map` é frequentemente usado para armazenar dados que precisam ser acessados rapidamente com base em uma chave única, como em caches, dicionários, etc.

Aqui está um exemplo simples de uso de `HashMap`:

Este exemplo demonstra como adicionar, acessar, remover e iterar sobre os elementos de um `Map` em Java.
<br/>

```
```
