package cn.riversky;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/23.
 */
public class HelloService {
    private String msg;
public String sayHello(){
    return "Hello"+msg;
}

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
