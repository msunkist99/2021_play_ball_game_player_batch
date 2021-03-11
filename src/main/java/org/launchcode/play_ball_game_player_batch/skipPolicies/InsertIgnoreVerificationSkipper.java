package org.launchcode.play_ball_game_player_batch.skipPolicies;


import org.springframework.batch.core.step.skip.SkipLimitExceededException;
import org.springframework.batch.core.step.skip.SkipPolicy;
import org.springframework.dao.EmptyResultDataAccessException;

public class InsertIgnoreVerificationSkipper implements SkipPolicy {

    @Override
    public boolean shouldSkip(Throwable exception, int skipCount) throws SkipLimitExceededException {
        if (exception instanceof EmptyResultDataAccessException) {
            return true;
        } else {
            return false;
        }
    }
}