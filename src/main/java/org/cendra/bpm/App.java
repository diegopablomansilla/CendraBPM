package org.cendra.bpm;

import java.time.ZoneId;
import java.time.format.TextStyle;
import java.time.zone.ZoneOffsetTransition;
import java.util.List;
import java.util.Locale;

import org.cendra.bpm.dao.globalizacion.ConfiguracionRegionalDAOx;
import org.cendra.bpm.model.globalizacion.ConfiguracionRegional;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Populate.populate();
		
		System.out.println("Hello World!");
		
		
		System.out.println(Locale.getDefault().getLanguage() + " " + Locale.getDefault().getCountry());
		
		List<ConfiguracionRegional> configuracionesRegionales = ConfiguracionRegionalDAOx.getInstance().findAll();
		
		for(ConfiguracionRegional configuracionRegional : configuracionesRegionales){
			System.out.println(configuracionRegional);
		}
		
		System.out.println("===============================================================");
		System.out.println("===============================================================");
		System.out.println("===============================================================");
		

		// Map<String, String> map = ZoneId.SHORT_IDS;
		//
		// Iterator it = map.entrySet().iterator();
		//
		// while (it.hasNext()) {
		// Map.Entry e = (Map.Entry) it.next();
		// System.out.println("[" + e.getKey() + "=" + e.getValue() + "]");
		// }

		System.out.println("===============================================================");
		System.out.println("===============================================================");
		System.out.println("===============================================================");

		for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
//			System.out.println(availableZoneId);
		}

		System.out.println("===============================================================");
		System.out.println("===============================================================");
		
		
		System.out.println(Locale.getDefault().getLanguage() + " " + Locale.getDefault().getCountry());
		
		System.out.println("===============================================================");

		System.out.println(ZoneId.systemDefault().getId());		
		
		System.out.println();
		
		System.out.println(ZoneId.systemDefault().getDisplayName(TextStyle.FULL, Locale.getDefault()));
//		System.out.println(ZoneId.systemDefault().getDisplayName(TextStyle.FULL_STANDALONE, Locale.getDefault()));
//		System.out.println(ZoneId.systemDefault().getDisplayName(TextStyle.NARROW, Locale.getDefault()));
//		System.out.println(ZoneId.systemDefault().getDisplayName(TextStyle.NARROW_STANDALONE, Locale.getDefault()));
		System.out.println(ZoneId.systemDefault().getDisplayName(TextStyle.SHORT, Locale.getDefault()));
//		System.out.println(ZoneId.systemDefault().getDisplayName(TextStyle.SHORT_STANDALONE, Locale.getDefault()));
		
		
		System.out.println();
		
		System.out.println(ZoneId.systemDefault().getRules().toString());
		System.out.println(ZoneId.systemDefault().getRules().getTransitions());
		
		
		
		
		for(ZoneOffsetTransition zoneOffsetTransition : ZoneId.systemDefault().getRules().getTransitions()){
			System.out.println(zoneOffsetTransition.toString());
		}

		System.out.println();
		
//		System.out.println(ZoneId.of("Mexico/BajaNorte").getId());		
//		System.out.println(ZoneId.of("Mexico/BajaNorte").getRules());
//		System.out.println(ZoneId.of("Mexico/BajaNorte").getDisplayName(TextStyle.FULL, Locale.getDefault()));
		
		


	}
}
