package oracle.chehao.exception;


import oracle.chehao.util.CacheErrorConstants;

/**
 * Created by chehao on 2016/12/15.
 */
public class CacheGroupNotFoundException extends CacheException {

    private static final String DASHBOARD_CACHE_GROUP_NOT_FOUND_ERROR = "DASHBOARD_CACHE_GROUP_NOT_FOUND_ERROR";

    public CacheGroupNotFoundException() {
        super(CacheErrorConstants.CACHE_GROUP_NOT_FOUND_ERROR_CODE, DASHBOARD_CACHE_GROUP_NOT_FOUND_ERROR);
    }
}
