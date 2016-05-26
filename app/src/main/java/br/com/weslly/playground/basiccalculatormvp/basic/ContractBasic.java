package br.com.weslly.playground.basiccalculatormvp.basic;

import java.util.List;

import br.com.weslly.playground.basiccalculatormvp.BasePresenter;
import br.com.weslly.playground.basiccalculatormvp.BaseView;
import br.com.weslly.playground.basiccalculatormvp.model.Calc;

/**
 * Created by weslly on 26/05/16.
 */
public interface ContractBasic {
    interface View extends BaseView<Presenter>{
        void loadCalc();
        void showResult(String operation);
        void loadHistory(List<Calc> Calcs);
        void showHistory();
        void showEmptyHistory();
        void showInvalidOperationError();

   }

    interface Presenter extends BasePresenter{
        String calculateSum(String operation);
        String  calculateSubtraction(String operation);
        String  calculateDivision(String operation);
        String  calculateMultiplication(String operation);
        void calcOperation();
    }
}
