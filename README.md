# Simple Spring kafka Template
Um simples template de [**Kafka**](https://kafka.apache.org) usando Spring Boot.

## Pré-requisitos
- Java 17 ou posterior
- Docker
- Gradle (ou use o script ./gradlew incluído)

Nota: Certifique-se de executar o container Docker com o Kafka e o Zookeeper antes de executar a aplicação.
Na raiz do projeto há um arquivo <code>docker-compose.yml</code> para criação do container:
  <pre><code>docker compose up -d</code></pre>
