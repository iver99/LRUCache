package oracle.chehao.exception;

import oracle.chehao.util.CacheErrorConstants;

/**
 * Created by chehao on 7/18/2017 17:35.
 */
public class ExecutionException extends CacheException {
    private static final String CACHE_EXECUTION_ERROR = "CACHE_EXECUTION_ERROR";

    public ExecutionException() {
        super(CacheErrorConstants.CACHE_EXECUTION_ERROR_CODE, CACHE_EXECUTION_ERROR);
    }

    public ExecutionException(Throwable cause) {
        super(cause, CacheErrorConstants.CACHE_EXECUTION_ERROR_CODE);
    }
}
