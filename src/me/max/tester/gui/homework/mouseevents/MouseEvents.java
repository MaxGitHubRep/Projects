/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.gui.homework.mouseevents;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.InnerShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.RectangleBuilder;
import javafx.stage.Stage;
import javax.imageio.ImageIO;
import javax.swing.filechooser.FileSystemView;
import me.max.tester.gui.homework.sphere.SphereJavaFX;

/**
 * A sample that demonstrates various mouse and scroll events and their usage.
 * Click the circles and drag them across the screen. Scroll the whole screen.
 * All events are logged to the console.
 *
 * @see javafx.scene.Cursor
 * @see javafx.scene.input.MouseEvent
 * @see javafx.event.EventHandler
 */
public class MouseEvents extends Application {
    
    private void setFlag(Circle circle, String flag) {
        String dir = FileSystemView.getFileSystemView().getDefaultDirectory().getPath() + "\\flags\\" + flag + ".png";
        BufferedImage image = null;
        try {
            image  = ImageIO.read(new File(dir));
        } catch (IOException ex) {
            Logger.getLogger(SphereJavaFX.class.getName()).log(Level.SEVERE, null, ex);
        }
        javafx.scene.image.Image newIm = SwingFXUtils.toFXImage(image, null);

        circle.setFill(new ImagePattern(newIm));
    }
    
    //create a console for logging mouse events
    final ListView<String> console = new ListView<String>();
    //create a observableArrayList of logged events that will be listed in console
    final ObservableList<String> consoleObservableList = FXCollections.observableArrayList();
    {
        //set up the console
        console.setItems(consoleObservableList);
        console.setLayoutY(305);
        console.setPrefSize(500, 195);
    }
    //create a rectangle - (500px X 300px) in which our circles can move
    final Rectangle rectangle = RectangleBuilder.create()
            .width(500).height(300)
            .fill(new LinearGradient(0, 0, 0, 1, true, CycleMethod.NO_CYCLE, new Stop[] {
                new Stop(1, Color.rgb(156,216,255)),
                new Stop(0, Color.rgb(156,216,255, 0.5))
            }))
            .stroke(Color.BLACK)
            .build();
    //variables for storing initial position before drag of circle
    private double initX;
    private double initY;
    private Point2D dragAnchor;

    private void init(Stage primaryStage) {
        Group root = new Group();
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, 500,500));

        
        final Circle circleOne = createCircle("North Korea", Color.DODGERBLUE, 40);
        circleOne.setTranslateX(50);
        circleOne.setTranslateY(50);
        setFlag(circleOne, "nk");

        
        final Circle circleTwo = createCircle("China", Color.INDIANRED, 80);
        circleTwo.setTranslateX(400);
        circleTwo.setTranslateY(100);
        setFlag(circleTwo, "china");
        
        
        final Circle circleThree = createCircle("USA", Color.AQUAMARINE, 70);
        circleThree.setTranslateX(60);
        circleThree.setTranslateY(200);
        setFlag(circleThree, "usa");
        
        final Circle circleFour = createCircle("UK", Color.WHITESMOKE, 60);
        circleFour.setTranslateX(400);
        circleFour.setTranslateY(230);
        setFlag(circleFour, "uk");
        
        final Circle circleFive = createCircle("ICBM", Color.WHITESMOKE, 60);
        circleFive.setTranslateX(200);
        circleFive.setTranslateY(100);
        setFlag(circleFive, "icbm");
        
        
        // we can set mouse event to any node, also on the rectangle
        rectangle.setOnMouseMoved(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                //log mouse move to console, method listed below
                showOnConsole("Mouse moved, x: " + me.getX() + ", y: " + me.getY() );
            }
        });

        rectangle.setOnScroll(new EventHandler<ScrollEvent>() {
            @Override public void handle(ScrollEvent event) {
                double translateX = event.getDeltaX();
                double translateY = event.getDeltaY();

                // reduce the deltas for the circles to stay in the screen
                for (Circle c : new Circle[] { circleOne, circleTwo, circleThree, circleFour }) {
                    if (c.getTranslateX() + translateX + c.getRadius() > 450) {
                        translateX = 450 - c.getTranslateX() - c.getRadius();
                    }
                    if (c.getTranslateX() + translateX - c.getRadius() < 0) {
                        translateX = - c.getTranslateX() + c.getRadius();
                    }
                    if (c.getTranslateY() + translateY + c.getRadius() > 300) {
                        translateY = 300 - c.getTranslateY() - c.getRadius();
                    }
                    if (c.getTranslateY() + translateY - c.getRadius() < 0) {
                        translateY = - c.getTranslateY() + c.getRadius();
                    }
                }

                // move the circles
                for (Circle c : new Circle[] { circleOne, circleTwo, circleThree, circleFour }) {
                    c.setTranslateX(c.getTranslateX() + translateX);
                    c.setTranslateY(c.getTranslateY() + translateY);
                }

                // log event
                showOnConsole("Scrolled, deltaX: " + event.getDeltaX() +
                        ", deltaY: " + event.getDeltaY());
            }
        });
        // show all the circle , rectangle and console
        root.getChildren().addAll(rectangle, circleTwo, circleOne, circleThree, circleFour, circleFive, console);
    }

    private Circle createCircle(final String name, final Color color, int radius) {
        //create a circle with desired name,  color and radius
        final Circle circle = new Circle(radius, new RadialGradient(0, 0, 0.2, 0.3, 1, true, CycleMethod.NO_CYCLE, new Stop[] {
            new Stop(0, Color.rgb(250,250,255)),
            new Stop(1, color)
        }));
        //add a shadow effect
        circle.setEffect(new InnerShadow(7, color.darker().darker()));
        //change a cursor when it is over circle
        circle.setCursor(Cursor.HAND);
        //add a mouse listeners
        circle.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                showOnConsole("Clicked on" + name + ", " + me.getClickCount() + "times");
                //the event will be passed only to the circle which is on front
                me.consume();
            }
        });
        circle.setOnMouseDragged(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                double dragX = me.getSceneX() - dragAnchor.getX();
                double dragY = me.getSceneY() - dragAnchor.getY();
                //calculate new position of the circle
                double newXPosition = initX + dragX;
                double newYPosition = initY + dragY;
                //if new position do not exceeds borders of the rectangle, translate to this position
                if ((newXPosition>=circle.getRadius()) && (newXPosition<=500-circle.getRadius())) {
                    circle.setTranslateX(newXPosition);
                }
                if ((newYPosition>=circle.getRadius()) && (newYPosition<=300-circle.getRadius())){
                    circle.setTranslateY(newYPosition);
                }
                showOnConsole(name + " was dragged (x:" + dragX + ", y:" + dragY +")");
            }
        });
        circle.setOnMouseEntered(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                //change the z-coordinate of the circle
                circle.toFront();
                showOnConsole("Mouse entered " + name);
            }
        });
        circle.setOnMouseExited(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                showOnConsole("Mouse exited " +name);
            }
        });
        circle.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                 //when mouse is pressed, store initial position
                initX = circle.getTranslateX();
                initY = circle.getTranslateY();
                dragAnchor = new Point2D(me.getSceneX(), me.getSceneY());
                showOnConsole("Mouse pressed above " + name);
            }
        });
        circle.setOnMouseReleased(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                showOnConsole("Mouse released above " +name);
            }
        });

        return circle;
    }

    private void showOnConsole(String text) {
         //if there is 8 items in list, delete first log message, shift other logs and  add a new one to end position
         if (consoleObservableList.size()==8) {
            consoleObservableList.remove(0);
         }
         consoleObservableList.add(text);
    }

    @Override public void start(Stage primaryStage) throws Exception {
        init(primaryStage);
        primaryStage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX 
     * application. main() serves only as fallback in case the 
     * application can not be launched through deployment artifacts,
     * e.g., in IDEs with limited FX support. NetBeans ignores main().
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}