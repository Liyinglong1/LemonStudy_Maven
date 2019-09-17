package lemon.day04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DongClock {
	
//	public SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//定义时间格式
//	public String nowtime = df.format(new Date());//获得当前时间
//	
//	public long nowtime1 = System.currentTimeMillis();//获得当前时间戳
	
	long nowtime;
	long overworktime;
	
	public static long  getNowtime() {
		
		//获得当前时间 字符串
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		String date = df.format(new Date());
		System.out.println(date);
		
		//获得当前时间戳
		Date date1 = new Date();
		long time = date1.getTime(); 
		System.out.println(time);
		
		return time;
	}
	
	public static long  getOverworktime() {
		Calendar calendar = new GregorianCalendar();  
	    calendar.add(Calendar.DAY_OF_MONTH,-1);  
	  
	    //一天的开始时间 yyyy:MM:dd 00:00:00  
	    calendar.set(Calendar.HOUR_OF_DAY,0);  
	    calendar.set(Calendar.MINUTE,0);  
	    calendar.set(Calendar.SECOND,0);  
	    calendar.set(Calendar.MILLISECOND,0);  
	    Date dayStart = calendar.getTime();  
	    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
	    String startStr = simpleDateFormat.format(dayStart) ;
	    System.out.println(startStr);
	    
	
	    Long currentTimestamps=System.currentTimeMillis();
        Long oneDayTimestamps= Long.valueOf(60*60*24*1000);
        
        System.out.println(currentTimestamps-(currentTimestamps+60*60*8*1000)%oneDayTimestamps); //获得当天第一个时间戳
        long overworktime =currentTimestamps-(currentTimestamps+60*60*8*1000)%oneDayTimestamps+63030000L;  //获得下班时间
       
        return overworktime;
	}
	
	
	public static void main(String[] args) {
		
		 long Overworktime = getOverworktime();
		 long nowtime = getNowtime();
		 long sum = Overworktime - nowtime; //还剩多少时间戳
		 System.out.println(sum);
		 double result = sum/60000;
	    System.out.println("还有"+ result+"分钟下班");
	    System.out.println("还有"+result/2+"东下班");
	    if(result < 0) {
	    	System.out.println("下班了，加你妈的班");
	    }
	}
	/*
	public static String DATE_YYYY_MM_DD = "yyyy-MM-dd";
	public static String DATE_Y_M_DDHHMMSS = "yyyy-MM-dd HH:mm:ss";
	/** 获取时间戳 milliseconds 
	static public long getLongDate(String dateStr, String format){
	    if (StringUtils.isNotBlank(dateStr) && StringUtils.isNotBlank(format)){
	        SimpleDateFormat sf = new SimpleDateFormat(format);
	        try {
	            return sf.parse(dateStr).getTime();
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
	    }
	    return 0l;
	}
	/** 日期 + days 天 
	static public String getDateChangeString(String dateStr, String format, int days){
	    long currentDateLong = getLongDate(dateStr, format);
	    long changedDateLong;
	    if (days > 0){
	        changedDateLong = currentDateLong + (days*24*60*60*1000);
	    }else {
	        changedDateLong = currentDateLong - (days*24*60*60*1000);
	    }
	    if (changedDateLong > 0){
	        return getDateFromMilliSecondsLong(changedDateLong);
	    }else {
	        return "";
	    }
	}
	// 毫秒转化成 日期格式 yyyy-MM-dd
	public static String getDateFromMilliSecondsLong(long millisecond){
	    if(millisecond <= 0)
	        return " ";
	    else{
	        Date date = new Date();
	        try{
	            date.setTime(millisecond);    // 转为millisecond
	        }catch(NumberFormatException nfe){
	        }
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	        return sdf.format(date);
	    }
	}*/
}



