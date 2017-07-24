package org.chehao.exception;

import oracle.chehao.exception.CacheException;
import oracle.chehao.exception.ExecutionException;
import org.testng.annotations.Test;

/**
 * Created by chehao on 2017/1/6.
 */
@Test(groups = {"s2"})
public class ExecutionExceptionTest {
    @Test(expectedExceptions = ExecutionException.class)
    public void testException() throws CacheException {
        throw new ExecutionException();
    }

    @Test(expectedExceptions = ExecutionException.class)
    public void testException2() throws CacheException {
        throw new ExecutionException(new Throwable());

    }
}
