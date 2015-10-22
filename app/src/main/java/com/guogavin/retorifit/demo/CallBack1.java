package com.guogavin.retorifit.demo;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by help on 2015-10-14.
 */
public class CallBack1<T> implements Callback<T>{
    @Override
    public void success(Object o, Response response) {
    }

    @Override
    public void failure(RetrofitError retrofitError) {
    }

}
