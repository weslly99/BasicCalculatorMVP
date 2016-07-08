package br.com.weslly.playground.basiccalculatormvp.basic;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by weslly on 27/05/16.
 */
public class BasicPresenter implements ContractBasic.Presenter {

    ContractBasic.View mView;

    public BasicPresenter(ContractBasic.View view) {
        mView = view;
        mView.setPresenter(this);
    }

    @Override
    public String validateOperation() {
        return null;
    }

    @Override
    public String calculateSum(BigDecimal operandOne, BigDecimal operandTwo) {
        return null;
    }

    @Override
    public String calculateSubtraction(BigDecimal operandOne, BigDecimal operandTwo) {
        return null;
    }

    @Override
    public String calculateDivision(BigDecimal operandOne, BigDecimal operandTwo) {
        return null;
    }

    @Override
    public String calculateMultiplication(BigDecimal operandOne, BigDecimal operandTwo) {
        return null;
    }

    @Override
    public String plusMinusValues(String value) {
        String[] array = breakOperation(value);
        value = value.replaceAll(array[array.length -1],"(-"+array[array.length -1]);

        return value;
    }

    @Override
    public void calcOperation(String operation) {
        StringBuilder builder = new StringBuilder(operation);
        Pattern pattern = Pattern.compile(".*[\\( .* \\)].*");
        Matcher matcher = pattern.matcher(builder);
        matcher.matches();

    }

    @Override
    public void precedence(String value) {

    }



    @Override
    public String[] breakOperation(String value) {
        StringBuilder builder = new StringBuilder();
        String[] v = value.split("[\\D]");

        return v;
    }


    @Override
    public void start() {

    }
}
