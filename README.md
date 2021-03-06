# Please read before run

## Status

[![Build Status](https://travis-ci.org/theweelab/spring-microservice-training.svg?branch=master)](https://travis-ci.org/theweelab/spring-microservice-training)

## spring-microservice-training

Follow the steps below to run

### Container Docker 
```docker pull postgres```  

```docker run --name postgres-msa -e POSTGRES_PASSWORD=mysecretpassword -p 5432:5432 -d postgres```  

```docker pull rabbitmq:3-management```  

```docker run -d --hostname my-rabbit --name rabbit-msa -p 5672:5672 -p 15672:15672 rabbitmq:3-management```  

### Database Configuration
- Start Postgres service in localhost on port 5432
- Make sure there is a user 'postgres' with password 'mysecretpassword'

### Build all projects using the pom.xml at the root level. 
```mvn –Dmaven.test.skip=true clean install```  

### Run 
Run below projects from the respective folders. 

Hint: Note that wait for 40-60 seconds before starting the next service. This will ensure that the dependent services are registered and are available before we starting a new service.

```java -jar target/config-server-1.0.jar```

```java -jar target/eurekaserver-1.0.jar```

```java -jar target/fares-1.0.jar```

```java -jar target/search-1.0.jar```

```java -jar target/checkin-1.0.jar```

```java -jar target/book-1.0.jar```

```java -jar target/baggage-1.0.jar```


```java –jar target/search-apigateway-1.0.jar```

```java –jar target/checkin-apigateway-1.0.jar```

```java –jar target/book-apigateway-1.0.jar```

```java –jar target/baggage-apigateway-1.0.jar```

```java -jar target/website-1.0.jar```

## Open the browser window and point to http://localhost:8001

## Test

Workflow: Search flight -> Book -> Checkin -> Add baggage  
> Note: The web service should wait for baggage-apigateway start completely if not it could caused the error when add baggage of not found service

Backend activities:  
- The baggage with weight and checkin id will be stored to baggage_record of baggage schema  
- Baggage service will update checkin record to have new value HAS_BAGGAGE to baggage status  
