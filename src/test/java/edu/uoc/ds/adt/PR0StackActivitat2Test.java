package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Before;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR0StackActivitat2Test {

    PR0StackActivitat2 pr0q;

    private void fillStack() {
        LocalDate dataInicial = this.pr0q.INICIDATA;

        for (int c = 0; c < this.pr0q.CAPACITY; c++) {
            if(c!=0){
                dataInicial = dataInicial.plusDays(this.pr0q.DESPLACAMENT);
            }
            pr0q.push(dataInicial.format(DateTimeFormatter.ofPattern("dd/MM")));
        }
    }

    @Before
    public void setUp() {
        this.pr0q = new PR0StackActivitat2();

        assertNotNull(this.pr0q.getStack());
        this.fillStack();
    }

    @After
    public void release() {
        this.pr0q = null;
    }


    @org.junit.Test
    public void stackTest() {

        assertEquals(this.pr0q.CAPACITY, this.pr0q.getStack().size());

        assertEquals(this.pr0q.clearAllStack(), new String("16/10 14/10 12/10 10/10 08/10 06/10 04/10 02/10 30/09 28/09 "));

        assertEquals(0, this.pr0q.getStack().size());
    }
}
