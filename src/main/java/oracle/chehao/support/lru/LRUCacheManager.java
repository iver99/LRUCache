package oracle.chehao.support.lru;

import oracle.chehao.api.ICache;
import oracle.chehao.support.AbstractCacheManager;
import oracle.chehao.tool.CacheConfig;
import oracle.chehao.util.CacheConstants;
import oracle.chehao.util.CacheSAXParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by chehao on 2016/12/22.
 */
public class LRUCacheManager extends AbstractCacheManager {

    private static final Logger LOGGER = LogManager.getLogger(LRUCacheManager.class);
    private static LRUCacheManager instance = new LRUCacheManager();

    private LRUCacheManager() {
        init();
    }

    public static LRUCacheManager getInstance() {
        return instance;
    }

    @Override
    public ICache createNewCache(String name, Integer capacity, Long timeToLive) {
        ICache<Object, Object> cache = new LinkedHashMapCache(name, capacity, timeToLive);
        return cache;
    }

    @Override
    public ICache createNewCache(String name) {
        return this.createNewCache(name, CacheConstants.DEFAULT_CAPACITY, CacheConstants.DEFAULT_EXPIRATION);
    }

    /**
     * Return a collection of the cache names known by this manager.
     *
     * @return the names of all caches known by the cache manager
     */
    @Override
    public void init() {
        super.init();
        //init default cache group
        LOGGER.info("Initialing LRU CacheManager...");
        //parse cache config
        parseCacheConfig();
        LOGGER.info("cache config size " + CacheConfig.cacheConfigList.size());
        for (CacheConfig cacheConfig : CacheConfig.cacheConfigList) {
            getCache(cacheConfig.getName(), cacheConfig.getCapacity(), cacheConfig.getExpiry());
        }
    }

    private void parseCacheConfig() {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        try {
            SAXParser parser = factory.newSAXParser();
            InputStream f = LRUCacheManager.class.getClassLoader().getResourceAsStream("default-cache-config.xml");
            CacheSAXParser dh = new CacheSAXParser();
            parser.parse(f, dh);
        } catch (ParserConfigurationException e) {
            LOGGER.error(e);
        } catch (SAXException e) {
            LOGGER.error(e);
        } catch (IOException e) {
            LOGGER.error(e);
        }
    }

    /**
     * Closes this stream and releases any system resources associated
     * with it. If the stream is already closed then invoking this
     * method has no effect.
     *
     * @throws IOException if an I/O error occurs
     */
    @Override
    public void close() throws IOException {
        LOGGER.info("LRU CacheManager is closing...");
        super.close();
    }
}
