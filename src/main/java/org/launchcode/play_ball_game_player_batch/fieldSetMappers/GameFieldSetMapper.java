package org.launchcode.play_ball_game_player_batch.fieldSetMappers;

import org.launchcode.play_ball_game_player_batch.models.Game;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class GameFieldSetMapper implements FieldSetMapper<Game> {

    @Override
    public Game mapFieldSet(FieldSet fieldSet) throws BindException {

        return new Game(
                fieldSet.readString(0),     // game id
                fieldSet.readString(9),     // game site
                fieldSet.readString(8),     // home team
                fieldSet.readString(7),     // visiting team
                fieldSet.readString(1),     // game date
                fieldSet.readString(6),     // day night flag
                fieldSet.readInt(2),        // game number 0- not a doubleheader, 1-first game of doubleheader, 2-second game of doubleheader



                fieldSet.readString(46),    // playerIdVisit1;
                fieldSet.readInt(47),       // playerPositionVisit1;

                fieldSet.readString(48),    // playerIdVisit2;
                fieldSet.readInt(49),       // playerPositionVisit2;

                fieldSet.readString(50),    // playerIdVisit3;
                fieldSet.readInt(51),       // playerPositionVisit3;

                fieldSet.readString(52),    // playerIdVisit4;
                fieldSet.readInt(53),       // playerPositionVisit4;

                fieldSet.readString(54),    // playerIdVisit5;
                fieldSet.readInt(55),       // playerPositionVisit5;

                fieldSet.readString(56),    // playerIdVisit6;
                fieldSet.readInt(57),       // playerPositionVisit6;

                fieldSet.readString(58),    // playerIdVisit7;
                fieldSet.readInt(59),       // playerPositionVisit7;

                fieldSet.readString(60),    // playerIdVisit8;
                fieldSet.readInt(61),       // playerPositionVisit8;

                fieldSet.readString(62),    // playerIdVisit9;
                fieldSet.readInt(63),       // playerPositionVisit9;

                fieldSet.readString(10),    // starting home pitcher, could be a duplicate
                1,                  // pitcher


                fieldSet.readString(64),    // playerIdHome1;
                fieldSet.readInt(65),       // playerPositionHome1;

                fieldSet.readString(66),    // playerIdHome2;
                fieldSet.readInt(67),       // playerPositionHome2;

                fieldSet.readString(68),    // playerIdHome3;
                fieldSet.readInt(69),       // playerPositionHome3;

                fieldSet.readString(70),    // playerIdHome4;
                fieldSet.readInt(71),       // playerPositionHome4;

                fieldSet.readString(72),    // playerIdHome5;
                fieldSet.readInt(73),       // playerPositionHome5;

                fieldSet.readString(74),    // playerIdHome6;
                fieldSet.readInt(75),       // playerPositionHome6;

                fieldSet.readString(76),    // playerIdHome7;
                fieldSet.readInt(77),       // playerPositionHome7;

                fieldSet.readString(78),    // playerIdHome8;
                fieldSet.readInt(79),       // playerPositionHome8;

                fieldSet.readString(80),    // playerIdHome9;
                fieldSet.readInt(81),       // playerPositionHome9;

                fieldSet.readString(11),    // starting visit pitcher, could be a duplicate
                1);             // pitcher
    }
}
