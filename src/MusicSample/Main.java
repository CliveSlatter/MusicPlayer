package MusicSample;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Menu;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        BorderPane root = new BorderPane();

        Scene scene = new Scene(root, 1024, 768);

        /*
            Create the table view and associated columns
        */

        TableView tableView = new TableView();
        TableColumn trackId = new TableColumn("Track ID");
        TableColumn trackTitle = new TableColumn("Title");
        TableColumn trackArtist = new TableColumn("Artist");
        TableColumn trackDuration = new TableColumn("Duration");
        tableView.getColumns().addAll(trackId,trackTitle,trackArtist,trackDuration);
        root.setCenter(table);
        stage.setTitle("Music Player");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}