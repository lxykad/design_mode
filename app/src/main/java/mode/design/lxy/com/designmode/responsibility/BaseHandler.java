package mode.design.lxy.com.designmode.responsibility;

/**
 * Created by lxy on 2017/10/1.
 * 抽象基类
 * 包含指向下一个处理类的成员变量 mNextHandler 和一个具体处理的方法 handEvent
 */

public abstract class BaseHandler {

    private BaseHandler mNextHandler;

    public int mMaxMoney;

    protected BaseHandler(int money) {
        mMaxMoney = money;
    }

    public void setNextHandler(BaseHandler handler) {
        mNextHandler = handler;
    }

    //具体处理的方法
    protected void handEvent(int money) {
        if (money <= mMaxMoney) {
            hand(money);
        } else {
            if (mNextHandler==null) {
                System.out.println("======麻蛋  去找你马云爸爸");
            }else {
                mNextHandler.handEvent(money);
            }
        }
    }

    protected abstract void hand(int money);

}
