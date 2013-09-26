package com.targettrust.olamundo;

import javax.ejb.Remote;

@Remote
public interface OlaMundoRemote {

    String ola(String nome);
    
}
