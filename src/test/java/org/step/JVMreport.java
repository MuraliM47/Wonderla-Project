package org.step;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMreport {
	public static  void generateJvmReport(String json) {
		File f=new File("C:\\Users\\mahek\\eclipse-workspace\\.metadata\\SampleWonderla\\Reports\\JVM");
		
		Configuration c=new Configuration(f,"Wonderla Application");
		c.addClassifications("Employee Name:", "Murali M");
		c.addClassifications("Employee id:", "12345");
		c.addClassifications("Os", "Windows11");
		List<String> l= new ArrayList<>();
		l.add(json);
        ReportBuilder r= new ReportBuilder(l,c);
        r.generateReports();
	}
	
	public static void main(String[] args) {
		generateJvmReport("C:\\Users\\mahek\\eclipse-workspace\\.metadata\\SampleWonderla\\Reports\\Json\\wonderla.json");
		
}}
