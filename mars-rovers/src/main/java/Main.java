import entity.Plateau;
import entity.Rover;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static mapper.Mapper.mapStringToDirection;

public class Main {

    private static String separator;
    private static String FILE_PATH;
    private static Plateau plateau;

    public static void main(String[] args) {
        try {
            setupFilePath();
            String fileName = "testfile";

            List<String> lines = Files.readAllLines(
                    Paths.get(FILE_PATH + fileName));

            String[] firstLine = lines.get(0).split(" ");
            lines.remove(0);

            plateau = new Plateau(Integer.valueOf(firstLine[0]),
                    Integer.valueOf(firstLine[1]));
            while (!lines.isEmpty()) {
                String[] lineRover = lines.get(0).split(" ");
                Rover rover = new Rover(Integer.valueOf(lineRover[0]),
                        Integer.valueOf(lineRover[1]),
                        mapStringToDirection(lineRover[2]));
                plateau.readAndExecuteCommands(rover, lines.get(1));
                lines.remove(0);
                lines.remove(0);
            }

            printOutput();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void setupFilePath() {
        File currentDirFile = new File("");
        separator = System.getProperty("file.separator");
        String separator = System.getProperty("file.separator");
        FILE_PATH = currentDirFile.getAbsolutePath() + separator + "src" + separator + "main" + separator + "java" + separator + "io" + separator + "files" + separator;
    }

    private static void printOutput() {
        plateau.getPlateau().forEach(rover -> System.out.println(rover.toString()));
    }
}


