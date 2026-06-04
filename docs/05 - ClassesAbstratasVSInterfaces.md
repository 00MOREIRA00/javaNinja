# Classes Abstratas VS Interfaces

## Classes Abstratas

Para esse tópico, vou focar nela como uma classes que não pode ser intanciada. Essa classes pode ter tudo que uma classe normal tem, mas diferentes das outras ela não pode servir de molde para um objeto.
Porém ele serve como "molde"/"exemplo" para outras classes. Também podemos ter metodos abstratos, ou seja, métodos que não tem implementação, mas funcionam de forma a obrigar as classes filhas a implementar esse método, garantindo que todas as classes que estendem a classe abstrata tenham uma implementação específica para esse método.

## Interfaces

Essa diferente das classes abstratas, funcionam como um contrato para quem está implementando, ou seja, ela define um conjunto de métodos que a classe que implementa a interface deve implementar. Ela é usada para garantir que uma classe tenha um comportamento específico, sem se preocupar com a implementação desses comportamentos.