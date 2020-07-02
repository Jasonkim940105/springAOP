package jaden.spring.member.service;

import jaden.spring.member.vo.MemberVO;

public interface MemberService {
    void regist(MemberVO member);
    boolean update(String name, MemberVO member);
}
