package ru.netology.domain;

public class NotFoundExeption extends RuntimeException{

    public NotFoundExeption(String message) {
        super(message);
    }
}
