import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;
public class helloWorld {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH mm ss SS");
		long tm=sdf.parse(s1).getTime();
		long NewYork=tm-12*60*60*1000;
		long Paris=tm-7*60*60*1000;
		Date dt1=new Date(Paris);
		Date dt2=new Date(NewYork);
		System.out.println("巴黎："+sdf.format(dt1));
		System.out.println("纽约："+sdf.format(dt2));
		
	}
	
	

}
