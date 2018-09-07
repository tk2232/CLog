package com.devtk.tk2232.clog;

import android.content.Context;
import android.util.Log;

/**
 * Custom Log class
 * Falls die Fehler an den Server geschickt werden sollen dann können die Methoden hier hinzugefügt werden.
 */

public class CLog {

    private static Configuration conf = new Configuration();

    public static void e(String tag, String msg) {
        if (conf.logWithConsole)
            Log.e(tag, msg);

        if (conf.logWithFirebase) {
            //TODO log with firebase
        }
    }

    public static void e(String tag, String msg, Throwable tr) {
        if (conf.logWithConsole)
            Log.e(tag, msg, tr);

        if (conf.logWithFirebase) {
            //TODO log with firebase
        }
    }

    public static Configuration configuration() {
        conf = new Configuration();
        return conf;
    }

    public static Configuration configuration(Context context) {
        conf = new Configuration();
        return conf;
    }

    public static class Configuration {

        private Context context;

        private boolean logWithConsole = true;
        private boolean logWithFirebase = false;

        public Configuration() {

        }

        public Configuration(Context context) {
            this.context = context;
        }

        public Configuration logWithFirebase(boolean logWithFirebase) {
            this.logWithFirebase = logWithFirebase;
            return this;
        }

        public Configuration logWithConsole(boolean logWithConsole) {
            this.logWithConsole = logWithConsole;
            return this;
        }
    }
}
