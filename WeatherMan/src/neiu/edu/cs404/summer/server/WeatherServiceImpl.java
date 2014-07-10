package neiu.edu.cs404.summer.server;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import neiu.edu.cs404.summer.client.WeatherService;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class WeatherServiceImpl extends RemoteServiceServlet implements
		WeatherService {

	static{
		DataReader.loadData();
	}

	@Override
	public String[] getWeatherData(String location, Date dateToPick, String timeText) {
		try{
			Date time = new SimpleDateFormat("HH:mm").parse(timeText);
			Calendar timeCal =  Calendar.getInstance();
			timeCal.setTime(time);
			Calendar cal = Calendar.getInstance();
			cal.setTime(dateToPick);
			cal.set(Calendar.HOUR_OF_DAY, timeCal.get(Calendar.HOUR_OF_DAY));
			cal.set(Calendar.MINUTE, timeCal.get(Calendar.MINUTE));
			dateToPick = cal.getTime();
			double tmpc =  DataReader.getTMPC(location, dateToPick);
			double dwpc = DataReader.getDWPC(location, dateToPick);
			double vp = 6.112 * Math.exp((17.67 * dwpc) / (243.50 + dwpc));
			double svp = 6.112 * Math.exp((17.67 * tmpc) / (243.50 + tmpc));
			return new String[]{new DecimalFormat("00.00").format( 32 + (tmpc * 9 / 5))  + " F" , new DecimalFormat("00.00").format(vp * 100/svp) + "%"};
		}catch(Exception ex){
			throw new RuntimeException(ex.getMessage());
		}
	}
}
