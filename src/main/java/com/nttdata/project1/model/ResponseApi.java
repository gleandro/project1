package com.nttdata.project1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
public class ResponseApi<T> {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

}
