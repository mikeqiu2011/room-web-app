# 

## run
    docker run --rm -d --name rabbit-docker -p 5671:5671 -p 5672:5672 -p 15672:15672 rabbitmq:3.8.9-management
    mvn spring-boot:run

## test
    http://localhost:8080/rooms
    http://localhost:8080/staff