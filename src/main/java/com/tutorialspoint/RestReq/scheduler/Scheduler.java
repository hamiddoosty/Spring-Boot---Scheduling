package com.tutorialspoint.RestReq.scheduler;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.SimpleIdGenerator;

@Component
public class Scheduler {
	@Scheduled(cron = "0 * 11 * * ?")
	public void cronJobSch(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		
		Date now = new Date();
		String strDate = sdf.format(now);
		System.out.println("Java cron job expression:: "+ strDate);
	}
	
	@Scheduled(fixedRate = 1000)
	public void fixedRateSch(){
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		Date now = new Date();
		String strDate = sdf.format(now);
		System.out.println("Fixed Rate schduler:: "+ strDate);
		
	}
	
	@Scheduled(fixedDelay=1000, initialDelay=3000)
	public void fixedDelaySch(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		
		Date now = new Date();
		String strDate = sdf.format(now);
		System.out.println("Fixed Delay scheduler:: " + strDate);
		
	}

}
