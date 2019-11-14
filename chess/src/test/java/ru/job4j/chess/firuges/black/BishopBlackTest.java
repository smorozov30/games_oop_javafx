package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BishopBlackTest {
    @Test
    public void whenPositionD3() {
        BishopBlack bb = new BishopBlack(Cell.D3);
        Cell result = bb.position();
        assertThat(result, is(Cell.D3));
    }
    @Test
    public void whenCopyFromA1ToD1() {
        BishopBlack bb = new BishopBlack(Cell.A1);
        BishopBlack newBb = (BishopBlack) bb.copy(Cell.D1);
        Cell result = newBb.position();
        assertThat(result, is(Cell.D1));
    }
    @Test
    public void whenWayC1G5() {
        BishopBlack bb = new BishopBlack(Cell.C1);
        Cell[] result = bb.way(Cell.C1, Cell.G5);
        assertThat(result, is(new Cell[] { Cell.D2, Cell.E3, Cell.F4, Cell.G5}));
    }
    @Test
    public void whenDiagTrue() {
        BishopBlack bb = new BishopBlack(Cell.D4);
        boolean result = bb.isDiagonal(Cell.D4, Cell.A1);
        assertThat(result, is(true));
    }
}
