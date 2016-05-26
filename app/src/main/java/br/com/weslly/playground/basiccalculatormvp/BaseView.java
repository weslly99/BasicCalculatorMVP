package br.com.weslly.playground.basiccalculatormvp;

/**
 * Created by weslly on 26/05/16.
 */
public interface BaseView<T> {
    void setPresenter(T presenter);
}
