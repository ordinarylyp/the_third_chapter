package lyp.com.uibestpractice;

/**
 * Created by lyp on 2018/4/29.
 */

public class Msg {
    public static final int TYPE_RECEIVED=0;

    public static final int TYPE_SENT=1;

    private String content;//消息的内容
    private int type;//消息的类型

    public Msg(String content, int type) {
        this.content = content;
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public int getType() {
        return type;
    }
}
