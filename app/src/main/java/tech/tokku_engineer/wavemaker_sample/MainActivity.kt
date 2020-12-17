package tech.tokku_engineer.wavemaker_sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent

class MainActivity : AppCompatActivity() {

    companion object {
        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }

    private external fun touchEvent(action: Int)

    private external fun startEngine()

    private external fun stopEngine()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startEngine()
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        if (event != null) {
            touchEvent(event.action)
        }
        return super.onTouchEvent(event)
    }

    override fun onDestroy() {
        stopEngine()
        super.onDestroy()
    }

}