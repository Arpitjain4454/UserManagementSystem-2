package com.example.UserManagement.usermanagement.validation;


import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.LocalDate;
public class UserValidator implements ConstraintValidator<UserValid, LocalDate> {

    @Override
    public boolean isValid(LocalDate dateOfBirth, ConstraintValidatorContext context) {
        LocalDate today = LocalDate.now();
        LocalDate maxDate = today.minusYears(18);
        LocalDate minDate = today.minusYears(100);
        return dateOfBirth.isAfter(minDate) && dateOfBirth.isBefore(maxDate);
    }

}