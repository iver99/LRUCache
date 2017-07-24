package org.chehao.support.lru;

import oracle.chehao.api.ICache;
import oracle.chehao.exception.ExecutionException;
import oracle.chehao.support.lru.LinkedHashMapCache;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by chehao on 2017/1/6.
 */
@Test(groups = {"s2"})
public class LinkedHashMapCacheTest {

    ICache cache;

    @BeforeClass
    public void before() {
        cache = new LinkedHashMapCache("name", 100, 1000L);
    }

    @Test
    public void testGet() {
        try {
            cache.get("one");
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testPut() {
        cache.put("one", 1);
    }

    @Test
    public void testEvict() {
        cache.evict("one");
    }

    @Test
    public void testClear() {
        cache.clear();
    }

    @Test
    public void testGetName() {
        cache.getName();
    }

    @AfterClass
    public void close() {
        cache = null;
    }

}
