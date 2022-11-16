// Return a programmer-defined object.
class Err {
    String msg; // error message
    int severity; // code indicating severity of error
    Err(String m, int s) {
        msg = m;
        severity = s;
    }
}
class ErrorInfo {

    final int OUTERR = 0;
    final int INERR = 1;
    final int DISKERR = 2;
    final int INDEXERR = 3;

    String[] msgs = {
            "Output Error",
            "Input Error",
            "Disk Full",
            "Index Out-Of-Bounds"
    };
    int[] howBad = { 3, 3, 2, 4 };
    Err getErrorInfo(int i) {
        if(i >= 0 & i < msgs.length)
            return new Err(msgs[i], howBad[i]);
        else
            return new Err("Invalid Error Code", 0);
    }
    String getErrMsg(int i){
        if(i >= 0 && i < msgs.length)
            return  msgs[i];
        else
            return "Invalid error code";
    }
}
class ErrInfo {
    public static void main(String[] args) {
        ErrorInfo err = new ErrorInfo();
        Err e;
        e = err.getErrorInfo(2);
        System.out.println(e.msg + " severity: " + e.severity);
        e = err.getErrorInfo(19);
        System.out.println(e.msg + " severity: " + e.severity);

        System.out.println(err.getErrMsg(err.INDEXERR));
        var test = new Object();
        String str = test.toString();
        System.out.println(str);
    }
}