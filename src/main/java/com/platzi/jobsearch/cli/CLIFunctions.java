package com.platzi.jobsearch.cli;

import java.util.HashMap;
import java.util.Map;

public class CLIFunctions {
    public static Map<String,Object> toMap(CLIArguments cliArguments){
        Map<String,Object> params = new HashMap<>();
        params.put("description",cliArguments.getKeyWord());
        params.put("location", cliArguments.getLocation());
        params.put("full time", cliArguments.getFullTime());
        params.put("page", cliArguments.getPage());

        if(cliArguments.getMarkDown()){
            params.put("markdown", true);
        };

        return params;

    }
}
