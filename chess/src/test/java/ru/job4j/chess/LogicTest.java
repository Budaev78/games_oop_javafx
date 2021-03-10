package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;

public class LogicTest {

    @Test(expected = FigureNotFoundException.class)
    public void testFindBy() throws FigureNotFoundException {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Logic logic = new Logic();
        logic.findBy(Cell.C2);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void testIsDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        bishopBlack.way(Cell.G4);
    }

    @Test
    public void testFree() throws OccupiedCellException {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        BishopBlack bishopBlack1 = new BishopBlack(Cell.F4);
        Logic logic = new Logic();
        bishopBlack.way(Cell.G5);
        logic.free(bishopBlack.way(Cell.G5));
    }
}