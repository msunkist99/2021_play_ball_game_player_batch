package org.launchcode.play_ball_game_player_batch.models;

public class Game {
    private final String id;
    private final String site;
    private final String homeTeam;
    private final String visitingTeam;
    private final String date;
    private final String dayNight;
    private final int gameNum;
    private final String playerIdVisit1;
    private final int playerPositionVisit1;
    private final String playerIdVisit2;
    private final int playerPositionVisit2;
    private final String playerIdVisit3;
    private final int playerPositionVisit3;
    private final String playerIdVisit4;
    private final int playerPositionVisit4;
    private final String playerIdVisit5;
    private final int playerPositionVisit5;
    private final String playerIdVisit6;
    private final int playerPositionVisit6;
    private final String playerIdVisit7;
    private final int playerPositionVisit7;
    private final String playerIdVisit8;
    private final int playerPositionVisit8;
    private final String playerIdVisit9;
    private final int playerPositionVisit9;
    private final String playerIdVisit10;               // start visit pitcher, could be a duplicate
    private final int playerPositionVisit10;

    private final String playerIdHome1;
    private final int playerPositionHome1;
    private final String playerIdHome2;
    private final int playerPositionHome2;
    private final String playerIdHome3;
    private final int playerPositionHome3;
    private final String playerIdHome4;
    private final int playerPositionHome4;
    private final String playerIdHome5;
    private final int playerPositionHome5;
    private final String playerIdHome6;
    private final int playerPositionHome6;
    private final String playerIdHome7;
    private final int playerPositionHome7;
    private final String playerIdHome8;
    private final int playerPositionHome8;
    private final String playerIdHome9;
    private final int playerPositionHome9;
    private final String playerIdHome10;            // start home pitcher, could be a duplicate
    private final int playerPositionHome10;


    // constructor

    public Game(String id, String site, String homeTeam, String visitingTeam, String date, String dayNight, int gameNum, String playerIdVisit1, int playerPositionVisit1, String playerIdVisit2, int playerPositionVisit2, String playerIdVisit3, int playerPositionVisit3, String playerIdVisit4, int playerPositionVisit4, String playerIdVisit5, int playerPositionVisit5, String playerIdVisit6, int playerPositionVisit6, String playerIdVisit7, int playerPositionVisit7, String playerIdVisit8, int playerPositionVisit8, String playerIdVisit9, int playerPositionVisit9, String playerIdVisit10, int playerPositionVisit10, String playerIdHome1, int playerPositionHome1, String playerIdHome2, int playerPositionHome2, String playerIdHome3, int playerPositionHome3, String playerIdHome4, int playerPositionHome4, String playerIdHome5, int playerPositionHome5, String playerIdHome6, int playerPositionHome6, String playerIdHome7, int playerPositionHome7, String playerIdHome8, int playerPositionHome8, String playerIdHome9, int playerPositionHome9, String playerIdHome10, int playerPositionHome10) {
        this.id = id;
        this.site = site;
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.date = date;
        this.dayNight = dayNight;
        this.gameNum = gameNum;
        this.playerIdVisit1 = playerIdVisit1;
        this.playerPositionVisit1 = playerPositionVisit1;
        this.playerIdVisit2 = playerIdVisit2;
        this.playerPositionVisit2 = playerPositionVisit2;
        this.playerIdVisit3 = playerIdVisit3;
        this.playerPositionVisit3 = playerPositionVisit3;
        this.playerIdVisit4 = playerIdVisit4;
        this.playerPositionVisit4 = playerPositionVisit4;
        this.playerIdVisit5 = playerIdVisit5;
        this.playerPositionVisit5 = playerPositionVisit5;
        this.playerIdVisit6 = playerIdVisit6;
        this.playerPositionVisit6 = playerPositionVisit6;
        this.playerIdVisit7 = playerIdVisit7;
        this.playerPositionVisit7 = playerPositionVisit7;
        this.playerIdVisit8 = playerIdVisit8;
        this.playerPositionVisit8 = playerPositionVisit8;
        this.playerIdVisit9 = playerIdVisit9;
        this.playerPositionVisit9 = playerPositionVisit9;
        this.playerIdVisit10 = playerIdVisit10;
        this.playerPositionVisit10 = playerPositionVisit10;

        this.playerIdHome1 = playerIdHome1;
        this.playerPositionHome1 = playerPositionHome1;
        this.playerIdHome2 = playerIdHome2;
        this.playerPositionHome2 = playerPositionHome2;
        this.playerIdHome3 = playerIdHome3;
        this.playerPositionHome3 = playerPositionHome3;
        this.playerIdHome4 = playerIdHome4;
        this.playerPositionHome4 = playerPositionHome4;
        this.playerIdHome5 = playerIdHome5;
        this.playerPositionHome5 = playerPositionHome5;
        this.playerIdHome6 = playerIdHome6;
        this.playerPositionHome6 = playerPositionHome6;
        this.playerIdHome7 = playerIdHome7;
        this.playerPositionHome7 = playerPositionHome7;
        this.playerIdHome8 = playerIdHome8;
        this.playerPositionHome8 = playerPositionHome8;
        this.playerIdHome9 = playerIdHome9;
        this.playerPositionHome9 = playerPositionHome9;
        this.playerIdHome10 = playerIdHome10;
        this.playerPositionHome10 = playerPositionHome10;
    }

    public String getId() {
        return id;
    }

    public String getSite() {
        return site;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getVisitingTeam() {
        return visitingTeam;
    }

    public String getDate() {
        return date;
    }

    public String getDayNight() {
        return dayNight;
    }

    public int getGameNum() {
        return gameNum;
    }

    public String getPlayerIdVisit1() {
        return playerIdVisit1;
    }

    public int getPlayerPositionVisit1() {
        return playerPositionVisit1;
    }

    public String getPlayerIdVisit2() {
        return playerIdVisit2;
    }

    public int getPlayerPositionVisit2() {
        return playerPositionVisit2;
    }

    public String getPlayerIdVisit3() {
        return playerIdVisit3;
    }

    public int getPlayerPositionVisit3() {
        return playerPositionVisit3;
    }

    public String getPlayerIdVisit4() {
        return playerIdVisit4;
    }

    public int getPlayerPositionVisit4() {
        return playerPositionVisit4;
    }

    public String getPlayerIdVisit5() {
        return playerIdVisit5;
    }

    public int getPlayerPositionVisit5() {
        return playerPositionVisit5;
    }

    public String getPlayerIdVisit6() {
        return playerIdVisit6;
    }

    public int getPlayerPositionVisit6() {
        return playerPositionVisit6;
    }

    public String getPlayerIdVisit7() {
        return playerIdVisit7;
    }

    public int getPlayerPositionVisit7() {
        return playerPositionVisit7;
    }

    public String getPlayerIdVisit8() {
        return playerIdVisit8;
    }

    public int getPlayerPositionVisit8() {
        return playerPositionVisit8;
    }

    public String getPlayerIdVisit9() {
        return playerIdVisit9;
    }

    public int getPlayerPositionVisit9() {
        return playerPositionVisit9;
    }

    public String getPlayerIdVisit10() {
        return playerIdVisit10;
    }

    public int getPlayerPositionVisit10() {
        return playerPositionVisit10;
    }

    public String getPlayerIdHome1() {
        return playerIdHome1;
    }

    public int getPlayerPositionHome1() {
        return playerPositionHome1;
    }

    public String getPlayerIdHome2() {
        return playerIdHome2;
    }

    public int getPlayerPositionHome2() {
        return playerPositionHome2;
    }

    public String getPlayerIdHome3() {
        return playerIdHome3;
    }

    public int getPlayerPositionHome3() {
        return playerPositionHome3;
    }

    public String getPlayerIdHome4() {
        return playerIdHome4;
    }

    public int getPlayerPositionHome4() {
        return playerPositionHome4;
    }

    public String getPlayerIdHome5() {
        return playerIdHome5;
    }

    public int getPlayerPositionHome5() {
        return playerPositionHome5;
    }

    public String getPlayerIdHome6() {
        return playerIdHome6;
    }

    public int getPlayerPositionHome6() {
        return playerPositionHome6;
    }

    public String getPlayerIdHome7() {
        return playerIdHome7;
    }

    public int getPlayerPositionHome7() {
        return playerPositionHome7;
    }

    public String getPlayerIdHome8() {
        return playerIdHome8;
    }

    public int getPlayerPositionHome8() {
        return playerPositionHome8;
    }

    public String getPlayerIdHome9() {
        return playerIdHome9;
    }

    public int getPlayerPositionHome9() {
        return playerPositionHome9;
    }

    public String getPlayerIdHome10() {
        return playerIdHome10;
    }

    public int getPlayerPositionHome10() {
        return playerPositionHome10;
    }

}

