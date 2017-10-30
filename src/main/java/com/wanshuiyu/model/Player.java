package com.wanshuiyu.model;

import javax.websocket.Session;
import java.util.Map;

/**
 * Created by Junhe on 2017/10/30.
 * 玩家
 */
public class Player {
    private Session session;
    private User user;//帐号
    private Map<Integer,Poker> pokers;

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Map<Integer, Poker> getPokers() {
        return pokers;
    }

    public void setPokers(Map<Integer, Poker> pokers) {
        this.pokers = pokers;
    }
}
