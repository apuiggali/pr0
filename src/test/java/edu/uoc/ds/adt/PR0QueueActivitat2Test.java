package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Before;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR0QueueActivitat2Test {

    PR0QueueActivitat2 pr0q;


    private void fillQueue() {

        LocalDate dataInicial = this.pr0q.INICIDATA;

        for (int c = 0; c < this.pr0q.CAPACITY; c++) {
            //System.out.println(dataInicial.format(DateTimeFormatter.ofPattern("dd/MM")));
            if(c!=0){
                dataInicial = dataInicial.plusDays(this.pr0q.DESPLACAMENT);
            }
            pr0q.add(dataInicial.format(DateTimeFormatter.ofPattern("dd/MM")));
        }
    }




    @Before
    public void setUp() {
        this.pr0q = new PR0QueueActivitat2();

        assertNotNull(this.pr0q.getQueue());
        fillQueue();
        System.out.println(this.pr0q.getQueue());
    }

    @After
    public void release() {
        this.pr0q = null;
    }


    @org.junit.Test
    public void queueTest() {
        
        assertEquals(this.pr0q.CAPACITY, this.pr0q.getQueue().size());

        assertEquals(this.pr0q.clearFullQueue(), new String("28/09 30/09 02/10 04/10 06/10 08/10 10/10 12/10 14/10 16/10 "));

        assertEquals(0, this.pr0q.getQueue().size());
    }

}
