package kr.co.service;

import kr.co.vo.MemberVO;

public interface MemberService {
    void register(MemberVO vo) throws Exception;

    MemberVO login(MemberVO vo) throws Exception;

    void memberUpdate(MemberVO vo) throws Exception;

    void memberDelete(MemberVO vo) throws Exception;

    int passChk(MemberVO vo) throws Exception;

    int idChk(MemberVO vo) throws Exception;
}
