# Getters e Setters 

Sõa métodos usados para acessar e alterar atributos de uma classe. Eles são usados para proteger os dados de uma classe, permitindo que o acesso e a modificação sejam controlados.

Utilizadas principalmente para acessar atributos privados, garantindo que os dados sejam manipulados de forma segura e consistente.

## Getters

O getter é um método que retorna o valor de um atributo. Ele geralmente tem o prefixo "get" seguido pelo nome do atributo com a primeira letra maiúscula.

````java
class Pessoa {
    String nome;
    private int documento;
    
    private Pessoa(String nome, int documento) {
        this.nome = nome;
        this.documento = documento;
    }
    
    getDocumento() {
        return documento;
    }
}
````
> Nesse exemplo acima, temos documento como um atributo privado, o que significa que ele não pode ser acessado diretamente de forma externa à classe Pessoa. No entanto, o método getDocumento() é um getter que permite acessar o valor do atributo documento de forma controlada.

````java
// Intanciando o objeto
Pessoa pessoa = new Pessoa("João", 123456789);

System.out.println(pessoa.documento); // Isso causará um erro, pois documento é privado
System.out.println(pessoa.getDocumento()); // Isso funcionará, pois getDocumento() é um getter que retorna o valor do atributo documento
````

## Setters

O setter é um método que permite alterar o valor de um atributo. Ele geralmente tem o prefixo "set" seguido pelo nome do atributo com a primeira letra maiúscula.

````java
class Pessoa {
    String nome;
    private int documento;
    
    private Pessoa(String nome, int documento) {
        this.nome = nome;
        this.documento = documento;
    }
    
    setDocumento(int documento) {
        this.documento = documento;
    }
}
````

> Nesse exemplo acima, o método setDocumento(int documento) é um setter que permite alterar o valor do atributo documento de forma controlada. Ele recebe um parâmetro do tipo int e atribui esse valor ao atributo documento.

````java
// Intanciando o objeto
Pessoa pessoa = new Pessoa("João", 123456789);

pessoa.documento = 987654321; // Isso causará um erro, pois documento é privado
pessoa.setDocumento(987654321); // Isso funcionará, pois setDocumento() é um setter que permite alterar o valor do atributo documento
````