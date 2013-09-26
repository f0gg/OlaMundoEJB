package com.targettrust.teste;

import com.targettrust.olamundo.OlaMundoRemote;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;

public class Teste {

    public static void main(String[] args) throws Exception {
        Properties props = new Properties();

        props.setProperty(Context.INITIAL_CONTEXT_FACTORY, "com.sun.enterprise.naming.SerialInitContextFactory");
        props.setProperty(Context.PROVIDER_URL, "localhost:3700");

        InitialContext ic = new InitialContext(props);
        OlaMundoRemote ejb = (OlaMundoRemote) ic.lookup("java:global/OlaMundoEJB-1.0/OlaMundo!com.targettrust.olamundo.OlaMundoRemote");
        System.out.println(ejb.ola("João da Silva"));
    }
}
