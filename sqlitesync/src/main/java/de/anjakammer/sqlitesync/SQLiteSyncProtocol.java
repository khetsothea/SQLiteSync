package de.anjakammer.sqlitesync;


import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.List;

public interface SQLiteSyncProtocol {

    String KEY_DB_ID = "dbId";
    String KEY_NAME = "name";
    String KEY_MESSAGE = "message";
    String VALUE_DELTA = "DELTA";
    String VALUE_SYNCREQUEST = "SYNCREQUEST";
    String VALUE_OK = "OK";
    String VALUE_CLOSE = "CLOSE";

    void syncRequest();

    List<String> getPeers();

    void sendDelta(JSONObject delta);

    HashMap<String, CommObject> receiveResponse(HashMap<String, CommObject> inputMap);

    void sendOK();

    void sendClose();
}
