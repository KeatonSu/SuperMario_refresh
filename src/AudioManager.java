import javax.sound.sampled.*;
import java.io.IOException;
import java.io.InputStream;

public class AudioManager {
    private static Clip clip;
    
    public static void playSound(String soundName) {
        try {
            String soundFile = "/sound/" + soundName + ".wav";
            InputStream audioSrc = SuperMario.class.getResourceAsStream(soundFile);
            if (audioSrc == null) {
                System.err.println("Could not find sound file: " + soundFile);
                return;
            }
            
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(audioSrc);
            clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
            
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
    
    public static void stopSound() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
        }
    }
} 