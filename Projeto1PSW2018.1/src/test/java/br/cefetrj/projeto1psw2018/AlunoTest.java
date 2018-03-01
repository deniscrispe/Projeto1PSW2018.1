package br.cefetrj.projeto1psw2018;

import br.cefetrj.projeto1psw2018.Aluno;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Classe AlunoTest que implementa os teste unitários para a classe Aluno
 * @author denis
 * @version 1.0
 */
public class AlunoTest {
    
    /**
     * Teste do método situacao da classe Aluno, quando um aluno é reprovado por falta.
     */    
    
    @Test
    public void testReprovadoFalta() {
        Aluno instance = new Aluno();
        System.out.println("situacao");
        String expResult = "Reprovado";
        String result = instance.situacao(0.6, 10.0, 8.0, 8.5, 0.0);
        assertEquals(expResult, result);

    }
    
    /**
     * Teste do método situacao da classe Aluno, quando um aluno é aprovado com média maior ou igual a 7.
     */

    @Test
    public void testAprovado() {
        Aluno instance = new Aluno();
        System.out.println("situacao");
        String expResult = "Aprovado";
        String result = instance.situacao(0.9, 9.5, 8.5, 8.5, 0.0);
        assertEquals(expResult, result);

    }
    
    /**
     * Teste do método situacao da classe Aluno, quando um aluno é reprovado com média inferior a 3.
     */
    
    @Test
    public void testReprovadoM1() {
        Aluno instance = new Aluno();
        System.out.println("situacao");
        String expResult = "Reprovado";
        String result = instance.situacao(0.9, 0.5, 2.0, 1.5, 0.0);
        assertEquals(expResult, result);

    }
        
    /**
     * Teste do método situacao da classe Aluno, quando um aluno é aprovado na PF.
     */
    
    @Test
    public void testAprovadoPF() {
        Aluno instance = new Aluno();
        System.out.println("situacao");
        String expResult = "Aprovado";
        String result = instance.situacao(0.9, 4.5, 7.0, 8.5, 8.0);
        assertEquals(expResult, result);

    }
    
    /**
     * Teste do método situacao da classe Aluno, quando um aluno é reprovado na prova final.
     */
    
    @Test
    public void testReprovadoPF() {
        Aluno instance = new Aluno();
        System.out.println("situacao");
        String expResult = "Reprovado";
        String result = instance.situacao(0.8, 5.5, 6.0, 6.5, 4.0);
        assertEquals(expResult, result);

    }
    
  
}
