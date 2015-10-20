# Feign JAX-RS Tutorial

Examples how to create a REST client derived from a JAX-RS based webservice in not time and [retrofit] style using [Netflix feign].

Please feel free to take a look at my blog at [www.hascode.com] for the full tutorial.

**Starting the Test Server**

Download and start the RESTful webservice server instance using the following command:

```
git clone https://bitbucket.org/hascode/jaxrs2-client-tutorial.git && \
cd jaxrs2-client-tutorial && \
make rest-server
```

**Running the Client Examples**

Run the examples using Maven e.g.

```
mvn exec:java -Dexec.mainClass=com.hascode.tutorial.BookServiceClient
```

----

**2015 Micha Kops / hasCode.com**

   [retrofit]:http://square.github.io/retrofit/
   [www.hascode.com]:http://www.hascode.com/
   [Netflix feign]:https://github.com/Netflix/feign