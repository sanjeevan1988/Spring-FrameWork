package samples.CornJob.basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class FileWriterJob {
	File file= new File("F:\\sampler.txt");
	FileOutputStream fos;
void WriteTofile(){
	try {
		fos= new FileOutputStream(file, true);
		fos.write(new Date().toString().getBytes());
		fos.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
