# Third Tech Challenge
> _Squad 3_

## Restaurant Finder

- [x] Cadastro de **Restaurante**:  
  - Os restaurantes podem se cadastrar no sistema, fornecendo informações como _nome, localização, tipo de cozinha, horários de funcionamento e capacidade_.

- [x] Reserva de Mesas:  
  - Os **usuários** podem fazer **reservas** para _datas_ e _horários específicos_.

- [ ] Avaliações e Comentários:  
  - Após a visita, os **usuários** podem avaliar o **restaurante** e deixar comentários sobre sua experiência.

- [ ] Busca de **Restaurantes**:  
  - Os **usuários** podem buscar **restaurantes** por nome, localização ou tipo de cozinha.

- [ ] Gerenciamento de **Reservas**:  
  - Os **restaurantes** podem gerenciar as **reservas**, visualizando e atualizando o status das mesas.

## Configuração de Ambiente
```docker
docker compose up -d
```

Após a execução do comando:
- Postgres e pgAdmin4 em um container dedicado ao projeto
- pgAdmin4 address: http://localhost:16543/browser/