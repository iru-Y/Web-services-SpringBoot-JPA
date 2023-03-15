package com.crud.project.yuri.projectcrud.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    public static final long serialVersionUID= 1l;
    public ResourceNotFoundException(Object id){
        super("Resource not found. Id: " + id);
    }
}
