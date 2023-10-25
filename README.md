# Projeto de Reserva de Hotel em Java

Este é um projeto que visa criar um sistema de reserva de hotel em Java. O projeto lida com as seguintes funcionalidades:

- Inserção de dados da reserva, incluindo número do quarto, data de check-in e data de check-out.
- Atualização de dados da reserva, incluindo verificação de datas futuras e validação.
- Apresentação dos detalhes da reserva, incluindo a duração em dias.

## Problema e Soluções

O projeto apresenta diferentes abordagens para lidar com as reservas, cada uma com suas vantagens e desvantagens:

### Solução 1 (Muito Ruim):

- Lógica de validação no programa principal.
- Lógica de validação não delegada à classe `Reservation`.

### Solução 2 (Ruim):

- Método retornando uma `String`, o que prejudica a semântica da operação.
- Retornar uma `String` não está relacionado à atualização de reserva.
- Limitações ao tratar exceções em construtores.
- Nenhuma assistência do compilador para garantir verificações de erros.
- Lógica estruturada em condicionais aninhadas.

### Solução 3 (Boa):

- Tratamento de exceções para melhor gerenciamento de erros.

Escolhemos a Solução 3 como a melhor abordagem, pois oferece um tratamento mais eficiente de exceções e ajuda a manter a semântica correta das operações.

## Como Executar o Projeto

Para executar o projeto, siga estas etapas:

1. Clone o repositório do GitHub.
2. Abra o projeto em seu ambiente de desenvolvimento Java.
3. Execute a classe `Program` no pacote `Application`.

## Contribuições

Contribuições são bem-vindas! Se você encontrar maneiras de melhorar o projeto ou identificar problemas, sinta-se à vontade para enviar solicitações de pull ou abrir problemas.

## Licença

Este projeto é distribuído sob a [licença MIT](LICENSE).
