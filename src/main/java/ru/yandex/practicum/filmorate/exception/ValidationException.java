package ru.yandex.practicum.filmorate.exception;

public class ValidationException extends RuntimeException {
    private String message;
    public ValidationException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return message;
    }
}
