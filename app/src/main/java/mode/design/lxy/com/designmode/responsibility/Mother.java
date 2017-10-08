package mode.design.lxy.com.designmode.responsibility;

/**
 * Created by lxy on 2017/10/2.
 * 具体处理者 妈妈
 */

public class Mother extends BaseHandler{

    protected Mother(int money) {
        super(money);
    }

    @Override
    protected void hand(int money) {
        System.out.println("=======妈妈有钱，拿去花");
    }
}
