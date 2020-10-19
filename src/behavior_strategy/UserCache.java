package behavior_strategy;

import java.util.HashMap;
import java.util.Map;

public class UserCache {
    private Map<String, User> cacheData = new HashMap<>();
    private Strategy eviction;

    public UserCache(Strategy eviction) {
        this.eviction = eviction;
    }

    private class User {
    }

    //...
}