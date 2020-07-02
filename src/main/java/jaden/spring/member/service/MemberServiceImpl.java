package jaden.spring.member.service;

import jaden.spring.common.annotation.TimeCheck;
import jaden.spring.member.vo.MemberVO;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{
    @TimeCheck
    public void regist(MemberVO member) {
        System.out.println("회원등록");
    }

    public boolean update(String name, MemberVO member) {
        System.out.println("회원 정보 변경");
        return true;
    }
}
