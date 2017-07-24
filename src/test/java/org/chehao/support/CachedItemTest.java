package org.chehao.support;

import oracle.chehao.support.CachedItem;
import org.testng.annotations.Test;

/**
 * Created by chehao on 2017/1/6.
 */
@Test(groups = {"s2"})
public class CachedItemTest {

    @Test
    public void testCachedItem() {
        CachedItem ci = new CachedItem("key", "value");
        ci.getValue();
//        ci.setValue("value2");
        ci.getCreationTime();
//        ci.setCreationTime(null);
        ci.getKey();
//        ci.setKey("key2");
        ci.getLastAccessTime();
        ci.setLastAccessTime(null);
        ci.getLastRefreshTime();
        ci.setLastRefreshTime(null);
    }
}
