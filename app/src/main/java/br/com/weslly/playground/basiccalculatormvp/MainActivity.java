package br.com.weslly.playground.basiccalculatormvp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import br.com.weslly.playground.basiccalculatormvp.basic.BasicCalculatorFragment;
import br.com.weslly.playground.basiccalculatormvp.basic.BasicPresenter;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements BasicCalculatorFragment.ScreenCallBackBasicKeyBoard {

    private List<BaseView> mKeyBoardFragmentList;

    private StringBuilder mSentence;

    @BindView(R.id.keyboard_vp)
    ViewPager mKeyboardViewPager;
    @BindView(R.id.operation_tv)
    TextView mOperationField;
    @BindView(R.id.result_tv)
    TextView mResultField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mKeyBoardFragmentList = new ArrayList<>();
        mSentence = new StringBuilder();


        setupViewPager();
    }

    void setupViewPager() {

        BasicCalculatorFragment basic = BasicCalculatorFragment.newInstance();
        BasicPresenter basicPresenter = new BasicPresenter(basic);

        mKeyBoardFragmentList.add(basic);
        mKeyBoardFragmentList.add(BasicCalculatorFragment.newInstance());
        mKeyBoardFragmentList.add(BasicCalculatorFragment.newInstance());

        FragmentManager fm = getSupportFragmentManager();

        mKeyboardViewPager.setAdapter(new FragmentPagerAdapter(fm) {
            @Override
            public Fragment getItem(int position) {
                return (Fragment) mKeyBoardFragmentList.get(position);
            }

            @Override
            public int getCount() {
                return mKeyBoardFragmentList.size();
            }
        });

        mKeyboardViewPager.setCurrentItem(0);
    }

    @Override
    public void showResultOnScreen(String result) {
        mSentence.append(result);
        mOperationField.setText(mSentence.toString());

    }

    @Override
    public void showCalcOnScreen(String result) {

    }

    @Override
    public String getOperationOnScrean() {
        return mSentence.toString();
    }

    @OnClick(R.id.backspace_iv)
    public void showBackSpace() {
        if (mSentence != null && mSentence.toString() != "" && mSentence.length() > 0) {
            mSentence.deleteCharAt(mSentence.length() - 1);
        }
        mOperationField.setText(mSentence);
    }

}
