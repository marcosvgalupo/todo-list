package br.edu.unifalmg.exception;

public class FileIsEmptyException extends RuntimeException{
    public FileIsEmptyException(String message){
        super(message);
    }
}