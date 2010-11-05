/*
* generated by Xtext
*/
package org.dadacoalition.ui.labeling;

import java.util.List;

import org.dadacoalition.json.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

import com.google.inject.Inject;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class JsonLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	public JsonLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	String text(JSONArray element){
		return "[]";
	}
	
	String text(JSONObject element){
		return "{}";
	}
	
	String text(JSONString element){
		return element.getValue();
	}
	

	
/*
	//Labels and icons can be computed like this:
	
	String text(MyModel ele) {
	  return "my "+ele.getName();
	}
	 
    String image(MyModel ele) {
      return "MyModel.gif";
    }
*/
}
