package com.supers.basic.util.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Redis操作工具类
 * @author gaoyang
 * @date 2020/5/15 15:05
 */
@Component
public class RedisHelper {
    private Logger logger = LoggerFactory.getLogger(RedisHelper.class);
    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    /**
     * 取Redis缓存
     * @param key
     * @return
     */
    public final Object getCatch(final String key){
        this.logger.info("开始获取Redis缓存 key: '" + key + "'");
        return redisTemplate.opsForValue().get(key);
    }

    /**
     * 批量获取获取Redis缓存
     * @param keys
     * @return
     */
    public final Map<String, Object> batchGetCatch(final String... keys){
        this.logger.info("开始批量获取获取Redis缓存 keys: '" + keys + "'");
        Map<String, Object> redisMap = new HashMap<>();
        for(String key:keys){
            redisMap.put(key, redisTemplate.opsForValue().get(key));
        }
        return redisMap;
    }

    /**
     * 写入Redis缓存
     * @param key
     * @param value
     * @return
     */
    public final boolean setCache(final String key, Object value) {
        boolean result = false;
        try {
            this.logger.info("开始新建Redis缓存 key: '" + key + "', value: '" + value + "'");
            redisTemplate.opsForValue().set(key, value);
            result = true;
        } catch (Exception e) {
            this.logger.error("新建Redis缓存失败");
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 更新Redis缓存
     * @param key
     * @param value
     * @return
     */
    public final boolean updateCache(final String key, Object value) {
        boolean result = false;
        try {
            this.logger.info("开始更新Redis缓存 key: '" + key + "', value: '" + value + "'");
            redisTemplate.opsForValue().getAndSet(key, value);
            result = true;
        } catch (Exception e) {
            this.logger.error("更新Redis缓存失败");
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 删除Redis缓存
     * @param key
     * @return
     */
    public final boolean delCache(final String key) {
        boolean result = false;
        try {
            this.logger.info("开始删除Redis缓存 key: '" + key + "'");
            redisTemplate.delete(key);
            result = true;
        } catch (Exception e) {
            this.logger.error("删除Redis缓存失败");
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 批量删除Redis缓存
     * @param keys
     * @return
     */
    public final boolean batchDelCache(final String... keys) {
        boolean result = false;
        try {
            this.logger.info("开始批量删除Redis缓存 keys: '" + keys + "'");
            for(String key:keys){
                redisTemplate.delete(key);
            }
            result = true;
        } catch (Exception e) {
            this.logger.error("批量删除Redis缓存出错");
            e.printStackTrace();
        }
        return result;
    }
}
