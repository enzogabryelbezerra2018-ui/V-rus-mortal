# V-rus-mortal


## Descrição
Este projeto é um aplicativo Android criado como um experimento de manipulação de arquivos de forma segura. Ele serve para demonstrar funcionalidades básicas de Android, como criar botões, detectar cliques e manipular pastas no armazenamento do dispositivo. O objetivo principal é educativo e não causar dano a outros dispositivos.

O app possui uma interface simples com um botão que, ao ser pressionado, verifica a existência de uma pasta específica e realiza ações sobre ela. O projeto foi desenvolvido utilizando **Java** para a lógica do aplicativo e **XML** para o layout da interface.

## Funcionalidades
- Criação de interface gráfica simples com botão de ação.
- Detecção de cliques em botões e execução de funções associadas.
- Verificação da existência de pastas no armazenamento do dispositivo.
- Função recursiva para apagar conteúdos de uma pasta específica (apenas no contexto do app).
- Mensagens de feedback para o usuário através de **Toast**.

- `MainActivity.java` → Contém a lógica do botão e a função que manipula a pasta.
- `activity_main.xml` → Define o layout da tela com o botão.
- `AndroidManifest.xml` → Define permissões e configurações do app.

## Como Funciona
1. O usuário abre o aplicativo.
2. O aplicativo exibe um botão chamado “Iniciar”.
3. Ao pressionar o botão:
   - O app verifica se existe uma pasta específica no armazenamento do dispositivo.
   - Se a pasta existir, todos os arquivos dentro dela são apagados de forma segura.
   - Se a pasta não existir, uma mensagem é exibida informando que não há nada a ser apagado.
4. O usuário recebe feedback imediato através de uma mensagem na tela (Toast).

## Objetivo Educativo
O principal objetivo deste projeto é **aprender sobre desenvolvimento Android**, manipulação de arquivos e criação de interfaces simples. Este app **não deve ser usado para prejudicar outros dispositivos**, servindo apenas como ferramenta de estudo e teste em um ambiente seguro.
confia

## Tecnologias Utilizadas
- **Java** → Para programação do app e manipulação de arquivos.
- **XML** → Para definir layouts e interface do usuário.
- **Android Studio** → IDE oficial para desenvolvimento Android.
- **API Android** → Para gerenciamento de armazenamento e permissões.

## Observações
- Este projeto demonstra conceitos básicos de Android, como eventos de clique, verificação de arquivos e exibição de mensagens.
- Sempre execute testes em dispositivos ou emuladores próprios para evitar qualquer problema.
- O código é educativo e seguro quando usado dentro do contexto do próprio dispositivo.

## Conclusão
Este projeto é um exemplo prático de como criar um aplicativo Android simples que interage com o sistema de arquivos de forma controlada. Ele pode ser expandido para incluir novas funcionalidades, como criação de pastas, cópia de arquivos ou outros experimentos educativos no Android. confia
