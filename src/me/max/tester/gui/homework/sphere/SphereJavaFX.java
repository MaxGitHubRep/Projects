//Page 391 in the JavaFX Textbook
package me.max.tester.gui.homework.sphere;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.*;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.*;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;
import javax.imageio.ImageIO;
import javax.swing.filechooser.FileSystemView;


public class SphereJavaFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        StackPane root = new StackPane();
        
        //root.getChildren().add(btn);
        Scene scene = new Scene(root, 800, 800);
        PerspectiveCamera camera = new PerspectiveCamera(true);
        
        //Backs the camera away from the scene by 1000 units
        camera.setTranslateZ(-1000);
        
        //This is the range of which the camera will render objects
        camera.setNearClip(0.1);
        camera.setFarClip(2000.0);
        
        //The default field of view for the scene is 30 but change to suit
        camera.setFieldOfView(30);
        scene.setCamera(camera);
        
        //This sets up my sphere
        Sphere mysphere = new Sphere(250);
        mysphere.setTranslateX(-500);
        mysphere.setTranslateY(-500);
        mysphere.setTranslateZ(500);
        root.getChildren().add(mysphere);
 
        
        //This sets up the image of the earth to wrap around my sphere
        Platform pf = new Platform();
        String dir = FileSystemView.getFileSystemView().getDefaultDirectory().getPath() + "\\" + pf.fileName;
        BufferedImage image = null;
        try {
            image  = ImageIO.read(new File(dir));
        } catch (IOException ex) {
            Logger.getLogger(SphereJavaFX.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Image newIm = SwingFXUtils.toFXImage(image, null);
        
        PhongMaterial earthPhong = new PhongMaterial();
        earthPhong.setDiffuseMap(newIm);
        mysphere.setMaterial(earthPhong);
        
        //This rotates my sphere
        RotateTransition rotate = new RotateTransition();
        rotate.setNode(mysphere);
        rotate.setDuration(Duration.millis(5000));
        rotate.setAxis(Rotate.Y_AXIS);
        rotate.setByAngle(360);
        rotate.setCycleCount(Animation.INDEFINITE);
        rotate.setInterpolator(Interpolator.LINEAR);
        rotate.play();
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void main(String[] args) {
        launch(args);
    }
    
}
