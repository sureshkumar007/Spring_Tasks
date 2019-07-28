package com.stackroute.domain;

public class Movies
{
private Actor actor;

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "actor=" + actor +
                '}';
    }
}
