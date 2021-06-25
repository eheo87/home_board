package kr.co.service;

import kr.co.vo.ReplyVO;

import java.util.List;

public interface ReplyService {

    
    //댓글 조회
    public List<ReplyVO> readReply(int bno) throws Exception;

    
    //댓글 작성
    public void writeReply(ReplyVO vo) throws Exception;

    //댓글 수정
    public void updateReply(ReplyVO vo) throws Exception;

    //댓글 삭제
    public void deleteReply(ReplyVO vo) throws Exception;

    //선택한 댓글 조회
    public ReplyVO selectReply(int rno) throws Exception;

    //게시물 댓글 개수
    int replyCnt(int bno) throws Exception;
}
