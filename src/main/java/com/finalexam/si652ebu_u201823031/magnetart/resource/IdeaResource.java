package com.finalexam.si652ebu_u201823031.magnetart.resource;

public class IdeaResource {
    private Long authorId;
    private String textQuery;
    private Integer initialSamples;

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getTextQuery() {
        return textQuery;
    }

    public void setTextQuery(String textQuery) {
        this.textQuery = textQuery;
    }

    public Integer getInitialSamples() {
        return initialSamples;
    }

    public void setInitialSamples(Integer initialSamples) {
        this.initialSamples = initialSamples;
    }
}
