# Construtores

São métodos especiais usadas para inicilizar um objeto quando ele é criado. O construtor é chamado automaticamente quando um objeto é instanciado a partir de uma classe. Ele tem o mesmo nome da classe e não possui um tipo de retorno, nem mesmo `void`.

Podemos ter dois tipos de construtores:
    
    - No Args: Vem vazio e não necessariamente recebe parâmetros. Ele é usado para criar objetos com valores padrão ou para criar objetos sem fornecer informações iniciais.
    - All Args: preenchido com todos os atributos da classe. Ele é usado para criar objetos com valores específicos fornecidos no momento da criação.
    
> Por padrão o Java já cria um construtor vazio para a gente 


### Regras

- O construtor deve ter o mesmo nome da classe.
- O construtor não pode ter um tipo de retorno, nem mesmo `void`.
- É chamado automaticamente quando um objeto é criado.

### Exemplo

````java
// All Args

Class Pessoa {
    String nome;
    int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

    Pessoa p = new Pessoa("João", 30);
````

````java
    Class Pessoa {
        String nome;
        int idade;
    }
    
    Pessoa p = new Pessoa();
    p.nome = "João";
    p.idade = 30;
````

- this.nome = atributo da classe
- nome = parâmetro do construtor