package com.training.bots;

import com.softwire.dynamite.bot.Bot;
import com.softwire.dynamite.game.Gamestate;
import com.softwire.dynamite.game.Move;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PaperBot implements Bot {

    @Override
    public Move makeMove(Gamestate gamestate) {
        return Move.P;
    }


    }





