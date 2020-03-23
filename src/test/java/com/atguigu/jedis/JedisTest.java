package com.atguigu.jedis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

public class JedisTest {



    @Test
    public void test(){
        Jedis jedis = new Jedis("192.168.136.128",6379);
        String ping = jedis.ping();
        System.out.println("ping="+ping);
       // jedis.setex("k2", 30, "11");
        Long ttl = jedis.ttl("k2");
        System.out.println("ttl="+ttl);
        System.out.println(jedis.exists("k1"));

    }

}
