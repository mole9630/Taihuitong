package top.taiht.pojo.article;

public class Article {
    // 私有成员变量
    private Integer aID;
    private String aTitle;
    private String aAuthor;
    private String aTime;
    private String aContent;

    public Article() {
    }

    public Article(Integer aID, String aTitle, String aAuthor, String aTime, String aContent) {
        this.aID = aID;
        this.aTitle = aTitle;
        this.aAuthor = aAuthor;
        this.aTime = aTime;
        this.aContent = aContent;
    }

    public Integer getaID() {
        return aID;
    }
    public void setaID(Integer aID) {
        this.aID = aID;
    }
    public String getaTitle() {
        return aTitle;
    }
    public void setaTitle(String aTitle) {
        this.aTitle = aTitle;
    }
    public String getaAuthor() {
        return aAuthor;
    }
    public void setaAuthor(String aAuthor) {
        this.aAuthor = aAuthor;
    }
    public String getaTime() {
        return aTime;
    }
    public void setaTime(String aTime) {
        this.aTime = aTime;
    }
    public String getaContent() {
        return aContent;
    }
    public void setaContent(String aContent) {
        this.aContent = aContent;
    }
}
