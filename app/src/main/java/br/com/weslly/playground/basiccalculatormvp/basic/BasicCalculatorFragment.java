package br.com.weslly.playground.basiccalculatormvp.basic;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import br.com.weslly.playground.basiccalculatormvp.R;
import br.com.weslly.playground.basiccalculatormvp.common.Digits;
import br.com.weslly.playground.basiccalculatormvp.model.Calc;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by weslly on 26/05/16.
 */
public class BasicCalculatorFragment extends Fragment implements ContractBasic.View {

    private static final String TAG = "BasicCalculatorFragment";
    private ContractBasic.Presenter mPresenter;
    private String mOperation;
    private BasicCalculatorFragment.ScreenCallBackBasicKeyBoard mCallBack;

    @BindView(R.id.one_digit_tv)
    TextView mOneDigit;
    @BindView(R.id.two_digit_tv)
    TextView mTwoDigit;
    @BindView(R.id.three_digit_tv)
    TextView mThreeDigit;
    @BindView(R.id.four_digit_tv)
    TextView mFourDigit;
    @BindView(R.id.five_digit_tv)
    TextView mFiveDigit;
    @BindView(R.id.six_digit_tv)
    TextView mSixDigit;
    @BindView(R.id.seven_digit_tv)
    TextView mSevenDigit;
    @BindView(R.id.eight_digit_tv)
    TextView mEigthDigit;
    @BindView(R.id.nine_digit_tv)
    TextView mNineDigit;
    @BindView(R.id.zero_digit_tv)
    TextView mZeroDigit;

    @BindView(R.id.clean_tv)
    TextView mClean;
    @BindView(R.id.left_parenthesis_tv)
    TextView mLeftParenthesis;
    @BindView(R.id.right_parenthesis_tv)
    TextView mRightParenthesis;
    @BindView(R.id.minus_sign_tv)
    TextView mMinusSign;
    @BindView(R.id.plus_sign_tv)
    TextView mPlusSing;
    @BindView(R.id.plus_minus_sign_tv)
    TextView mPlusMinusSign;
    @BindView(R.id.multiply_sign_tv)
    TextView mMultiplySign;
    @BindView(R.id.division_sign_tv)
    TextView mDivisionSing;
    @BindView(R.id.dot_sign_tv)
    TextView mDotSign;
    @BindView(R.id.equals_sign)
    TextView mEqualsSign;


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mCallBack = (ScreenCallBackBasicKeyBoard) context;
    }

    public static BasicCalculatorFragment newInstance() {

        Bundle args = new Bundle();

        BasicCalculatorFragment fragment = new BasicCalculatorFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.keyboard_basic, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

    @Override
    public void loadCalc(String digit) {
        mOperation += digit;
    }

    @Override
    public void showResult(String operation) {

    }

    @Override
    public void loadHistory(List<Calc> Calcs) {

    }

    @Override
    public void showHistory() {

    }

    @Override
    public void showEmptyHistory() {

    }

    @Override
    public void showInvalidOperationError() {

    }

    @OnClick(R.id.one_digit_tv)
    @Override
    public void showOneDigit() {
        mCallBack.showResultOnScreen(Digits.ONE);
    }

    @OnClick(R.id.two_digit_tv)
    @Override
    public void showTwoDigit() {
        mCallBack.showResultOnScreen(Digits.TWO);
    }

    @OnClick(R.id.three_digit_tv)
    @Override
    public void showThreeDigit() {
        mCallBack.showResultOnScreen(Digits.THREE);
    }

    @OnClick(R.id.four_digit_tv)
    @Override
    public void showFourDigit() {
        mCallBack.showResultOnScreen(Digits.FOUR);
    }

    @OnClick(R.id.five_digit_tv)
    @Override
    public void showFiveDigit() {
        mCallBack.showResultOnScreen(Digits.FIVE);
    }

    @OnClick(R.id.six_digit_tv)
    @Override
    public void showSixDigit() {
        mCallBack.showResultOnScreen(Digits.SIX);
    }

    @OnClick(R.id.seven_digit_tv)
    @Override
    public void showSevenDigit() {
        mCallBack.showResultOnScreen(Digits.SEVEN);
    }

    @OnClick(R.id.eight_digit_tv)
    @Override
    public void showEightDigit() {
        mCallBack.showResultOnScreen(Digits.EIGHT);
    }

    @OnClick(R.id.nine_digit_tv)
    @Override
    public void showNineDigit() {
        mCallBack.showResultOnScreen(Digits.NINE);
    }

    @OnClick(R.id.zero_digit_tv)
    @Override
    public void showZeroDigit() {
        mCallBack.showResultOnScreen(Digits.ZERO);
    }

    @OnClick(R.id.plus_sign_tv)
    @Override
    public void showPlus() {
        mCallBack.showResultOnScreen(Digits.PLUS);
    }


    @OnClick(R.id.minus_sign_tv)
    @Override
    public void showMinus() {
        mCallBack.showResultOnScreen(Digits.MINUS);
    }

    @OnClick(R.id.multiply_sign_tv)
    @Override
    public void showMultiply() {
        mCallBack.showResultOnScreen(Digits.MULTIPLY);

    }

    @OnClick(R.id.division_sign_tv)
    @Override
    public void showDivision() {
        mCallBack.showResultOnScreen(Digits.DIVISION);
    }

    @OnClick(R.id.left_parenthesis_tv)
    @Override
    public void showLeftParenthesis() {
        mCallBack.showResultOnScreen(Digits.LEFT_PARENTHESIS);
    }

    @OnClick(R.id.right_parenthesis_tv)
    @Override
    public void showRightParenthesis() {
        mCallBack.showResultOnScreen(Digits.RIGHT_PARENTHESIS);
    }

    @OnClick(R.id.dot_sign_tv)
    @Override
    public void showDot() {
        mCallBack.showResultOnScreen(Digits.DOT);
    }

    @OnClick(R.id.plus_minus_sign_tv)
    @Override
    public void showPlusMinus() {
       String valor = mPresenter.plusMinusValues(mCallBack.getOperationOnScrean());
        mCallBack.showResultOnScreen(valor);
    }


    @Override
    public void showClean() {

    }

    @Override
    public void setPresenter(ContractBasic.Presenter presenter) {
        this.mPresenter = presenter;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mCallBack = null;
    }

    public interface ScreenCallBackBasicKeyBoard {
        void showResultOnScreen(String result);

        void showCalcOnScreen(String result);
        String getOperationOnScrean();

    }
}
