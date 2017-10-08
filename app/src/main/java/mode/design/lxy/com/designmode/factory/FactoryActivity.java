package mode.design.lxy.com.designmode.factory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import mode.design.lxy.com.designmode.R;

public class FactoryActivity extends AppCompatActivity {

    private Product mProduct;
    private Factory mFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory);

        mFactory = new ProductFactory();
        mProduct = mFactory.createProduct(BoyFriendProduct.class);

        mProduct.createProduct();
    }

    //生产一个朋友
    public void clickCreate(View view) {

    }
}


