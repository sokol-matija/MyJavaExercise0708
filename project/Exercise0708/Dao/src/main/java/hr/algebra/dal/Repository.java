package hr.algebra.dal;

import hr.algebra.model.Article;
import java.util.List;
import java.util.Optional;

public interface Repository {

    int createArticle(Article article) throws Exception;

    void createArticles(List<Article> articles) throws Exception;

    void updateArticle(int id, Article article) throws Exception;

    void deleteArticle(int id) throws Exception;

    Optional<Article> selectArticle(int id) throws Exception;

    List<Article> selectArticles() throws Exception;

}
