# Desenvolvimento de Software I

Aulas de Desenvolvimento de Software I com o professor João Siles utilizando Java.

## **_Baixando e configurando o Java no computador:_**

- Para usar o Java no computador primeiro é necessário instalar um JDK (Java Development Kit), que é um conjunto de ferramentas usado para criar e executar programas em Java.

- Após baixar um JDK compatível com o seu sistema, é necessário seguir os passos da instalação.

- Durante a instalação deve-se habilitar as opções que configuram automaticamente o **Path** e a variável **Java_Home**, pois isso permite que o sistema reconheça os comandos do Java no terminal.

## **_Configurações básicas do Java:_**

- Todo programa Java deve estar dentro de uma classe, então todo os códigos devem estar dentro da declaração de uma classe usando o **`class`**.

- O nome da classe principal deve ser igual ao nome do arquivo, por exemplo, se classe principal for `Main`, o nome do arquivo deverá ser `Main.java`.

- Cada instrução deverá acabar com um ponto e vírgula `;`.

- Um exemplo de código em Java simples criado em aula:

```java

package aula01;



public  class  Main {

public  Main() {

}



public  static  void  main(String[] var0) {

System.out.println("Hello World");

}

}

```

## **_Iniciando um projeto Spring Boot:_**

Springboot é um framework baseado em Java que busca facilitar a criação e o desenvolvimento de projetos Java.

Podemos criar um projeto Spring Boot a partir do site **Spring Initializr**, através de extensões do **VS Code** e pelo **IntelliJ**.

## _Iniciando pelo **Spring Initializr**:_

![Print da tela do Spring initializr](https://media2.dev.to/dynamic/image/width=800%2Cheight=%2Cfit=scale-down%2Cgravity=auto%2Cformat=auto/https%3A%2F%2Fdev-to-uploads.s3.amazonaws.com%2Fuploads%2Farticles%2Fe6r096dsre1pm39jxqrs.png)

### **_Project:_**

O **project** serve para escolher a ferramenta que vai gerenciar as dependências, automatizar o build (compilação) e definir a estrutura padrão de pastas da aplicação.

- **Maven**: Usa arquivos XML (`pom.xml`) e é o mais tradicional do mercado.
- **Gradle**: Usa scripts em código (Groovy ou Kotlin), sendo mais moderno e rápido.

### **_Language:_**

Define qual será a linguagem principal usada no projeto:

- **Java**: A linguagem padrão e mais utilizada com Spring.
- **Kotlin / Groovy**: Alternativas modernas que rodam na máquina virtual Java (JVM).

### **_Spring Boot (versão do framework):_**

Defini qual versão do Spring Boot o projeto utilizará.

### **_Project Metadata (Dados do Projeto):_**

- **Group**: Identificador único da sua empresa ou domínio (ex: `com.suaempresa`).
- **Artifact**: O nome do seu projeto ou módulo (ex: `sistema-vendas`).
- **Package name**: O pacote principal de código, gerado unindo o Group e o Artifact.

### **_Packaging (Formato de Empacotamento):_**

Como o projeto será compactado para rodar no servidor.

- **Jar**: Empacota tudo em um único arquivo executável (recomendado para Spring Boot).
- **War**: Formato antigo para rodar dentro de servidores externos (como Apache Tomcat).

### **_Configuration (Configurações do Projeto):_**

Formato dos arquivos onde você colocará as configurações do sistema (banco de dados, portas, etc).

- **Properties**: Formato tradicional de texto em linhas (`chave=valor`).
- **YAML**: Formato moderno baseado em indentação visual por espaços.

### **_Java (Versão do JDK):_**

Define a versão do Java que você vai usar para programar. Certifique-se de escolher uma versão que você já tenha instalada no seu computador (como a 17 ou 21).

### **_Dependencies (Dependências):_**

O lado direito serve para adicionar as bibliotecas que seu projeto vai usar. Clicando em **Add Dependencies**, você pode buscar por recursos como banco de dados (Spring Data JPA), segurança (Spring Security) ou criação de APIs (Spring Web).
