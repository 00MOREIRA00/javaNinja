# Poliformismo 

O poliformismo é um conceito fundamental na programação orientada a objetos que permite que objetos de diferentes classes sejam tratados como objetos de uma classe comum. Isso é possível graças à herança e à capacidade de sobrescrever métodos em subclasses.

Um mesmo método pode ter comportamentos diferentes dependendo do objeto que o chama. Isso é conhecido como poliformismo de tempo de execução ou poliformismo dinâmico. Ele é alcançado através do uso de métodos virtuais e da ligação dinâmica.

````java
// Exemplo: Criando metodos polimórficos

public classe Animal {
    public void emitirSom() {
        System.out.println("O animal está emitindo um som.");
        }
````

````java
public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O cachorro está latindo.");
    }
}
````

````java
public class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O gato está miando.");
    }
}
````

> Podemos observar que temos um método `emitirSom()` na classe `Animal` e que as classes `Cachorro` e `Gato` sobrescrevem esse método para fornecer uma implementação específica para cada tipo de animal. Dessa forma o padrão pode ser sempre retornado, mas se tivermos casos especificos, podemos sobrescrever o método para cada caso, sem precisar criar um método diferente para cada tipo de animal.

Temos dois tipos de poliformismo: 
- Poliformismo de Sobrecarga: Ocorre quando temos vários métodos com o mesmo nome, mas com diferentes parâmetros. O compilador determina qual método chamar com base nos argumentos fornecidos.
- Poliformismo de Sobreescrita: Ocorre quando uma subclasse fornece uma implementação específica para um método que já existe na classe pai. O método na subclasse tem a mesma assinatura (nome e parâmetros) do método na classe pai, mas pode ter um comportamento diferente.


````java
// Exemplo: Poliformismo de Sobrecarga

public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public double somar(double a, double b) {
        return a + b;
    }
}
````

````java
// Exemplo: Poliformismo de Sobreescrita

public class Veiculo {
    public void mover() {
        System.out.println("O veículo está se movendo.");
    }
}

public class Carro extends Veiculo {
    @Override
    public void mover() {
        System.out.println("O carro está dirigindo.");
    }
}
````