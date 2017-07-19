package oracle.chehao.api;

import oracle.chehao.exception.ExecutionException;
import oracle.chehao.support.CachedItem;

/**
 * Created by chehao on 7/18/2017 17:35.
 */
public interface ICache<K, V> {
    public V get(K key) throws ExecutionException;

    public V get(K key, CacheLoader factory) throws ExecutionException;

//    public V get(K key,CacheLoader factory,boolean refresh);

    public void put(K key, Object value);

    public void evict(K key);

    public void clear();

    public String getName();

    public boolean isExpired(CachedItem cachedItem);

    public Object refreshAfterGet(K key, CacheLoader factory) throws ExecutionException;

}
