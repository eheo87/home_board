package kr.co.dao;

import kr.co.vo.BoardVO;
import kr.co.vo.SearchCriteria;

import java.util.List;
import java.util.Map;

public interface BoardDAO {
    // 게시글 작성
    public void write(BoardVO boardVO) throws Exception;

    // 게시물 목록 조회
    public List<BoardVO> list(SearchCriteria scri) throws Exception;

    // 게시물 총 갯수
    public int listCount(SearchCriteria scri) throws Exception;

    //게시믈 조회
    public BoardVO read(int bno) throws Exception;

    // 게시물 수정
    public void update(BoardVO boardVO) throws Exception;

    // 게시물 삭제
    public void delete(int bno) throws Exception;

    // 첨부파일 업로드
    void insertFile(Map<String, Object> map) throws Exception;

    // 첨부파일 조회
    List<Map<String , Object>> selectFileList(int bno) throws Exception;

    //첨부파일 다운
    Map<String , Object> selectFileInfo(Map<String, Object> map) throws Exception;

    //첨부파일 수정
    void updateFile(Map<String ,Object> map) throws Exception;

    //게시판 조회수
    void boardHit(int bno) throws Exception;

    void updateReplyCnt(int bno) throws Exception;
}
