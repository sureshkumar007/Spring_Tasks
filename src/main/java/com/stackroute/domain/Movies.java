package com.stackroute.domain;

public class Movies
{
private Actor actor;

//   public void setActor(Actor actor)
//   {
//        this.actor = actor;
//    }


    public Movies(Actor actor)
    {
        this.actor = actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "actor=" + actor +
                '}';
    }
}
