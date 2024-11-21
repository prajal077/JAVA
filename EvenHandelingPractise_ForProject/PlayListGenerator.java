package EvenHandelingPractise_ForProject;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class PlayListGenerator {

        public static void main(String[] args) {
            // Create a GUI frame
            JFrame frame = new JFrame("Playlist Generator");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Components
            JLabel moodLabel = new JLabel("Describe your mood:");
            JTextField moodField = new JTextField(20);
            JButton generateButton = new JButton("Generate Playlist");
            JTextArea playlistArea = new JTextArea(10, 30);
            playlistArea.setEditable(false);

            // Panel to organize components
            JPanel panel = new JPanel();
            panel.add(moodLabel);
            panel.add(moodField);
            panel.add(generateButton);
            panel.add(new JScrollPane(playlistArea));

            // Add panel to frame
            frame.add(panel);
            frame.setVisible(true);

            // Predefined playlists
            Map<String, List<String>> moodToSongs = new HashMap<>();
            moodToSongs.put("happy", Arrays.asList("Song A - Artist 1", "Song B - Artist 2"));
            moodToSongs.put("sad", Arrays.asList("Song C - Artist 3", "Song D - Artist 4"));
            moodToSongs.put("focused", Arrays.asList("Song E - Artist 5", "Song F - Artist 6"));
            moodToSongs.put("energetic", Arrays.asList("Song G - Artist 7", "Song H - Artist 8"));

            // Generate button functionality
            generateButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String mood = moodField.getText().toLowerCase().trim();
                    if (mood.isEmpty()) {
                        playlistArea.setText("Please enter your mood!");
                    } else if (moodToSongs.containsKey(mood)) {
                        List<String> playlist = moodToSongs.get(mood);
                        playlistArea.setText("Playlist for '" + mood + "':\n");
                        for (String song : playlist) {
                            playlistArea.append(song + "\n");
                        }
                    } else {
                        playlistArea.setText("Sorry, no playlist available for this mood.");
                    }
                }
            });

            hello
        }
    }

