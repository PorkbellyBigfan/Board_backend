package com.porkbelly.board.repository.article;

import com.porkbelly.board.entity.article.PopularSearch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PopularSearchRepository extends JpaRepository<PopularSearch, String> {
}
