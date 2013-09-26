# OlaMundoEJB

Projeto exemplificando o uso de um EJB e seu lookup remoto através do Application Server Glassfish.

## Observação

Trecho do `pom.xml` que referencia a dependência necessária para permitir o lookup remoto:

```xml
        <dependency>
            <groupId>org.glassfish.appclient</groupId>
            <artifactId>gf-client-module</artifactId>
            <version>3.1.1</version>
        </dependency>
```

*Projeto criado utilizando Maven e NetBeans. Testado no Glassfish 3.1.2*
