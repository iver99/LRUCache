package oracle.chehao.api;


import oracle.chehao.tool.Keys;
import oracle.chehao.tool.Tenant;

/**
 * Created by chehao on 2016/12/11.
 */
public interface IKeyGenerator {
    /**
     * Generate a key for the given tenant and key list.
     *
     * @param tenant the tenant
     * @return a generated key
     */
    Object generate(Tenant tenant, Keys keys);
}
