# Super Classes e Sub Classes

As super classes são classes que servem como base para outras classes. Enquanto as sub classes são classes que foram geradas a partir de uma super classe, herdando suas características e comportamentos.

Exemplo:
````java
class Animal {
}

class Mamifero extends Animal {
}

class Cachorro extends Mamifero {
}
````

Nesse caso:

* Animal é superclasse de Mamifero;
* Mamifero é subclasse de Animal;
* Mamifero também é superclasse de Cachorro;
* Cachorro é subclasse de Mamifero.

## Herdando Atributos e Métodos

Temos uma classe Animal com os atributos nome e idade. A classe Cachorro herda esses atributos da classe Animal, o que significa que a classe Cachorro tem acesso a esses atributos sem precisar declará-los novamente. Além disso, a classe Cachorro pode adicionar seus próprios atributos e métodos, como o atributo raca.

````java
class Animal {
    String nome;
    String idade;
    int patas;
    
    public Animal(String nome, String idade) {
        this.nome = nome;
        this.idade = idade;
        this.patas = patas;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getIdade(){
        return idade;
    }
    
    public int getPatas(){
        return patas;
    }
}

class Cachorro extends Animal {
    private String raca;
    
    public Cachorro(String nome, String idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }
}

Cachorro cachorro = new Cachorro("Rex", "3 anos", "Labrador");
````

> Esse super pega o valor que está sendo passado ao instanciar a classe Cachorro e passa para o construtor da classe Animal, que é a super classe. Assim, o construtor da classe Animal é chamado para inicializar os atributos nome e idade, enquanto o construtor da classe Cachorro é responsável por inicializar o atributo raca.

