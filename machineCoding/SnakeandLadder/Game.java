package com.example.machineCoding.SnakeandLadder;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
public class Game {

    private int noOfSnakes;
    private int noOfLadder;
    private List<Player> players;
    private List<Snake> snakes;
    private List<Ladder> ladders;
    private Board board;
    private Dice dice;

    public Game(int noOfSnakes,int noOfLadder,int boardSize)
    {
        this.noOfSnakes=noOfSnakes;
        this.noOfLadder=noOfLadder;
        snakes=new ArrayList<>();
        ladders=new ArrayList<>();
        board=new Board(boardSize);
        dice=new Dice(1,6,2);
        init();
    }

    public void init()
    {
        Random random=new Random();

       Set<String> slSet=new HashSet<>();
       for(int i=0;i<noOfSnakes;i++)
       {
           while(true)
           {
               int snakeStart= random.nextInt((board.getEnd()-board.getStart()) + board.getStart());
               int snakeEnd= random.nextInt((board.getEnd()-board.getStart()) + board.getStart());

               if(snakeEnd<=snakeStart)
               {
                   continue;
               }
               if(slSet.contains(snakeStart+"#"+snakeEnd)==false)
               {
                   snakes.add(new Snake(snakeStart,snakeEnd));
                   slSet.add(snakeStart+"#"+snakeEnd);
                   break;

               }

           }
       }

        for(int i=0;i<noOfLadder;i++)
        {
            while(true)
            {
                int snakeStart= random.nextInt((board.getEnd()-board.getStart()) + board.getStart());
                int snakeEnd= random.nextInt((board.getEnd()-board.getStart()) + board.getStart());

                if(snakeEnd<=snakeStart)
                {
                    continue;
                }
                if(slSet.contains(snakeStart+"#"+snakeEnd)==false)
                {
                    snakes.add(new Snake(snakeStart,snakeEnd));
                    slSet.add(snakeStart+"#"+snakeEnd);
                    break;

                }

            }
        }
    }

    public void addPlayer(Player player)
    {
        players.add(player);
    }
    public void playGame() {
        while (true) {
            Player player = players.removeFirst();
            int val = dice.roll();
            int newPosition = player.getPosition() + val;
            if (newPosition > board.getEnd()) {
                player.setPosition(player.getPosition());
                players.remove(player);
            } else {
                player.setPosition(getNewPosition(newPosition));
                if (player.getPosition() == board.getEnd()) {
                    player.setWon(true);
                    System.out.println("Player " + player.getName() + " Won.");
                } else {
                    System.out.println("Setting " + player.getName() + "'s new position to " + player.getPosition());
                    players.remove(player);
                }
            }
            if (players.size() < 2) {
                break;
            }
        }
    }

    private int getNewPosition(int newPosition) {
        for (Snake snake : snakes) {
            if (snake.getHead() == newPosition) {
                System.out.println("Snake Bit");
                return snake.getTail();
            }
        }
        for (Ladder ladder : ladders) {
            if (ladder.getStart() == newPosition) {
                System.out.println("Climbed ladder");
                return ladder.getEnd();
            }
        }
        return newPosition;
    }

}
