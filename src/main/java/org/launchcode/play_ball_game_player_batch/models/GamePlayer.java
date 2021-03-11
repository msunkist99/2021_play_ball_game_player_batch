package org.launchcode.play_ball_game_player_batch.models;

public class GamePlayer {
    private String gameId;
    private String playerId;

    public GamePlayer(String gameId, String playerId) {
        this.gameId = gameId;
        this.playerId = playerId;
    }

    public String getGameId() {
        return gameId;
    }

    public String getPlayerId() {
        return playerId;
    }
}
