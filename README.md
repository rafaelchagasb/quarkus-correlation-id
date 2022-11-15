# Quarkus Tracing logs

This project show logs using correlation-id for trace requests

## How do I run?

Run your application

```shell script
./mvnw compile quarkus:dev
```

## How do I test?

Send a request

```shell
curl --location --request GET 'http://localhost:8080/register'
```

Open your logs

```
11:17:45 INFO  b6891959-8357-4913-91ee-5487a1a054ae [br.co.ra.RegisterService] (executor-thread-0) Data saved in the database
11:17:45 INFO  b6891959-8357-4913-91ee-5487a1a054ae [br.co.ra.EmailService] (executor-thread-0) Email sent
11:17:48 INFO  055ced4a-1523-4cfe-9d37-62fb27c214a4 [br.co.ra.RegisterService] (executor-thread-0) Data saved in the database
11:17:48 INFO  055ced4a-1523-4cfe-9d37-62fb27c214a4 [br.co.ra.EmailService] (executor-thread-0) Email sent
```
