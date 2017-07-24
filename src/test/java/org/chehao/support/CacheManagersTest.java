package org.chehao.support;

import oracle.chehao.api.ICacheManager;
import oracle.chehao.support.CacheManagers;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by chehao on 2017/1/6.
 */
@Test(groups = {"s2"})
public class CacheManagersTest {

    @Test
    public void testCacheManagers() {
        ICacheManager cm1 = CacheManagers.getInstance().build();
        Assert.assertNotNull(cm1);
    }
}
