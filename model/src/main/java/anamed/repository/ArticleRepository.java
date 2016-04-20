package anamed.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import anamed.entity.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {

}
