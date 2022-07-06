package com.finalexam.si652ebu_u201823031.magnetart.domain.model.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Embeddable
public class IdeaPKEntity implements Serializable {
    @Column(name = "author_id", insertable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long authorId;

    @Column(name = "text_query")
    private String textQuery;

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
}
