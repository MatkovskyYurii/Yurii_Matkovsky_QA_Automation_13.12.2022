package com.hiilel.lessons.lesson11.task;

public class ObstacleWall implements Obstacle{
    @Override
    public void start(Participant participant) {
        participant.jump();
    }
}
