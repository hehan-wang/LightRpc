package com.lightrpc.client;

/**
 * Created by david on 2016-03-17.
 */
public interface AsyncRPCCallback {

    void success(Object result);

    void fail(Exception e);

}
