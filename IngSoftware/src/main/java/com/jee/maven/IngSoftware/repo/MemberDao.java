package com.jee.maven.IngSoftware.repo;

import java.util.List;

import com.jee.maven.IngSoftware.domain.Member;

public interface MemberDao
{
    public Member findById(Long id);

    public Member findByEmail(String email);

    public List<Member> findAllOrderedByName();

    public void register(Member member);
}
