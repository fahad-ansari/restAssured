package api_payload;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

public class Root {
    private String status;

    @JsonProperty("request_id")
    private String requestId;

    private Parameters parameters;
    private Data data;

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getRequestId() {
        return requestId;
    }
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
    public Parameters getParameters() {
        return parameters;
    }
    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }
    public Data getData() {
        return data;
    }
    public void setData(Data data) {
        this.data = data;
    }
}