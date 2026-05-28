# Interfaces

Em Java são contratos (ou padrões) que definem um conjunto de métodos que uma classe deve implementar. Elas são usadas para garantir que uma classe siga um determinado comportamento ou forneça uma funcionalidade específica.

Ele é interessante pois garante que as classes sigam um comportamento especifico, forçanndo a implementação dos métodos definidos, mas sem dizer como realiza-los.

## Exemplo de Interface

```java
// Exemplo de interface

public interface ComportamentoAnimal {
    void comer();
    void dormir();
    void emitirSom();
}
```

> Dessa forma, qualquer classe que implemente a interface `ComportamentoAnimal` deve fornecer uma implementação para os métodos `comer()`, `dormir()` e `emitirSom()`.

## Implementação de Interface

```java
// Implementação da interface

public class Cachorro implements ComportamentoAnimal {
    @Override
    public void comer() {
        System.out.println("O cachorro está comendo.");
    }

    @Override
    public void dormir() {
        System.out.println("O cachorro está dormindo.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro está latindo.");
    }
}
```