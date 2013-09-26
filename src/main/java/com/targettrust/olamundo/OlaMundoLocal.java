package com.targettrust.olamundo;

import javax.ejb.Local;

@Local
public interface OlaMundoLocal {
    
    String ola(String nome);    
    
}
