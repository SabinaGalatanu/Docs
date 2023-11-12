package BibliotecaApp.model;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CarteTest {
    static Carte c0;
    Carte c1, c2, c3, c4;

    @BeforeAll
    public static void setUpAll(){
        c0 = new Carte();
    }
    @BeforeEach
    public void setUp() {
        //se apeleaza automat inaintea fiecarui test.
            c1 = new Carte();

            c2 = new Carte();
            c2.setTitlu("Ion");
            ArrayList<String> autori2 = new ArrayList<>();
            autori2.add("Rebreanu");
            c2.setAutori(autori2);
            c2.setEditura("Humanitas");
            c2.setAnAparitie("2022");
            ArrayList<String> cuvinte2 = new ArrayList<>();
            cuvinte2.add("pamant");
            cuvinte2.add("iubire");
            c2.setCuvinteCheie(cuvinte2);

            c3 = new Carte();
            c3.setTitlu("Poezii");
            ArrayList<String> autori3 = new ArrayList<>();
            cuvinte2.add("Eminescu");
            c3.setAutori(autori3);
            c3.setEditura("Humanitas");
            c3.setAnAparitie("2022");
            ArrayList<String> cuvinte3 = new ArrayList<>();
            cuvinte3.add("floare");
            cuvinte3.add("iubire");
            c3.setCuvinteCheie(cuvinte3);
    }


    @Test
    @Order(2)
    public void test_setTitlu1(){

            assertEquals("",c0.getTitlu());
            assertEquals("",c1.getTitlu());
            assertEquals("Ion",c2.getTitlu());
            assertEquals("Poezii",c3.getTitlu());

            c0.setTitlu("Povesti");
            assertEquals("Povesti", c0.getTitlu());
            c1.setTitlu("Povesti");
            assertEquals("Povesti", c1.getTitlu());
            c2.setTitlu("Povesti");
            assertEquals("Povesti", c2.getTitlu());
            c3.setTitlu("Povesti");
            assertEquals("Povesti", c3.getTitlu());

            try{
                c4.setTitlu("Povesti");
                assert false;
            } catch (Exception e) {
                assert true;
            }
        }

    @Test
    @Order(1)
    public void test_setTitlu2(){

        assertEquals("Povesti",c0.getTitlu());
        assertEquals("",c1.getTitlu());
        assertEquals("Ion",c2.getTitlu());
        assertEquals("Poezii",c3.getTitlu());

        c1.setTitlu("Povesti");
        assertEquals("Povesti", c1.getTitlu());
        c2.setTitlu("Povesti");
        assertEquals("Povesti", c2.getTitlu());
        c3.setTitlu("Povesti");
        assertEquals("Povesti", c3.getTitlu());

        try{
            c4.setTitlu("Povesti");
            assert false;
        } catch (Exception e) {
            assert true;
        }
    }



    @AfterEach
    public void tearDownEach() {
        System.out.println("\n se distruge unul");
    }
    @AfterAll
    public static void tearDownAll() {
        System.out.println("\n se distrug toate");
    }
}