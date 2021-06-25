package kr.co.service;

import kr.co.dao.BoardDAO;
import kr.co.dao.ReplyDAO;
import kr.co.vo.ReplyVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.List;

@Service
public class ReplyServiceImpl implements ReplyService {
    @Inject
    private ReplyDAO dao;

    @Override
    public List<ReplyVO> readReply(int bno) throws  Exception{
        return dao.readReply(bno);
    }

    @Override
    public void writeReply(ReplyVO vo) throws Exception{
        dao.writeReply(vo);
    }

    @Override
    public void updateReply(ReplyVO vo) throws Exception {
        dao.updateReply(vo);
    }

    @Override
    public void deleteReply(ReplyVO vo) throws Exception {
        dao.deleteReply(vo);
    }

    @Override
    public ReplyVO selectReply(int rno) throws Exception {
        return dao.selectReply(rno);
    }

    @Override
    public int replyCnt(int bno) throws Exception {
        return dao.replyCnt(bno);
    }
}
