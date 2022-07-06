package com.finalexam.si652ebu_u201823031.magnetart.domain.persistence;

import com.finalexam.si652ebu_u201823031.magnetart.domain.model.entity.IdeaEntity;
import com.finalexam.si652ebu_u201823031.magnetart.domain.model.entity.IdeaPKEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IdeaEntityRepository extends CrudRepository<IdeaEntity, IdeaPKEntity> {
    Optional<IdeaEntity> findByComposedPk_AuthorId(long authorId);
    Optional<IdeaEntity> findByComposedPk_TextQuery(String authorId);
    List<IdeaEntity> findByInitialSamples(int initialSamples);
}
