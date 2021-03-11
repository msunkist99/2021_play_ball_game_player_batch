package org.launchcode.play_ball_game_player_batch.models;

public class Player {
    private String id;
    private String lastName;
    private String firstName;
    private String bats;
    private String pitches;
    private String teamId;
    private String position;

    public Player(String id, String lastName, String firstName, String bats, String pitches, String teamId, String position) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.bats = bats;
        this.pitches = pitches;
        this.teamId = teamId;
        this.position = position;
    }

    public String getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getBats() {
        return bats;
    }

    public String getPitches() {
        return pitches;
    }

    public String getTeamId() {
        return teamId;
    }

    public String getPosition() {
        return position;
    }
}

