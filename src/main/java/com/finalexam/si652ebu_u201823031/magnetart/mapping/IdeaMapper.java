package com.finalexam.si652ebu_u201823031.magnetart.mapping;

import com.finalexam.si652ebu_u201823031.magnetart.domain.model.entity.IdeaEntity;
import com.finalexam.si652ebu_u201823031.magnetart.resource.IdeaResource;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IdeaMapper {

    @Mappings({
            @Mapping(target = "textQuery", source = "composedPk.textQuery"),
            @Mapping(target = "authorId", source = "composedPk.authorId")
    })
    IdeaResource IdeaEntityToIdeaResource(IdeaEntity ideaResource);
    List<IdeaResource> IdeaEntitiesToIdeaResources(List<IdeaEntity> ideaResources);

    @InheritInverseConfiguration
    IdeaEntity IdeaResourceToIdeaEntity(IdeaResource ideaResource);
    List<IdeaEntity> IdeaResourcesToIdeaEntities(List<IdeaResource> ideaResources);
}
