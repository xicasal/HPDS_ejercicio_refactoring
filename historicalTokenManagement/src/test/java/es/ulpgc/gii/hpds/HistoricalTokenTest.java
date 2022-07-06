package es.ulpgc.gii.hpds;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HistoricalTokenTest
{
    private HistoricalToken historialToken;
    @Before
    public void init(){
        historialToken = new HistoricalToken();
    }

    @Test
    public void whenWeCreateHistoricalToken_itsInitialState_IsEqualTo_Undiscovered()
    {
        assertTrue(historialToken.isUnDiscovered());
    }

    @Test
    public void whenWeChangeHistoricalTokenStateOnce_itsState_IsEqualTo_Discovered()
    {
        historialToken.changeState();
        assertTrue(historialToken.isDiscovered());
    }

    @Test
    public void whenWeChangeHistoricalTokenStateTwice_itsState_IsEqualTo_Unstudied()
    {
        historialToken.changeState();
        historialToken.changeState();
        assertTrue(historialToken.isUnstudied());
    }

    @Test
    public void whenWeChangeHistoricalTokenStateThreeTimes_itsState_IsEqualTo_Catalogued()
    {
        historialToken.changeState();
        historialToken.changeState();
        historialToken.changeState();
        assertTrue(historialToken.isCatalogued());
    }

    @Test
    public void whenWeDefineALoss_HistoricalTokenState_IsEqualTo_Lost()
    {
        historialToken.setLostState();
        assertTrue(historialToken.isLost());
    }

    @Test
    public void whenWeDefineARobbery_HistoricalTokenState_IsEqualTo_Stolen()
    {
        historialToken.setStolenState();
        assertTrue(historialToken.isStolen());
    }
}
