package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class BishopBlackTest {

    @Test
    public void testPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A3);
        bishopBlack.position();
        assertThat(bishopBlack.position(),is(Cell.A3));
    }

    @Test
    public void testCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A3);
        bishopBlack.copy(Cell.C5);
        assertThat(bishopBlack.copy(Cell.C5).position(),is(Cell.C5));
    }

    @Test
    public void testWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        bishopBlack.way(Cell.G5);
        assertThat(bishopBlack.way(Cell.G5),is(new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5}));

    }

    @Test
    public void testIsDiagonal () {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        bishopBlack.isDiagonal(Cell.C1,Cell.G5);
        assertThat(bishopBlack.isDiagonal(Cell.C1,Cell.G5), is(true));
    }


}
