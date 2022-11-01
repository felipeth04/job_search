package com.platzi.jobsearch.cli;

import com.beust.jcommander.Parameter;

public class CLIArguments {

    @Parameter(
            names = {
                    "--markdown",
                    "-md"
            },
            description = "get the results in markdown version"

    )
    private Boolean isMarkDown = false;

    @Parameter(
            names = {
                    "--help",
                    "-h"
            },
            help = true,
            description = "Show all help"
    )
    private Boolean isHelp;

    @Parameter(
            names = {
                    "--full-time",
                    "-ft"
            },
            description = "personalize your search with this parameter and get results to full time open positions"
    )
    private Boolean isFullTime = false;

    @Parameter(
            names = {
                    "--page",
                    "-p"
            },
            description = "the API returns 50 results per page"
    )
    private Integer page = 0;

    @Parameter(
            required = true,
            descriptionKey = "KEYWORD",
            description = "KEY WORD"
    )
    private String keyWord;

    @Parameter(
            names = {
                    "--location",
                    "-l"
            },
            description = "Each search could include a location"
    )
    private String location;

    CLIArguments(){

    }

    public Integer getPage() {
        return page;
    }
    public Boolean getFullTime() {
        return isFullTime;
    }
    public Boolean getMarkDown() {
        return isMarkDown;
    }
    public Boolean getHelp() {
        return isHelp;
    }
    public String getKeyWord() {
        return keyWord;
    }
    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "CLIArguments{" +
                "page=" + page +
                ", isFullTime=" + isFullTime +
                ", isMarkDown=" + isMarkDown +
                ", isHelp=" + isHelp +
                ", keyWord='" + keyWord + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public static CLIArguments newInstance(){
        return new CLIArguments();
    };
}
