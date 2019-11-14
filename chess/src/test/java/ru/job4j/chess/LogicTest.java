package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.PawnBlack;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LogicTest {
    @Test
    public void whenWayClean() {
        Logic logic = new Logic();
        boolean result = logic.move(Cell.D4, Cell.A7);
        assertThat(result, is(true));
    }
    @Test
    public void whenWayNotClean() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.D4));
        logic.add(new PawnBlack(Cell.C3));
        boolean result = logic.move(Cell.D4, Cell.A1);
        assertThat(result, is(false));
    }
    @Test
    public void whenDestNotClean() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.D4));
        logic.add(new PawnBlack(Cell.A7));
        boolean result = logic.move(Cell.D4, Cell.A7);
        assertThat(result, is(false));
    }
}
