package net;

import java.util.ArrayList;
import java.util.List;

import mvvm.Data;

/** does nothing! */
public class DummyNetworkManager implements INetworkManager {

    @Override
    public void connect() {
        // do nothing
    }

    @Override
    public List<Data> retrieveData() {
        return new ArrayList<>();
    }
}