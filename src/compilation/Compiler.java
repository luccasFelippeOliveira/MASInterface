/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilation;

import analisador.lexico.LexicalAnalyser;
import analisador.lexico.TokenStream;
import analisador.sintatico.SyntacticAnalyser;
import analisador.sintatico.SyntacticErrorException;
import analisador.sintatico.UnexpectedEndOfInputException;
import com.norm.checker.norm.definition.Norm;
import java.util.ArrayList;
import java.util.List;

/**
 * Compile String norms and returns list of Norms.
 *
 * @author lfo
 */
public class Compiler {

    private List<Norm> compiledNorms = null;

    public Compiler() {
        /*Instatiate Fields*/
        compiledNorms = new ArrayList<Norm>();
    }
    
    public Norm compileNorm(String norm) throws SyntacticErrorException, UnexpectedEndOfInputException{
        LexicalAnalyser la = new LexicalAnalyser(norm);
        TokenStream ts = la.getTokenStream();
        SyntacticAnalyser sa = new SyntacticAnalyser(ts);
        
        sa.doSyntaxAnalysis();
        
        return sa.generateNorm();
    }
    
    public List<Norm> compileList(List<String> normList) throws SyntacticErrorException, UnexpectedEndOfInputException {
        for(String norm : normList) {
            compiledNorms.add(compileNorm(norm));
        }
        
        return compiledNorms;
    }
}
