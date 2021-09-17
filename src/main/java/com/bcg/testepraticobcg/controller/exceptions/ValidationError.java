package com.bcg.testepraticobcg.controller.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {

    private final List<FieldMessage> errors = new ArrayList<>();

    public List<FieldMessage> getErrors() {
        return errors;
    }

    public void addError(String fieldName, String msg) {
        errors.add(new FieldMessage(fieldName,msg));
    }
}
