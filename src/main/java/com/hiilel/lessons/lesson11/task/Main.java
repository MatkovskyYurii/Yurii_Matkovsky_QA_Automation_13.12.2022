package com.hiilel.lessons.lesson11.task;

public class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat("Cat 1");
//        Dog dog = new Dog("Dog 1");
//        Parrot parrot = new Parrot("Parrot 1");
//        Rabbit rabbit = new Rabbit("Rabbit 1");

//        ObstaclePool obstaclePool = new ObstaclePool();
//        ObstacleWall obstacleWall = new ObstacleWall();
//
//        obstaclePool.start(cat);
//        obstaclePool.start(dog);
//        obstaclePool.start(parrot);
//        obstaclePool.start(rabbit);
//
//        obstacleWall.start(cat);
//        obstacleWall.start(dog);
//        obstacleWall.start(parrot);
//        obstacleWall.start(rabbit);

        Participant[] participants = {
                new Cat("Cat 1"),
                new Dog("Dog 1"),
                new Parrot("Parrot 1"),
                new Rabbit("Rabbit 1")
        };
        Obstacle[] obstacles = {
                new ObstaclePool(),
                new ObstacleWall()
        };

        for (Obstacle obstacle : obstacles) {
            for (Participant participant : participants) {
                obstacle.start(participant);
            }
        }
        
    }
}
