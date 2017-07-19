package oracle.chehao.api;

/**
 * Created by chehao on 7/18/2017 17:34.
 */
public abstract class CacheLoader<K, V> {
    /**
     * Fetch cache data for the given cache key. Note that this method must be thread safe.
     *
     * @param key
     * @return The entry, or null if it does not exist.
     * @throws Exception On failure creating the object.
     */
    public abstract V load(K key) throws Exception;

}
