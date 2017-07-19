package oracle.chehao.support;

import oracle.chehao.api.ICacheManager;
import oracle.chehao.support.lru.LRUCacheManager;
import oracle.chehao.support.screenshot.LRUScreenshotCacheManager;
import oracle.chehao.util.CacheConstants;

/**
 * Created by chehao on 2016/12/27.
 */
public class CacheManagers {


    private static CacheManagers instance = new CacheManagers();

    private CacheManagers() {
    }

    public static CacheManagers getInstance() {
        return instance;
    }

    public ICacheManager build(String type) {
        if (type != null && CacheConstants.LRU_SCREENSHOT_MANAGER.equals(type)) {
            return LRUScreenshotCacheManager.getInstance();
        }
        return build();
    }

    public ICacheManager build() {
        return LRUCacheManager.getInstance();
    }

}
