package keijumt.registry.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import keijumt.registry.helloworld.HelloWorld

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(HelloWorld.getString())
    }
}
