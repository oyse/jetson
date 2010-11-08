package org.dadacoalition.ui;

import org.eclipse.xtext.ui.editor.syntaxcoloring.antlr.AbstractAntlrTokenToAttributeIdMapper;
import org.dadacoalition.ui.JsonHighlightingConfiguration;

public class JsonAntlrTokenToAttributeIdMapper extends AbstractAntlrTokenToAttributeIdMapper {

    @Override
    protected String calculateId(String tokenName, int tokenType) {
        
        System.out.println(tokenName + " " + tokenType);
        
        if(tokenName.equals("RULE_ML_COMMENT") || tokenName.equals("RULE_SL_COMMENT") ){
            return JsonHighlightingConfiguration.JSON_COMMENT;
        }
        
        // TODO Auto-generated method stub
        return null;
    }

}
