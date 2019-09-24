package mobi.quadram.qsamples;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;

import androidx.test.runner.AndroidJUnitRunner;

/*
    Utilizamos esta clase para reemplazar nuestro Application principal por uno que queramos para testing
 */

public class MockRunner extends AndroidJUnitRunner {

    @Override
    public void onCreate(Bundle arguments) {
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        super.onCreate(arguments);
    }

    @Override
    public Application newApplication(ClassLoader cl, String className, Context context)
            throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return super.newApplication(cl, AppTest.class.getName(), context);
    }
}