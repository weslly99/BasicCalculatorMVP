package br.com.weslly.playground.basiccalculatormvp.model;

import java.util.UUID;

/**
 * Created by weslly on 26/05/16.
 */
public class Calc {

    private UUID mUUID;
    private String mOperation;
    private String mResult;

    public Calc(UUID uuid){
        this(uuid,null,null);
    }

    public Calc(String operation,String result){
        this(UUID.randomUUID(),operation,result);
    }

    public Calc(UUID uuid, String operation,String result){
        mUUID = uuid;
        mOperation = operation;
        mResult = result;
    }

    public UUID getUUID() {
        return mUUID;
    }

    public String getOperation() {
        return mOperation;
    }

    public void setOperation(String operation) {
        mOperation = operation;
    }

    public String getResult() {
        return mResult;
    }

    public void setResult(String result) {
        mResult = result;
    }
}
