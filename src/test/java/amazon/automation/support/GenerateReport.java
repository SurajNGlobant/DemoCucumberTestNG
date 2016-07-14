package amazon.automation.support;

import net.masterthought.cucumber.ReportBuilder;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GenerateReport {
	public static List<String> jsonFileList = new ArrayList<>();
	public static String jsonReportFol = "target/json-report";

	/*
	 * To generate cucumber report
	 */
	public static void GenerateMasterthoughtReport() {
		try {
			// String RootDir = System.getProperty("user.dir");
			Date date = new Date();
			DateFormat dateFormat = new SimpleDateFormat("ddMMYYY_hh_mm");
			String separator = System.getProperty("file.separator");
			String suffix = "AmazonAutomation_Report_"
					+ dateFormat.format(date);
			String fileName = "target" + separator + "Cucumber_Reports"
					+ separator + suffix;
			File reportOutputDirectory = new File(fileName);
			List<String> list = new ArrayList<String>();
			list.add("target/json-report/home-page-cucumber-json-report.json");

			String pluginUrlPath = "";
			String buildNumber = "1";
			String buildProject = "cucumber-jvm";
			boolean skippedFails = true;
			boolean pendingFails = true;
			boolean undefinedFails = true;
			boolean missingFails = true;
			boolean flashCharts = true;
			boolean runWithJenkins = false;
			boolean highCharts = false;
			boolean parallelTesting = true;

			ReportBuilder reportBuilder = new ReportBuilder(
					listFilesForFolder(new File(jsonReportFol)),
					reportOutputDirectory, pluginUrlPath, buildNumber,
					buildProject, skippedFails, pendingFails, undefinedFails,
					missingFails, flashCharts, runWithJenkins, highCharts,
					parallelTesting);

			reportBuilder.generateReports();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    /*
     * return list of files in the specified folder
     * @param Folder
     */
    public static List<String> listFilesForFolder(final File folder) {
    	
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                listFilesForFolder(fileEntry);
            } else {
            	
            	jsonFileList.add(jsonReportFol+"/"+fileEntry.getName());
            }
        }
        return jsonFileList;
    }
   
}