## Atividade

Escreva um programa que modele funcionários de uma empresa, para isso deve-se criar duas classes:

1. Funcionario
2. Gerente (herda de funcionário)

Na classe funcionário crie um método para calcular o salário mensal do funcionário. Cada funcionário deve ter uma carga de trabalho mensal e um valor por hora. O salário deve ser o a carga horária multiplicada pelo valor da hora.

No entanto, gerentes possuem uma regra particular. Os gerentes além do salário por hora ganham bônus, a depender do seu nível:

- Júnior: R$ 1.000,00
- Pleno: R$ 2.000,00
- Sênior: RS 3.000,00

para mais detalhes, siga as seguinte instruções detalhadamente:

1. Criar pacote chamado br.ufrn.imd
2. Criar a classe chamada Funcionario dentro deste pacote
3. Criar a classe Gerente que herda de Funcionario no pacote br.ufrn.imd
4. Crie os parâmetros hh e chMensal na classe funcionário
5. Crie um construtor na classe Funcionario que receba os parâmetros, nesta ordem: int chMensal, double hh.
6. Crie na classe Funcionario o método calcularSalario que retorne o valor do salário
7. Crie a classe Gerente e herde de Funcionário
8. Adicione um atributo (Enum) com o nivel do Gerente
9. O Enum deve ser definido dentro da própria classe Gerente (veja a imagem de referência)
10. Crie um construtor que receba o nível (construa a superclasse através do super)
11. Sobrescreva o método de calcularSalario com a nova regra

> Atenção utilize exatamente os mesmos nomes para as classes, atributos e métodos da imagem de referência.

![Classes](https://i.ibb.co/tZx4r8g/Captura-de-Tela-2021-11-25-a-s-20-07-51.png)

## Testes

O programa possui testes automatizados implementados. Se quiser testar execute o seguinte comando:

```console
$ ./gradlew test
```
