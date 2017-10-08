package mode.design.lxy.com.designmode.responsibility;

/**
 * Created by lxy on 2017/10/2.
 * 具体处理者 爸爸
 */

public class Father extends BaseHandler{


    protected Father(int money) {
        super(money);
    }

    @Override
    protected void hand(int money) {
        System.out.println("=======爸爸的私房钱也就这么点了，省着点花");
    }
}
