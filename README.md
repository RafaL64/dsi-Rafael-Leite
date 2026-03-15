# Desenvolvimento de Software I
Aulas de Desenvolvimento de Software I com o professor João Siles utilizando Java.

## ***Baixando e configurando o Java no computador:***
 - Para usar o Java no computador primeiro é necessário instalar um JDK (Java Development Kit), que é um conjunto de ferramentas usado para criar e executar programas em Java.
 
 - Após baixar um JDK compatível com o seu sistema, é necessário seguir os passos da instalação. 
 - Durante a instalação deve-se habilitar as opções que configuram automaticamente o **Path** e  a variável **Java_Home**, pois isso permite que o sistema reconheça os comandos do Java no terminal.
 
 ## ***Configurações básicas do Java:***
- Todo programa Java deve estar dentro de uma classe, então todo os códigos devem estar dentro da declaração de uma classe usando o **`class`**.

- O nome da classe principal deve ser igual ao nome do arquivo, por exemplo, se classe principal for `Main`, o nome do arquivo deverá ser `Main.java`.

- Cada instrução deverá acabar com um ponto e vírgula `;`.

- Um exemplo de código em Java simples criado em aula:

```java
package aula01;

public class Main {
   public Main() {
   }

   public static void main(String[] var0) {
      System.out.println("Hello World");
   }
}
```