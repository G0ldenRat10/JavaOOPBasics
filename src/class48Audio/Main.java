package class48Audio;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class Main {

    public static void main(String[] args) {
        // Use a relative path from project root where the audio file actually resides in the workspace
        File file = new File("src/class48Audio/sample-15s.wav");

        if (!file.exists()) {
            System.err.println("Audio file not found: " + file.getAbsolutePath());
            System.err.println("Make sure you run the program from the project root so the relative path is valid.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        Clip clip = null;

        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {
            clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";

            while (!response.equals("Q")) {
                System.out.println("P = play, S = Stop, R = Reset, Q = Quit");
                System.out.print("Enter your choice: ");

                response = scanner.next();
                response = response.toUpperCase();

                switch (response) {
                    case ("P"):
                        clip.start();
                        break;
                    case ("S"):
                        clip.stop();
                        break;
                    case ("R"):
                        clip.setMicrosecondPosition(0);
                        break;
                    case ("Q"):
                        clip.stop();
                        clip.close();
                        break;
                    default:
                        System.out.println("Not a valid response");
                }
            }

            System.out.println("Byeeee!");

        } catch (UnsupportedAudioFileException e) {
            System.err.println("Unsupported audio file: " + e.getMessage());
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            System.err.println("Audio line unavailable: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("I/O error while handling audio: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (clip != null && clip.isOpen()) {
                clip.close();
            }
            scanner.close();
        }
    }
}