How to build
==============

mvn clean package

How to use
==============
Copy  jax-rs-2.0-cdi-0.0.1-SNAPSHOT.war into Tomcat's webapp folder.

- curl http://localhost:8080/jax-rs-2.0-cdi/rest/api/people -X POST -d "email=a@b.com&firstName=Tom&lastName=Knocker"
- curl http://localhost:8080/jax-rs-2.0-cdi/rest/api/people/a@b.com -X PUT -d "firstName=Tommy"
- curl http://localhost:8080/jax-rs-2.0-cdi/rest/api/people/a@b.com -X DELETE
- curl http://localhost:8080/jax-rs-2.0-cdi/rest/api/people
