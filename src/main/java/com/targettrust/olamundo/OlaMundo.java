package com.targettrust.olamundo;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@Stateless
@WebService
public class OlaMundo implements OlaMundoRemote, OlaMundoLocal {

    @WebMethod
    @Override
    public String ola(@WebParam(name = "nome") String nome) {
        return "Olá, " + nome;
    }
}
