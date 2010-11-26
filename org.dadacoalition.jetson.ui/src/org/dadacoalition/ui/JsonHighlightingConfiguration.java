package org.dadacoalition.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

/**
 * Configures the different "categories" that are available for styling in the
 * editor. It is the responsibility of the either lexical token scanner or
 * semantical highlighting calculator to match textual input to the categories
 * that are defined here.
 *
 * @author oysteto
 *
 */
public class JsonHighlightingConfiguration implements IHighlightingConfiguration {

    public static final String JSON_STRING        = "JSON_STRING";
    public static final String JSON_ATTRIBUTE_KEY = "JSON_ATTRIBUTE_KEY";
    public static final String JSON_NUM           = "JSON_NUM";
    public static final String JSON_COMMENT       = "JSON_COMMENT";
    public static final String JSON_KEYWORD       = "JSON_KEYWORD";

    public void configure(IHighlightingConfigurationAcceptor acceptor) {
        acceptor.acceptDefaultHighlighting(JSON_STRING, "Strings", stringStyle());
        acceptor.acceptDefaultHighlighting(JSON_ATTRIBUTE_KEY, "Attribute names", attributeStyle());
        acceptor.acceptDefaultHighlighting(JSON_NUM, "Numbers", numStyle());
        acceptor.acceptDefaultHighlighting(JSON_COMMENT, "Comment", commentStyle());
        acceptor.acceptDefaultHighlighting(JSON_KEYWORD, "Keywords (true, false, null)", keywordStyle());
    }

    public TextStyle defaultTextStyle() {
        TextStyle textStyle = new TextStyle();
        textStyle.setBackgroundColor(new RGB(255, 255, 255));
        textStyle.setColor(new RGB(0, 0, 0));
        return textStyle;
    }

    public TextStyle stringStyle() {
        TextStyle textStyle = new TextStyle();
        textStyle.setBackgroundColor(new RGB(255,255,255));
        textStyle.setColor(new RGB(42,0,255));

        return textStyle;
    }

    public TextStyle attributeStyle() {
        TextStyle textStyle = defaultTextStyle().copy();
        textStyle.setStyle(SWT.BOLD);
        return textStyle;
    }

    public TextStyle numStyle() {
        TextStyle textStyle = defaultTextStyle().copy();
        return textStyle;
    }

    public TextStyle commentStyle() {
        TextStyle textStyle = defaultTextStyle().copy();
        textStyle.setStyle(SWT.ITALIC);
        textStyle.setColor(new RGB(100,100,100));
        return textStyle;
    }

    public TextStyle keywordStyle() {
        TextStyle textStyle = defaultTextStyle().copy();
        textStyle.setColor(new RGB(127,0,85));
        textStyle.setStyle(SWT.BOLD);
        return textStyle;
    }

}
