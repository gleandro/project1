package com.nttdata.project1.model;

import com.nttdata.project1.model.Enum.TypeAccount;
import lombok.Data;

@Data
public class Account {
    private String id;
    private TypeAccount typeAccount;
    private double balance;
    private int moveLimit;
}

