package com.porkbelly.board.entity.visitor;

import com.porkbelly.board.entity.article.Article;
import com.porkbelly.board.entity.etc.DateEntity;
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
public class Visitor extends DateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long visitorId;

//    @Column
//    private String prevLink;

    @ManyToOne
    private Article article;

}
