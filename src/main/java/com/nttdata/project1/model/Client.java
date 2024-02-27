package com.nttdata.project1.model;

import com.nttdata.project1.model.Enum.TypeClient;
import lombok.Data;

import java.util.List;

@Data
public class Client {
    private String id;
    private String name;
    private TypeClient typeClient;
    private List<Account> cuentas;
    private List<Credit> productosCredito;
}

