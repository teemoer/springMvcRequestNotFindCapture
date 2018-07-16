package sx.java.www.mvc.dto;

public class ErrorResult {
    private Integer errorCode;
    private String path;
    private String msg;
    private String method;

    public ErrorResult(Integer errorCode, String path, String method,String msg) {
        this.errorCode = errorCode;
        this.path = path;
        this.msg = msg;
        this.method = method;

    }

    public ErrorResult() {
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
