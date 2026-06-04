# Classe Abstrata 

Uma classe abstrata abstrata em java serve como modelo ou base para outras classes, mas que não podem ser instanciadas diretamente. Ela é usada para definir um conjunto de métodos que as subclasses devem implementar, garantindo assim uma estrutura comum para todas as classes que a estendem.

- Método abstrato funciona como uma obrigação para as subclasses implementarem esse método, garantindo que todas as classes que estendem a classe abstrata tenham uma implementação específica para esse método.
- Usamos classes abstratas quando queremos criar uma base comum para varias classes parecidas, mas essa base é generica demais para virar objeto.



````java
class abstract Animal {
    String nome;
    
    Animal(String nome) {
        this.nome = nome;
    }
    
    abstract void emitirSom();
    
    void dormir() {
        System.out.println(nome + " está dormindo.");
    }
}

````

> Nesse exemplo animal não pode ser instanciado, mas quando for herdada por outras classes, elas terão que implementar o método emitirSom, garantindo que todas as subclasses de Animal tenham uma implementação específica para esse método.