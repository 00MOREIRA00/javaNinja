# Condicionais

As **estruturas condicionais** permitem que um programa tome decisões. Elas executam diferentes blocos de código de acordo com o resultado de uma condição, que sempre será `true` (verdadeira) ou `false` (falsa).

Por exemplo, um programa pode verificar a idade de uma pessoa para decidir se ela pode entrar em um evento:

```java
int idade = 18;

if (idade >= 18) {
    System.out.println("Entrada permitida");
}
```

## Operadores de comparação

As condições normalmente são construídas com operadores de comparação:

| Operador | Significado | Exemplo |
| --- | --- | --- |
| `==` | Igual a | `idade == 18` |
| `!=` | Diferente de | `idade != 18` |
| `>` | Maior que | `idade > 18` |
| `<` | Menor que | `idade < 18` |
| `>=` | Maior ou igual a | `idade >= 18` |
| `<=` | Menor ou igual a | `idade <= 18` |

O resultado de uma comparação é um valor do tipo `boolean`:

```java
int idade = 20;
boolean maiorDeIdade = idade >= 18;

System.out.println(maiorDeIdade); // true
```

## `if`

O `if` executa um bloco de código somente quando sua condição é verdadeira:

```java
double nota = 8.5;

if (nota >= 7) {
    System.out.println("Aluno aprovado");
}
```

Se a condição for falsa, o bloco entre as chaves será ignorado.

## `if` e `else`

O `else` define o que deve acontecer quando a condição do `if` for falsa:

```java
double nota = 5.5;

if (nota >= 7) {
    System.out.println("Aluno aprovado");
} else {
    System.out.println("Aluno reprovado");
}
```

Apenas um dos dois blocos será executado.

## `else if`

Quando existem mais de duas possibilidades, podemos testar outras condições com `else if`:

```java
double nota = 6.5;

if (nota >= 7) {
    System.out.println("Aluno aprovado");
} else if (nota >= 5) {
    System.out.println("Aluno em recuperação");
} else {
    System.out.println("Aluno reprovado");
}
```

As condições são verificadas de cima para baixo. Assim que uma delas for verdadeira, seu bloco será executado e as demais serão ignoradas.

Por esse motivo, a ordem das condições é importante. Primeiro devem aparecer os casos mais específicos ou os maiores limites:

```java
int idade = 70;

if (idade >= 60) {
    System.out.println("Pessoa idosa");
} else if (idade >= 18) {
    System.out.println("Pessoa adulta");
} else {
    System.out.println("Pessoa menor de idade");
}
```

## Operadores lógicos

Os operadores lógicos permitem combinar ou inverter condições:

| Operador | Nome | Resultado |
| --- | --- | --- |
| `&&` | E | `true` quando todas as condições são verdadeiras |
| `\|\|` | OU | `true` quando pelo menos uma condição é verdadeira |
| `!` | NÃO | Inverte o resultado da condição |

### Operador E (`&&`)

```java
int idade = 20;
boolean possuiIngresso = true;

if (idade >= 18 && possuiIngresso) {
    System.out.println("Entrada permitida");
}
```

Nesse caso, as duas condições precisam ser verdadeiras.

### Operador OU (`||`)

```java
boolean fimDeSemana = false;
boolean feriado = true;

if (fimDeSemana || feriado) {
    System.out.println("Hoje não há aula");
}
```

Aqui, basta que uma das condições seja verdadeira.

### Operador NÃO (`!`)

```java
boolean estaChovendo = false;

if (!estaChovendo) {
    System.out.println("Podemos sair sem guarda-chuva");
}
```

O operador `!` transforma `false` em `true` e `true` em `false`.

## Comparando textos

Para comparar o conteúdo de duas `String`, usamos o método `equals()`. O operador `==` não deve ser usado para essa finalidade, pois ele compara se as variáveis apontam para o mesmo objeto.

```java
String usuario = "Naruto";

if (usuario.equals("Naruto")) {
    System.out.println("Usuário encontrado");
}
```

Quando quisermos ignorar a diferença entre letras maiúsculas e minúsculas, podemos usar `equalsIgnoreCase()`:

```java
String resposta = "SIM";

if (resposta.equalsIgnoreCase("sim")) {
    System.out.println("Resposta confirmada");
}
```

## Condicionais aninhadas

Uma estrutura condicional pode ficar dentro de outra:

```java
int idade = 20;
boolean possuiIngresso = true;

if (idade >= 18) {
    if (possuiIngresso) {
        System.out.println("Entrada permitida");
    } else {
        System.out.println("É necessário apresentar o ingresso");
    }
} else {
    System.out.println("Entrada não permitida para menores");
}
```

Esse recurso deve ser usado com moderação, pois muitos níveis de condições aninhadas podem dificultar a leitura do código.

## Operador ternário

O operador ternário é uma forma curta de escolher entre dois valores. Sua estrutura é:

```java
condicao ? valorSeVerdadeiro : valorSeFalso;
```

Exemplo:

```java
int idade = 17;
String categoria = idade >= 18 ? "Maior de idade" : "Menor de idade";

System.out.println(categoria);
```

Ele é indicado para decisões simples. Para regras maiores ou com várias instruções, prefira `if` e `else`.

## `switch`

O `switch` é útil quando uma única variável pode possuir vários valores conhecidos. Cada `case` representa uma possibilidade:

```java
int diaDaSemana = 2;

switch (diaDaSemana) {
    case 1:
        System.out.println("Domingo");
        break;
    case 2:
        System.out.println("Segunda-feira");
        break;
    case 3:
        System.out.println("Terça-feira");
        break;
    default:
        System.out.println("Dia inválido");
}
```

O `break` encerra o `switch` depois que um caso é encontrado. Sem ele, a execução continua nos casos seguintes. O `default` é executado quando nenhum `case` corresponde ao valor informado.

O `switch` também pode ser usado com textos:

```java
String nivel = "ADMIN";

switch (nivel) {
    case "ADMIN":
        System.out.println("Acesso completo");
        break;
    case "USUARIO":
        System.out.println("Acesso limitado");
        break;
    default:
        System.out.println("Acesso negado");
}
```

## Exemplo completo

```java
import java.util.Scanner;

public class VerificadorDeNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida");
        } else if (nota >= 7) {
            System.out.println("Aluno aprovado");
        } else if (nota >= 5) {
            System.out.println("Aluno em recuperação");
        } else {
            System.out.println("Aluno reprovado");
        }

        scanner.close();
    }
}
```

## Resumo das estruturas

| Estrutura | Quando utilizar |
| --- | --- |
| `if` | Quando um código deve ser executado somente se uma condição for verdadeira |
| `if` e `else` | Quando existem duas possibilidades |
| `else if` | Quando é necessário verificar várias condições diferentes |
| Operador ternário | Para escolher de forma curta entre dois valores simples |
| `switch` | Quando uma variável pode corresponder a vários valores conhecidos |

Em geral, use a estrutura que deixa a regra mais clara e fácil de entender. Condições simples e bem organizadas facilitam a manutenção do programa.
