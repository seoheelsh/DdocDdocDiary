package com.forkoon.board.persistence;

import org.springframework.data.repository.CrudRepository;

import com.forkoon.board.domain.Member;

public interface MemberRepository extends CrudRepository<Member, String> {
}
