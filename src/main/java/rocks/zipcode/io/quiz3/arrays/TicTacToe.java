package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class  TicTacToe {

    private String[][] board;

    public TicTacToe(String[][] board) {
        this.board=board;
    }

    public TicTacToe() {
        this.board= new String[0][0];
    }

    public String[] getRow(Integer value) {
            System.out.println(Arrays.toString(board[value]));
            return board[value];

    }

    public String[] getColumn(Integer value) {

            return new String[] {board[0][value], board[1][value], board[2][value]};
        }



    public Boolean isRowHomogenous(Integer rowIndex) {

            return (getRow(rowIndex)[0].equals(getRow(rowIndex)[1]) && getRow(rowIndex)[0].equals(getRow(rowIndex)[2]));

        }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
            return (getColumn(columnIndex)[0].equals(getColumn(columnIndex)[1]) && getColumn(columnIndex)[0].equals(getColumn(columnIndex)[2]));


    }

    public String getWinner() {
            for (int i = 0; i < 3; i++) {
                if (isColumnHomogeneous(i)) {
                    return getColumn(i)[0];
                } else if (isRowHomogenous(i)) {
                    return getRow(i)[0];
                }
            }
        return getBoard()[1][1];
    }

    public String[][] getBoard() {
        return this.board;
    }
}






