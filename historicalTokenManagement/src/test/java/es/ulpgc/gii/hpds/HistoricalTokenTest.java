package es.ulpgc.gii.hpds;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class HistoricalTokenTest
{
    @Test
    public void whenWeCreateHistoricalToken_itsInitialState_IsEqualTo_Undiscovered()
    {
        HistoricalToken historialToken = new HistoricalToken();
        assertTrue(historialToken.isUnDiscovered());
    }

    @Test
    public void whenWeChangeHistoricalTokenStateOnce_itsState_IsEqualTo_Discovered()
    {
        HistoricalToken historialToken = new HistoricalToken();
        historialToken.changeState();
        assertTrue(historialToken.isDiscovered());
    }

    @Test
    public void whenWeChangeHistoricalTokenStateTwice_itsState_IsEqualTo_Unstudied()
    {
        HistoricalToken historialToken = new HistoricalToken();
        historialToken.changeState();
        historialToken.changeState();
        assertTrue(historialToken.isUnstudied());
    }

    @Test
    public void whenWeChangeHistoricalTokenStateThreeTimes_itsState_IsEqualTo_Catalogued()
    {
        HistoricalToken historialToken = new HistoricalToken();
        historialToken.changeState();
        historialToken.changeState();
        historialToken.changeState();
        assertTrue(historialToken.isCatalogued());
    }

    @Test
    public void whenWeDefineALoss_HistoricalTokenState_IsEqualTo_Lost()
    {
        HistoricalToken historialToken = new HistoricalToken();
        historialToken.setLostState();
        assertTrue(historialToken.isLost());
    }

    @Test
    public void whenWeDefineARobbery_HistoricalTokenState_IsEqualTo_Stolen()
    {
        HistoricalToken historialToken = new HistoricalToken();
        historialToken.setStolenState();
        assertTrue(historialToken.isStolen());
    }
}
