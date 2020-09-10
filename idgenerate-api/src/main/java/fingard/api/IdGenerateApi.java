package fingard.api;


import fingard.entity.Result;

/**
 * @author zhaolc
 * @version 1.0
 * @description TODO
 * @createTime 2020年08月18日 16:40:00
 */
public interface IdGenerateApi {

    Result getId(String key);
}
