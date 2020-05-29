package net;

import java.util.List;

import mvvm.Data;

public interface INetworkManager {

    List<Data> retrieveData();
    void connect();
}