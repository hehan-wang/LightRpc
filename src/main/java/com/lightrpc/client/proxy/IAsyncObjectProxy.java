package com.lightrpc.client.proxy;

import com.lightrpc.client.RPCFuture;

/**
 * Created by david on 2016/3/16.
 */
public interface IAsyncObjectProxy {
    public RPCFuture call(String funcName, Object... args);
}