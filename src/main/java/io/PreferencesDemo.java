package io;

import java.util.prefs.Preferences;

import static net.mindview.util.Print.print;

/**
 * @author Dylan.Deng
 * @version 1.00 9/17/2016 13:29
 */
public class PreferencesDemo {
    public static void main(String[] args) throws Exception {
        Preferences prefs = Preferences.userNodeForPackage(PreferencesDemo.class);
        prefs.put("Location", "Qz");
        prefs.put("Footwear", "Ruby Slippers");
        prefs.putInt("Companions", 4);
        prefs.putBoolean("Are there witches?", true);
        int usageCount = prefs.getInt("UsageCount", 0);
        usageCount++;
        prefs.putInt("UsageCount", usageCount);
        for (String key : prefs.keys())
            print(key + ": " + prefs.get(key, null));
        // You must always provide a default value:
        print("How many companions does Dorothy have? " +
                prefs.getInt("Companions", 0));
    }
}
