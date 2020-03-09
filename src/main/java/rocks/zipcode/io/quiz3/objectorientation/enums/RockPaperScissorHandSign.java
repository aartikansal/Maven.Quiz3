package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK, PAPER, SCISSOR;

    public RockPaperScissorHandSign getWinner() {
        switch (this) {
            case ROCK:
                return PAPER;
            case SCISSOR:
                return ROCK;
            case PAPER:
                return SCISSOR;

        }


        return null;
    }

    public RockPaperScissorHandSign getLoser() {
        switch (this) {
            case PAPER:
                return ROCK;
            case ROCK:
                return SCISSOR;
            case SCISSOR:
                return PAPER;

        }
        return null;
    }
}