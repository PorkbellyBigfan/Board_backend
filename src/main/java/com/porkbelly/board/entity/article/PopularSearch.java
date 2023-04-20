package com.porkbelly.board.entity.article;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PopularSearch {
    //인기검색어
    @Id
    private String popularTerm;
    @Column
    private Long popularSearchCount;
}
