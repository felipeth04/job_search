package com.platzi.jobsearch.cli;
import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.ParameterException;

public class CLIHelpValidator implements IParameterValidator {

    @Override
    public void validate(String name, String value) throws ParameterException {
        Boolean currentlyValue = Boolean.parseBoolean(value);
        if (currentlyValue){
            throw new ParameterException("Request Help");
        }
    }
}
