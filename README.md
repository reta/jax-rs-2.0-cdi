How to build
==============
Because of https://jira.codehaus.org/browse/MNG-5620, please use Apache Maven 3.0.5 
to run using maven-jetty-plugin:

mvn clean jetty:run

How to use
==============

- curl http://localhost:8080/rest/api/people -X POST -d "email=a@b.com&firstName=Tom&lastName=Knocker"
- curl http://localhost:8080/rest/api/people/a@b.com -X PUT -d "firstName=Tommy"
- curl http://localhost:8080/rest/api/people/a@b.com -X DELETE
- curl http://localhost:8080/rest/api/people
