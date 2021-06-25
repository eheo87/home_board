package kr.co.vo;

import java.util.Date;

public class BoardVO {
    private int bno;
    private String title;
    private String content;
    private String writer;
    private Date regdate;
    private int hit;
    private int Reply_Cnt;

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public int getReply_Cnt() {
        return Reply_Cnt;
    }

    public void setReply_Cnt(int reply_Cnt) {
        Reply_Cnt = reply_Cnt;
    }
}
