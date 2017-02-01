package src.com.crimsonvision;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.opencv.core.Mat;
import org.opencv.core.Rect;

import edu.wpi.first.wpilibj.networktables.NetworkTable;

public class CrimsonServer {
	
public CrimsonServer(Rect rect, Mat mat) throws InterruptedException{
		run(rect,mat);
//server is located at the top of the final if statement in main class
}
public void run(Rect rect, Mat mat){
	NetworkTable.setClientMode();
	NetworkTable.setIPAddress("10.183.25.127");
	NetworkTable table = NetworkTable.getTable("datatable");
	table.putNumber("Angle", Utils.calculateAngleOfBoundingBox(mat, rect));
}
}