package com.siwon.swlms.member.repository;

import com.siwon.swlms.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MemberRepository extends JpaRepository<Member, String> {

}
