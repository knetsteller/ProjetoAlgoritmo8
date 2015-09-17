/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.es.construcaodesoftware.projetoalgoritmo8;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alunoinf
 */
public class SomaDosCubosTest {
    
    public SomaDosCubosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testIsSomaDosCubosComArgumentoInvalido() {
        SomaDosCubos.isSomaDosCubos(1000);
    }
    

    /**
     * Test of calculaSomaDosCubos method, of class SomaDosCubos.
     */
    @org.junit.Test
    public void testIsSomaDosCubosComZero() {
        System.out.println("calculaSomaDosCubos");
        int n = 0;
        SomaDosCubos instance = new SomaDosCubos();
        boolean expResult = true;
        boolean result = instance.isSomaDosCubos(n);
        assertEquals(expResult, result);        
    }
    
    @org.junit.Test
    public void testIsSomaDosCubosComDoze() {
        System.out.println("calculaSomaDosCubos");
        int n = 12;
        SomaDosCubos instance = new SomaDosCubos();
        boolean expResult = false;
        boolean result = instance.isSomaDosCubos(n);
        assertEquals(expResult, result);        
    }
    
}
