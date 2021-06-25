package kr.co.service;

import kr.co.dao.MemberDAO;
import kr.co.vo.MemberVO;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class MemberServiceImpl implements MemberService {

    @Inject
    MemberDAO dao;

    @Override
    public void register(MemberVO vo) throws Exception {

        dao.register(vo);

    }

    @Override
    public MemberVO login(MemberVO vo) throws Exception {
        return dao.login(vo);
    }

    @Override
    public void memberUpdate(MemberVO vo) throws Exception {
        dao.memberUpdate(vo);
    }

    @Override
    public void memberDelete(MemberVO vo) throws Exception {
        dao.memberDelete(vo);
    }

    @Override
    public int passChk(MemberVO vo) throws Exception {
        int result= dao.passChk(vo);
        return result;
    }

    @Override
    public int idChk(MemberVO vo) throws Exception {
        int result = dao.idChk(vo);
        return result;
    }

}