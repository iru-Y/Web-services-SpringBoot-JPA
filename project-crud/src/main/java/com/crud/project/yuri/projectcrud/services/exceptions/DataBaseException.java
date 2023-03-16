package com.crud.project.yuri.projectcrud.services.exceptions;

public class DataBaseException extends RuntimeException{
    public static final long serialVersionUID = 1l;

    public DataBaseException (String msg){
        super(msg);
    }
}
