package com.porkbelly.board.repository.member;

import com.porkbelly.board.entity.user.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
