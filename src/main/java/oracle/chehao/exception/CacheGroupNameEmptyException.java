package oracle.chehao.exception;


import oracle.chehao.util.CacheErrorConstants;

/**
 * Created by chehao on 2016/12/15.
 */
public class CacheGroupNameEmptyException extends CacheException {

    private static final String CACHE_GROUP_NAME_EMPTY_ERROR = "CACHE_GROUP_NAME_EMPTY_ERROR";

    public CacheGroupNameEmptyException() {
        super(CacheErrorConstants.CACHE_EXECUTION_ERROR_CODE, CACHE_GROUP_NAME_EMPTY_ERROR);
    }
}
