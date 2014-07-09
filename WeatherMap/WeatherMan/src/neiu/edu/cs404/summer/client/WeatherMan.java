package neiu.edu.cs404.summer.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class WeatherMan implements EntryPoint {
	public void onModuleLoad() {
		//History.addValueChangeHandler(this);
		RootPanel.get().clear();
		LocationReader launcherForm = new LocationReader();
		RootPanel.get().add(launcherForm);
	}
}
