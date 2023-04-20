package com.porkbelly.board.repository.member;

import com.porkbelly.board.entity.visitor.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitorRepository extends JpaRepository<Visitor, Long> {
}
