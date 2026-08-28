# Arrays

Um **array** é uma estrutura usada para armazenar vários valores do mesmo tipo em uma única variável. Em vez de criar uma variável para cada valor, podemos agrupá-los e acessar cada elemento por meio de sua posição, chamada de **índice**.

Em Java, o primeiro índice de um array é sempre `0`. Portanto, um array com três elementos possui os índices `0`, `1` e `2`.

## Criando um array

Para criar um array, informamos o tipo dos elementos e a quantidade de posições:

```java
int[] numeros = new int[5];
```

Esse código cria um array capaz de armazenar cinco números inteiros. Seu tamanho é definido na criação e não pode ser alterado depois.

Podemos preencher e acessar suas posições usando os índices:

```java
numeros[0] = 10;
numeros[1] = 20;

System.out.println(numeros[0]); // 10
System.out.println(numeros[1]); // 20

numeros[0] = 30; // Substitui o valor da primeira posição
```

## Criando um array com valores iniciais

Quando os valores já são conhecidos, podemos declarar e inicializar o array ao mesmo tempo:

```java
String[] convidados = {
    "Naruto Uzumaki",
    "Sasuke Uchiha",
    "Sakura Haruno"
};

System.out.println(convidados[0]); // Naruto Uzumaki
System.out.println(convidados.length); // 3
```

A propriedade `length` informa a quantidade de posições do array.

## Percorrendo um array

Podemos usar um laço `for` para acessar cada posição:

```java
for (int i = 0; i < convidados.length; i++) {
    System.out.println(convidados[i]);
}
```

Quando não precisamos do índice, o `for-each` deixa o código mais simples:

```java
for (String convidado : convidados) {
    System.out.println(convidado);
}
```

## Valores padrão

Ao criar um array sem preencher suas posições, Java atribui valores padrão de acordo com o tipo:

- tipos numéricos recebem `0`;
- `boolean` recebe `false`;
- `char` recebe o caractere nulo (`'\u0000'`);
- objetos, como `String`, recebem `null`.

## Cuidado com os limites

Tentar acessar uma posição que não existe provoca uma `ArrayIndexOutOfBoundsException`:

```java
int[] numeros = new int[3];
numeros[3] = 10; // Erro: os índices válidos são 0, 1 e 2
```

## `ArrayList`

Uma `ArrayList` também armazena vários elementos do mesmo tipo, mas, ao contrário de um array, seu tamanho pode aumentar ou diminuir durante a execução do programa. Ela é útil quando ainda não sabemos quantos elementos precisaremos guardar.

Para utilizá-la, precisamos importar a classe `ArrayList`:

```java
import java.util.ArrayList;
```

Na declaração, o tipo dos elementos é informado entre `< >`:

```java
ArrayList<String> convidados = new ArrayList<>();
```

Uma `ArrayList` trabalha com objetos. Por isso, para números e outros tipos primitivos, usamos suas classes correspondentes:

```java
ArrayList<Integer> numeros = new ArrayList<>(); // Em vez de int
ArrayList<Double> notas = new ArrayList<>();    // Em vez de double
ArrayList<Boolean> respostas = new ArrayList<>(); // Em vez de boolean
```

### Adicionando elementos

O método `add()` adiciona um elemento ao final da lista:

```java
convidados.add("Naruto Uzumaki");
convidados.add("Sasuke Uchiha");
convidados.add("Sakura Haruno");
```

Também podemos inserir um elemento em uma posição específica. Os elementos seguintes são deslocados para a direita:

```java
convidados.add(1, "Kakashi Hatake");
```

### Acessando e alterando elementos

Em vez de usar os colchetes do array, usamos `get()` para acessar e `set()` para alterar um elemento:

```java
System.out.println(convidados.get(0)); // Naruto Uzumaki

convidados.set(0, "Hinata Hyuga");
System.out.println(convidados.get(0)); // Hinata Hyuga
```

Assim como nos arrays, o primeiro índice é `0`.

### Removendo elementos

O método `remove()` permite remover um elemento pelo índice ou pelo próprio valor:

```java
convidados.remove(1);          // Remove o elemento do índice 1
convidados.remove("Sakura Haruno"); // Remove pelo valor
```

Depois de uma remoção, os índices dos elementos seguintes são reorganizados.

### Tamanho e busca

Em uma `ArrayList`, usamos o método `size()` para descobrir a quantidade de elementos:

```java
System.out.println(convidados.size());
```

Também podemos verificar se um elemento existe com `contains()`:

```java
boolean estaNaLista = convidados.contains("Naruto Uzumaki");
System.out.println(estaNaLista);
```

Observe a diferença: arrays usam a propriedade `length`, enquanto listas usam o método `size()`.

### Percorrendo uma `ArrayList`

Podemos percorrer a lista com um `for` tradicional:

```java
for (int i = 0; i < convidados.size(); i++) {
    System.out.println(convidados.get(i));
}
```

Ou com um `for-each`:

```java
for (String convidado : convidados) {
    System.out.println(convidado);
}
```

### Exemplo completo

```java
import java.util.ArrayList;

public class ListaDeConvidados {
    public static void main(String[] args) {
        ArrayList<String> convidados = new ArrayList<>();

        convidados.add("Naruto Uzumaki");
        convidados.add("Sasuke Uchiha");
        convidados.add("Sakura Haruno");

        convidados.set(1, "Kakashi Hatake");
        convidados.remove("Sakura Haruno");

        for (String convidado : convidados) {
            System.out.println(convidado);
        }

        System.out.println("Total de convidados: " + convidados.size());
    }
}
```

## Diferenças entre array e `ArrayList`

| Array | `ArrayList` |
| --- | --- |
| Possui tamanho fixo | Pode aumentar ou diminuir |
| Acessa um elemento com `array[indice]` | Acessa um elemento com `lista.get(indice)` |
| Altera um elemento com `array[indice] = valor` | Altera um elemento com `lista.set(indice, valor)` |
| Consulta o tamanho com `array.length` | Consulta o tamanho com `lista.size()` |
| Pode armazenar tipos primitivos diretamente | Armazena objetos, como `Integer` e `Double` |

Use um array quando a quantidade de elementos for conhecida e não precisar mudar. Use uma `ArrayList` quando for necessário adicionar ou remover elementos ao longo do programa.
