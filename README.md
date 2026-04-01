# **componentesGuigui-chan 🚀**

Este repositório contém um projeto desenvolvido para a disciplina de **Programação Orientada a Objetos II** na **Universidade Estadual de Minas Gerais (UEMG)**. O objetivo principal é o estudo e a implementação de interfaces gráficas (GUI) utilizando a biblioteca **Swing** do Java.

## **📋 Sobre o Projeto**

O projeto componentesGuigui-chan foca na criação de componentes de tela reutilizáveis e customizáveis. Através da classe Tela, é possível instanciar janelas que facilitam a coleta de dados, exibição de mensagens e interação com o usuário através de diversos elementos gráficos.

### **Funcionalidades principais:**

* **Entrada de Dados:** Campos de texto para capturar informações como ano de nascimento.  
* **Componentes de Seleção:** Uso de JCheckBox (para múltiplas escolhas) e JRadioButton (para escolhas únicas, como formas de pagamento).  
* **Customização de Janelas:** Métodos sobrecarregados para configurar título, tamanho e posição da janela de forma dinâmica.  
* **Interatividade:** Botões com ouvintes de eventos (ActionListeners) para processar ações do usuário.

## **🛠️ Tecnologias Utilizadas**

* **Java**: Linguagem base do projeto.  
* **Swing / AWT**: Bibliotecas para criação da interface gráfica.

## **📂 Estrutura do Código**

* Principal.java: Ponto de entrada da aplicação que demonstra a inicialização de uma janela de coleta de dados.  
* Tela.java: A classe "mestra" que estende JFrame, contendo a lógica de montagem dos painéis, botões, checkboxes e layouts.

## **🚀 Como Executar**

1. Certifique-se de ter o **JDK** (Java Development Kit) instalado em sua máquina.  
2. Clone o repositório ou baixe os arquivos fonte.  
3. Compile os arquivos .java:  
   javac \*.java

4. Execute a classe principal:  
   java Principal

## **📝 Exemplo de Uso**

No código atual, a classe Principal demonstra como criar uma tela de entrada simples:

Tela recolherAnoNascimento \= new Tela("Ano de nascimento:", "Digite seu ano de nascimento aqui.");  
recolherAnoNascimento.configurarJanela("Atividade 1", 500, 500, 466, 266);

## **👤 Autor**

* **Guilherme-Porto-Silva** \- *Desenvolvedor e estudante na UEMG*

*Este projeto foi criado para fins acadêmicos.*