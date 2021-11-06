package com.example.retrofit;

public class CreateOrgLog {
    private boolean success;
    private OrgLogResponse response;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public OrgLogResponse getResponse() {
        return response;
    }

    public void setResponse(OrgLogResponse response) {
        this.response = response;
    }
}
