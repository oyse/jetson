
package org.dadacoalition;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class JsonStandaloneSetup extends JsonStandaloneSetupGenerated{

	public static void doSetup() {
		new JsonStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

