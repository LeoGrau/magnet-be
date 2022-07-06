package com.finalexam.si652ebu_u201823031.magnetart.domain.service;

import com.finalexam.si652ebu_u201823031.magnetart.resource.IdeaResource;

import java.util.List;
import java.util.Optional;

public interface IdeaService {
    Optional<IdeaResource> getIdeaByAuthorId(long authorId);

    Optional<IdeaResource> getIdeaByTextQuery(String textQuery);

    List<IdeaResource> getIdeasByInitialSamples(int initialSamples);

    List<IdeaResource> getAllIdeas();

    IdeaResource createNewIdea(IdeaResource ideaResource);
}
