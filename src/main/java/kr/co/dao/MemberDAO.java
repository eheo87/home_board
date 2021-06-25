package kr.co.dao;

import kr.co.vo.MemberVO;

public interface MemberDAO {

    //회원가입
    void register(MemberVO vo) throws Exception;

    //로그인
    MemberVO login(MemberVO vo) throws Exception;

    //회원정보 수정
    void memberUpdate(MemberVO vo) throws Exception;

    //회원 탈퇴
    void memberDelete(MemberVO vo) throws Exception;

    //패스워드 체크
    int passChk(MemberVO vo) throws Exception;

    //아이디 중복 체크
    int idChk(MemberVO vo) throws Exception;
}
