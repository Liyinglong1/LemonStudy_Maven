package lemon.day04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DongClock {
	
//	public SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//����ʱ���ʽ
//	public String nowtime = df.format(new Date());//��õ�ǰʱ��
//	
//	public long nowtime1 = System.currentTimeMillis();//��õ�ǰʱ���
	
	long nowtime;
	long overworktime;
	
	public static long  getNowtime() {
		
		//��õ�ǰʱ�� �ַ���
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
		String date = df.format(new Date());
		System.out.println(date);
		
		//��õ�ǰʱ���
		Date date1 = new Date();
		long time = date1.getTime(); 
		System.out.println(time);
		
		return time;
	}
	
	public static long  getOverworktime() {
		Calendar calendar = new GregorianCalendar();  
	    calendar.add(Calendar.DAY_OF_MONTH,-1);  
	  
	    //һ��Ŀ�ʼʱ�� yyyy:MM:dd 00:00:00  
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
        
        System.out.println(currentTimestamps-(currentTimestamps+60*60*8*1000)%oneDayTimestamps); //��õ����һ��ʱ���
        long overworktime =currentTimestamps-(currentTimestamps+60*60*8*1000)%oneDayTimestamps+63030000L;  //����°�ʱ��
       
        return overworktime;
	}
	
	
	public static void main(String[] args) {
		
		 long Overworktime = getOverworktime();
		 long nowtime = getNowtime();
		 long sum = Overworktime - nowtime; //��ʣ����ʱ���
		 System.out.println(sum);
		 double result = sum/60000;
	    System.out.println("����"+ result+"�����°�");
	    System.out.println("����"+result/2+"���°�");
	    if(result < 0) {
	    	System.out.println("�°��ˣ�������İ�");
	    }
	}
	/*
	public static String DATE_YYYY_MM_DD = "yyyy-MM-dd";
	public static String DATE_Y_M_DDHHMMSS = "yyyy-MM-dd HH:mm:ss";
	/** ��ȡʱ��� milliseconds 
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

	/** ���� + days �� 
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
	// ����ת���� ���ڸ�ʽ yyyy-MM-dd
	public static String getDateFromMilliSecondsLong(long millisecond){
	    if(millisecond <= 0)
	        return " ";
	    else{
	        Date date = new Date();
	        try{
	            date.setTime(millisecond);    // תΪmillisecond
	        }catch(NumberFormatException nfe){
	        }
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	        return sdf.format(date);
	    }
	}*/
}



