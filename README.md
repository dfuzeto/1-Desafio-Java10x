# 🥷 Desafio Java10x - Missão Ninja

Este projeto é uma simulação simples de um sistema de missões no estilo "Naruto", feito em Java como parte do desafio **Java10x**.

## 📄 Sobre o Projeto

O programa define uma estrutura com três classes principais:

- `Ninja`: representa um ninja com nome, idade e nível.
- `Mission`: representa uma missão com um determinado nível de dificuldade.
- `Main`: onde o programa é executado e a lógica de comparação entre o nível do ninja e o nível da missão acontece.

## 🚀 Como Funciona

1. Um ninja é criado com nome, idade e nível (`S`, `A`, `B`, `C`, `D`, etc.).
2. Uma missão é criada com um nível e uma descrição.
3. A missão é atribuída ao ninja, e o sistema verifica se ele tem nível suficiente para completá-la.

Se o nível do ninja for igual ou superior ao da missão, ele a conclui com sucesso. Caso contrário, a missão é considerada fracassada.

## 💻 Exemplo de Execução

```java
Ninja sasuke = new Ninja("Sasuke", 17, 'C');
Mission zabuza = new Mission('S', "Derrote o zabuza!");
Mission.fazerMissao(sasuke, zabuza);
