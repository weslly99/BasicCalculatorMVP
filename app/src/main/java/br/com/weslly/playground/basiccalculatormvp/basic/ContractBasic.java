package br.com.weslly.playground.basiccalculatormvp.basic;

import java.math.BigDecimal;
import java.util.List;

import br.com.weslly.playground.basiccalculatormvp.BasePresenter;
import br.com.weslly.playground.basiccalculatormvp.BaseView;
import br.com.weslly.playground.basiccalculatormvp.model.Calc;

/**
 * Created by weslly on 26/05/16.
 */
public interface ContractBasic {
    interface View extends BaseView<Presenter> {
        void loadCalc(String digit);

        void showResult(String operation);

        void loadHistory(List<Calc> Calcs);

        void showHistory();

        void showEmptyHistory();

        void showInvalidOperationError();

        void showOneDigit();

        void showTwoDigit();

        void showThreeDigit();

        void showFourDigit();

        void showFiveDigit();

        void showSixDigit();

        void showSevenDigit();

        void showEightDigit();

        void showNineDigit();

        void showZeroDigit();

        void showPlus();

        void showMinus();

        void showMultiply();

        void showDivision();

        void showLeftParenthesis();

        void showRightParenthesis();

        void showDot();

        void showPlusMinus();

        void showClean();

    }

    interface Presenter extends BasePresenter {
        String validateOperation();

        String calculateSum(BigDecimal operandOne, BigDecimal operandTwo);

        String calculateSubtraction(BigDecimal operandOne, BigDecimal operandTwo);

        String calculateDivision(BigDecimal operandOne, BigDecimal operandTwo);

        String calculateMultiplication(BigDecimal operandOne, BigDecimal operandTwo);

        String plusMinusValues(String value);

        void calcOperation(String operation);

        void precedence(String value);

        String[] breakOperation(String value);

    }
}
