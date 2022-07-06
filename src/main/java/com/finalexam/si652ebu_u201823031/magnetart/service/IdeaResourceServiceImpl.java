package com.finalexam.si652ebu_u201823031.magnetart.service;

import com.finalexam.si652ebu_u201823031.magnetart.domain.model.entity.IdeaEntity;
import com.finalexam.si652ebu_u201823031.magnetart.domain.persistence.IdeaEntityRepository;
import com.finalexam.si652ebu_u201823031.magnetart.domain.service.IdeaService;
import com.finalexam.si652ebu_u201823031.magnetart.mapping.IdeaMapper;
import com.finalexam.si652ebu_u201823031.magnetart.resource.IdeaResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IdeaResourceServiceImpl implements IdeaService {

    @Autowired
    private IdeaMapper ideaMapper;

    @Autowired
    private IdeaEntityRepository ideaEntityRepository;

    @Override
    public Optional<IdeaResource> getIdeaByAuthorId(long authorId) {
        return ideaEntityRepository.findByComposedPk_AuthorId(authorId).map(idea -> ideaMapper.IdeaEntityToIdeaResource(idea));
    }

    @Override
    public Optional<IdeaResource> getIdeaByTextQuery(String textQuery) {
        return ideaEntityRepository.findByComposedPk_TextQuery(textQuery).map(idea -> ideaMapper.IdeaEntityToIdeaResource(idea));
    }

    @Override
    public List<IdeaResource> getIdeasByInitialSamples(int initialSamples) {
        List<IdeaEntity> ideaEntities = (List<IdeaEntity>) ideaEntityRepository.findByInitialSamples(initialSamples);
        return ideaMapper.IdeaEntitiesToIdeaResources(ideaEntities);
    }

    @Override
    public List<IdeaResource> getAllIdeas() {
        List<IdeaEntity> ideaEntities = (List<IdeaEntity>) ideaEntityRepository.findAll();
        return ideaMapper.IdeaEntitiesToIdeaResources(ideaEntities);
    }

    @Override
    public IdeaResource createNewIdea(IdeaResource ideaResource) {
        IdeaEntity ideaEntity = ideaMapper.IdeaResourceToIdeaEntity(ideaResource);
        return ideaMapper.IdeaEntityToIdeaResource(ideaEntityRepository.save(ideaEntity));
    }
}
