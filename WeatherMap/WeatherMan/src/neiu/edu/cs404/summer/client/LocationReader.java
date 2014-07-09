package neiu.edu.cs404.summer.client;

import java.util.Date;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.DateBox;

public class LocationReader extends Composite  {

	private static LocationReaderUiBinder uiBinder = GWT.create(LocationReaderUiBinder.class);
	
	@UiField Button button;
	@UiField ListBox timeCombo;
	@UiField DateBox dateTxt;
	@UiField ListBox locationCombo;
	@UiField Label temperatureLbl;
	@UiField Label humidityLbl;
	
	WeatherServiceAsync service = GWT.create(WeatherService.class);
	
	interface LocationReaderUiBinder extends UiBinder<Widget, LocationReader> {
	}

	public LocationReader() {
		initWidget(uiBinder.createAndBindUi(this));
		for (int i = 0; i < 24; i++){
			if (i < 10)
				timeCombo.addItem("0" + i + ":00");
			else
				timeCombo.addItem(i + ":00");
		}
		locationCombo.addItem("KORD", "CHICAGO O'HARE");
		dateTxt.setFormat(new DateBox.DefaultFormat(DateTimeFormat.getFormat("MM/dd/yyyy")));

	}

	public LocationReader(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
	}



	@UiHandler("button")
	void onButtonClick(ClickEvent event) {
		
		Date dateTime =  dateTxt.getDatePicker().getValue();
		String timetxt = timeCombo.getValue(timeCombo.getSelectedIndex());
		
		service.getWeatherData(locationCombo.getItemText(locationCombo.getSelectedIndex()), dateTime, timetxt , new AsyncCallback<String[]>() {
			
			@Override
			public void onSuccess(String[] result) {
				temperatureLbl.setText(result[0]);
				humidityLbl.setText(result[1]);
			}
			
			@Override
			public void onFailure(Throwable caught) {
				Window.alert("Error calculating Relative Humidity :: " + caught.getMessage());
			}
		});	
		
	}
	
}
