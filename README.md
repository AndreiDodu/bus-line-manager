# bus-line-manager
Bus line manager

Work in progress...

-  Technologies: GraphQL, Spring Boot, Liquibase, Hibernate, PostgreSQL

- before starting project as spring boot application, run "docker-compose up"

- make graphql queries to http://localhost:8080/graphql

- orika has some compatibility problems with JDK17, so that for now add 
  **_--add-opens java.base/java.lang=ALL-UNNAMED_**
  in the VM Arguments of your IDE

For further information look here: http://dodu.it/?page_id=711
