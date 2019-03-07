package com.training.bots;

import com.softwire.dynamite.bot.Bot;
import com.softwire.dynamite.game.Gamestate;
import com.softwire.dynamite.game.Move;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomBot implements Bot {

    @Override
    public Move makeMove(Gamestate gamestate) {

        Random r = new Random();
        List<Move> outcome = new ArrayList<>();
        outcome.add(Move.R);
        outcome.add(Move.P);
        outcome.add(Move.S);

            return outcome.get(r.nextInt(outcome.size()));

    }
}




