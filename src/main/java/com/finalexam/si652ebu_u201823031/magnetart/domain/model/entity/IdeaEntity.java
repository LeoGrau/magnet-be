package com.finalexam.si652ebu_u201823031.magnetart.domain.model.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ideas")
public class IdeaEntity {
    @EmbeddedId
    private IdeaPKEntity composedPk;

    @Column(name = "initial_samples")
    private Integer initialSamples;

    public IdeaPKEntity getComposedPk() {
        return composedPk;
    }

    public void setComposedPk(IdeaPKEntity composedPk) {
        this.composedPk = composedPk;
    }

    public Integer getInitialSamples() {
        return initialSamples;
    }

    public void setInitialSamples(Integer initialSamples) {
        this.initialSamples = initialSamples;
    }
}
