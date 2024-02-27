package com.nttdata.project1.model;

import com.nttdata.project1.model.Enum.TypeCredit;
import lombok.Data;

@Data
public class Credit {
    private String id;
    private TypeCredit typeCredit;
    private double monto;
    private double saldoPendiente;
}

