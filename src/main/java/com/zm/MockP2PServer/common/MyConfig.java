package com.zm.MockP2PServer.common;

import com.zm.frame.conf.Config;

import java.io.IOException;

/**
 * Created by zhangmin on 2017/8/23.
 */
public class MyConfig extends Config {
    private int port;
    private ConnectionType cntType;
    private static int maxPacketSize;

    public MyConfig(String filePath) throws IOException {
        super(filePath);
        this.maxPacketSize = getInt("maxPacketSize");
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public ConnectionType getCntType() {
        return cntType;
    }

    public void setCntType(ConnectionType cntType) {
        this.cntType = cntType;
    }

    public static int getMaxPacketSize() {
        return maxPacketSize;
    }
}