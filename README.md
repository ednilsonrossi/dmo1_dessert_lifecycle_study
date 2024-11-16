# Desserts Lifecycle Study

## Descrição

O **Desserts Lifecycle Study** é um aplicativo Android desenvolvido em **Kotlin** que tem como objetivo demonstrar a importância de compreender o ciclo de vida de uma `Activity` e o uso do `savedInstanceState` para preservar o estado da aplicação durante mudanças de configuração (como rotação de tela) e situações onde a `Activity` é destruída e recriada.

O aplicativo exibe uma lista de sobremesas e seus preços. O usuário pode clicar em uma sobremesa, o que adicionará a sobremesa a um contador e acumulará o valor total de todas as sobremesas clicadas. Esse comportamento ajuda a demonstrar como o ciclo de vida da `Activity` e o armazenamento temporário de dados são gerenciados no Android.

## Funcionalidades

- **Lista de Sobremesas**: O aplicativo exibe uma lista de sobremesas com seus preços.
- **Contador de Sobremesas**: Ao clicar em uma sobremesa, ela é adicionada a um contador, e o valor da sobremesa é acumulado.

## Objetivo

O principal objetivo deste aplicativo é **demonstrar a importância de compreender o ciclo de vida de uma `Activity`** no Android, especialmente o método `savedInstanceState`. Com esse exemplo prático, os desenvolvedores podem entender como o sistema Android lida com a destruição e recriação das `Activities` e como usar o `savedInstanceState` para preservar o estado da aplicação de maneira eficiente.

## Tecnologias Utilizadas

- **Kotlin**: Linguagem de programação principal utilizada para o desenvolvimento.
- **Android SDK**: Framework para desenvolvimento Android.
- **View Binding**: Para acessar de forma segura e eficiente os elementos da UI.

## Como Executar o Projeto

1. **Clone o repositório**:

    ```bash
    git clone https://github.com/seu-usuario/desserts-lifecycle-study.git
    ```

2. **Abra o projeto no Android Studio**:
    - No Android Studio, clique em **File** > **Open** e selecione o diretório onde o projeto foi clonado.

3. **Sincronize o Gradle**:
    - Quando o projeto for aberto, o Android Studio pode solicitar para sincronizar as dependências do Gradle. Clique em "Sync Now" para que o Gradle baixe as dependências necessárias.

4. **Execute o aplicativo**:
    - Conecte um dispositivo Android ou inicie um emulador.
    - Clique em **Run** no Android Studio para compilar e rodar o aplicativo.

## Demonstração do Ciclo de Vida e savedInstanceState

- O aplicativo demonstra como o Android lida com a destruição e recriação de `Activities`, como acontece durante a rotação da tela.
- O método `onSaveInstanceState()` é utilizado para salvar o estado das variáveis importantes, como o número de sobremesas clicadas e o valor acumulado, antes de a `Activity` ser destruída.
- O estado é restaurado de forma transparente para o usuário quando a `Activity` é recriada, mantendo a contagem e o valor correto.


## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para fazer um **fork** do repositório, criar uma nova **branch**, implementar a funcionalidade ou correção de bug e enviar um **pull request**.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).