package com.github.yanzheshi.behavior.chainofresponsibility;

/**
 * 抽象处理类
 * @author shiyanzhe
 */
public abstract class AbstractHandler {
    private AbstractHandler next;

    /**
     * 如果请求级别不符， 交由其他类处理
     * @param request
     * @return
     */
    public final Response handleMessage(Request request) {
        Response response = null;
        //判断是否是自己的处理级别
        if (getHandleLevel().equals(request.getRequestLevel())) {
            response = echo(request);
        } else {
            if (next != null) {
                response = next.handleMessage(request);
            } else {
                //没有相应级别的处理者
                throw new RuntimeException("没有相应处理者");
            }
        }
        return response;
    }

    /**
     * 返回处理者的处理级别
     * @return
     */
    protected abstract Level getHandleLevel();

    /**
     * 处理任务方法
     * @param request
     * @return
     */
    protected abstract Response echo(Request request);



    public AbstractHandler getNext() {
        return next;
    }

    public void setNext(AbstractHandler next) {
        this.next = next;
    }
}
