package code.um;


public class HtmlDocument {
    public String content;

    public void makeBold() {
        content = "<b>" + content + "</b>";
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
