import org.example.Bolig;
import org.example.Bud;
import org.example.Budgiver;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BoligTest {
    private Bolig bolig;
    private Budgiver budgiver1;
    private Budgiver budgiver2;

    @Before
    public void setUp(){
        bolig = new Bolig("Adresseveien 1", "1111", 1111);
        budgiver1 = new Budgiver("Erlend", "12345678");
        budgiver2 = new Budgiver("Martine", "87654321");
    }

    @Test
    public void testHentAktiveBudSortertEtterFrist(){
        Bud bud1 = budgiver1.opprettBud(bolig, 1,40, 1100);
        Bud bud2 = budgiver2.opprettBud(bolig, 1,30, 1200);
        Bud bud3 = budgiver1.opprettBud(bolig, 0,14, 1600);

        assertEquals(3, bolig.hentAktiveBudSortertEtterFristen().size());
    }

    @Test
    public void testHentHoyesteAktiveBud(){
        Bud bud1 = budgiver1.opprettBud(bolig, 1,40, 1100);
        Bud bud2 = budgiver2.opprettBud(bolig, 1,30, 1200);
        Bud bud3 = budgiver1.opprettBud(bolig, 0,14, 1600);

        Bud hoyesteBud = bolig.hentHoyesteAktiveBud();
        assertEquals(1600, hoyesteBud.getBelop());
    }

    @Test
    public void testAksepterBud(){
        Bud bud1 = budgiver1.opprettBud(bolig, 1,40, 1100);
        Bud bud2 = budgiver2.opprettBud(bolig, 1,30, 1200);
        Bud bud3 = budgiver1.opprettBud(bolig, 0,14, 1600);

        boolean suksess = bolig.aksepterBud(bud3);
        assertTrue(suksess);
    }

}
