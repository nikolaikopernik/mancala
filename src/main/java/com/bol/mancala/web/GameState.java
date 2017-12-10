package com.bol.mancala.web;

import com.bol.mancala.Game;
import com.bol.mancala.GamePlayer;

public class GameState {
    private String error= "";
    private boolean gameStarted= false;
    private boolean gameFinished = false;
    private boolean yourTurn = false;
    private String yourName;
    private String opponentName;
    private int totalSeeds;
    private int[] yourSeeds;
    private int yourBasket;
    private int[] opponentSeeds;
    private int opponentBasket;

    public GameState(Throwable error, GamePlayer user) {
        this(user);
        this.error=error.getLocalizedMessage();
    }

    public GameState(GamePlayer player) {
        this.gameFinished = player.isGameFinished();
        this.gameStarted = player.isGameStarted();
        this.yourTurn = player.isMyTurn();
        this.yourName = player.getName();
        this.opponentName = player.getOpponentName();
        this.yourSeeds = player.getMySeeds();
        this.yourBasket = player.getBasket();
        this.opponentSeeds = player.getOpponentSeeds();
        this.opponentBasket = player.getOpponentBasket();
        this.totalSeeds = player.getTotalSeeds();
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public boolean isGameStarted() {
        return gameStarted;
    }

    public void setGameStarted(boolean gameStarted) {
        this.gameStarted = gameStarted;
    }

    public boolean isGameFinished() {
        return gameFinished;
    }

    public void setGameFinished(boolean gameFinished) {
        this.gameFinished = gameFinished;
    }

    public boolean isYourTurn() {
        return yourTurn;
    }

    public void setYourTurn(boolean yourTurn) {
        this.yourTurn = yourTurn;
    }

    public int getTotalSeeds() {
        return totalSeeds;
    }

    public void setTotalSeeds(int totalSeeds) {
        this.totalSeeds = totalSeeds;
    }

    public int[] getYourSeeds() {
        return yourSeeds;
    }

    public void setYourSeeds(int[] yourSeeds) {
        this.yourSeeds = yourSeeds;
    }

    public int getYourBasket() {
        return yourBasket;
    }

    public void setYourBasket(int yourBasket) {
        this.yourBasket = yourBasket;
    }

    public int[] getOpponentSeeds() {
        return opponentSeeds;
    }

    public void setOpponentSeeds(int[] opponentSeeds) {
        this.opponentSeeds = opponentSeeds;
    }

    public int getOpponentBasket() {
        return opponentBasket;
    }

    public void setOpponentBasket(int opponentBasket) {
        this.opponentBasket = opponentBasket;
    }

    public String getYourName() {
        return yourName;
    }

    public void setYourName(String yourName) {
        this.yourName = yourName;
    }

    public String getOpponentName() {
        return opponentName;
    }

    public void setOpponentName(String opponentName) {
        this.opponentName = opponentName;
    }
}