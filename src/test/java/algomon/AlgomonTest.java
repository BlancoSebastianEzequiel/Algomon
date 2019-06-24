package algomon;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import algomon.ataque.Brasas;
import algomon.ataque.Burbuja;
import algomon.ataque.Canto;
import algomon.ataque.CanionDeAgua;
import algomon.ataque.Chupavidas;
import algomon.ataque.Fogonazo;
import algomon.ataque.LatigoCepa;
import algomon.elemento.Pocion;
import algomon.elemento.Restaurador;
import algomon.elemento.SuperPocion;
import algomon.entrenador.Entrenador;
import algomon.excepciones.EquipoCompletoException;
import algomon.excepciones.GanadorException;
import algomon.excepciones.PerdedorException;
import algomon.excepciones.PokemonPropioSeDebilitoException;
import algomon.excepciones.PokemonSeDebilitoException;
import algomon.juego.Juego;
import algomon.ataque.AtaqueRapido;
import algomon.pokemon.Bulbasaur;
import algomon.pokemon.Chansey;
import algomon.pokemon.Charmander;
import algomon.pokemon.Jigglypuff;
import algomon.pokemon.Rattata;
import algomon.pokemon.Squirtle;

public class AlgomonTest {

    @Test
    public void test01SquirtleAtacaConBurbujaYLeQuita20DeVidaACharmander()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Squirtle unSquirtle = new Squirtle();
        Charmander unCharmander = new Charmander();
        Burbuja unBurbuja = new Burbuja();
        double hpInicialCharmander = unCharmander.getHP();
        unSquirtle.atacar(unBurbuja, unCharmander);
        assert (unCharmander.getHP() == hpInicialCharmander - 20);
    }

    @Test
    public void test02SquirtleAtacaConBurbujaYLeQuita10DeVidaAChansey()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Squirtle unSquirtle = new Squirtle();
        Chansey unChansey = new Chansey();
        Burbuja unBurbuja = new Burbuja();
        double hpInicialChansey = unChansey.getHP();
        unSquirtle.atacar(unBurbuja, unChansey);
        assert (unChansey.getHP() == hpInicialChansey - 10);
    }

    @Test
    public void test03SquirtleAtacaConBurbujaYLeQuita5DeVidaABulbasaur()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Squirtle unSquirtle = new Squirtle();
        Bulbasaur unBulbasaur = new Bulbasaur();
        Burbuja unBurbuja = new Burbuja();
        double hpInicialBulbasaur = unBulbasaur.getHP();
        unSquirtle.atacar(unBurbuja, unBulbasaur);
        assertEquals(hpInicialBulbasaur - 5, unBulbasaur.getHP(), 0.0001D);
    }

    @Test
    public void test04SquirtleAtacaConAtaqueRapidoYLeQuita10DeVidaACharmander()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Squirtle unSquirtle = new Squirtle();
        Charmander unCharmander = new Charmander();
        AtaqueRapido unAtaqueRapido = new AtaqueRapido();
        double hpInicialCharmander = unCharmander.getHP();
        unSquirtle.atacar(unAtaqueRapido, unCharmander);
        assert (unCharmander.getHP() == hpInicialCharmander - 10);
    }

    @Test
    public void test05SquirtleAtacaConCanionDeAguaACharmander()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Squirtle unSquirtle = new Squirtle();
        Charmander unCharmander = new Charmander();
        CanionDeAgua unCanionDeAgua = new CanionDeAgua();
        double hpInicialCharmander = unCharmander.getHP();
        unSquirtle.atacar(unCanionDeAgua, unCharmander);
        assert (unCharmander.getHP() == hpInicialCharmander - 40);
    }

    @Test
    public void test06SquirtleAtacaConCanionDeAguaYLeQuita10DeVidaABulbasaur()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Squirtle unSquirtle = new Squirtle();
        Bulbasaur unBulbasaur = new Bulbasaur();
        CanionDeAgua unCanionDeAgua = new CanionDeAgua();
        double hpInicialBulbasaur = unBulbasaur.getHP();
        unSquirtle.atacar(unCanionDeAgua, unBulbasaur);
        assertEquals(hpInicialBulbasaur - 10, unBulbasaur.getHP(), 0.0001D);
    }

    @Test
    public void test07SquirtleAtacaConBurbujaYLeQuita10DeVidaAJigglypuff()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Squirtle unSquirtle = new Squirtle();
        Jigglypuff unJigglypuff  = new Jigglypuff();
        Burbuja unBurbuja = new Burbuja();
        double hpInicialJigglypuff  = unJigglypuff.getHP();
        unSquirtle.atacar(unBurbuja, unJigglypuff );
        assert (unJigglypuff .getHP() == hpInicialJigglypuff  - 10);
    }

    @Test
    public void test08SquirtleAtacaConBurbujaYLeQuita10DeVidaARattata()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Squirtle unSquirtle = new Squirtle();
        Rattata  unRattata  = new Rattata();
        Burbuja unBurbuja = new Burbuja();
        double hpInicialRattata  = unRattata.getHP();
        unSquirtle.atacar(unBurbuja, unRattata );
        assert (unRattata .getHP() == hpInicialRattata  - 10);
    }

    @Test
    public void test09SquirtleAtacaConCanionDeAguaYLeQuita20DeVidaAChansey()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Squirtle unSquirtle = new Squirtle();
        Chansey unChansey = new Chansey();
        CanionDeAgua unCanionDeAgua = new CanionDeAgua();
        double hpInicialChansey = unChansey.getHP();
        unSquirtle.atacar(unCanionDeAgua, unChansey);
        assert (unChansey.getHP() == hpInicialChansey - 20);
    }

    @Test
    public void test10SquirtleAtacaConCanionDeAguaYLeQuita20DeVidaAJigglypuff()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Squirtle unSquirtle = new Squirtle();
        Jigglypuff  unJigglypuff  = new Jigglypuff();
        CanionDeAgua unCanionDeAgua = new CanionDeAgua();
        double hpInicialJigglypuff  = unJigglypuff.getHP();
        unSquirtle.atacar(unCanionDeAgua, unJigglypuff );
        assert (unJigglypuff .getHP() == hpInicialJigglypuff  - 20);
    }

    @Test
    public void test11SquirtleAtacaCanionDeAguaYLeQuita20DeVidaARattata()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Squirtle unSquirtle = new Squirtle();
        Rattata  unRattata  = new Rattata();
        CanionDeAgua unCanionDeAgua = new CanionDeAgua();
        double hpInicialRattata  = unRattata.getHP();
        unSquirtle.atacar(unCanionDeAgua, unRattata );
        assert (unRattata .getHP() == hpInicialRattata  - 20);
    }


    @Test
    public void test12BulbasorAtacaASquirtleConLatigoCepaYLeQuita30DeVida()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Bulbasaur unBulbasaur = new Bulbasaur();
        Squirtle unSquirtle = new Squirtle();
        LatigoCepa unLatiagoCepa = new LatigoCepa();
        double hpSquirtleInicial = unSquirtle.getHP();
        unBulbasaur.atacar(unLatiagoCepa, unSquirtle);
        assert (unSquirtle.getHP() == hpSquirtleInicial  - 30);
    }

    @Test
    public void test13BulbasorAtacaACharmanderConLatigoCepaYLeQuita7DeVida()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Bulbasaur unBulbasaur = new Bulbasaur();
        Charmander unCharmander = new Charmander();
        LatigoCepa unLatiagoCepa = new LatigoCepa();
        double hpCharmanderInicial = unCharmander.getHP();
        unBulbasaur.atacar(unLatiagoCepa, unCharmander);
        assertEquals(hpCharmanderInicial  - 7, unCharmander.getHP(), 0.0001D);
    }

    @Test
    public void test14BulbasorAtacaAJigglypuffConLatigoCepaYLeQuita15DeVida()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Bulbasaur unBulbasaur = new Bulbasaur();
        Jigglypuff unJigglypuff = new Jigglypuff();
        LatigoCepa unLatiagoCepa = new LatigoCepa();
        double hpJigglypuffInicial = unJigglypuff.getHP();
        unBulbasaur.atacar(unLatiagoCepa, unJigglypuff);
        assert (unJigglypuff.getHP() == hpJigglypuffInicial  - 15);
    }

    @Test
    public void test15BulbasorAtacaAChanseyConLatigoCepaYLeQuita15DeVida()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Bulbasaur unBulbasaur = new Bulbasaur();
        Chansey unChansey = new Chansey();
        LatigoCepa unLatiagoCepa = new LatigoCepa();
        double hpChanseyInicial = unChansey.getHP();
        unBulbasaur.atacar(unLatiagoCepa, unChansey);
        assert (unChansey.getHP() == hpChanseyInicial  - 15);
    }

    @Test
    public void test16BulbasorAtacaARattataConLatigoCepaYLeQuita15DeVida()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Bulbasaur unBulbasaur = new Bulbasaur();
        Rattata unRattata = new Rattata();
        LatigoCepa unLatiagoCepa = new LatigoCepa();
        double hpRattataInicial = unRattata.getHP();
        unBulbasaur.atacar(unLatiagoCepa, unRattata);
        assertEquals(hpRattataInicial - 15, unRattata.getHP(), 0.0001D);
    }

    @Test
    public void test17ChanseyAtacaASquirtleConLatigoCepaYLeQuita30DeVida()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Chansey unChansey = new Chansey();
        Squirtle unSquirtle = new Squirtle();
        LatigoCepa unLatiagoCepa = new LatigoCepa();
        double hpSquirtleInicial = unSquirtle.getHP();
        unChansey.atacar(unLatiagoCepa, unSquirtle);
        assert (unSquirtle.getHP() == hpSquirtleInicial  - 30);
    }

    @Test
    public void test18ChanseyAtacaACharmanderConLatigoCepaYLeQuita7DeVida()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Chansey unChansey = new Chansey();
        Charmander unCharmander = new Charmander();
        LatigoCepa unLatiagoCepa = new LatigoCepa();
        double hpCharmanderInicial = unCharmander.getHP();
        unChansey.atacar(unLatiagoCepa, unCharmander);
        assertEquals(hpCharmanderInicial  - 7, unCharmander.getHP(), 0.0001D);
    }

    @Test
    public void test19ChanseyAtacaAJigglypuffConLatigoCepaYLeQuita15DeVida()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Chansey unChansey = new Chansey();
        Jigglypuff unJigglypuff = new Jigglypuff();
        LatigoCepa unLatiagoCepa = new LatigoCepa();
        double hpJigglypuffInicial = unJigglypuff.getHP();
        unChansey.atacar(unLatiagoCepa, unJigglypuff);
        assert (unJigglypuff.getHP() == hpJigglypuffInicial  - 15);
    }

    @Test
    public void test20ChanseyAtacaABulbasaurConLatigoCepaYLeQuita7DeVida()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Chansey unChansey = new Chansey();
        Bulbasaur unBulbasaur = new Bulbasaur();
        LatigoCepa unLatiagoCepa = new LatigoCepa();
        double hpBulbasaurInicial = unBulbasaur.getHP();
        unChansey.atacar(unLatiagoCepa, unBulbasaur);
        assertEquals(hpBulbasaurInicial  - 7, unBulbasaur.getHP(), 0.0001D);
    }

    @Test
    public void test21ChanseyAtacaARattataConLatigoCepaYLeQuita15DeVida()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Bulbasaur unChansey = new Bulbasaur();
        Rattata unRattata = new Rattata();
        LatigoCepa unLatiagoCepa = new LatigoCepa();
        double hpRattataInicial = unRattata.getHP();
        unChansey.atacar(unLatiagoCepa, unRattata);
        assert (unRattata.getHP() == hpRattataInicial  - 15);
    }

    @Test
    public void test22CharmanderAtacaABulbasaurConBrasasyLeQuita32DeVidad()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Charmander unCharmander = new Charmander();
        Bulbasaur unBulbasaur = new Bulbasaur();
        Brasas brasas = new Brasas();
        double hpInicialBulbasaur = unBulbasaur.getHP();
        unCharmander.atacar(brasas, unBulbasaur);
        assertEquals(hpInicialBulbasaur  - 32, unBulbasaur.getHP(), 0.0001D);
    }

    @Test
    public void test23CharmanderAtacaASquirtleConBrasasyLeQuita8DeVidad()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Charmander unCharmander = new Charmander();
        Squirtle unSquirtle = new Squirtle();
        Brasas brasas = new Brasas();
        double hpInicialSquirtle = unSquirtle.getHP();
        unCharmander.atacar(brasas, unSquirtle);
        assertEquals(hpInicialSquirtle - 8, unSquirtle.getHP(), 0.0001D);
    }

    @Test
    public void test24CharmanderAtacaAJigglypuffConBrasasyLeQuita16DeVidad()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Charmander unCharmander = new Charmander();
        Jigglypuff unJigglypuff = new Jigglypuff();
        Brasas brasas = new Brasas();
        double hpInicialJigglypuff = unJigglypuff.getHP();
        unCharmander.atacar(brasas, unJigglypuff);
        assertEquals(hpInicialJigglypuff - 16, unJigglypuff.getHP(), 0.0001D);
    }

    @Test
    public void test25CharmanderAtacaAChanseyConBrasasyLeQuita16DeVidad()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Charmander unCharmander = new Charmander();
        Chansey unChansey = new Chansey();
        Brasas brasas = new Brasas();
        double hpInicialChansey = unChansey.getHP();
        unCharmander.atacar(brasas, unChansey);
        assertEquals(hpInicialChansey - 16, unChansey.getHP(), 0.0001D);
    }


    @Test
    public void test26CharmanderAtacaARattataConBrasasyLeQuita16DeVidad()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Charmander unCharmander = new Charmander();
        Rattata unRattata = new Rattata();
        Brasas brasas = new Brasas();
        double hpInicialRattata = unRattata.getHP();
        unCharmander.atacar(brasas, unRattata);
        assertEquals(hpInicialRattata - 16, unRattata.getHP(), 0.0001D);
    }

    @Test
    public void test27CharmanderAgotaSuFogonazoYaNoPuedeVolverAUsarlo()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Charmander unCharmander = new Charmander();
        Rattata unRattata = new Rattata();
        Fogonazo unFogonazo = new Fogonazo();
        for (int x = 0; x < 4; x++) {
            unCharmander.atacar(unFogonazo, unRattata);
        }
        // Cuando salimos del for, chamander ya agotñ su ataque
        double hpRattata = unRattata.getHP();
        unCharmander.atacar(unFogonazo, unRattata); // Este ataque no tiene que ejecutarse
        // Como el ataque no se ejecutñ, sus puntos de vida tienen que seguir igual
        assertEquals(hpRattata, unRattata.getHP(), 0.0001D);
        unCharmander.atacar(unFogonazo, unRattata);
        assertEquals(hpRattata, unRattata.getHP(), 0.0001D);
        unCharmander.atacar(unFogonazo, unRattata);
        // Probamos algunas veces mñs para comprobar que el ataque queda inhabilitado permanentemente
        assertEquals(hpRattata, unRattata.getHP(), 0.0001D);

    }

    @Test
    public void test29JigglypuffAtacaConCantoYDuermeSquirtleQuienNoLeCausaDanioProbandoUnTurno()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Squirtle unSquirtle = new Squirtle();
        Jigglypuff  unJigglypuff  = new Jigglypuff();
        Canto canto = new Canto();
        unJigglypuff.atacar(canto, unSquirtle);
        double hpInicialJigglypuff  = unJigglypuff.getHP();
        Burbuja unBurbuja = new Burbuja();
        unSquirtle.atacar(unBurbuja, unJigglypuff );
        assertEquals(hpInicialJigglypuff, unJigglypuff.getHP(), 0.0001D);
    }

    @Test
    public void test30JigglypuffAtacaConCantoYDuermeSquirtleQuienNoLeCausaDanioProbandoDosTurnos()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Squirtle unSquirtle = new Squirtle();
        Jigglypuff  unJigglypuff  = new Jigglypuff();
        Canto canto = new Canto();
        unJigglypuff.atacar(canto, unSquirtle);
        double hpInicialJigglypuff  = unJigglypuff.getHP();
        Burbuja unBurbuja = new Burbuja();
        unSquirtle.atacar(unBurbuja, unJigglypuff );
        unSquirtle.atacar(unBurbuja, unJigglypuff );
        assertEquals(hpInicialJigglypuff, unJigglypuff.getHP(), 0.0001D);
    }

    @Test
    public void test31JigglypuffAtacaConCantoYDuermeSquirtleQuienNoLeCausaDanioProbandoTresTurnos()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Squirtle unSquirtle = new Squirtle();
        Jigglypuff  unJigglypuff  = new Jigglypuff();
        Canto canto = new Canto();
        unJigglypuff.atacar(canto, unSquirtle);
        double hpInicialJigglypuff  = unJigglypuff.getHP();
        Burbuja unBurbuja = new Burbuja();
        unSquirtle.atacar(unBurbuja, unJigglypuff );
        unSquirtle.atacar(unBurbuja, unJigglypuff );
        unSquirtle.atacar(unBurbuja, unJigglypuff );
        assertEquals(hpInicialJigglypuff, unJigglypuff.getHP(), 0.0001D);
    }

    @Test
    public void test32JigglypuffAtacaConCantoYDuermeSquirtleQuienLeCausaDanioLuegoDeTresTurnos()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Squirtle unSquirtle = new Squirtle();
        Jigglypuff  unJigglypuff  = new Jigglypuff();
        Canto canto = new Canto();
        unJigglypuff.atacar(canto, unSquirtle);
        double hpInicialJigglypuff  = unJigglypuff.getHP();
        Burbuja unBurbuja = new Burbuja();
        unSquirtle.atacar(unBurbuja, unJigglypuff );
        unSquirtle.atacar(unBurbuja, unJigglypuff );
        unSquirtle.atacar(unBurbuja, unJigglypuff );
        unSquirtle.atacar(unBurbuja, unJigglypuff );
        assertEquals(hpInicialJigglypuff - 10, unJigglypuff.getHP(), 0.0001D );
    }

    @Test
    public void test33CharmanderAtacaABulbasaurConFogonazoQuitandole4PuntosDeVida()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Charmander unCharmander = new Charmander();
        Fogonazo unFogonazo = new Fogonazo();
        Bulbasaur unBulbasaur = new Bulbasaur();
        double hpInicialBulbasaur = unBulbasaur.getHP();
        unCharmander.atacar(unFogonazo, unBulbasaur);
        assert ( hpInicialBulbasaur - 4 == unBulbasaur.getHP() );
    }

    @Test
    public void test34CharmanderAtacaASquirtleConFogonazoQuitandole1PuntoDeVida()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Charmander unCharmander = new Charmander();
        Fogonazo unFogonazo = new Fogonazo();
        Squirtle unSquirtle = new Squirtle();
        double hpInicialSquirtle = unSquirtle.getHP();
        unCharmander.atacar(unFogonazo, unSquirtle);
        assert ( hpInicialSquirtle - 1 == unSquirtle.getHP() );
    }

    @Test
    public void test35CharmanderAtacaARattataConFogonazoQuitandole2PuntosDeVida()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Charmander unCharmander = new Charmander();
        Fogonazo unFogonazo = new Fogonazo();
        Rattata unRattata = new Rattata();
        double hpInicialRattata = unRattata.getHP();
        unCharmander.atacar(unFogonazo, unRattata);
        assert ( hpInicialRattata - 2 == unRattata.getHP() );
    }

    @Test
    public void test36CharmanderAtacaABulbasaurConFogonazoProvocandoleUnDanioPermanenteDe14Puntos()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Charmander unCharmander = new Charmander();
        Fogonazo unFogonazo = new Fogonazo();
        Bulbasaur unBulbasaur = new Bulbasaur();
        unCharmander.atacar(unFogonazo, unBulbasaur);
        AtaqueRapido unAtaqueRapido = new AtaqueRapido();
        double hpActualBulbasaur = unBulbasaur.getHP();
        unBulbasaur.atacar(unAtaqueRapido, unCharmander);
        assert ( hpActualBulbasaur - 14 == unBulbasaur.getHP() );
        hpActualBulbasaur = unBulbasaur.getHP();
        unBulbasaur.atacar(unAtaqueRapido, unCharmander);
        assert ( hpActualBulbasaur - 14 == unBulbasaur.getHP() );
        hpActualBulbasaur = unBulbasaur.getHP();
        unBulbasaur.atacar(unAtaqueRapido, unCharmander);
        assert ( hpActualBulbasaur - 14 == unBulbasaur.getHP() );
        hpActualBulbasaur = unBulbasaur.getHP();
        unBulbasaur.atacar(unAtaqueRapido, unCharmander);
        assert ( hpActualBulbasaur - 14 == unBulbasaur.getHP() );
    }

    @Test
    public void test37CharmanderAtacaASquirtleConFogonazoProvocandoleUnDanioPermanenteDe15Puntos()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Charmander unCharmander = new Charmander();
        Fogonazo unFogonazo = new Fogonazo();
        Squirtle unSquirtle = new Squirtle();
        unCharmander.atacar(unFogonazo, unSquirtle);
        AtaqueRapido unAtaqueRapido = new AtaqueRapido();
        double hpActualSquirtle = unSquirtle.getHP();
        unSquirtle.atacar(unAtaqueRapido, unCharmander);
        assert (hpActualSquirtle - 15 == unSquirtle.getHP());
        hpActualSquirtle = unSquirtle.getHP();
        unSquirtle.atacar(unAtaqueRapido, unCharmander);
        assert (hpActualSquirtle - 15 == unSquirtle.getHP());
        hpActualSquirtle = unSquirtle.getHP();
        unSquirtle.atacar(unAtaqueRapido, unCharmander);
        assert (hpActualSquirtle - 15 == unSquirtle.getHP());
        hpActualSquirtle = unSquirtle.getHP();
        unSquirtle.atacar(unAtaqueRapido, unCharmander);
        assert (hpActualSquirtle - 15 == unSquirtle.getHP());
    }

    @Test
    public void test38CharmanderAtacaARattataConFogonazoProvocandoleUnDanioPermanenteDe17Puntos()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Charmander unCharmander = new Charmander();
        Fogonazo unFogonazo = new Fogonazo();
        Rattata unRattata = new Rattata();
        unCharmander.atacar(unFogonazo, unRattata);
        AtaqueRapido unAtaqueRapido = new AtaqueRapido();
        double hpActualRattata = unRattata.getHP();
        unRattata.atacar(unAtaqueRapido, unCharmander);
        assert (hpActualRattata - 17 == unRattata.getHP());
        hpActualRattata = unRattata.getHP();
        unRattata.atacar(unAtaqueRapido, unCharmander);
        assert (hpActualRattata - 17 == unRattata.getHP());
        hpActualRattata = unRattata.getHP();
        unRattata.atacar(unAtaqueRapido, unCharmander);
        assert (hpActualRattata - 17 == unRattata.getHP());
        hpActualRattata = unRattata.getHP();
        unRattata.atacar(unAtaqueRapido, unCharmander);
        assert (hpActualRattata - 17 == unRattata.getHP());
    }

    @Test
    public void test39BulbasaurAtacaARattataConChupavidasYLeQuita15PuntosDeVidaGanandoLuego4PuntosDeVida()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Rattata unRattata = new Rattata();
        double hpInicialRattata = unRattata.getHP();
        Bulbasaur unBulbasaur = new Bulbasaur();
        AtaqueRapido unAtaqueRapido = new AtaqueRapido();
        Chupavidas unChupavidas = new Chupavidas();
        unRattata.atacar(unAtaqueRapido, unBulbasaur);
        double hpActualBulbasaur = unBulbasaur.getHP();
        unBulbasaur.atacar(unChupavidas, unRattata);
        assert (unRattata.getHP() == hpInicialRattata - 15);
        assert (unBulbasaur.getHP() == hpActualBulbasaur + 4);
    }

    @Test
    public void test40BulbasaurAtacaASquirtleConChupavidasYLeQuita30PuntosDeVidaGanandoLuego9PuntosDeVida()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Squirtle unSquirtle = new Squirtle();
        double hpInicialSquirtle = unSquirtle.getHP();
        Bulbasaur unBulbasaur = new Bulbasaur();
        AtaqueRapido unAtaqueRapido = new AtaqueRapido();
        Chupavidas unChupavidas = new Chupavidas();
        unSquirtle.atacar(unAtaqueRapido, unBulbasaur);
        double hpActualBulbasaur = unBulbasaur.getHP();
        unBulbasaur.atacar(unChupavidas, unSquirtle);
        assert (unSquirtle.getHP() == hpInicialSquirtle - 30);
        assert (unBulbasaur.getHP() == hpActualBulbasaur + 9);
    }

    @Test
    public void test41BulbasaurAtacaACharmanderConChupavidasYLeQuita7PuntosDeVidaGanandoLuego2PuntosDeVida()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Charmander unCharmander = new Charmander();
        double hpInicialCharmander = unCharmander.getHP();
        Bulbasaur unBulbasaur = new Bulbasaur();
        AtaqueRapido unAtaqueRapido = new AtaqueRapido();
        Chupavidas unChupavidas = new Chupavidas();
        unCharmander.atacar(unAtaqueRapido, unBulbasaur);
        double hpActualBulbasaur = unBulbasaur.getHP();
        unBulbasaur.atacar(unChupavidas, unCharmander);
        assert (unCharmander.getHP() == hpInicialCharmander - 7);
        assert (unBulbasaur.getHP() == hpActualBulbasaur + 2);
    }

    @Test
    public void test42BulbasaurAtacaAOtroBulbasaurConChupavidasYLeQuita7PuntosDeVidaGanandoLuego2PuntosDeVida()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Bulbasaur otroBulbasaur = new Bulbasaur();
        double hpInicialOtroBulbasaur = otroBulbasaur.getHP();
        Bulbasaur unBulbasaur = new Bulbasaur();
        AtaqueRapido unAtaqueRapido = new AtaqueRapido();
        Chupavidas unChupavidas = new Chupavidas();
        otroBulbasaur.atacar(unAtaqueRapido, unBulbasaur);
        double hpActualBulbasaur = unBulbasaur.getHP();
        unBulbasaur.atacar(unChupavidas, otroBulbasaur);
        assert (otroBulbasaur.getHP() == hpInicialOtroBulbasaur - 7);
        assert (unBulbasaur.getHP() == hpActualBulbasaur + 2);
    }

    @Test
    public void test43CharmanderQuemaAUnRattaDormidoQueNoPuedeAtacarPorTresTurnosYLeGeneraDanioPermanenteDe17()
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Charmander unCharmander = new Charmander();
        Rattata unRattata = new Rattata();
        Fogonazo unFogonazo = new Fogonazo();
        Canto unCanto = new Canto();
        AtaqueRapido unAtaqueRapido = new AtaqueRapido();
        double hpInicialCharmander = unCharmander.getHP();
        double hpActualRattata = (unRattata.getHP() - 2); //El fogonazo le habia quitado 2HP
        unCharmander.atacar(unCanto, unRattata);
        unCharmander.atacar(unFogonazo, unRattata);
        unRattata.atacar(unAtaqueRapido, unCharmander);
        assert (unCharmander.getHP() == hpInicialCharmander); //Rattata no puede atacar (quedan 2 turnos)
        assert (unRattata.getHP() == hpActualRattata - 17); //El fogonazo dania a Rattata
        hpActualRattata = unRattata.getHP();
        unRattata.atacar(unAtaqueRapido, unCharmander);
        assert (unCharmander.getHP() == hpInicialCharmander); //Rattata no puede atacar (quedan 1 turno)
        assert (unRattata.getHP() == hpActualRattata - 17); //El fogonazo dania a Rattata
        hpActualRattata = unRattata.getHP();
        unRattata.atacar(unAtaqueRapido, unCharmander);
        assert (unCharmander.getHP() == hpInicialCharmander); //Rattata no puede atacar (al proximo tiene que poder hacerlo)
        assert (unRattata.getHP() == hpActualRattata - 17); //El fogonazo dania a Rattata
        hpActualRattata = unRattata.getHP();
        unRattata.atacar(unAtaqueRapido, unCharmander);
        assert (unCharmander.getHP() == hpInicialCharmander - 10); //Rattata salio de la inactividad
        assert (unRattata.getHP() == hpActualRattata - 17); //El danio permanente continua
    }


    @Test
    public void test44UnPokemonDebilitadoNoPuedeAtacar() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Charmander unCharmander = new Charmander();
        Rattata unRattata = new Rattata();
        try {
            unCharmander.recibirDanio(unCharmander.getHP());
        } catch (PokemonSeDebilitoException e) {
            // No hago nada con esta excepcion, no es lo que me interesa probar ahora
        }
        Fogonazo unFogonazo = new Fogonazo();
        double hpInicialRattata = unRattata.getHP();
        unCharmander.atacar(unFogonazo, unRattata);
        assert (unRattata.getHP() == hpInicialRattata); //Como charmander esta debilitado, su ataque no tiene efecto
    }


    @Test
    public void test45UnPokemonDebilitadoNoPuedeRecibirMasDanio() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Charmander unCharmander = new Charmander();
        Rattata unRattata = new Rattata();
        AtaqueRapido unAtaqueRapido = new AtaqueRapido();
        try {
            unCharmander.recibirDanio(unCharmander.getHP());
        } catch (PokemonSeDebilitoException e) {
            // No hago nada con esta excepcion, no es lo que me interesa probar ahora
        }
        double hpCharmander = unCharmander.getHP();
        unRattata.atacar(unAtaqueRapido, unCharmander);
        assert (unCharmander.getHP() == hpCharmander); // Como charmander esta debilitado, ya no pierde mas puntos de vida
    }

    @Test (expected = EquipoCompletoException.class )
    public void test46UnEntrenadorNoPuedeAgregarMasDeTresPokemonEnSuEquipo() throws EquipoCompletoException {
        Charmander unCharmander = new Charmander();
        Bulbasaur unBulbasaur = new Bulbasaur();
        Squirtle unSquirtle = new Squirtle();
        Rattata unRattata = new Rattata();
        Entrenador unEntrenador = new Entrenador();
        unEntrenador.agregarPokemonAlEquipo(unCharmander);
        unEntrenador.agregarPokemonAlEquipo(unSquirtle);
        unEntrenador.agregarPokemonAlEquipo(unBulbasaur);
        unEntrenador.agregarPokemonAlEquipo(unRattata); //Aca tiene que saltar la excepcion
    }

    @Test
    public void test47UnEntrenadorOrdenaASuPokemonAtacarYEsteLoHace()
            throws EquipoCompletoException, PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Squirtle unSquirtle = new Squirtle();
        Rattata unRattata = new Rattata();
        Entrenador unEntrenador = new Entrenador();
        Burbuja unBurbuja = new Burbuja();
        double hpInicialRattata = unRattata.getHP();
        unEntrenador.agregarPokemonAlEquipo(unSquirtle);
        unEntrenador.darOrdenDeAtaque(unBurbuja, unRattata);
        assert (unRattata.getHP() == hpInicialRattata - 10);
    }


    @Test
    public void test48ElPrimerPokemonQueAgregaElEntrenadorAlEquipoSeraElPokemonActual() throws EquipoCompletoException {
        Squirtle unSquirtle = new Squirtle();
        Entrenador unEntrenador = new Entrenador();
        unEntrenador.agregarPokemonAlEquipo(unSquirtle);
        assert (unEntrenador.getPokemonActual() == unSquirtle);
    }

    @Test
    public void test49IntercambiarPokemonDelEquipo() throws EquipoCompletoException, PokemonSeDebilitoException {
        @SuppressWarnings("unused")
        Squirtle unSquirtle = new Squirtle();
        Rattata unRattata = new Rattata();
        Entrenador unEntrenador = new Entrenador();
        unEntrenador.agregarPokemonAlEquipo(unRattata);
        unEntrenador.agregarPokemonAlEquipo(unRattata);
        unEntrenador.pedirCambio("rattata");
        assert (unEntrenador.getPokemonActual() == unRattata);
    }


    @Test
    public void test50TratarDeIntercambiarPorUnPokemonQueNoEstaEnElEquipoNoGeneraNingunCambio()
            throws EquipoCompletoException, PokemonSeDebilitoException {
        Rattata unRattata = new Rattata();
        Entrenador unEntrenador = new Entrenador();
        unEntrenador.agregarPokemonAlEquipo(unRattata);
        unEntrenador.pedirCambio("bulbasaur");
        assert (unEntrenador.getPokemonActual() == unRattata);
    }


    @Test (expected = PokemonSeDebilitoException.class)
    public void test51TratarDeCambiarAUnPokemonPorOtroQueEstaDebilitadoGeneraExcepcion()
            throws EquipoCompletoException, PokemonSeDebilitoException {
        Rattata unRattata = new Rattata();
        Bulbasaur unBulbasaur = new Bulbasaur();
        try {
            unBulbasaur.recibirDanio( unBulbasaur.getHP() );
        } catch (PokemonSeDebilitoException e) {
            // No hago nada con esta excepcion, no es lo que me interesa probar ahora
        }
        Entrenador unEntrenador = new Entrenador();
        unEntrenador.agregarPokemonAlEquipo(unRattata);
        unEntrenador.agregarPokemonAlEquipo(unBulbasaur);
        unEntrenador.pedirCambio("bulbasaur");
    }


    @Test
    public void test52ElCambiarDeTurnoDuranteLaBatallaCambiaAlEntrenadorActual() {
        Entrenador unEntrenador = new Entrenador();
        Entrenador otroEntrenador = new Entrenador();
        Juego.comenzarBatalla(unEntrenador, otroEntrenador);
        Juego.cambioDeTurno();
        assert (Juego.getEntrenadorActual() == otroEntrenador);
    }


    @Test
    public void test53ElMetodoAtacarDeJuegoProvocaQueAtaqueSolamenteElEntrenadorActual()
            throws EquipoCompletoException, PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Entrenador unEntrenador = new Entrenador();
        Entrenador otroEntrenador = new Entrenador();
        Squirtle unSquirtle = new Squirtle();
        Rattata unRattata = new Rattata();
        AtaqueRapido unAtaqueRapido = new AtaqueRapido();
        unEntrenador.agregarPokemonAlEquipo(unRattata);
        otroEntrenador.agregarPokemonAlEquipo(unSquirtle);
        double hpInicialRattata = unRattata.getHP();
        double hpInicialSquirtle = unSquirtle.getHP();
        Juego.comenzarBatalla(unEntrenador, otroEntrenador);
        unEntrenador.darOrdenDeAtaque(unAtaqueRapido, unSquirtle);
        assert (unSquirtle.getHP() == hpInicialSquirtle - 10);
        assert (unRattata.getHP() == hpInicialRattata);
    }


    @Test
    public void test54UsarPocionEnPokemonLeDevuelve20PuntosDeVida() throws PokemonSeDebilitoException {
        Pocion unaPocion = new Pocion(1);
        Charmander unCharmander = new Charmander();
        unCharmander.recibirDanio(40);
        double hpCharmander = unCharmander.getHP();
        unaPocion.aplicarEn(unCharmander);
        assert (unCharmander.getHP() == hpCharmander + 20);
    }

    @Test
    public void test55UsarPocionEnPokemonConPuntosDeVidaATopeNoTieneEfecto() {
        Pocion unaPocion = new Pocion(1);
        Charmander unCharmander = new Charmander();
        double hpCharmander = unCharmander.getHP();
        unaPocion.aplicarEn(unCharmander);
        assert ( unCharmander.getHP() == hpCharmander );
    }


    @Test
    public void test56TratarDeUsarPocionesCuandoYaNoQuedanMasNoProduceEfecto() throws PokemonSeDebilitoException {
        Pocion unaPocion = new Pocion(0);
        Charmander unCharmander = new Charmander();
        unCharmander.recibirDanio(40);
        double hpCharmander = unCharmander.getHP();
        unaPocion.aplicarEn(unCharmander);
        assert (unCharmander.getHP() == hpCharmander);
    }

    @Test
    public void test57UsarSuperPocionEnPokemonLeDevuelve40PuntosDeVida() throws PokemonSeDebilitoException {
        SuperPocion unaSuperPocion = new SuperPocion(1);
        Charmander unCharmander = new Charmander();
        unCharmander.recibirDanio(80);
        double hpCharmander = unCharmander.getHP();
        unaSuperPocion.aplicarEn(unCharmander);
        assert (unCharmander.getHP() == hpCharmander + 40);
    }

    @Test
    public void test58UsarSuperPocionEnPokemonConPuntosDeVidaATopeNoTieneEfecto() {
        SuperPocion unaSuperPocion = new SuperPocion(1);
        Charmander unCharmander = new Charmander();
        double hpCharmander = unCharmander.getHP();
        unaSuperPocion.aplicarEn(unCharmander);
        assert ( unCharmander.getHP() == hpCharmander );
    }


    @Test
    public void test59TratarDeUsarSuperPocionesCuandoYaNoQuedanMasNoProduceEfecto() throws PokemonSeDebilitoException {
        SuperPocion unaSuperPocion = new SuperPocion(0);
        Charmander unCharmander = new Charmander();
        unCharmander.recibirDanio(40);
        double hpCharmander = unCharmander.getHP();
        unaSuperPocion.aplicarEn(unCharmander);
        assert (unCharmander.getHP() == hpCharmander);
    }

    @Test
    public void test60RestauradorDevuelveAlpokemonASuEstadoNormal() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        Restaurador unRestaurador = new Restaurador(1);
        Charmander unCharmander = new Charmander();
        double hpCharmander = unCharmander.getHP();
        Rattata unRattata = new Rattata();
        Canto unCanto = new Canto();
        Fogonazo unFogonazo = new Fogonazo();
        AtaqueRapido unAtaqueRapido = new AtaqueRapido();
        unCharmander.atacar(unCanto, unRattata);
        unCharmander.atacar(unFogonazo, unRattata);
        double hpRattata =  unRattata.getHP();
        unRestaurador.aplicarEn(unRattata);
        unRattata.atacar(unAtaqueRapido, unCharmander); //En condiciones normales, rattata no podria atacar y sufriria 17 de danio
        assert (unCharmander.getHP() == hpCharmander - 10);
        assert (unRattata.getHP() == hpRattata);
    }

    @Test
    public void test61EntrenadorDerrotaAUnPokemonDelOponenteYGanaUnPunto()
            throws EquipoCompletoException, GanadorException, PerdedorException {
        Charmander unChamander = new Charmander();
        Bulbasaur unBulbasaur = new Bulbasaur();
        Entrenador unEntrenador = new Entrenador();
        Entrenador otroEntrenador = new Entrenador();
        unEntrenador.agregarPokemonAlEquipo(unChamander);
        otroEntrenador.agregarPokemonAlEquipo(unBulbasaur);
        Juego.comenzarBatalla(unEntrenador, otroEntrenador);
        Brasas unBrasas = new Brasas();
        Juego.atacar(unBrasas, unBulbasaur);
        Juego.atacar(unBrasas, unBulbasaur);
        Juego.atacar(unBrasas, unBulbasaur);
        Juego.atacar(unBrasas, unBulbasaur);
        Juego.atacar(unBrasas, unBulbasaur);  //Aca derrota a Bulbasaur
        assert ( unEntrenador.getPuntaje() == 1 );
    }

    @Test (expected = GanadorException.class)
    public void test62EntrenadorGanaTresPuntosYEsDeclaradoGanador() throws GanadorException {
        Entrenador unEntrenador = new Entrenador();
        Entrenador otroEntrenador = new Entrenador();
        Juego.comenzarBatalla(unEntrenador, otroEntrenador);
        unEntrenador.aumentarPuntuacion();
        unEntrenador.aumentarPuntuacion();
        unEntrenador.aumentarPuntuacion();
    }
}
