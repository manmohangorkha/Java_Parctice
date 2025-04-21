package Array_objects;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Array_Objects {

	String area;
	int ward;

	public void display() {
		System.out.println(area + "\t" + ward);
	}

	public Array_Objects(String a, int w) {
		area = a;
		ward = w;
	}

	public static void main(String[] args) {
		Array_Objects[] tc = {new Array_Objects("ram",44),new Array_Objects("roni",44)};
		
		
		for(Array_Objects quant : tc)
		{
			quant.display();
		}
		
		
			
			
	}
	
		

}